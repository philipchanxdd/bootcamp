public class practice6 {
  public static void main(String[] args) {
    //Basic
    for (int j = 0; j < 5; j++){//When j loops once, i loops third times. 
    System.out.println("World");
    //Therefore, j loops 5th times, i loops 15th times and prints 15"Hello"
    for(int i = 0; i < 3; i++){
      System.out.println("Hello");
      }
    }
    //array is a data structure!!
    //For-each loop = ehanced for loop
    int[] arr = new int[] {1, 2, 3 ,4};
    // for (Type Element: dataset)
    //*the below cannot skip a part of elements
    //cannot compare
    for (int x : arr ){  //loop through all elements
      System.out.println("for-each: Hello, x= " + x);
      System.out.println("Index = " + arr[0]); 
    }

    String[] arr2 = new String[] {"5", "6", "7", "8"};
    for ( String y : arr2 ){
      System.out.println("for-each: Hi, y= " + y);
      System.out.println("Index[0] = " + arr2[0] + ", Index[1]= " + arr2[1]);
    }
  }
}
