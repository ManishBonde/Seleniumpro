package PracticeSession;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

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
		
		WebElement course = driver.findElement(By.id("course"));
	     Actions a = new Actions(driver);
	     a.moveToElement(course).build().perform();
	     
	     driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		
	     WebElement plusbtn = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
	     a.doubleClick(plusbtn).build().perform();
	     
	     driver.findElement(By.xpath("//button[text()=' Add to Cart']")).submit();
	      Alert ac=driver.switchTo().alert();
	      ac.accept();
	     Thread.sleep(3000);
	     WebElement notify = driver.findElement(By.id("callout"));
	     System.out.println(notify.getText());
	     System.out.println("Product get added Successfully...");
	      driver.quit();
	     
        
		}

}

