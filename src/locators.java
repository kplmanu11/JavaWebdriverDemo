
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\Demo\\drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//Locators
		
		//ID
		//<input id=”techcanvass” class=”required” type=”text”/>
		driver.findElement(By.id("techcanvass"));
		
		//Name
		//<input id=”techcanvass” name=”admin” class=”required”  type=”text”/>
		driver.findElement(By.name("admin"));
		
		//linktext
		//<a href=”http://www.techcanvass.com“>Click Here</a>
		driver.findElement(By.linkText("Click Here"));
		
		//PartialLinkText
		driver.findElement(By.partialLinkText("Click"));
		
		//TagName
		driver.findElement(By.tagName("input"));
		
		//ClassName
		//<input id=”techcanvass” name=”admin” class=”required”  type=”text” class = "demo"/>
		driver.findElement(By.className("demo"));
		
		
		//CSS selector
		
		//<input type="text" placeholder="Username" id= “inputUsername”  value=" ">
		
		//tagname#id
		//input#techcanvass 
		
		//tagname.classname
		
		//Tagname[attribute=’value’]
		//input[id='inputUserName']
		driver.findElement(By.cssSelector("input[id='inputUserName']"));
		
		
		//XPATH
		
		// //Tagname[@attribute='value']
		// //input[@id = 'inputUserName']
		driver.findElement(By.xpath("//input[@id = 'inputUserName']"));
		
				
		
		
		
		
	}

}
