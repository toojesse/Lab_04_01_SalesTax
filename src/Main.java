public class Main {
    public static void main(String[] args) {
        double itemPrice = 45.00;
        final double SALES_TAX_RATE = 0.05;
        double salesTax = itemPrice * SALES_TAX_RATE;

        System.out.println("The purchase price is $" + itemPrice + " and the calculated sales tax is $" + salesTax);
    }
}
