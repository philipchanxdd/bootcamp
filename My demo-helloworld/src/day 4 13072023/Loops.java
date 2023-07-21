public class Loops {
  public static void main(String[] args) {
    // For Loop
    int a = 0;
    ++a;
    a++;

    for (int i = 0; i < 4 ;++i) {
      System.out.println("i= " + i + ", Hello");
      //Logic flow:
      //i=0 -> i = 0 < 4, print 1st Hello
      //++i -> i = 1 < 4, print 2nd Hello
      //++i -> i = 2 < 4, print 3rd Hello
      //++i -> i = 3 < 4, print 4th Hello
      //++i -> i = 4, 4 is not smaller than 4, therefore exit loop

    
     for (int x = 5; x < 10; x++) {
      System.out.println("Count is: " + x);
   }
    //practice 1 with y--
   for (int y = 2; y > -6; y--){
      System.out.println("y = " + y + ", Hello!");
     }
     for (int j =6; j > 8; --j) {
      System.out.println("j=" + j); //6 times
     }
    }
    for (int z = 1; z <= 4; z++) {
      System.out.println ("something");

      // endless loop
      //for (int j= 0; z >=0; j++){
        //System.out.println("Hello");
          //}
    }

    int max = 10;
    int total = 0;
    for (int i = 0; i <max; ++i){
        total += i; // 0,1... 9

    // total = 45

    int sum = 0;
    for (int k = 0; k < 10; k++){
      // odd numbers
      if (k % 2 ==1){
            
        // sum=25
      }
      //1. Sum up all odd numbers
      //2. Sum up all odd numbers, except 5
      int sum2 = 0;
      int sumOddNumWithout5 = 0;
      for (int y = 0; i < 10; i++){
        if (y % 2 == 1) {
          sum += i;          
        }
        if (y % 2 == 1 && y != 5){
          sumOddNumWithout5 += i;
        }
      }

    }
    }
    // sum=25
    //sumOddNumWithout5=20

    for (int i = 0; i < 5; ++i) {
      System.out.println("hello");
      if (i > 2) {
        break;
      }
    }
    //i=0, hello
    //i=1, hello
    //i=2, hello
    //i=3, hello
    //break;

    // continue
    for (int i = 0; i < 6; i++) {
      System.out.println("Hello");
      if (i >3) {
        continue; // go to the next iteration (next loop)
      }
      System.out.println("Bye");
      }
      // i = 0, hello, bye
      // i = 1, hello, bye
      // i = 2, hello, bye
      // i = 3, hello, bye
      // i = 4, hello, bye
      // i = 5, hello, bye
      // i = 6, exit
      
      for (int i = 0; i < 8; i++) {
        if (i % 2 == 0 && i % 3 == 0)//if conditon in for loop
        // if i is divisible by 2 && i is divisible by 3
        System.out.println("i= " + i);
        
        }
      }
}

