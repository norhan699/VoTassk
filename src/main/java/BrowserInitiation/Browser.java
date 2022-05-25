package BrowserInitiation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public  WebDriver driver;//static
   /* public Browser(WebDriver driver) {
        this.driver=driver;
    }*/
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
        driver = new ChromeDriver();//chromeOptions
        /* ChromeOptions chromeOption = new ChromeOptions();
      / WebDriverManager.chromedriver().setup();*/
    }
    public void openWebsite(String websiteUrl){
        driver.get(websiteUrl);
    }
}
