package nl.leocms.util;

import java.util.*;

import org.mmbase.bridge.*;

public class DateUtil {
  
  public String getObjectNumber(Cloud cloud, Date date) {
    // returns the object number of the node that was the first to be created on day date
    int today_days = (int)(date.getTime() / (60 * 60 * 24)) / 1000;
    NodeList nl = cloud.getNodeManager("daymarks").getList("daymarks.daycount <= " + today_days,"number","DOWN");
    if (nl.size()>0){
      return nl.getNode(0).getStringValue("mark");
    } else {
      return "-1";
    }

  }

  public long getObjectAge(Node nodeObject) {
    // returns the age of the object in milliseconds
    String sAge = nodeObject.getFunctionValue("age", null).toString();
    return (new Date()).getTime() - (new Integer(sAge)).longValue() * 86400000;
  }
}
