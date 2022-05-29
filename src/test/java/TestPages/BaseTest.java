package TestPages;

import BrowserInitiation.Browser;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {
    Browser browser;
    @BeforeMethod
    public void setUpBrowser() throws Exception {
        //This function throws exception because oenWebsite() function throws this exception ,So it is mandatory here to throw Exception
        browser= new Browser();
        Browser.setDriver();//=browser.setDriver();
        //Browser.setDriver();////////////de 2a5er 7aga 8irtha hia wl static fel Browser class
       // browser.openWebsite("https://www.google.com/ncr");//ncr de bt5le google y Run in english
        browser.openWebsite();
    }
    @AfterMethod
    public void closeBrowser(){
        // browser.tearDownDriver();
    }
}
