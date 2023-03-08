import java.util.Scanner;

public class Calculator {
    // psvm shortcut for main function
    public static void main(String[] args) {
        System.out.println("Calculator...");
        System.out.println("Calculating some of two numbers");
        System.out.println("Provide first number: ");
        double firstNumber;
        double secondNumber;
        //TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " +secondNumber);
        double sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        double difference = firstNumber - secondNumber;
        System.out.println("Difference is: " + difference);

        double product = firstNumber * secondNumber;
        System.out.println("Product is: " + product);

        double quotient = firstNumber / secondNumber;
        System.out.println("Quotient is: " + quotient);
    }
}
