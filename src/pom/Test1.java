package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

FaceBook fb=new FaceBook(driver);
fb.emailaddreestb("qertyu");
fb.passwordtextbox("eysdgdgjhgdjhfg");
fb.login();


	}

}
