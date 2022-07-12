package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;
	 
    @FindBy(id = "welcome")
    WebElement homePageUserName;
 
    public homepage(WebDriver driver) {
      
 
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageUserName.getText();
    }
}
