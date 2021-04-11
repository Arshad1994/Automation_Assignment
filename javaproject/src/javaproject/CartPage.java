package javaproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CartPage{
	WebDriver driver;
	public  CartPage(WebDriver driver2)
	{
			this.driver= driver2;
	}		
	// initializing WebElement
	By FluffyBunny = (By.xpath("/html/body/div[2]/div/form/table/tbody/tr[1]/td[1]"));
	By FunnyCow = (By.xpath("/html/body/div[2]/div/form/table/tbody/tr[2]/td[1]"));
	By QuantityFluffyBunny = (By.xpath("/html/body/div[2]/div/form/table/tbody/tr[1]/td[3]/input"));
	By QuantityFunnyCow = (By.xpath("/html/body/div[2]/div/form/table/tbody/tr[2]/td[3]/input"));
	
public WebElement ValidateCartItems() {
		
		System.out.println("Fluffy Bunny Display Status:");
		driver.findElement(FluffyBunny).isDisplayed();
		
		System.out.println("Fluffy Bunny Quantity Display Status:");
		driver.findElement( QuantityFluffyBunny).isDisplayed();
		

		System.out.println("Funny Cow Display Status:");
		driver.findElement(FunnyCow).isDisplayed();
		
		System.out.println("Funny Cow Quantity Display Status:");
		driver.findElement( QuantityFunnyCow ).isDisplayed();
		
		return null;	
	
   }
}