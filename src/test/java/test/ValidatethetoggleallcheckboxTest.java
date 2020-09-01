package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.BasePage;
import page.DashboardPage;
import page.ValidationthetoggleallcheckboxPage;
import util.BrowserFactory;

public class ValidatethetoggleallcheckboxTest{
	WebDriver driver;
	DashboardPage dashboard;
	ValidationthetoggleallcheckboxPage validationtoggleallcheckboxpage;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		dashboard = PageFactory.initElements(driver, DashboardPage.class);
		validationtoggleallcheckboxpage = PageFactory.initElements(driver, ValidationthetoggleallcheckboxPage.class);
	}
	
	
	@Test
	public void validation() throws InterruptedException {
		dashboard.dashboardValidation();
		validationtoggleallcheckboxpage.enteredListItemCheckbox("JunitProject");
		validationtoggleallcheckboxpage.beforeAllToggleCheckbox();
		validationtoggleallcheckboxpage.clickToggleAllCheckBox();
		validationtoggleallcheckboxpage.afterAllToggleCheckbox();
	
	}
	@After
	public void close() throws InterruptedException {
		BasePage.waitForImplicitWaitly();
		driver.close();
		driver.quit();
  }
}
