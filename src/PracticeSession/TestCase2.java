package PracticeSession;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;	

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
		WebElement dd = driver.findElement(By.name("addresstype"));
		Select s= new Select(dd);
		s.selectByIndex(1);

		WebElement src = driver.findElement(By.id("Selenium Training"));
		
		WebElement tar = driver.findElement(By.id("cartArea"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tar).build().perform();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		WebElement facebook = driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[2]"));
		Point loc = facebook.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		System.out.println("X-axis location: "+x);
		System.out.println("Y-axis location: "+y);
		
	}

}
