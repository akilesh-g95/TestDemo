package cheating;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("Screenshot//screenshot1.png"));
		
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("Akhileshg@globussoft.in");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Akilesh@123");
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
		
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("Screenshot//screenshot2.png"));
		
		Thread.sleep(3000);
		driver.quit();
	}

}
