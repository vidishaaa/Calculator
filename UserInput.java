// UserInput.java
import java.util.*;
public class UserInput {
 public double[] inputNumbers(int count) {
 Scanner sc = new Scanner(System.in);
 double[] numbers = new double[count];
 for (int i = 0; i < count; i++) {
 System.out.println("Enter number " + (i + 1) + ": ");
 numbers[i] = sc.nextDouble();
 }
 return numbers;
 }
}