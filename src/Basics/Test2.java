package Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://bazaar.shopclues.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());

	}

}
