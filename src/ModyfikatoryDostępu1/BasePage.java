package ModyfikatoryDostępu1;

public class BasePage {
    public String title;
    public String url;

    public BasePage() {}

    public void goTo (String pageUrl){
        System.out.println("Going to page");

    }

    // Protected można użyć w obrębie tego samego pakietu lub w klasie dziedziczącej po tej klasie
    // Domyślny modyfikator dostępu można użyć tylko w obrębie tego samego pakietu

    public void searchForProduct(String product) {
        System.out.println("Searching for product " + product);
        System.out.println(url);
    }
}