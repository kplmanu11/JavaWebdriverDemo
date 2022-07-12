package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	WebDriver driver;
	 
    @FindBy(name = "txtUsername")
    WebElement userName;
 
    @FindBy(name = "txtPassword")
    WebElement password;
 
    @FindBy(id = "logInPanelHeading")
    WebElement titleText;
 
    @FindBy(id = "btnLogin")
    WebElement login;
 
    public login(WebDriver driver) {
 
 
        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
 
    // Set user name in textbox
    public void setUserName(String strUserName) {
        userName.sendKeys(strUserName);
    }
 
    // Set password in password textbox
    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }
 
    // Click on login button
    public void clickLogin() {
        login.click();
    }
 
    // Get the title of Login Page
    public String getLoginTitle() {
        return titleText.getText();
    }
 
    public void login1(String strUserName, String strPassword) {
 
        // Fill user name
        this.setUserName(strUserName);
 
        // Fill password
        this.setPassword(strPassword);
 
        // Click Login button
        this.clickLogin();
 
    }

}
