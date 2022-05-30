package TestPages;

import BrowserInitiation.DriverManager;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class SearchResults extends BaseTest {//final:because i don't want anyone to extend this class because it is a test case
    private SearchResults(){

    }
    HomePage home;
    @Test
    public void userSearchInGoogle(){
        System.out.println(DriverManager.getDrv().getTitle());//getDrv b null !!!!!!!!!!!!-->browser.getDrv()
        home=new HomePage(DriverManager.getDrv());//browser.driver-->browser.getDrv()
        home.searchInGoogle("Vodafone");
        WebDriverWait wait = new WebDriverWait(DriverManager.getDrv(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(home.getVodafonelogo())));
       // browser.getDrv().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(DriverManager.getDrv().getTitle().toLowerCase().contains("google search"));
        Assert.assertTrue(home.getVodafonelogoText().contains("Vodafone"));
        List<WebElement> links = home.getListOfLinks();//By.xpath(home.getListOfLinks())
        Assert.assertTrue(links.size()<=13);
        Assert.assertTrue(links.size()>=10);
        home.scrollDownTillEndOfPage();
    }

   /* @Test(dependsOnMethods = "userSearchInGoogle")
    public void userNavigateToNextSearchPage(){
        home.NavigateToNextpage();
    }*/
}
