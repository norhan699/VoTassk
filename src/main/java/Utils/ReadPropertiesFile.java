package Utils;

import Constants.Constantpaths;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
public final class ReadPropertiesFile {
    static final Map<String,String> CONFIGMAP = new HashMap<>();
    public static String getValue(String key) throws Exception {
        //String value="";
        Properties property = new Properties();
        FileInputStream filePath =new FileInputStream(Constantpaths.getPROPERTIESFILEPATH());
        property.load(filePath);
       // value = property.getProperty(key);=da b2a bdalo CONFIGMAP.get(key);
        for(Map.Entry<Object,Object> entry: property.entrySet()){
            CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()).trim());//remove any spaces before or after the value
        }
        if(Objects.isNull(CONFIGMAP.get(key))){//=value==null//Objects.isNull(value)
            throw new Exception("property name "+key+" is not found, please check it in resources.properties file");
        }
        return CONFIGMAP.get(key);
        //return value;
    }
}
