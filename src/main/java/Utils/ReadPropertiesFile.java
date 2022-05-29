package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
public final class ReadPropertiesFile {

    public static String getValue(String key) throws Exception {
        String value="";
        Properties property = new Properties();
        FileInputStream filePath =new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties");
        property.load(filePath);
        value = property.getProperty(key);
        if(Objects.isNull(value)){//=value==null
            throw new Exception("property name "+key+" is not found, please check it in resources.properties file");
        }
        return value;
    }
}
