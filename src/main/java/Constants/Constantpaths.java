package Constants;

public class Constantpaths {


    private static final String CHROMEPATH=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
    private static final String PROPERTIESFILEPATH =System.getProperty("user.dir")+"/src/main/resources/properties";
    private static final String JSONFILEPATH =System.getProperty("user.dir")+"/src/main/resources/json.json";
    public static String getCHROMEPATH() {//3lshan msh lsa ha5od object mnha hnak yadob andhha b esm el class
        return CHROMEPATH;
    }
    public static String getPROPERTIESFILEPATH() {//3lshan msh lsa ha5od object mnha hnak yadob andhha b esm el class
        return PROPERTIESFILEPATH;
    }
    public static String getJSONFILEPATH() {//3lshan msh lsa ha5od object mnha hnak yadob andhha b esm el class
        return JSONFILEPATH;
    }

}
