package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgeSelection extends BasePage {
    JavascriptExecutor js=(JavascriptExecutor)driver;
	public AgeSelection(WebDriver driver) {
		super(driver);
	}
	   @FindBy(xpath="//label[@for=\"traveller_2\"]")
	   WebElement no_of_people;
	   @FindBy(xpath="//*[contains(text(),'traveller 1')]")
	   WebElement age1;
	   @FindBy(xpath="//*[@id=\"optionBox_0_wrapper\"]/div[24]")
	   WebElement age1select;
	   @FindBy(xpath="//*[contains(text(),'traveller 2')]")
	   WebElement age2;
	   @FindBy(xpath="//*[@id=\"optionBox_1_wrapper\"]/div[23]")
	   WebElement age2select;
	   
	   public void noofpeoples()
		{
		   WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.elementToBeClickable(no_of_people));
			no_of_people.click();
			
			WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.elementToBeClickable(age1));
			age1.click();
			
			WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.elementToBeClickable(age1select));
			age1select.click();
			
			WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait4.until(ExpectedConditions.elementToBeClickable(age2));
			age2.click();
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(age2select));
			age2select.click();
		}
}
 