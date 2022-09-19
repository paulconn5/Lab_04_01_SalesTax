public class Main {
    public static void main(String[] args) {
        double purchasePrice = 100;
        double salesTax =  purchasePrice*0.05;
        double totalPrice = purchasePrice+salesTax;

        System.out.println("The price is $" + purchasePrice + " and the salestax is $" + salesTax + ", so the total is $" + totalPrice);

    }
}