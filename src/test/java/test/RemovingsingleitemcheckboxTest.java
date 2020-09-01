package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemovingsingleitemcheckboxPage;
import page.BasePage;
import page.DashboardPage;
import util.BrowserFactory;

public class RemovingsingleitemcheckboxTest {
	WebDriver driver;
	DashboardPage dashboard;
	RemovingsingleitemcheckboxPage removingsingleitemcheckbox;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		dashboard = PageFactory.initElements(driver, DashboardPage.class);
		removingsingleitemcheckbox = PageFactory.initElements(driver, RemovingsingleitemcheckboxPage.class);
	}

	@Test
	public void validation() throws InterruptedException { 
		dashboard.dashboardValidation();
		
		// dashboard.verifyToDoListElement();
		removingsingleitemcheckbox.enteredListItemCheckbox("JUnitProject");
		removingsingleitemcheckbox.SingleItemCheckbox();
		removingsingleitemcheckbox.clickRemoveButton();
		removingsingleitemcheckbox.validateIfSingleItemHasBeenRemoved();
	
	}

	@After
	public void close() throws InterruptedException {
		BasePage.waitForImplicitWaitly();
		driver.close();
		driver.quit();
	}
}
