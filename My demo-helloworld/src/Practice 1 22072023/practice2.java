public class practice2 {
  public static void main(String [] args){
    //swap
    String str1 = "Adventure";
    String str2 = "Venturenix";

String temp = str1;
str1 = str2;
str2 = temp;

System.out.println("str1 = " + str1);
System.out.println("str2 = " + str2);


  public String reversePrefix(String word, char ch) {
      //1. Cheack if ch exists?
      //Str.indexOf()
      int idx = word.indexOf(Ch);
      if (idx == -1)
        return word;
           
      }
      //2.lowercase only. word.length() >= 1
      //idx
      //Swap for reverse
      char[] arr = word.toCharArray();
      char temp;
      for (int = 0; i < arr.length; i++){

          if()
            break;
            //swap
            temp = arr[i];
            arr[i] = arr(arr.length - 1 - i);
            arr(arr.length -1 -i) = temp;
      }
      return String.valueOf(arr);
  }
}

