package TestPages;

import BrowserInitiation.DriverManager;
import Pages.HomePage;
import org.testng.annotations.Test;

public final class NextPage extends BaseTest{
    private NextPage(){

    }
        HomePage home;
    @Test
    public void userNavigateToNextSearchPage(){
        home=new HomePage(DriverManager.getDrv());//browser.driverThen it becomes-->browser.getDrv()
        home.searchInGoogle("Vodafone");
        home.NavigateToNextpage();
    }
}
