import java.util.Scanner;

public class gptexercise2 {
  public static void main(String [] args){
    //Q2. Write a program that prompts the user to enter 5 double values, 
    //stores them in an array of double, 
    //and then calculates and displays the sum and average of the values.
    Scanner scanner2 = new Scanner(System.in);
    double [] nums2 = new double[5];//double has a length of 5(ie 01234)
    double sum2 = 0;
    int i;
    for (i = 0; i < nums2.length; ++i) {
      System.out.println("Please enter a number in decimal places: ");
      nums2[i] = scanner2.nextDouble();
      sum2 += nums2[i];
    }
      double average2 = sum2 / nums2.length;
      System.out.println("Sum2: " + sum2);
      System.out.println("Average2:" + average2);
  }
}
