package javaproject;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testclass {
	
	
//	public static void main(String[] args)
	
	 WebDriver driver;
		WebDriverWait Submit = new WebDriverWait(driver, 10);

		@BeforeTest
		public void BeforeTest()	
		{
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C://selenium jars and folders//drivers/chromedriver.exe");	
	  driver.get("http://jupiter.cloud.planittesting.com");
	  driver.manage().window().maximize();
	  
	  
		}
@Test(priority= 0)
public void TestCase1()	
{
	
	  // creating object to contact page
	  ContactPage mandatefield= new ContactPage(driver);
	  //// Navigate to contact page
	  mandatefield.ClickContact();
	 // click submit
	  mandatefield.ClickSubmit();
			// validate error messages
	  mandatefield.ValidateErrors();
	  // Adding mandate fields
	  mandatefield.PopulateMfields();
	// validate error messages
		  mandatefield.ValidateErrors();
}
@Test(priority= 1)
public void TestCase2()	
{
	// creating object to contact page
		  ContactPage SucessMessage = new ContactPage(driver);
	// Navigate to contact page
		  SucessMessage.ClickContact();
	//Populating mandate fields
		  SucessMessage.PopulateMfields();
	//Click submit
		  SucessMessage.ClickSubmit();
	//Validate sucess message  
		  SucessMessage.ValidateSucessMessage();
	}
@Test(priority= 2)
public void TestCase3()	
{
	// Creating object to contact page
	ContactPage InvalidMessage = new ContactPage(driver);
	// Navigate to Contact Page
	InvalidMessage.ClickContact();
	// populate Invalid Data
	InvalidMessage.PopulateMInvalidData();
	//Validate Error Message
	InvalidMessage.ValidateActualErrorMessage();

}
@Test(priority= 3)
public void TestCase4()	
{
	//Creating Object to ShopPage
	ShopPage Cart = new ShopPage(driver);
	
	// Navigate to Shop page
	Cart.ClickShop();
	//Double click Funnycow
	Cart.ValidateClickBuyButtonFunnyCow();
	//Click Fluffy Bunny
	Cart.ValidateClickBuyFluffyBunny();
	// Navigate to Cart menu
	Cart.ClickCartMenu();
	
	//Creating Object for Cart Page
	CartPage CartItems = new CartPage(driver);
	// Validating Cart items
	CartItems.ValidateCartItems();	

}
    @AfterTest
    public void AfterTest()	
    {
    	driver.quit();
    }
	}
 
