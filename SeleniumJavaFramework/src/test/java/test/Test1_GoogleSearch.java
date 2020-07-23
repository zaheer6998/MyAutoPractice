package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	
	public static void main(String[] args) throws Exception {
		googleSearch();
}
	
	public static void googleSearch() throws InterruptedException {
		
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath +"/drivers/chromedriver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		// go to google.com
		driver.get("https://google.com");
		
		//enter text in search text box
		
		driver.findElement(By.name("q")).sendKeys("automation");
		//driver.findElement(By.name("gsr")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("test completed successfully");
	}
}
