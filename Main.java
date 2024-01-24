import java.io.*;
import java.util.* ; 
public class Main {
 public static void main(String[] args) {
 // Create an instance of UserInput and Calculator
 UserInput userInput = new UserInput();
 Calculator calculator = new Calculator();
 // Perform operations based on user input
 double[] numbers = userInput.inputNumbers(2); // Adjust the count as needed
 // Extracting numbers for individual operations
 double num1 = numbers[0];
 double num2 = numbers[1];
 // Addition
 System.out.println("Sum: " + calculator.addition(num1, num2));
 // Subtraction
 System.out.println("Difference: " + calculator.subtraction(num1, num2));
 // Multiplication
 System.out.println("Product: " + calculator.multiplication(num1, num2));
 // Division
 System.out.println("Quotient: " + calculator.division(num1, num2));
 System.out.println("\n\n");
 // Sum of array
 double[] numbersArray = userInput.inputNumbers(5); // Adjust the count as needed
 System.out.println("Sum of array: " + calculator.sumOfArray(numbersArray));
 // Variance of array
 System.out.println("Variance of array: " + calculator.varianceOfArray(numbersArray));
 // Standard deviation of array
 System.out.println("Standard Deviation of array: " + 
calculator.standardDeviationOfArray(numbersArray));
 }
}