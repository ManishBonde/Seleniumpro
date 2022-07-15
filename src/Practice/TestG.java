package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestG {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		Thread.sleep(7000);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginbtn = driver.findElement(By.name("login"));
		if (loginbtn.isEnabled()) {
			System.out.println("Pass: Login button is enabled");
		} else {
            System.out.println("Fail: Login button is disabled");
		}
		driver.quit();

	}

}
