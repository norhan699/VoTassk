package BrowserInitiation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Browser {
    final static String DRIVER_PATH=System.getProperty("user.dir")+"/Drivers/chromedriver.exe";
    private static WebDriver driver;//kan public
   /* public Browser(WebDriver driver) {
        this.driver=driver;
    }*/
    private static ThreadLocal<WebDriver> drv = new ThreadLocal<>();
    public static WebDriver getDrv(){
        return drv.get();
    }
    public static void setDrv(WebDriver driverRef){
         drv.set(driverRef);
    }
    public  void unloadDrv(){
        drv.remove();
    }
    public static void setDriver() {
        if(Objects.isNull(driver)) {
            System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
            driver = new ChromeDriver();
            setDrv(driver);
        }
    }
    public void openWebsite(String websiteUrl){
        getDrv().get(websiteUrl);
       // driver.get(websiteUrl);
    }
    public void tearDownDriver(){
        getDrv().quit();
        //driver.quit();
    }
}
