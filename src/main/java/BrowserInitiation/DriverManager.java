package BrowserInitiation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    // if i make it final Then i don't want anyone to extend this class and use "drv" directly only uses it through
   // private static ThreadLocal<WebDriver> drv = new ThreadLocal<>();
    private static ThreadLocal<WebDriver> drv = ThreadLocal.withInitial(() -> {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
        return new ChromeDriver();
    });// Dr anonymous function y3ny mlhash esm howa yadob esm el class bs
    //it's function to declare the driver initial value with chromedriver instead of null
    public static WebDriver getDrv(){//

        return drv.get();
    }
    public static void setDrv(WebDriver driverRef){//
        drv.set(driverRef);
    }
    public  void unloadDrv(){
        drv.remove();
    }
}
