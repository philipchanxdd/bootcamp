import java.util.Scanner;

public class dowhileloop {
  public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    int number;

    do{
      System.out.print("Enter any number: ");
    number = scn.nextInt(); 
    //.nextInt is a method call on the Scanner object, 
    //which reads an integer value from the standard input stream.
    } while (number < 1 || number > 10);

    System.out.println("Boom! You enter: " + number);
  }
}
