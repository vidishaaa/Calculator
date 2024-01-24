//Calculator.java
public class Calculator {
 // Addition
 public double addition(double num1, double num2) {
 return num1 + num2;
 }
 // Subtraction
 public double subtraction(double num1, double num2) {
 return num1 - num2;
 }
 // Multiplication
 public double multiplication(double num1, double num2) {
 return num1 * num2;
 }
 // Division
 public double division(double num1, double num2) {
 if (num2 != 0) {
 return num1 / num2;
 } else {
 throw new ArithmeticException("Cannot divide by zero");
 }
 }
 // Sum of array
 public double sumOfArray(double[] numbersArray) {
 double sum = 0;
 for (double num : numbersArray) {
 sum += num;
 }
 return sum;
 }
 // Variance of array
 public double varianceOfArray(double[] numbersArray) {
 double mean = sumOfArray(numbersArray) / numbersArray.length;
 double sumOfSquaredDifferences = 0;
 for (double num : numbersArray) {
 sumOfSquaredDifferences += Math.pow(num - mean, 2);
 }
 return sumOfSquaredDifferences / numbersArray.length;
 }
 // Standard deviation of array
 public double standardDeviationOfArray(double[] numbersArray) {
 return Math.sqrt(varianceOfArray(numbersArray));
 }
}
