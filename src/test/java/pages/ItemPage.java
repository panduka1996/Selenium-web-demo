package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ItemPage {

	private Wait<WebDriver> wait = null;
	
	public ItemPage(WebDriver driver) {
		
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
		
	}
	
	public WebElement AddToWishListBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]")));
	}
	
	public WebElement AddToCardBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"button-cart\"]")));
	}
	
	public WebElement NavigateToCartBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]")));
	}

}
