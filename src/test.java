import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "D:\\Demo\\drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] veggies = { "Cucumber", "Brocolli" };

		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		//#root > div > div.products-wrapper > div > div:nth-child(1) > h4
		for (int i = 0; i < productList.size(); i++) {

			// writing the logic "Brocolli - 1 Kg" for removing -1 Kg characters
			String[] vegName = productList.get(i).getText().split("-");
			// format it to get the actual vegetable name
			String formattedVegName = vegName[0].trim();

			// convert the array in the arraylist
		
			List<String> arrayList = Arrays.asList(veggies);

			
			
			int j = 0;
			// check the veggies name present in the arraylist or not.
			if (arrayList.contains(formattedVegName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				Thread.sleep(3000);
				if (j == veggies.length) {
					break;
				}
			}

		}

	}

}
