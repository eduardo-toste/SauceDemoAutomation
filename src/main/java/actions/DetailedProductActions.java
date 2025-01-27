package actions;

import org.junit.Assert;
import pages.DetailedProductPage;
import utils.BasePage;

public class DetailedProductActions extends BasePage {
    DetailedProductPage detailedProductPage = new DetailedProductPage();

    public void selectProduct(){
        detailedProductPage.getProductField().click();
    }

    public void viewProductDetails(){
        String expectedDescription = "Sauce Labs Fleece Jacket\nIt's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.\n$49.99\nAdd to cart";
        Assert.assertEquals(expectedDescription, detailedProductPage.getProductDetails().getText());
    }
}
