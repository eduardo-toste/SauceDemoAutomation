package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
	public static ChromeDriver DRIVER;
	private String driverDownloadPath = "C:\\temp\\chromedriver_win32";
	private WebDriverWait WAIT;
	
    public void initializeChromeDriver() {
    	WebDriverManager wdm = WebDriverManager.chromedriver();
    	wdm.cachePath(driverDownloadPath);
    	wdm.setup();
        System.setProperty("webdriver.chrome.driver", wdm.getDownloadedDriverPath());
        DRIVER = new ChromeDriver();
        DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        configureDriver();
    }
    
    private void configureDriver() {
    	DRIVER.manage().window().maximize();
    	DRIVER.manage().deleteAllCookies();
    	WAIT = new WebDriverWait(DRIVER, Duration.ofSeconds(30));
    	
    }
}
