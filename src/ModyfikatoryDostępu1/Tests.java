package ModyfikatoryDostępu1;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void productPriceTest() {
        ProductPage productPage = new ProductPage();
        productPage.goTo("jakiś url");
        String price = productPage.productPrice;


        HomePage homePage = new HomePage();
        homePage.searchForProduct("Kawa");

    }
}