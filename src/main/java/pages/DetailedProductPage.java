package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

public class DetailedProductPage extends BasePage {

    private static final String PRODUCT_FIELD = "//*[contains(text(), 'Sauce Labs Fleece Jacket')]";
    private static final String PRODUCT_DETAILS = "//*[@id=\"inventory_item_container\"]/div/div/div[2]";

    public WebElement getProductField(){
        return driver.findElement(By.xpath(PRODUCT_FIELD));
    }

    public WebElement getProductDetails(){
        return driver.findElement(By.xpath(PRODUCT_DETAILS));
    }
}
