package BrowserInitiation;


import Constants.Constantpaths;
import Utils.ReadJsonFile;
import Utils.ReadPropertiesFile;
import com.beust.jcommander.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FireFoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import java.io.IOException;
import java.util.Objects;
//import static BrowserInitiation.DriverManager.getDrv;

public class Browser {
    //leh hna lw m5lthomsh static msh bi run el parallel execution??/??????????
   // final static String DRIVER_PATH=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
   // private static WebDriver driver;//kan public
   /* public Browser(WebDriver driver) {
        this.driver=driver;
    }*/

    public static void setDriver(String browser) {//
        // if(Objects.isNull(driver)) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", Constantpaths.getCHROMEPATH());
            DriverManager.setDrv(new ChromeDriver());//driver
            //driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", Constantpaths.getEDGEPATH());
            DriverManager.setDrv(new EdgeDriver());//driver
        }
        /*else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", Constantpaths.getIEPATH());
            DriverManager.setDrv(new InternetExplorerDriver());//driver
        }*/

        // }

    }
    public void openWebsite() throws Exception {
       // DriverManager.getDrv().get(ReadJsonFile.get("url"));
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
