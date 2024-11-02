package AssignmentPartD;

public class Menu {
    private String[] items;
    private double[] prices;

    public Menu(String[] items, double[] prices) {
        this.items = items;
        this.prices = prices;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public double[] getPrices() {
        return prices;
    }

    public void setPrices(double[] prices) {
        this.prices = prices;
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i]);
        }
    }
}
