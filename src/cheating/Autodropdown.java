package cheating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autodropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		Thread.sleep(5000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//img[@alt='Make My Trip'] "))).click().build().perform();
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//img[@alt='Make My Trip'] "))).click().build().perform();

		WebElement text = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
		text.click();

		WebElement sendingtext = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		sendingtext.click();
		sendingtext.sendKeys("Del");

		// WebElement place =
		// driver.findElement(By.cssSelector("input[placeholder=\"From\"]"));

		
			
			for(int i=0; i<3 ; i++) {
				Thread.sleep(2000);
				sendingtext.sendKeys(Keys.DOWN);
			}
		
		Thread.sleep(3000);
		sendingtext.sendKeys(Keys.ENTER);
	}

}
