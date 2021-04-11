package javaproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ContactPage{
	WebDriver driver;
	public ContactPage(WebDriver driver2)
	{
			this.driver= driver2;
	}		
	// initializing WebElement
	By Contact = (By.xpath("//a[@href='#/contact']"));
	By SubmitButton = (By.xpath("//a[text()='Submit']"));
	By HeaderErrorMessage = (By.xpath("/html/body/div[2]/div/div/div"));
	By ForeNameErrorMessage = (By.xpath("/html/body/div[2]/div/form/fieldset/div[1]/div/span"));
	By MessageErrorMessage = (By.xpath("/html/body/div[2]/div/form/fieldset/div[5]/div/span"));
	By Forename = (By.xpath("/html/body/div[2]/div/form/fieldset/div[1]/div/input"));
	By Email = (By.xpath("/html/body/div[2]/div/form/fieldset/div[3]/div/input"));
	By Message = (By.xpath("/html/body/div[2]/div/form/fieldset/div[5]/div/textarea"));
	By SucessMessage = (By.xpath("/html/body/div[2]/div/div"));
	
	//By InvalidMessage = (By.xpath("/html/body/div[2]/div/div/div"));
	
	
	public void ClickContact()
	{
		driver.findElement(Contact).click();
		// driver.findElement(SubmitButton).click();
		
	}
	public WebElement ClickSubmit()
	{
		//driver.findElement(Contact).click()
		 driver.findElement(SubmitButton).click();
		return null;
	}

	public WebElement ValidateErrors() {
		
		System.out.println("Header Error Message status:");
		driver.findElement(HeaderErrorMessage).isDisplayed();
		System.out.println("ForeNameErrorMessage:");
		driver.findElement(ForeNameErrorMessage).isDisplayed();
		System.out.println("MessageErrorMessage:");
		driver.findElement(MessageErrorMessage).isDisplayed();
		return null;
	}
	
	public WebElement ValidateActualErrorMessage()
	{
		String ExpectedErrorMessage = "We welcome your feedback - but we won't get it unless you complete the form correctly.";
		 String ActualErrorMessage = driver.findElement(HeaderErrorMessage).getText();
		 String Message = "The error Message mismatch";
		 Assert.assertEquals(ActualErrorMessage,ExpectedErrorMessage, Message);
		return null;
	}
	public WebElement ValidateSucessMessage()
	{
		System.out.println("Sucess message display status:");
		driver.findElement(SucessMessage).isDisplayed();
		return null;
	}
	public WebElement PopulateMfields() {
		driver.findElement(Forename).sendKeys("Arshad Ahmed");
		driver.findElement(Email).sendKeys("mailarsh.4565@gmail.com");
		driver.findElement(Message).sendKeys("Good Shopping Website");
		return null;
		
	}
	public WebElement PopulateMInvalidData() {
		driver.findElement(Forename).sendKeys("/*/*/*");
		driver.findElement(Email).sendKeys("/*/*/*");
		driver.findElement(Message).sendKeys("/*/*/*");
		return null;
		
	}
	
}



