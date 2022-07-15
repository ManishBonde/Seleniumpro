package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Face {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FaceBook fb = new FaceBook(driver);
		fb.unametextbox("admin");
		fb.pswdtextbox("manager");
		fb.loginbutton();
		
		Thread.sleep(3000);
		driver.close();

	}

}
