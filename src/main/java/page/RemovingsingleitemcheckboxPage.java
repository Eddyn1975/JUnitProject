package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemovingsingleitemcheckboxPage<string> extends BasePage{
	WebDriver driver;

	public RemovingsingleitemcheckboxPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//div[@class='advance-controls']/input[@name='data']")
	WebElement ADD_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//div[@class='controls']//following::input[@value='Remove']")
	WebElement REMOVE_BUTTON;
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	WebElement SINGLE_ITEM_CHECKBOX_BUTTON;

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
	
	public void SingleItemCheckbox() throws InterruptedException {
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total Number of Single item checkbox : " + Integer.toString(elements.size()));
		SINGLE_ITEM_CHECKBOX_BUTTON.click();
	}

	public void clickRemoveButton() throws InterruptedException {
		REMOVE_BUTTON.click();
		BasePage.waitForImplicitWaitly();
	}

	public void validateIfSingleItemHasBeenRemoved() {
		List<WebElement> SingleItemCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of remaining Single item checkbox : " + Integer.toString(SingleItemCheckBox.size()));

	}
}
