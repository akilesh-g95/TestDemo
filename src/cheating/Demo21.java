package cheating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo21 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
 WebElement drag = driver.findElement(By.xpath("//a[@aria-labelledby=\"price-max-label\"]"));
		
		Actions a = new Actions(driver);
		//a.dragAndDropBy(drag, 500,0).perform();
		a.dragAndDropBy(drag, 100, 0).perform();
		Thread.sleep(5000);
	}

}
