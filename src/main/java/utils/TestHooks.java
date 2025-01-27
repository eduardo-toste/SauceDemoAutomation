package utils;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.io.IOException;

public class TestHooks extends BasePage{

	private DriverFactory driverFactory;

	@Before
	public void setUp() {
		driverFactory = new DriverFactory(); // Create an instance of the DriverFactory
		driverFactory.initializeChromeDriver(); // Initialize the ChromeDriver
		System.out.println("WebDriver initialized.");
	}

	@After
	public void tearDown() {
		if (DriverFactory.DRIVER != null) {
			DriverFactory.DRIVER.quit(); // Close the WebDriver if it has been initialized
			System.out.println("WebDriver closed.");

		}
	}

	@AfterStep
    public void stepScreenshot(Scenario scenario) throws IOException {
            captureScreenshot(scenario); // Call the BasePage method to take a screenshot
        
        
	}
}