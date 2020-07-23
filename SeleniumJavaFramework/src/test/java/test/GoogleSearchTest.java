package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws Exception {
		googleSearch();
}
	
	public static void googleSearch() throws InterruptedException {
		
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath +"/drivers/chromedriver/chromedriver.exe");

		 driver = new ChromeDriver();
		
		// go to google.com
		driver.get("https://google.com");
		
		//enter text in search text box
		
	//	driver.findElement(By.name("q")).sendKeys("automation");
		//driver.findElement(By.name("gsr")).click();
		GoogleSearchPage.text_search(driver).sendKeys("automation");
		Thread.sleep(2000);
		
		
	//	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("test completed successfully");
	}
}
