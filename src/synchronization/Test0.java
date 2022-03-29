package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofDays(2));


driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("manager");
driver.findElement(By.xpath("//div[text()='Log In']")).click();

	}

}
