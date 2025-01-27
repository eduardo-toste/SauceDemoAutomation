package actions;

import org.openqa.selenium.WebElement;
import pages.PriceSortingPage;
import utils.BasePage;

import java.util.List;

public class PriceSortingPageActions extends BasePage {
    PriceSortingPage priceSortingPage = new PriceSortingPage();

    public void selectFilter(){
        priceSortingPage.getFilterField().click();
    }

    public void selectIncreasingPriceFilter(){
        priceSortingPage.getIncreasingPriceField().click();
    }

    public void selectDecreasingPriceField(){
        priceSortingPage.getDecreasingPriceField().click();
    }

    public boolean validateIncSorting() {
        List<WebElement> prices = priceSortingPage.getItemsPrices();

        if (prices.size() >= 3) {
            double firstPrice = Double.parseDouble(prices.get(0).getText().replace("$", ""));
            double secondPrice = Double.parseDouble(prices.get(1).getText().replace("$", ""));
            double thirdPrice = Double.parseDouble(prices.get(2).getText().replace("$", ""));

            boolean sorted = (firstPrice < secondPrice && secondPrice < thirdPrice) ? true : false;
            return sorted;
        }
        return false;
    }

    public boolean validateDecSorting() {
        List<WebElement> prices = priceSortingPage.getItemsPrices();

        if (prices.size() >= 3) {
            double firstPrice = Double.parseDouble(prices.get(0).getText().replace("$", ""));
            double secondPrice = Double.parseDouble(prices.get(1).getText().replace("$", ""));
            double thirdPrice = Double.parseDouble(prices.get(2).getText().replace("$", ""));

            boolean sorted = (firstPrice > secondPrice && secondPrice > thirdPrice) ? true : false;
            return sorted;
        }
        return false;
    }

}
