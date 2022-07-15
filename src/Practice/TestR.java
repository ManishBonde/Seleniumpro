package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestR {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement course = driver.findElement(By.id("course"));
        Actions a= new Actions(driver);
        a.moveToElement(course).build().perform();
        driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(3000);
        //Alert ad= driver.switchTo().alert();
       // ad.dismiss();
        Thread.sleep(3000);
        driver.quit();
	}

}
