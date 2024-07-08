package cheating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement webframe = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(webframe);
		System.out.println(driver.findElement(By.xpath("//a[text()=\"Omayo\"]")).getText());
		driver.switchTo().defaultContent();
	System.out.println(driver.findElement(By.xpath("//h2[text()=\"Readonly TextBox\"]")).getText());
	//driver.quit()	;

	}

}
