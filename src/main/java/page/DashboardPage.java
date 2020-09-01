package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	// Elements library

	@FindBy(how = How.XPATH, using = "//*[@id='label-first']/b")
	WebElement TODOLIST_TITLE;

	// Methods to interact with the elements

	public void dashboardValidation() {
		Assert.assertEquals(TODOLIST_TITLE.getText(), "NSS-TODO List v 1.1", "Wrong page!!!");
		BasePage.waitForElement(TODOLIST_TITLE, driver);

	}
}
