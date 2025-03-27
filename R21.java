package aleksandre_guledani_1.quiz1.t2.cup.sub;

import aleksandre_guledani_1.quiz1.t2.cup.A21;
import aleksandre_guledani_1.quiz1.t2.cheese.aria.A22;

public class R21 {

    public void displayInfo() {
        // Create instances of A21 and A22
        A21 a21 = new A21();
        A22 a22 = new A22();

        // Calculate and display the area of the rectangle from A21
        int area = a21.getWidth() * a21.getHeight();
        System.out.println("Area of the rectangle: " + area);

        // Get and display the name of the month from A22
        String monthName = getMonthName(a22.getMonth());
        System.out.println("Month: " + monthName);
    }

    // Helper method to convert month number to month name
    private String getMonthName(int month) {
        // Array of month names
        String[] months = {
            "Invalid month", "January", "February", "March", "April", "May", 
            "June", "July", "August", "September", "October", "November", "December"
        };

        // Check if month is valid (1-12), otherwise return "Invalid month"
        if (month < 1 || month > 12) {
            return months[0]; // Invalid month
        }
        
        // Return the corresponding month name
        return months[month];
    }

    public static void main(String[] args) {
        // Create an instance of R21 and call the displayInfo method
        R21 r21 = new R21();
        r21.displayInfo();
    }
}
