package cheating;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo11 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement cal = driver.findElement(By.xpath("//input[@id=\"form-field-travel_comp_date\"]"));
		// Thread.sleep(3000);

		js.executeScript("arguments[0].scrollIntoView()", cal);
		Thread.sleep(2000);
		cal.click();

		
	    String currentMonth = driver.findElement(By.xpath("//span[@class=\"cur-month\"]")).getText();
		System.out.println(currentMonth);
		
		for(int i=0; i<6; i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class=\"flatpickr-next-month\"]/child::*")).click();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String month = driver.findElement(By.xpath("//span[text()=\"June \"]")).getText();
		//System.out.println(month);
		

	/*
		
	 
//String dec = driver.findElement(By.xpath("//span[text()=\"December \"]")).getText();
	
	if(driver.findElement(By.xpath("//*[@class=\"numInput cur-year\"]")).getText().equals(2025)) {
		while(!month.equalsIgnoreCase(driver.findElement(By.xpath("//span[text()=\"December \"]")).getText())) {
			driver.findElement(By.xpath("//span[@class=\"flatpickr-next-month\"]/child::*")).click();
		}*/
	}

}
