package TestPages;

import BrowserInitiation.Browser;
import Pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserRegistration  {//extends Browser
    HomePage home;
    Browser browser;
  //  WebDriver driver;
    @BeforeClass
    public void setUpBrowser(){
        browser= new Browser();
        browser.setDriver();
        browser.openWebsite("https://www.google.com/");
    }
    @Test
    public void userCanRegister(){
        home=new HomePage(browser.driver);
        home.setGoogleSearch("Vodafone");
    }
}
