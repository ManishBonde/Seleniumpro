package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipcartLoginScript {
	public WebDriver driver;
	Properties p = new Properties();
	@Test
	public void openApp() throws IOException {
		FileInputStream fis = new FileInputStream("./Input.properties");
		p.load(fis);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void loginApp() {
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(p.getProperty("user"));
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(p.getProperty("pass"));
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	/*@Test()
	public void closeApp() {
		driver.close();
	}*/

}
