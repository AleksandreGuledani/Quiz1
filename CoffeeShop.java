package aleksandre_guledani_1.quiz1.t3;

public class CoffeeShop {
    int pricePerCoffee = 250; // tetri
    int numCoffeeSold = 100; // number of coffees sold
    int totalCostOfBeans = 15000; // tetri
    
    // Calculate other expenses from the expenses.txt file
    int otherExpenses = calculateOtherExpenses();
    
    // Calculate profit
    double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);
    
    // Method to calculate other expenses
    private int calculateOtherExpenses() {
        // Converting all expenses to tetri
        int tax = 51 * 100; // 51 lari to tetri
        int water = 75; // already in tetri
        int gas = 159; // already in tetri
        int electricity = 148 * 100; // 148 lari to tetri
        int parking = 51 * 100; // 51 lari to tetri
        
        // Sum up all expenses
        return tax + water + gas + electricity + parking;
    }
    
    // Method to calculate profit
    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, int totalCostOfBeans, int otherExpenses) {
        // Calculate total revenue in tetri
        int totalRevenue = pricePerCoffee * numCoffeeSold;
        
        // Calculate total expenses in tetri
        int totalExpenses = totalCostOfBeans + otherExpenses;
        
        // Calculate profit in tetri and convert to lari
        double profitInLaris = (totalRevenue - totalExpenses) / 100.0;
        
        return profitInLaris;
    }
}