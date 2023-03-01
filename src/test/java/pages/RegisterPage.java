package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RegisterPage {

	private Wait<WebDriver> wait = null;
	
	public RegisterPage(WebDriver driver) {
		
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
		
	}
	
	public WebElement FirstName() {
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-firstname\"]")));
	}
	
	public WebElement LastName(){
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-lastname\"]")));
    }

    public WebElement Email(){
    	
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-email\"]")));
    }

    public WebElement Telephone(){
    	
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-telephone\"]")));
    }

    public WebElement Password(){
    	
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-password\"]")));
    }

    public WebElement ConformPassword(){
    	
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"input-confirm\"]")));
    }
    
    public WebElement AcceptPolicy(){
    	
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")));
    }
    
    public WebElement RegisterBtn(){
    	
    	return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")));
    }
   
}
