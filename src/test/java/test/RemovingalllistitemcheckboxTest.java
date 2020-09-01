package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;
import page.RemovingalllistitemcheckboxPage;
import page.DashboardPage;
import util.BrowserFactory;

public class RemovingalllistitemcheckboxTest {
	WebDriver driver;
	DashboardPage dashboard;
	RemovingalllistitemcheckboxPage removingalllistitemcheckboxpage;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		dashboard = PageFactory.initElements(driver, DashboardPage.class);
		removingalllistitemcheckboxpage = PageFactory.initElements(driver, RemovingalllistitemcheckboxPage.class);
	}

	@Test
	public void validation() throws InterruptedException {
		dashboard.dashboardValidation();;
		removingalllistitemcheckboxpage.enteredListItemCheckbox("JUnitProject");
		removingalllistitemcheckboxpage.BeforeclickingOnToggleAllCheckBox();
		removingalllistitemcheckboxpage.clickToggleAllCheckBox();
		removingalllistitemcheckboxpage.clickRemoveButton();
		removingalllistitemcheckboxpage.AfterclickingOnToggleAllCheckBox();

	}

	@After
	public void close() throws InterruptedException {
		BasePage.waitForImplicitWaitly();
		driver.close();
		driver.quit();
	}
}
