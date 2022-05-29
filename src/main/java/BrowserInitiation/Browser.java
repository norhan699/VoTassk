package BrowserInitiation;


import Constants.Constantpaths;
import Utils.ReadPropertiesFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Objects;

//import static BrowserInitiation.DriverManager.getDrv;

public class Browser {
    //leh hna lw m5lthomsh static msh bi run el parallel execution??/??????????
    final static String DRIVER_PATH=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
   // private static WebDriver driver;//kan public
   /* public Browser(WebDriver driver) {
        this.driver=driver;
    }*/
    public static void setDriver() {//
       // if(Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", Constantpaths.getCHROMEPATH());
            //driver = new ChromeDriver();
            DriverManager.setDrv(new ChromeDriver());//driver
       // }
    }
    public void openWebsite() throws Exception {
        DriverManager.getDrv().get(ReadPropertiesFile.getValue("url"));
        // driver.get(websiteUrl);
    }
    /*public void openWebsite(String websiteUrl){
        DriverManager.getDrv().get(websiteUrl);
       // driver.get(websiteUrl);
    }*/
    public void tearDownDriver(){
        DriverManager.getDrv().quit();
        //driver.quit();
    }
}
