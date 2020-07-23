import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		String ProjectPath = System.getProperty("user.dir");
		System.out.println(ProjectPath);
		
		//System.setProperty("webdriver.gecko.driver", ProjectPath +"/SeleniumJavaFramework/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", ProjectPath +"/drivers/chromedriver/chromedriver.exe");
		// we do not have to set system property for chrome because I have added it to the environment varialbel the c
		// chrome driver path.
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", ProjectPath +"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://google.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//driver.findElement(By.name("q")).sendKeys("abcd");
		
		//WebElement aaa = driver.findElement(By.name("q"));
		//aaa.sendKeys("automation");
	List<WebElement> bakeries = driver.findElements(By.xpath("//input"));
	int aa = bakeries.size();
	//String bakeries = myList.get(3).getText();
	//System.out.println(aaaa);
	
	//************** NOTE - THIS NEEDS TO BE DONE -  PRINT ALL THE TEXT FROM THE LIST ELEMENTS ON THE PAGE *****************************************
			System.out.println(aa);	
			for (WebElement webElement : bakeries) {
	            String name = webElement.getText();
	            System.out.println(name);
			//	Thread.sleep(3000);
		driver.close();
		driver.quit();
	
			}
	}
}

