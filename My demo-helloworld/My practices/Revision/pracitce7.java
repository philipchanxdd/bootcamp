public class pracitce7 {
  public static void main(String[] args) {

   // Q1.Print the numbers from 1 to 10.
   int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
   for (int i = 0; i < arr.length; i++){
    System.out.println("Q1: " + arr[i]);
  }

     // Q2.Print the even numbers from 1 to 20.
    for (int i = 1; i <= 20; i++){
       if (i % 2 == 0) {
        System.out.println("Q2: " + i); //why not arr[e]?
        }
    }

    //Q3.Print the odd numbers from 1 to 20.
    for (int o = 1 ;o <=20;o++){
     // if(o%2==0){
     // }
      if (o%2 != 0){
         System.out.println("Q3: " + o);
    }
 }
     
    // Q4.Print the cubes of the numbers from 1 to 10.
    // cube formula: Volume = side * side * side
    for (int c = 1; c < 10; c++){
      int cube = c*c*c;
      System.out.println("Q4: " + cube);
       }

     // Q5.Print the sum of the numbers from 1 to 10.
     int sum = 0;
     for (int s = 1; s <= 10; s++){
      sum += s; 
      System.out.println("Q5: " + sum);
     }

       // Q6.Print the average of the numbers from 1 to 10.

      int sum2 = 0;
       for (int a = 1; a <= 10; a++){
      
      sum2 += a;
      }
      int average = sum2 / 10;
      System.out.println("Q6: " + average);
     
  }
}
