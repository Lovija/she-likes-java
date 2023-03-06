import java.util.Scanner;

public class Calculator {
    // psvm shortcut for main function
    public static void main(String[] args) {
        System.out.println("Calculator...");
        System.out.println("Calculating some of two numbers");
        System.out.println("Provide first number: ");
        int firstNumber;
        int secondNumber;
        //TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " +secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        int difference = firstNumber - secondNumber;
        System.out.println("Difference is: " + difference);

        int product = firstNumber * secondNumber;
        System.out.println("Product is: " + product);

        double quotient = firstNumber / secondNumber;
        System.out.println("Quotient is: " + quotient);
    }
}
