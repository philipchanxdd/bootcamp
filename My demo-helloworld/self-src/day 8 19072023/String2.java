public class String2 {
  public static void main(String[] args) { 
    //method signature = method name + parameter type & quantity

    // trim(), remove leading space and trail space
    String str = "Hello";
    String str2 = "Hel lo";
    System.out.println("str,trim()= " + str.trim()); //Hello
    System.out.println("str2,trim()= " + str2.trim()); //Hel lo

    // startWith(), check if the string start with the target string
    if (str.startsWith("Hel")){
      System.out.println("THe string starts with Hel");

         }
     //endsWith(), check if the string ends with the target string
     boolean endsWithSpace = str.endsWith(" ");
     if (endsWithSpace){
      System.out.println("The string ends with space");
     }

     //*index of char
     //str.indexOf('a');
     System.out.println("The index of o in str= " + str.indexOf('o')); //4
     //indexOf(String)
     System.out.println("The index of ll in str= " + str.indexOf("ll")); //2
     System.out.println("The index of lll in str= " + str.indexOf("lll")); //-1

     System.out.println(
      "The index of o in str, search from index 5= " + str.indexOf('o', 5)); 
      //-1, meaning it cannot be found

      System.out.println(
      "The index of ll in str, search from index 3= " + str.indexOf('9', 3));//-1 


      //lastIndexOf(int), the last occurence of the char/string in the string
      System.out.println(str.lastIndexOf('l')); //3
       System.out.println(str.lastIndexOf("ll")); //3
        System.out.println(str.lastIndexOf('l', 3)); //2



  }
}
