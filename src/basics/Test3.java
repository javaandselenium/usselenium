package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

Thread.sleep(3000);
//forward
driver.navigate().back();


Thread.sleep(3000);
//back
driver.navigate().forward();


Thread.sleep(3000);
//refresh
driver.navigate().refresh();


Thread.sleep(3000);
driver.close();


	}

}
