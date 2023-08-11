//package day 12 25072023;
public class App {
   public static void main(String [] args){
    double result = Math.pow(2, 3);//or employ while loop
    System.out.println(result);

   // System.out.println(Math.round(5,4));//5
  //  System.out.println(Math.round(5,45));//5

    System.out.println(Math.sqrt(-26));

    int num= -25;
    if (num > 0 && Math.sqrt(num) == 5){

    }

    Math.random(); //0,0 - 1.0
    //base10:

    int[] nums = new int[] {-100, 100, 90, 50};
    //-100 -> 100
    //100 + 100 + 90 + 50
    int sum = 0;
    for (int i = 0; i < nums.length; i++){
      sum += Math.abs(nums[i]);
    }
       System.out.println(sum);

       double[] arr = new double[] {-5.64, 5.23, 9.000, 6.55};
       int total = 0;//double also ok??
       for (i = 0; i < arr.length; i++){
          total = total + (int) Math.round(Math)
       }

       int cubelength = 3;
       double volume = Math.pow(cubelength, 3); //9

       int[] bases = new int[] {2,3,4,5};
       int[] index = new int[] {3,4,5,6};
       int[] result = new int[] {bases.length};
       for (int = 0; i < bases.length; i++){
         result[i] = (int) Math.pow[bases[i], indexes(i)];
       }

   }
}
