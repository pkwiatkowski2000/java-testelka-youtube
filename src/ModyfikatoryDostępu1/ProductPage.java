package ModyfikatoryDostępu1;

public class ProductPage extends BasePage {
    public String productName;
    public String productPrice;

    protected void addToCart() {
        BasePage basePage = new BasePage();
        basePage.searchForProduct("product");
        System.out.println("Product added to cart");
    }
}