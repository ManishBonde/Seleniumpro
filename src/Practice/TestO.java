package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestO {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement options = driver.findElement(By.id("cars"));
		Select s = new Select(options);
		Thread.sleep(3000);
		s.selectByIndex(2);
		s.selectByValue("199");
		s.selectByVisibleText("More Than INR 500 ( 55 ) ");
		
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		if (s.isMultiple()) {
			s.deselectAll();
		} else {
			System.out.println("Fail : it is single select");
		}

	}

}
