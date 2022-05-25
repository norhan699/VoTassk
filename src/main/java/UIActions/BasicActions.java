package UIActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasicActions {//extends Browser
    // Browser browser ;
   // WebDriver driver;
    public BasicActions(WebDriver driver) {
        PageFactory.initElements(driver,this);//mn 8erha el inputField bikon b null
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
}
