package cheating;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.out.println("Karan edited the project ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.get("https://omayo.blogspot.com/"); 
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();

System.out.println("Updated code is pushing to rbranch");
	Set<String> windows = driver.getWindowHandles();
		
	Iterator<String> itr = windows.iterator();
	
	while(itr.hasNext()) {  // 3 winows id
		String id = itr.next(); 
		driver.switchTo().window(id);
		if(driver.getTitle().equalsIgnoreCase("New Window")) {
		String h=	driver.findElement(By.className("example")).getText();
			
		System.out.println(h);
		}

			}
	
	

			System.out.println("Hello World");
	
	driver.quit();
	}

}
