package TestPages;

import Pages.HomePage;
import org.testng.annotations.Test;

public final class NextPage extends BaseTest{
    private NextPage(){

    }
        HomePage home;
    @Test
    public void userNavigateToNextSearchPage(){
        home=new HomePage(browser.getDrv());//browser.driver
        home.searchInGoogle("Vodafone");
        home.NavigateToNextpage();
    }
}
