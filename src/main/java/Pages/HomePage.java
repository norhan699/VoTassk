package Pages;

import UIActions.BasicActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasicActions {//extends Browser
    WebDriver driver;
   public HomePage(WebDriver driver) {
        super(driver);
      // this.driver= driver;
   }
   // BasicActions actions ;
    @FindBy(name="q")//css = "input.gLFyf.gsfi"
    WebElement GoogleSearch;
   //  WebElement GoogleSearch = driver.findElement(By.name("q"));
    public void searchInGoogle(String SearchKey) {
      //  actions= new BasicActions(driver);
       // System.out.println(GoogleSearch.getText()+"mmmmmmmmmmmmmmmmm");
        //actions.EnterTextInInputField(GoogleSearch,SearchKey);//el moshkla msh hna
       // GoogleSearch.sendKeys(SearchKey, Keys.ENTER);
        EnterTextInInputField(GoogleSearch,SearchKey);
    }
    public void ScrollDownTillEndOfPage(){
        scrollDown();
    }
}
