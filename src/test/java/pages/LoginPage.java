package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class LoginPage {

	private Wait<WebDriver> wait = null;
	
	public LoginPage(WebDriver driver) {
		
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
		
	}
	
	public WebElement EmailAddress() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-email\"]")));
	}
	
	public WebElement Password() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-password\"]")));
	}
	
	public WebElement LoginBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")));
	}
	
	public WebElement BackToHome() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"account-account\"]/ul/li[1]/a/i")));
	}

}
