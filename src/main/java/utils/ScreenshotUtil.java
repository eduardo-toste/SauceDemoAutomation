package utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtil {
	/**
	 * Tira um screenShot do browser salvando como
	 * stepNam+yyyy-MM-dd'T'HH-mm-ss.SSS'Z'
	 * 
	 * @author Pedro Pires
	 * 
	 * @param driver - web driver em execução
	 * @param name   - o nome do step para nomeação do screenshot
	 * @throws IOException - Signals that an I/O exception of some sort has
	 *                     occurred. Thisclass is the general class of exceptions
	 *                     produced by failed orinterrupted I/O operations.
	 */
	public void TakeScreenShot(WebDriver driver, String name) throws IOException {
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH-mm-ss.SSS'Z'");
		String text = date.format(formatter);
		TakeScreenShot(driver, name + text + ".png", "target\\allure-results", "screenshots");
	}

	/**
	 * Tira um screenShot do browser salvando na pasta informada
	 *
	 * 
	 * @author Pedro Pires
	 * 
	 * @param driver - Web driver em execução
	 * @param name   - Nome do screenshot
	 * @param path	 - Caminho onde salvar o arquivo
	 * @param folder - Pasta onde o screenShot deve ser salvo
	 * 
	 * @throws IOException - Signals that an I/O exception of some sort has
	 *                     occurred. Thisclass is the general class of exceptions
	 *                     produced by failed orinterrupted I/O operations.
	 */
	public void TakeScreenShot(WebDriver driver, String name, String path, String folder) throws IOException {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Path screenshotPath = Paths.get(path, folder, name);
		Files.createDirectories(screenshotPath.getParent());
		Files.write(screenshotPath, screenshot);
		Allure.addAttachment(name, new ByteArrayInputStream(screenshot));

	}
}