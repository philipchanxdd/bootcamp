public class Whileloop2 {
  public static void main(String[] args) {
    //continue while loop
    int j = 0;
    while (j < 6){
      System.out.println("continue: hello");
      j++;
      if (j > 3){
        continue;
      }
      System.out.println("continue hello");
    }

    String s2 = "Hello world ! I am Vincent";
    String[] strings = s2.split(" ");
    for (String s: strings){
      System.out.println(s);
    }
      //Without using split, use a for loop to split s2
      //output: String[]
      //1.substring(
      //2.toCharArray[]
      

     // for loop
    int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}


  }
}
