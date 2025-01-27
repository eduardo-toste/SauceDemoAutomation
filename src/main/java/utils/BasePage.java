package utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Base class for all page classes. This class manages the WebDriver and provides common functionality.
 */
public class BasePage {
    protected static WebDriver driver; // Static WebDriver instance
    private ScreenshotUtil screenshotUtil; // Instance of ScreenshotUtil

    public BasePage() {
        // Initialize the driver from DriverFactory
        this.driver = DriverFactory.DRIVER;
        this.screenshotUtil = new ScreenshotUtil(); // Initialize ScreenshotUtil with the driver
    }

    /**
     * Captures a screenshot and saves it to the Allure report.
     * This method can be called in hooks to capture the state of the application.
     * @throws IOException 
     */
    public void captureScreenshot(Scenario scenario) throws IOException {
        if (driver != null) {
            screenshotUtil.TakeScreenShot(driver, scenario.getName()); // Call the capture method from ScreenshotUtil
        }
    }
}