package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ShoppingCartPage {

	private Wait<WebDriver> wait = null;
	
	public ShoppingCartPage(WebDriver driver) {
		
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
		
	}
	
	public WebElement QuatityTxt() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")));
	}
	
	public WebElement QuatityUpdateBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]")));
	}

	public WebElement CheckoutBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")));
	}
	
}
