public class App2 {
  public static void main(String [] args){
    StringBuilder s = new StringBuilder("Hello"); //Constructor
    // s -> address (reference)
    s.append("World");
    System.out.println(s);//Hello World
    System.out.println(s.toString());//toString=getString()

    //Hellow World.3true4000
    System.out.println(s.append(true).append(4000L).length());//22

    String str = "he llo";
    String[] strs = str.trim().replace('h', 'e').split("");
    System.out.println(strs.length);
 
    //approach 1
    StringBuilder s2 = new StringBuilder("start");
    System.out.println(s2.append('a').toString().charAt(3));//r

    //approach 2
    StringBuilder s3 = s2.append('a');
    String s4 = s3.toString();
    s4.charAt(3); //r

    //insert 
    String s10 = "hello"; // how to insert a space between 11
    StringBuilder s11 = new StringBuilder("hello");
    s11,insert(3, ' '); //return StringBuilder
    System.out.println(s11); //hel lo

    s11.insert(0, "world").append("world");
    System.out.println(s11); //worldhel lworld

    System.out.println(s11.deleteChatAt(3).toString());//worldhel loworld
    System.out.println(s11.append("abc"));

    Integer a = 10;
    System.out.println(a + 10); //20
    //a = 10

    s11.setCharAt(4, 'J');
    System.out.println();
  }
}
