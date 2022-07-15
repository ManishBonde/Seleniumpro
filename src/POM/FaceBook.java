package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	
	@FindBy(id="email")
	private WebElement unametb;
	
	@FindBy(id="pass")
	private WebElement pswdtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public FaceBook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void unametextbox(String user) {
		unametb.sendKeys(user);
	}
	public void pswdtextbox(String pass) {
		pswdtb.sendKeys(pass);
	}
	public void loginbutton() {
		loginbtn.click();
	}

}
