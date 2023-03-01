package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HomePage {

	private Wait<WebDriver> wait = null;
	
	public HomePage(WebDriver driver) {
		
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
		
	}
	
	public WebElement MyAccount() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")));
	}
	
	public WebElement RegisterBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")));
	}	
	
	public WebElement LogoutBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")));
	}
	
	public WebElement LoginBtn() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")));
	}
	
	public WebElement FirstItem() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[2]/div[1]")));
	}
	
}
