package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestF {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.name("field-keywords"));
		
		if (searchtb.isDisplayed()) {
			System.out.println("Pass:  An Element is Displayed");
		} else {
			System.out.println("Fail:  An Element is not Displayed");
		}
		driver.quit();
	}
	

}
