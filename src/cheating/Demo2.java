package cheating;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(3000);
		
	 String text = driver.switchTo().alert().getText();
	 System.out.println(text);		Thread.sleep(3000);
	 driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().defaultContent();
		driver.close();

	}

}
