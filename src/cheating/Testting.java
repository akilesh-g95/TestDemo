package cheating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Testting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a = new Actions(driver);

		WebElement blog = driver.findElement(By.cssSelector("span#blogsmenu"));
		a.moveToElement(blog).perform();
		
	WebElement sell = driver.findElement(By.cssSelector("a[href=\"http://www.selenium143.blogspot.com\"]"));
	a.moveToElement(sell).perform();
	a.click(sell).perform();
	Thread.sleep(3000);
	driver.quit();
	}

}
