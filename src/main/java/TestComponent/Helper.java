package TestComponent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Helper {
    private WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }

    public void VerifyHome_Page() {
    	try {
    		
    		String Logo_text = driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
            System.out.println(Logo_text);
            Assert.assertEquals(Logo_text, "Swag Labs");
    	}
        catch (Exception | Error e) {
        	
        }
    }
    
    
    public void Login() {
    	
    	try {
    		
    		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
    		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    		WebElement Login_BTN = driver.findElement(By.xpath("//input[@id='login-button']"));
    		Login_BTN.click();
    	}
    	catch(Exception | Error e) {
    		
    	}
    	
    }
    
    
    
    
}

