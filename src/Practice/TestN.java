package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestN {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Actions a = new Actions(driver);
		a.moveToElement(dropdown).build().perform();
		
		Select s = new Select(dropdown);
		s.selectByIndex(5);
		s.selectByValue("search-alias=beauty");
		s.selectByVisibleText("Health & Personal Care");
		
		List<WebElement> Alloptions = s.getOptions();
		System.out.println(Alloptions.size());
		 for (WebElement b : Alloptions) {
			System.out.println(b.getText());
		}
		    s.deselectByIndex(5);
			s.deselectByValue("search-alias=beauty");
			s.deselectByVisibleText("Health & Personal Care");
			
			Thread.sleep(3000);
		  driver.close();
		}

}
