package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	
	@FindBy(id="email")
	private WebElement emailaddresstb;
	
	@FindBy(id="pass")
	private WebElement passwordtb;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
public FaceBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

public void emailaddreestb(String email) {
	emailaddresstb.sendKeys(email);
}

public void passwordtextbox(String pwd) {
	passwordtb.sendKeys(pwd);
}

public void login() {
	loginbtn.click();
	
}
	
	

}
