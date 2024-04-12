
	package pageObjects;
	 
	import java.time.Duration;
import java.util.List; 
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
	 
	public class PlanPage extends BasePage {
	 
		public PlanPage(WebDriver driver) {
			super(driver);
		}
		@FindBy(xpath = "//*[@id='Traveller_1']")
		WebElement Traveler1;
		@FindBy(xpath = "//*[@id='Traveller_2']")
		WebElement Traveler2;
		@FindBy(xpath = "//*[@id='feet']")
		WebElement noOfDays;
		@FindBy(xpath = "//*[@id=\"amt-modal\"]/div[3]/button")
		WebElement apply;
		@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/summary/p")
		WebElement sortby;
		@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/aside/section[1]/details/ul/li[2]")
		WebElement lowest;
		@FindBy(xpath = "//div//p[@class='quotesCard--insurerName']")
		List<WebElement> Names;
		@FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/section/article/div/div/div/div/div")
		List<WebElement> provider;
		@FindBy(xpath = "//div[@class='quotesCard__cta familyPlanPriceContainer']//span")
		List<WebElement> price;
		public void details() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(Traveler1));
			Traveler1.click();
			
			WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.elementToBeClickable(Traveler2));
			Traveler2.click();

			WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait3.until(ExpectedConditions.elementToBeClickable(noOfDays));
			noOfDays.click();
			
			Select obj=new Select(noOfDays);
			obj.selectByVisibleText("60 Days");
			
			WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait4.until(ExpectedConditions.elementToBeClickable(apply));
			apply.click();
			
			WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait5.until(ExpectedConditions.elementToBeClickable(sortby));
			sortby.click();
			
			WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait6.until(ExpectedConditions.elementToBeClickable(lowest));
			lowest.click();
			
			for(int i=0;i<3;i++) {
				System.out.println(provider.get(i).getText());
				System.out.println("Price : "+price.get(i).getText());
			}
			
		}
			
		}

	  
	
