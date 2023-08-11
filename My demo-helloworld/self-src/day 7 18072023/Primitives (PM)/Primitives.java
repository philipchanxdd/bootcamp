public class Primitives  {
  public static void main(String[] args) {
    //Correct Syntaax
    //Upcasting (Implicit)
    //byte -> short -> int -> long -> float -> double
    //char -> int
    byte b = 2;
    short s = b; //byte -> short, upcasting (promotion)
    int i = s;
    long l = i;
    float f = l;
    double d = f;
    //char -> int
    char c = 'A';
    int j = c;

    //Downcasting
    double d2 = 10.3d;
    //float f2 = d2; //why error? double precision is larger than float
    float f2 = (float) d2; //In java, double precision is larger than float
    //Software developer shoulder the responsiblity for the risk of data loss

    short s2 = 128;
    //byte b2 = s2; // error byte -128 to 127
   byte b2 = (byte) s2; //Explicit 
   System.out.println("b2= " + b2); //-128

   for (byte k = 127; k < 129; k++){ //128 -> -128
    System.out.println("Hey");

   }
    long[] arr= new long[(Integer.MAX_VALUE)];
   for (int n = 0; n < arr.length; n++){

     }

     char c2 = '8'; //66
     if (c2 == '8'){
      System.out.println("c2 is 8");
     }
     if (c2 == 66){
      System.out.println("c2 is 66");
       }
    char c3 = 67;
    if (c3 == 'C'){
      System.out.println("c3 is C");
    }
    //ASCII (int) to char
    int g = 'a';
    char k = (char) g; //downcasting
    char k2 = 66; // why? downcast

    //char is always accessible to numbers

    //
    int h = (int) 1000L; //downcasting, explicit conversion
    short s10 = 128;
    byte o = (byte) 9;
    byte o2 = -128;
    char character = 'a' + 1;
    if (character == 'b') {
      System.out.println("character= " + character);
    }
    if (character == 98) { 
      
    }
  }
}
