package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver = null;

	By Search_Textbox = By.name("q");
	By Button_search = By.name("btnK");

	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;

	}
	public void settextInSearchBopx(String text) {

		driver.findElement(Search_Textbox).sendKeys(text);
	}


	public void ClickSearchButton() {

		driver.findElement(Button_search).sendKeys(Keys.RETURN);

	}



}
