package cheating;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// TODO Auto-generated method stub

	WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
	
	WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
	
	Actions a =new Actions(driver);
	a.dragAndDrop(madrid, spain).perform();
	}

}
