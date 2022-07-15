package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesI {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://bazaar.shopclues.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.findElement(By.id("autocomplete")).sendKeys("dress");
        
        Thread.sleep(3000);
        
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='srch_sugg_lst']/div"));
        System.out.println(options.size());
        for (WebElement b : options) {
        	
        	System.out.println(b.getText());
			
		}
        driver.quit();
        
	}

}
