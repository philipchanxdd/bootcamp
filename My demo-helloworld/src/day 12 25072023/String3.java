public class String3 {
  public static void main(String[] args) {
    String str = "abc";
    String str2 = "abc";
    System.out.println(str.equals(str2));//true, "abc" is same as "abc"
    System.out.println(str == str2);//true

    //String Literal Pool -> "abc"
    String str3 = "abcd";
    System.out.println(str.equals(str3));//false, check equals->check content
    System.out.println(str == str3); //false, their addresses are not same

    str = "abc100";
    // str2 = "abc";
      String temp = str;
      str = new String("abc100");// new object
      System.out.println(temp == str);//false

    //Integer a = 10;
    //a = a + 20; //that 'a' + 20 is just a copy of 'a' (not override)

  }
}
