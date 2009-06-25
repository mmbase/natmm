package nl.leocms.servlets;

import java.io.IOException;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.leocms.applications.NatMMConfig;

import org.apache.commons.lang.StringUtils;
import org.mmbase.util.logging.Logger;
import org.mmbase.util.logging.Logging;

/**
 * This filter rejects or allows a request based on the IP address it comes
 * from.
 * 
 * @author Jurn de Ruijter
 */
public class IPFilter implements Filter {
   
   private List allowedIPList; 
   private boolean IPFilterEnabled;

   /** MMbase logging system */
   private static final Logger log = Logging.getLoggerInstance(IPFilter.class.getName());

   /**
    * The initialization method of the filter, called on startup.
    * 
    * @param config object containing init parameters specified
    * @throws ServletException thrown when an exception occurs in the web.xml
    */
   public void init(FilterConfig filterConfig) throws ServletException {
      this.allowedIPList = new ArrayList();
      this.IPFilterEnabled = NatMMConfig.isIPFilterEnabled();
      
      String allowedIPProperty = NatMMConfig.getAllowedIP();
      if (StringUtils.isNotBlank(allowedIPProperty)) {
         StringTokenizer token = new StringTokenizer(allowedIPProperty, ",");
   
         while (token.hasMoreTokens()) {
            String nextIp = token.nextToken().trim();
            allowedIPList.add(nextIp);
            log.info("Allowed ip = " + nextIp + ".");
         }
      }
      else {
         log.info("IPFilter on /services/ will deny ALL addresses");
      }
      log.debug("IPFilter initialized");
   }

   /**
    * Does the filtering. URL conversion is only tried when a dot is found in
    * the URI. The conversion work is delegated to the UrlConverter class.
    * 
    * @param request incoming request
    * @param response outgoing response
    * @param chain a chain object, provided for by the servlet container
    * @throws ServletException thrown when an exception occurs
    * @throws IOException thrown when an exception occurs
    */
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      
      // skip IPFiltering if disabled
      if (!IPFilterEnabled) {
         log.debug("Ip filtering disabled.");
         chain.doFilter(request, response);
         
      } else {
         List ips = new ArrayList();
         ips.add(request.getRemoteAddr());
         
         String ip = ((HttpServletRequest) request).getHeader("X-Forwarded-For");
         if (StringUtils.isBlank(ip)) {
            // not behind a proxy or mod_proxy
            log.debug("Incoming ip, remote address = " + request.getRemoteAddr());
         }
         else {
            log.debug("Incoming ip, remote address = " + request.getRemoteAddr() + " X-Forwarded-For =" + ip);
            StringTokenizer token = new StringTokenizer(ip, ",");
            while(token.hasMoreTokens()) {
               ips.add(token.nextToken().trim());
            }
         }
   
         for (Iterator iterator = ips.iterator(); iterator.hasNext();) {
            String addr = (String) iterator.next();
            if (allowedIPList.contains(addr)) {
               log.debug("Ip " + addr + " allowed.");
               chain.doFilter(request, response);
               return;
            }
         }
      
         log.debug("Ip " + ips.toString() + " not allowed.");
         if (response instanceof HttpServletResponse) {
            HttpServletResponse httpResp = (HttpServletResponse) response;         
            httpResp.sendError(HttpServletResponse.SC_FORBIDDEN, "That means goodbye forever!");
         }
         else {
            response.getWriter().write("FORBIDDEN: That means goodbye forever!");
         }
      }
   }

   /**
    * Destroy method
    */
   public void destroy() {
      /*
       * called before the Filter instance is removed from service by the web
       * container
       */
   } 
}