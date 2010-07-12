package nl.leocms.vastgoed;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.mmbase.util.logging.Logging;
import org.mmbase.util.logging.Logger;
import org.mmbase.bridge.Cloud;
import com.finalist.mmbase.util.CloudFactory;
import nl.leocms.util.ApplicationHelper;


public class NelisReader
{ 
    // ASSUMES A 2 COLUMN FORMAT (EENHEID/GEBIED)
    // Separator and nelis file are configured in readData() method
    private Map natGebMap;
    private Map gebiedMap;
    private long timeStamp;
    private final static long  EXPIRE_INTERVAL = 24 * 60 * 60 * 1000; //two hours of refresh interval since last read 
    private static final Logger log = Logging.getLoggerInstance(NelisReader.class);
    
    
  // Private constructor suppresses generation of a (public) default constructor
  private NelisReader() {}
 
  private static class SingletonHolder
  { 
    private final static NelisReader INSTANCE = new NelisReader();
  }
 
  public static NelisReader getInstance()
  {
    return SingletonHolder.INSTANCE;
  }


public Map getNatGebMap() { 
    if ((natGebMap == null) || (System.currentTimeMillis() > timeStamp + EXPIRE_INTERVAL)) {
        readData();
    }
    return copyMaps(natGebMap);
}

public Map getGebiedMap() {
    if ((gebiedMap == null) || (System.currentTimeMillis() > timeStamp + EXPIRE_INTERVAL)) {
        readData();
    }
    return copyMaps(gebiedMap);
}

// For proper multi-user behavior, we copy references of objects inside these Map of Maps
private Map copyMaps(Map map) {
    Map copyMap = new TreeMap();
    
    Set keySet = map.keySet();
    Iterator keysIterator = keySet.iterator();
    while (keysIterator.hasNext()) {
       String theKey = (String) keysIterator.next();  
       TreeMap innerMap = (TreeMap) map.get(theKey);
       Map copyInnerMap = new TreeMap();
       copyMap.put(new String(theKey), copyInnerMap);
       
       Set subSet = innerMap.keySet();
       Iterator subIterator = subSet.iterator();
       while (subIterator.hasNext()) {
          copyInnerMap.put(new String((String)subIterator.next()), new Boolean(false));
        }   
    }
    return copyMap;
}

// procides access to the list of eenheids to be used directly in forms
public Set getEenheidList() {
    // calling map getter for a refresh
    Map temp = getNatGebMap();
    //copying to a new Set to support .add() method. 
    Set copySet = new TreeSet();
    Set mapSet = temp.keySet();
    Iterator setIterator = mapSet.iterator();
    while(setIterator.hasNext()) {
       copySet.add(setIterator.next());
    }
    return copySet;
 }

//Provides access to the list of eenheids to be used directly in forms
public Set getEenheidListWithDepartments() {
    // calling map getter for a refresh
    Set temp = getEenheidList();
    // Centraal kantoor and Regio kantoren are also requested to appear on the list
    temp.add("Centraal kantoor");
    Map regios = (Map) gebiedMap.get("Regio");
    Iterator mapIterator = regios.keySet().iterator();
    while(mapIterator.hasNext()) {
       temp.add(mapIterator.next());
    }
    return temp;
 }


public void readData() {
    //set time stamp 
    timeStamp = System.currentTimeMillis();
    log.debug("timestamp:" + timeStamp);
 
    String separator = "\\|";
    String NELIS_FILE = "nelis.csv";
    
    Cloud cloud = CloudFactory.getCloud();
    ApplicationHelper ap = new ApplicationHelper(cloud);
    String temp = ap.getIncomingDir();
    
    String nelisPath= temp + NELIS_FILE;
    
    try {
      BufferedReader dataFileReader = getBufferedReader(nelisPath);
      String nextLine = dataFileReader.readLine();
      
      // file is found. maps can be reset. otherwise keep old maps.
      natGebMap = new TreeMap();
      gebiedMap = new TreeMap();
      
      while(nextLine!=null) {
          
        String selectionEenheid = "";
        String selectionGebied = "";
        
        String[] tokens = nextLine.split(separator);
        
        if (tokens.length < 2) {
            log.warn("line in Nelis file contains less then expected tokens.");
        } else {
            selectionEenheid = tokens[0].trim();
            selectionGebied = tokens[1].trim();
            
            addLineToMaps(selectionEenheid, selectionGebied);
        }
            nextLine = dataFileReader.readLine();
        }
        dataFileReader.close();
      } catch(Exception e) {
        log.info(e);
        // If Nelis file absent first time then maps will be null. In this case we instantiate for a graceful degradation.
        if (natGebMap == null) {
           natGebMap = new TreeMap();
        }
        if (gebiedMap == null) {
           gebiedMap= new TreeMap();
        }
      }
                 
     // Provincies & regios are constant and hardcoded unlike other values that come from Nelis file.  
    Map dummy = new TreeMap();
    dummy.put("Groningen", Boolean.valueOf(false));
    dummy.put("Friesland", Boolean.valueOf(false));
    dummy.put("Drenthe", Boolean.valueOf(false));
    dummy.put("Overijssel", Boolean.valueOf(false));
    dummy.put("Flevoland", Boolean.valueOf(false));
    dummy.put("Gelderland", Boolean.valueOf(false));
    dummy.put("Utrecht", Boolean.valueOf(false));
    dummy.put("Noord-Holland", Boolean.valueOf(false));
    dummy.put("Zuid-Holland", Boolean.valueOf(false));
    dummy.put("Zeeland", Boolean.valueOf(false));
    dummy.put("Noord-Brabant", Boolean.valueOf(false));
    dummy.put("Limburg", Boolean.valueOf(false));
    gebiedMap.put("Provincie", dummy);   
    
    dummy = new TreeMap();
    dummy.put("Gelderland", Boolean.valueOf(false));
    dummy.put("Groningen, Friesland en Drenthe", Boolean.valueOf(false));
    dummy.put("Noord-Brabant en Limburg", Boolean.valueOf(false));
    dummy.put("Noord-Holland en Utrecht", Boolean.valueOf(false));
    dummy.put("Overijssel en Flevoland", Boolean.valueOf(false));
    dummy.put("Zuid-Holland en Zeeland", Boolean.valueOf(false));
    gebiedMap.put("Regio", dummy);
}

private void addLineToMaps(String eenheid, String gebied){
    insertKeyToSubMap(natGebMap, eenheid, gebied);
    insertKeyToSubMap(gebiedMap, "Eenheid", eenheid);
}

// we are using Map of Maps to represent the selection boxes. 
private void insertKeyToSubMap(Map topMap, String topKey, String subKey) {
    Map subMap = (Map) topMap.get(topKey);
    if (subMap == null) {
        TreeMap temp = new TreeMap();
        temp.put(subKey, Boolean.valueOf(false));
        topMap.put(topKey, temp);
        
    } else {
        subMap.put(subKey, Boolean.valueOf(false));
    }
    
}

private BufferedReader getBufferedReader(String sFileName) throws FileNotFoundException, UnsupportedEncodingException {
    FileInputStream fin = new FileInputStream(sFileName);
    InputStreamReader isr = new InputStreamReader(fin,"ISO-8859-1");
    return new BufferedReader(isr);
  }

}