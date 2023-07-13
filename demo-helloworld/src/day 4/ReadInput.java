import java.util.Scanner;

public class ReadInput {
  
      String str ="Hello";
      str.charAt(8); // H
      
  public static void main (String [] args) {
    //Scanner -> read user input
    Scanner s = new Scanner (System.in);
    int input = s.nextInt(); // read user input, expecting it is an integer
    System.out.println("input=" + input); 

    for (int i = 0; i < input; i++){
      System.out.println("Hello");
    }

  }
}
