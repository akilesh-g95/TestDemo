package cheating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lightbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/lightbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("img[class =\"hover-shadow cursor\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("span.close.cursor")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
