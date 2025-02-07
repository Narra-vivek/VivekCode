package TestComponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Helper {
    private WebDriver driver;

    public Helper(WebDriver driver) {
        this.driver = driver;
    }

    public void VerifyHome_Page() {
        String Logo_text = driver.findElement(By.xpath("//div[@class='login_logo']")).getText();
        System.out.println(Logo_text);
        Assert.assertEquals(Logo_text, "Swag Labs");
    }
}
