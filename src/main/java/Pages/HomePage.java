package Pages;

import UIActions.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasicActions {//extends Browser
   // WebDriver driver;
   public HomePage(WebDriver driver) {
        super(driver);
      // this.driver= driver;
   }
   // BasicActions actions ;
    @FindBy(name="q")//css = "input.gLFyf.gsfi"
    WebElement GoogleSearch;
     /*WebElement GoogleSearch = this.getDrv().findElement(By.name("q"));*/
    @FindBy(id="pnnext")
    WebElement NextPageLink;
    @FindBy(css = "h2.qrShPb.kno-ecr-pt.PZPZlf.q8U8x>span")//"#mh_tsuid39.h2"
    // div[@id='mh_tsuid39']or//*[@id='mh_tsuid39']/div/div/div[2]/h2/span
    WebElement VodafoneLogo;// i use it in assertion
    @FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md']")
    List<WebElement> LinksList;
    public void searchInGoogle(String SearchKey) {
      //  actions= new BasicActions(driver);
       // System.out.println(GoogleSearch.getText()+"mmmmmmmmmmmmmmmmm");
        //actions.EnterTextInInputField(GoogleSearch,SearchKey);//el moshkla msh hna
       // GoogleSearch.sendKeys(SearchKey, Keys.ENTER);
        EnterTextInInputField(GoogleSearch,SearchKey);
    }
    public void scrollDownTillEndOfPage(){
        scrollDown();
    }
    public void NavigateToNextpage(){
        clickLink(NextPageLink);
    }
    public String getVodafonelogo(){
        return "h2.qrShPb.kno-ecr-pt.PZPZlf.q8U8x>span";
    }
    public String getVodafonelogoText(){
        return VodafoneLogo.getText();
    }
    public String getSearchResultTtle(){
        return VodafoneLogo.getText();
    }
    public List<WebElement> getListOfLinks(){
        return LinksList;
    }
}
