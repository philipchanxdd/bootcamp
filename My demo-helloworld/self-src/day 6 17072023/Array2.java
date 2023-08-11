import java.util.Arrays;

public class Array2 {
  public static void main(String[] args) {
    String[] fruits = new String[5];
    fruits[0] = "apple";
    fruits[1] = "waterlemon";
    fruits[2] = "orange";
   // fruits[3] = "mango";
    //fruits[4] = "strawberry";
     
    // null
    // null
    System.out.println(Arrays.toString(fruits));
    // Result:[apple,waterlemon,orange,null,null]

    byte[] bytes = new byte[6];
    bytes[3] = -4;
    System.out.println(Arrays.toString(bytes));
    // [0,0,0,0,-4,0,0]
  }

}
