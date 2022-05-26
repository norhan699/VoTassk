package TestPages;

import Pages.HomePage;
import org.testng.annotations.Test;

public final class SearchResults extends BaseTest {//final:because i don't want anyone to extend this class because it is a test case
    HomePage home;
    @Test
    public void userSearchInGoogle(){
       // browser.setDriver();
        home=new HomePage(browser.driver);
        home.searchInGoogle("Vodafone");
        home.scrollDownTillEndOfPage();
    }
    @Test(dependsOnMethods = "userSearchInGoogle")
    public void userNavigateToNextSearchPage(){
        home.NavigateToNextpage();
    }
   /* @Test(priority = 2)
    public void userCanRegister2(){

        home.searchInGoogle("Vodafone");
       // home.ScrollDownTillEndOfPage();
    }*/
}
