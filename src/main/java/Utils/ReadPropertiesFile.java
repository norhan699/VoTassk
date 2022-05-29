package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public final class ReadPropertiesFile {

    public static String getValue(String key) throws IOException {
        Properties property = new Properties();
        FileInputStream filePath =new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/properties");
        property.load(filePath);
        return property.getProperty(key);
    }
}
