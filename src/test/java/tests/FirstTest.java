package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.ShoppingCartPage;

public class FirstTest extends BaseClass {

	String Email = RandomEmailGenerator();
	
	@Test(priority = 1,description="Register as a new user")
	public void Test1() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		RegisterPage registerPage = new RegisterPage(driver);

		Thread.sleep(1000); // To slow the process
		
		WebElement element1 = homePage.MyAccount(); // Click the My Account button
		element1.click();

		Thread.sleep(1000); // To slow the process
		
		WebElement element2 = homePage.RegisterBtn(); // Click the register button
		element2.click();
		
		Thread.sleep(1000); // To slow the process

		WebElement element3 = registerPage.FirstName(); // Enter first name
		element3.sendKeys("Panduka");

		WebElement element4 = registerPage.LastName(); // Enter last name
		element4.sendKeys("Wijekoon");

		WebElement element5 = registerPage.Email(); // Enter email
		element5.sendKeys(Email);

		WebElement element6 = registerPage.Telephone(); // Enter telephone number
		element6.sendKeys("0763533511");

		WebElement element7 = registerPage.Password(); // Enter password
		element7.sendKeys("123456");

		WebElement element8 = registerPage.ConformPassword(); // Enter confirm password
		element8.sendKeys("123456");
		
		WebElement element9 = registerPage.AcceptPolicy(); // Accept the policy
		element9.click();
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element10 = registerPage.RegisterBtn(); // Click register continues button
		element10.click();
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element11 = homePage.MyAccount(); // Click my account button
		element11.click();
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element12 = homePage.LogoutBtn(); // Click logout button
		element12.click();
		
		Thread.sleep(1000); // To slow the process

	}
	
	@Test(priority = 2,description="Login to the store")
	public void Test2() throws InterruptedException{
		
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);
		
		WebElement element1 = homePage.MyAccount(); // Click my account button
		element1.click();
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element2 = homePage.LoginBtn(); // Click login button
		element2.click();
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element3 = loginPage.EmailAddress(); // Enter email
		element3.sendKeys(Email);
		
		WebElement element4 = loginPage.Password(); // Enter password
		element4.sendKeys("123456");
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element5 = loginPage.LoginBtn(); // Enter login continue button
		element5.click();
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element6 = loginPage.BackToHome(); // Click the home button
		element6.click();
		
		Thread.sleep(1000); // To slow the process
		
	}
	
	@Test(priority = 3,description="Select the first item from the featured list")
	public void Test3() throws InterruptedException {
		
		HomePage homePage = new HomePage(driver);
		
		WebElement element1 = homePage.FirstItem(); // Click the first item
		element1.click();
		
		Thread.sleep(1000); // To slow the process
		
	}
	
	@Test(priority = 4,description="Add the selected item to the wish list")
	public void Test4() throws InterruptedException {
		
		ItemPage itemPage = new ItemPage(driver);
		
		WebElement element1 = itemPage.AddToWishListBtn(); // Add to wish list
		element1.click();
		
		Thread.sleep(1000); // To slow the process
		
	}

	@Test(priority = 5,description="Add the selected item to the cart")
	public void Test5() throws InterruptedException {
		
		ItemPage itemPage = new ItemPage(driver);
		
		WebElement element1 = itemPage.AddToCardBtn(); // Add to cart
		element1.click();
		
		Thread.sleep(1000); // To slow the process
		
	}
	
	@Test(priority = 6,description="Navigate to the shopping cart")
	public void Test6() throws InterruptedException {
		
		ItemPage itemPage = new ItemPage(driver);
		
		WebElement element1 = itemPage.NavigateToCartBtn(); // Navigate to the shopping cart
		element1.click();
		
		Thread.sleep(1000); // To slow the process
		
	}
	
	@Test(priority = 7,description="Change the quantity")
	public void Test7() throws InterruptedException {
		
		ShoppingCartPage cartPage = new ShoppingCartPage(driver);
		
		WebElement element1 = cartPage.QuatityTxt();
		element1.clear();
		element1.sendKeys("12"); // Change the quantity
		
		Thread.sleep(1000); // To slow the process
		
		WebElement element2 = cartPage.QuatityUpdateBtn(); // Update the quantity
		element2.click();
		
		Thread.sleep(1000); // To slow the process
		
	}
	
	@Test(priority = 8,description="Place order")
	public void Test8() throws InterruptedException {
		
		ShoppingCartPage cartPage = new ShoppingCartPage(driver);
		
		WebElement element1 = cartPage.CheckoutBtn(); // Enter the checkout button
		element1.click();
		
		Thread.sleep(1000); // To slow the process
		
	}

	
	public String RandomEmailGenerator() {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";

		StringBuilder sb = new StringBuilder(10);

		for (int i = 0; i < 10; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());

			sb.append(AlphaNumericString.charAt(index));
		}

		sb.append("@gmail.com");
		
		return sb.toString();

	}

}
