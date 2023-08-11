public class Loop3 {
    
    public static void main(String[] args){
    String str = "hello";
    // output: olleh
    // str.charAt()
    String reversed = "";
    for (int i = str.length()-1; i >= 0; i--) { //reverse String letters
      reversed += str.charAt(i);
    }
    System.out.println(reversed);
  }
}