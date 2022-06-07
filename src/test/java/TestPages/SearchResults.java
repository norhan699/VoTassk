package TestPages;

import BrowserInitiation.DriverManager;
import Pages.HomePage;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public final class SearchResults extends BaseTest {//final:because i don't want anyone to extend this class because it is a test case
    private SearchResults(){//private because i don't want anyone to make an object from this test

    }
    HomePage home;
    @Test(priority = 1)
    public void userSearchInGoogle(){
       // System.out.println(DriverManager.getDrv().getTitle());//getDrv b null !!!!!!!!!!!!-->browser.getDrv()
        home=new HomePage(DriverManager.getDrv());//browser.driver-->browser.getDrv()
        home.searchInGoogle("Vodafone");
        WebDriverWait wait = new WebDriverWait(DriverManager.getDrv(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(home.getVodafonelogo())));
       // browser.getDrv().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title= DriverManager.getDrv().getTitle();
        Assertions.assertThat(title).
                as("title is not found").isNotNull().
                as("It does not contains expected text").containsIgnoringCase("google search");
       // Assert.assertTrue(title.toLowerCase().contains("google search"));
        Assert.assertTrue(home.getVodafonelogoText().contains("Vodafone"));
        List<WebElement> links = home.getListOfLinks();
        Assertions.assertThat(links).hasSizeBetween(7,13);
       /* Assert.assertTrue(links.size()<=13);
        Assert.assertTrue(links.size()>=10);*/
        home.scrollDownTillEndOfPage();
        home.NavigateToNextpage();
    }

   /*@Test(priority = 2)
    public void userNavigateToNextSearchPage(){
        System.out.println("userNavigateToNextSearchPage function");
        home.NavigateToNextpage();
    }*/
}
