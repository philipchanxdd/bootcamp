public class Whileloop {
  public static void main(String[] args) {
  //while
  //while loop only for true/false statment
  int count = 0;
  while (count < 5){  //continue condition
    System.out.println("Count is " + count);
    count++;
      // count = 4
  } 
      //for loop
  int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println("number i= " + numbers[i]);
}

         
      boolean isHoliday = false;
      int count2 = 0;
      while(!isHoliday){  // Is not holiday
         if (count2 < 6){
          System.out.println("Count2 is " + count2);
          count2++;
          }if (count2 >= 6) {
            isHoliday = true;
          }
          
      }

      int c = 0;
      while (c > 0 || c < 0){
        System.out.println(c);
        c++;
      }

      int a = 0;
      int b = 10;
      while (a < 5 || b > 0){  //false, true
        System.out.println("hello");
        a++;
        b--;
      }
          //
      int count3 = 0;
while (count3 < 10) {
    System.out.println("Count is " + count);
    count3++;
}
        //break, continue;
        int k = 0;
        while (k < 6){
          System.out.println("break: hello");
          k++;
          if (k > 3){  //0,1,2,3 times
          break;
          }
        }

    }
  }
