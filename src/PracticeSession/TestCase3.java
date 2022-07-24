package PracticeSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("Core java for Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		
		driver.findElement(By.xpath("//a[text()= ' Core Java For Selenium Trainin']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click(); 
		driver.quit();
	}

}
