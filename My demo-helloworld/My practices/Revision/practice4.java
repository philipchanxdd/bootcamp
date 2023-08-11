public class practice4 {
  public static void main(String[] args) {
    //String method:
    String str = "          LeetCode.     0962783            ";
    //toCharArray
    //char[] arr = str.toCharArray();

    //valueOf
    String str2 = String.valueOf(1);
    String str3 = String.valueOf(98);

System.out.println(str3);
    
    //indexOf 
    int str4 = str.indexOf("L");
    System.out.println(str4);

    //replace
  String newstr = str.replace("0962783", "96692102");
  System.out.println(newstr);

    //trim  
   char str5 = str.trim().charAt(5);
   System.out.println(str5);
  //   System.out.println(c);

  //trim again
    String str6 = "   Hello, World!   ";
    String trimmedStr = str6.trim();
    System.out.println(trimmedStr); // Output: "Hello, World!"

    //practice trim
    String str7 = "  Hello.. I'm Sky.  ";
    String trimmedstr7 = str7.trim();
    System.out.println(trimmedstr7);
  }
}
