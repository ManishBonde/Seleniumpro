package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextC {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.name("q"));
		Point loc = searchtb.getLocation();
		int x = loc.getX();
		
		int y = loc.getY();
		
	    System.out.println("X coordinates: "+x);
	    System.out.println("X coordinates: "+y);
	    driver.quit();
	}

}
