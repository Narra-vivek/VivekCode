package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestComponent.Helper;
import TestLibs.BrowserSetup;

public class SwagLabs {
    WebDriver driver;
    BrowserSetup browserSetup;
    Helper classHelper;

    @BeforeTest
    public void setupBrowser() {
        browserSetup = new BrowserSetup();
        driver = browserSetup.BrowserStart("saucedemo");
        classHelper = new Helper(driver);
    }

    @Test
    public void Tests() {
        classHelper.VerifyHome_Page();
        classHelper.Login();
    }

    @AfterTest
    public void Close() {
        browserSetup.closeBrowser();
    }
}
