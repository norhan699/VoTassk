package UIActions;

import BrowserInitiation.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasicActions extends Browser {
    // Browser browser ;
   // WebDriver driver;
    public BasicActions(WebDriver driver) {
        PageFactory.initElements(driver,this);//mn 8erha el inputField bikon b null
        //We use Page Factory pattern to initialize web elements which are defined in Page Objects.
        //El mfrod hn3rf el webElements ele httb3t hna fe "this"
    }
    public void clickButton(WebElement button){
        button.click();
    }
    public void clickLink(WebElement link){
        link.click();
    }
    public void EnterTextInInputField(WebElement inputField,String text){
        inputField.sendKeys(text, Keys.ENTER);
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;//this.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
