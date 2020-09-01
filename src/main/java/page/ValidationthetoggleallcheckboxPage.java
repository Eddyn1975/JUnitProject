package page;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidationthetoggleallcheckboxPage<string> extends BasePage {
	WebDriver driver;

	public ValidationthetoggleallcheckboxPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//div[@class='advance-controls']/input[@name='data']")
	WebElement ADD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='controls']//following::input[@name='allbox']")
	WebElement TOGGLE_ALL_CHECKBOX;

	// Methods to interact with the elements

	String enteredcategory;
	public void enteredListItemCheckbox(String categoryName) throws InterruptedException {
		for (int i = 0; i < 1; i++) {
			enteredcategory = categoryName + randomNumGenerator();
			ADD_FIELD_LOCATOR.sendKeys(enteredcategory);
			BasePage.waitForImplicitWaitly();
			driver.findElement(By.xpath("//div[@class='advance-controls']//following::input[@value='Add']")).sendKeys(Keys.ENTER);
			BasePage.waitForImplicitWaitly();
			driver.navigate().back();
			driver.findElement(By.xpath("//div[@class='advance-controls']//following::input[@value='Add']")).sendKeys(Keys.ENTER);
			BasePage.waitForImplicitWaitly();
		}
		for (int i = 1; i < 4; i++) {
			enteredcategory = categoryName + randomNumGenerator();
			ADD_FIELD_LOCATOR.sendKeys(enteredcategory);
			BasePage.waitForImplicitWaitly();
			driver.findElement(By.xpath("//div[@class='advance-controls']//following::input[@value='Add']")).sendKeys(Keys.ENTER);
			BasePage.waitForImplicitWaitly();
		}

	}

	public void clickToggleAllCheckBox() throws InterruptedException {
		TOGGLE_ALL_CHECKBOX.click();
		BasePage.waitForImplicitWaitly();
	}

	public void beforeAllToggleCheckbox() {
		List<WebElement> allUnCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of uncheck boxes : " + Integer.toString(allUnCheckBoxes.size()));
		boolean unCheckboxItem = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		if (unCheckboxItem == false)
			System.out.println("The selected item is not checked");
		else {
			System.out.println("The selected item is checked");

		}
	}

	public void afterAllToggleCheckbox() {
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of Checked boxes : " + Integer.toString(allCheckBoxes.size()));
		int Size = allCheckBoxes.size();
		for (int i = 0; i < Size; i++) {
			boolean CheckboxItem = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
			if (CheckboxItem  == true)
				System.out.println("The selected item is checked");
			else {
				System.out.println("The selected item is not checked");
			}
		}
	}

}
