package TestPages;

import BrowserInitiation.Browser;
import Pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserRegistration  {//extends Browser
    HomePage home;
    Browser browser;
  //  WebDriver driver;
    @BeforeTest
    public void setUpBrowser(){
        browser= new Browser();
        browser.setDriver();
        browser.openWebsite("https://www.google.com/");
    }
    @Test(priority = 1)
    public void userCanRegister(){
        browser.setDriver();
        home=new HomePage(browser.driver);
        home.searchInGoogle("Vodafone");
        home.ScrollDownTillEndOfPage();
    }
    @Test(priority = 2)
    public void userCanRegister2(){

        home.searchInGoogle("Vodafone");
       // home.ScrollDownTillEndOfPage();
    }
    @AfterClass
    public void closeBrowser(){
       // browser.tearDownDriver();
    }
}
