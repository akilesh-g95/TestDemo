package cheating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("input-email")).sendKeys("Akilesh@globussoft.in");
		driver.findElement(By.id("input-password")).sendKeys("Akilesh@123");
		Thread.sleep(3000);
		driver.findElement(By.id("input-password")).sendKeys(Keys.ENTER);
	
}
}
