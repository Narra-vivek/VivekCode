package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import TestComponent.Helper;
import TestLibs.BrowserSetup;

public class Test1 {
    WebDriver driver;
    BrowserSetup browserSetup;
    Helper classHelper;

    @Test
    public void Tests() {
        classHelper.VerifyHome_Page();
    }

    @AfterTest
    public void Close() {
        browserSetup.closeBrowser();
    }

@BeforeTest
public void setupBrowser() {
    browserSetup = new BrowserSetup();
    driver = browserSetup.BrowserStart("saucedemo");
    Helper  classHelper = new Helper(driver);
}
}