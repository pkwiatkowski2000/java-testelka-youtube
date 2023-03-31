package ModyfikatoryDostępu1;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    public void addToCartTest() {
        ProductPage productPage = new ProductPage();
        productPage.setAmount(3).addToCart().goToCart();
    }
}