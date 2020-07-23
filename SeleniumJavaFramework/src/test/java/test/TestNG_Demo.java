package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {

	static WebDriver driver = null;

	@BeforeTest
	public void setuptest() {

		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath +"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public static void googleSearch() {

		// go to google.com
		driver.get("https://google.com");

		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("automation");

		//driver.findElement(By.name("gsr")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}

	@Test
	public static void googleSearchagain() throws InterruptedException {

		// go to google.com
		driver.get("https://google.com");

		//enter text in search text box
		driver.findElement(By.name("q")).sendKeys("automation");

		//driver.findElement(By.name("gsr")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	@AfterTest
	public void teardown() {

		driver.close();
		driver.quit();
		System.out.println("test completed successfully");


	}


}
