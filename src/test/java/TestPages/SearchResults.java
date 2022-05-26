package TestPages;

import Pages.HomePage;
import org.testng.annotations.Test;

public final class SearchResults extends BaseTest {//final:because i don't want anyone to extend this class because it is a test case
    private SearchResults(){

    }
    HomePage home;
    @Test
    public void userSearchInGoogle(){
        System.out.println(browser.getDrv().getTitle());//getDrv b null !!!!!!!!!!!!
        home=new HomePage(browser.getDrv());//browser.driver
        home.searchInGoogle("Etisalat");
        home.scrollDownTillEndOfPage();
    }

   /* @Test(dependsOnMethods = "userSearchInGoogle")
    public void userNavigateToNextSearchPage(){
        home.NavigateToNextpage();
    }*/
}
