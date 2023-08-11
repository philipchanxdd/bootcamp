public class Array {
  public static void main(String[] args){
    //Normally..
    int num = 7;
    int num2 = 8;
    int num3 = -30;

    //Creat Empty Array (Approach 1)
    //arr or nums --> array can save a lot of numbers.
    //array: index must define values eg.
    int[] nums = new int[3]; // 3 is the length of array nums
    // with index 0,1,2 (like an address)
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;
    nums[0] = 50000; //can redefine

    //Practice time
    //double
    double[] arr = new double [5];
    arr[0] = 0.5;
    arr[1] = 1.5;
    arr[2] = 2.5;
    arr[3] = 3.5;
    arr[1] = 'a'; // explain later..

    // ***Mostly used: char[], int[], String[]
    // Match with for loop
    for (int i = 0; i < nums.length; i++) {   //0,1,2
       System.out.println("nums[" + i + "]" + nums[i]);

       // reversely print array nums
       for (int j = nums.length - 1; j >= 0; i--){
        System.out.println("array[" + j + "]" + nums[j]);
       }

       //Approach 2, create Array
       int[] array = new int [] {3,9,12};
       for (int j = 0; j < array.length; ++j){
        System.out.println("array[" + j + "]=" + array[j]);

       }
       //Modify an element
       int index = 2;
       System.out.println(array[index]); //-10

       // char[]
       char[] chars = new char[3];
       chars[2] = 'a';
       chars[0] = '!';
       for (int a = 0; i < chars.length; i++){
        System.out.println("chars[" + i + "]" + chars[i]);
       }
       
    }

    long[] numbers = new long[4];
    numbers[0] =123;
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numerbs[" + i + "]=" + numbers[i]);

    }
    boolean[] arr2 = new boolean[2];
    arr2[0] = true;
    for (int i = 0; i < arr2.length; ++i){
      System.out.println("arr2[" + i + "]=" + arr2[i]);
       }
       //String
       String[] strs = new String[] {"Hello", "abc", "goodbye"};
       strs[1] = "typhoon";
       for (int i = 0; i < strs.length; ++i){
         System.out.println("i");
       }

  }
}
