public class String1 {
    public static void main(String[] args) {
      String str = "I am intelligent but lazy";
      str = str + ",";
      System.out.println(str); // I am intelligent, but lazy.

      // Method
      int i =str.length();
      System.out.println("i" + i); // convert i to String "24 -> "i=24"
      
      System.out.println("hello".length()); // 5

      // equals()
      String str1 = "abc";
      String str2 = "abcd";
      String str3 = "abc";
      boolean areTheyEqual = str1.equals(str2); // false
      boolean areTheyEqual2 = str1.equals(str3); // true
      boolean b4 = str2.equals (str1 + "d"); // false
      System.out.println(b4); // true
      boolean b5 = str2.equals (str1 + "c"); // false
      System.out.println(b5); //
      boolean b6 = str2.equals (str1 + "d");//true
      System.out.println("b6= " + b6);

      //chatAt(2) // find the char at index 2 of the string
      String str4 = "helloworld";
      // index 0 of str4 -> 'h'
      // index 4 of str4 -> 'o'
      System.out.println(str4.charAt(2)); //result; 
      System.out.println(str4.charAt(28));

      //charAT() example:
      //char find = 'a';
      //String myString = "Hello";
      //char firstcharofstring = myString.charAt(0);

      char myChar = 'a';
    String myString = "hello";

     char firstCharOfString = myString.charAt(0); // returns 'h'
    char secondCharOfString = myString.charAt(1); // returns 'e'
      
}
}