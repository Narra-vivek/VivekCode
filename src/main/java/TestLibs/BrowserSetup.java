
package TestLibs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {
    public WebDriver driver;
    private Properties properties;

    public BrowserSetup() {
        loadProperties();
    }

    private void loadProperties() {
        properties = new Properties();
        try (FileInputStream input = new FileInputStream("C:\\Users\\vivek\\git\\repository\\Vivek-Code\\src\\main\\resources\\Config\\URL")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public WebDriver BrowserStart(String urlKey) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\eclipse-workspace\\Vivek-Code\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl(urlKey));
        return driver;
    }

    public String getUrl(String key) {
        return properties.getProperty(key);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
