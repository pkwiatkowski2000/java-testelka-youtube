package ModyfikatoryDostępu1;

public class ProductPage extends BasePage {
    public String productName;
    public String productPrice;

    protected ProductPage addToCart() {
        System.out.println("Produkt dodany do koszyka");
        return this;
    }
    protected ProductPage setAmount(int amount) {
        System.out.println("Wybrano ilość: " +amount);
        return this;

    }

    protected void goToCart() {
        System.out.println("Przejście do koszyka");
    }
}