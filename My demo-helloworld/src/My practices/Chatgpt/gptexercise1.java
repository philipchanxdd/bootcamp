package Chatgpt;
import java.util.Scanner;

public class gptexercise1 {
  public static void main(String [] args){
    //Q1. Write a program that prompts the user to enter 5 integer values, 
    //stores them in an array of int, 
    //and then calculates and displays the sum and average of the values.
    //Scanner scanner = new Scanner(System.in);
    int i = 0;
    int [] nums = new int[5];//nums has a length of 5
    int sum = 0;
    for (i = 0; i < nums.length; i++) {
    //System.out.println("Please enter an integer: ");
    //nums[i] = scanner.nextInt();
    sum += nums[i];//sum + num[i] = ?
    }
    double average = (double) sum / nums.length;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }
}
