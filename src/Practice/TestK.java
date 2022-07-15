package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestK {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Health & Beauty'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
		
		//driver.findElement(By.xpath("(//a[text()='Sell on eBay'])[1]")).click();
	}

}
