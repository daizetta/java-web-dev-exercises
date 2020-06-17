package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven: ");
        Integer miles = input.nextInt();
        System.out.println("Enter the amount of gas you have consumed (in gallons): ");
        Integer gallon = input.nextInt();
        System.out.println("The amount of miles per gallon is: " + (miles / gallon));
    }
}
