package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestE {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb = driver.findElement(By.id("twotabsearchtextbox"));
		
		String typeValue = searchtb.getAttribute("type");
		System.out.println("Value of type attribute: "+typeValue);
		
		String autocompleteValue = searchtb.getAttribute("autocomplete");
		System.out.println("Value of autocomplete attribute: "+autocompleteValue);
		
		String notExistingAttribute = searchtb.getAttribute("notExistingAttribute");
		System.out.println("Value of not existing attribute : "+notExistingAttribute);
		
	}

}
