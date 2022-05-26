package TestPages;

import BrowserInitiation.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    Browser browser;
    @BeforeClass
    public void setUpBrowser(){
        browser= new Browser();
        browser.setDriver();
        browser.openWebsite("https://www.google.com/");
    }
    @AfterClass
    public void closeBrowser(){
        // browser.tearDownDriver();
    }
}
