package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageText {
	private static WebDriver driver = null;
	public static void main(String[] args) {

		googleSeachTest();

	}

	public static void googleSeachTest() {
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath +"/drivers/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();

		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

		driver.get("http://google.com");
		searchPageObj.settextInSearchBopx("Automation");
		searchPageObj.ClickSearchButton();
		driver.close();
		System.out.println("Test is done and browser closed.");

	}

}
