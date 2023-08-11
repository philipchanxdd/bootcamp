import java.util.Scanner;

public class ReadInput {
  
     
  public static void main (String [] args) {

      String str ="Hello world!";
      str.charAt(8); // H
      System.out.println("Please enter a number: ");

    //Scanner -> read user input
    Scanner s = new Scanner (System.in);
    int input = s.nextInt(); // read user input, expecting it is an integer
    System.out.println("input= " + input); 

    for (int i = 0; i < input; i++){
      
      System.out.println("Hello");
    }

  }
}
