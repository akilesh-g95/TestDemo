package cheating;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class mass {

	public static void main(String[] args) {
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(300));
		
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		
		Set<String> windows = driver.getWindowHandles();
		
	Iterator<String> itr = windows.iterator();
	while(itr.hasNext()) {
		
	 String web = itr.next();
	 driver.switchTo().window(web);
	 if(driver.getTitle().equalsIgnoreCase("New Window")) {
		 driver.findElement(By.className("example")).getText();
		 System.out.println( driver.findElement(By.className("example")).getText());
	 }
	}
	}

}
