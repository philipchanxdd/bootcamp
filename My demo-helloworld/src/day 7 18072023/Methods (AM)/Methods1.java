     //package Methods;
     //import java.util.Methods1;

public class Methods1 {
    
  public static void print(){    //method name: print()
   System.out.println("hi in print() method.");
  

  public static int sum(int a, int b) {
    int c = a + b;
    return c; //error

    //public static String sum(int a, int b){
    //int c = a + b;
    //return "Hi Philip"; //error

  }
  public static void main(String [] args){   //<--this is method
  
   String str = "hi";
   str = str + "world"; //append operation

   // Approach 1
   System.out.println("Hi in print() method.");
  
   //Approach 1
   int x = 10;
   int y = 100;
   int sum = x + y; //10+100=110

   //Approach 2
   int z = sum (x,y); //z=110
   int i = sum(1000, -30); //970
   //int o = sum("hello", 123);//"hello" string is illegal in int o = 
   
  }
   public static int substract(int x, int y){
    return x - y; //execute x - y first, then return the result
   }
  
   public static void method2(String str){
    if (str == null || ".equals(str)"){ //null is not empty, empty --> "" 
    // and usually str equals, while str == null
      return;
    }
     System.out.println("String= " + str);

   } 
   // void means no return 
   }
 }
