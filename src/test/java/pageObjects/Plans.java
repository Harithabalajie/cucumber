
package pageObjects;
 
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class Plans extends BasePage{
 
	public Plans(WebDriver driver) {

		super(driver);

	}

	WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));

	JavascriptExecutor js=(JavascriptExecutor)driver;
	@FindBy(xpath = ("//*[@id=\"studentTrip\"]"))
	WebElement Studenttrip;

	public void plans() {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Studenttrip));
		js.executeScript("window.scrollBy(0,100)", Studenttrip);

		Studenttrip.click();


	}
 
}
