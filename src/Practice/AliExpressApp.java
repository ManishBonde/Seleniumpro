package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AliExpressApp {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(8000);
		driver.get("https://www.aliexpress.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement signin = driver.findElement(By.xpath("(//span[text()='Account'])[1]"));
	    Actions a = new Actions(driver);
	    a.moveToElement(signin).build().perform();
		driver.findElement(By.xpath("//a[@class='sign-btn']")).click();
		driver.findElement(By.id("fm-login-id")).sendKeys("manish.dbonde@gmail.com");
		driver.findElement(By.id("fm-login-password")).sendKeys("Patil@123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
	
	}

}
