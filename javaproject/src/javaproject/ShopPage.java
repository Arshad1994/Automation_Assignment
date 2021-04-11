package javaproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShopPage{
	WebDriver driver;
	public ShopPage(WebDriver driver2)
	{
			this.driver= driver2;
			
	}
	
	// initializing WebElement	
	By ShopMenu = (By.xpath("/html/body/div[1]/div/div/div/ul[1]/li[2]/a"));
	By BuyFunnyCow = (By.xpath("/html/body/div[2]/div/ul/li[6]/div/p/a"));
	By BuyFluffyBunny = (By.xpath("/html/body/div[2]/div/ul/li[4]/div/p/a"));
	By Cart = (By.xpath("/html/body/div[1]/div/div/div/ul[2]/li[4]/a"));
	
	public WebElement ClickShop()
	{
		driver.findElement(ShopMenu).click();
	
		return null;
	}
	
	public WebElement ClickCartMenu()
	{
		driver.findElement(Cart).click();
	
		return null;
	}
	
	public WebElement ValidateClickBuyButtonFunnyCow()
	{
		driver.findElement(BuyFunnyCow).click();
		driver.findElement(BuyFunnyCow).click();
	String ActualValue = driver.findElement(Cart).getText();
    String ExpectedValue = "Cart (2)";
    String Message = "Cart item number mismatch";
		Assert.assertEquals(ActualValue, ExpectedValue, Message);
		return null;
	 }
	public WebElement ValidateClickBuyFluffyBunny()
	{
		driver.findElement(BuyFluffyBunny).click();
	String ActualValue = driver.findElement(Cart).getText();
    String ExpectedValue = "Cart (3)";
    String Message = "Cart item number mismatch";
		Assert.assertEquals(ActualValue, ExpectedValue, Message);
		return null;
	 }

		
	}


