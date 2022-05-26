package TestPages;

import BrowserInitiation.Browser;
import org.testng.annotations.*;

public class BaseTest {
    Browser browser;
    @BeforeMethod
    public void setUpBrowser(){
        browser= new Browser();
        browser.setDriver();
        //Browser.setDriver();////////////de 2a5er 7aga 8irtha hia wl static fel Browser class
        browser.openWebsite("https://www.google.com/");
    }
    @AfterMethod
    public void closeBrowser(){
        // browser.tearDownDriver();
    }
}
