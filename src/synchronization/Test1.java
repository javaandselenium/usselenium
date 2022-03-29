package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	

    WebElement user = driver.findElement(By.name("username"));
  w.until(ExpectedConditions.visibilityOf(user)).sendKeys("admin");  
  
driver.findElement(By.name("password")).sendKeys("manager");

WebElement loginbtn = driver.findElement(By.xpath("//div[text()='Log In']"));
w.until(ExpectedConditions.elementToBeClickable(loginbtn)).click();	

String title = driver.getTitle();
w.until(ExpectedConditions.titleContains("56ttetfghfgh"));
	}

}
