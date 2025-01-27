package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BasePage;

import java.util.List;

public class PriceSortingPage extends BasePage {

    private static final String FILTER_FIELD = "//*[@id=\"header_container\"]/div[2]/div/span/select";
    private static final String INCREASINGPRICE_FILTER = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]";
    private static final String DECREASINGPRICE_FILTER = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]";
    private static final String ITEMS_PRICE = "inventory_item_price";

    public WebElement getFilterField(){
        return driver.findElement(By.xpath(FILTER_FIELD));
    }

    public WebElement getIncreasingPriceField(){
        return driver.findElement(By.xpath(INCREASINGPRICE_FILTER));
    }

    public WebElement getDecreasingPriceField(){
        return driver.findElement(By.xpath(DECREASINGPRICE_FILTER));
    }

    public List<WebElement> getItemsPrices() {
        return driver.findElements(By.className(ITEMS_PRICE));
    }

}
