import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import pages.homepage;
import pages.login;

public class POMTestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver; // = new EdgeDriver();
		login objLogin;
		String username = "Admin";
		String password = "admin123";
		homepage objHomePage;
		
		System.setProperty("webdriver.edge.driver", "D:\\Demo\\drivers\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Create Login Page object
		objLogin = new login(driver);

//		// Verify login page text
//		String loginPageTitle = objLogin.getLoginTitle();
//		Assert.assertTrue(loginPageTitle.contains("LOGIN Panel"));

		// login to application
		objLogin.login1(username, password);

		// go the next page
		objHomePage = new homepage(driver);

		// Verify home page
		Assert.assertTrue(objHomePage.getHomePageText().contains("Welcome"));
		System.out.println(objHomePage.getHomePageText());

		driver.quit();

	}
}
