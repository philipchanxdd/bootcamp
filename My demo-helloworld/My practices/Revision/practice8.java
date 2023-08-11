public class practice8 {
//Array is zero-indexed!! 
//i is used as the loop counter. Initial value of i is 0.

  public static void main(String[] args) {
    //for loop - int array i.e. int[]
    int[] ages = {13, 25, 44, 38, 66}; //int array
    int sum = 0;
    for (int i = 0; i < ages.length; i++){
       //sum += i;// it is sum of index only
       sum += ages[i];
    }
    int average = sum / 5;
    System.out.println("sum of all ages = " + sum);
    System.out.println("Average of ages = " + average);

    //for loop - string array String[]
    String[] str = {"Practice", "makes", "perfect"};//sting array
    for (int i = 0; i < str.length; i++){
      //length() method is a member function of the String class.
    }
   // System.out.println("The sum of String = " + str[i]);//don't put into for-loop

    //while loop
     int count = 1;
     int sum3 = 0;

    while (count <= 10){
        sum3 += count;//sum + count = sum -> 0+1=1
       count++;
    }
    System.out.println("Sum of while loop = " + sum3);

    //for each loop
    int[] arr = new int[] {300, 456, 233, 5};
    for (int x : arr){
      System.out.println("For-each: " + x);
      System.out.println(arr[3]);

      //for each loop inside for loop
      //- calculate the average score of 3 runners across 3 competitions
      int[][] scores = {
           {80, 90, 70},
           {70, 60, 40},
           {60, 68, 23}
      };
      for (int i = 0; i < scores.length; i++){
        int sum4 = 0;
        for (int score : scores[i]) {
          sum4 += score; //sum + score = _
        }
        int average4 = sum4 / scores[i].length;
        System.out.println("Runner" + (i+1) + "'s average score is " + average);
      }
    }
    }
  }
