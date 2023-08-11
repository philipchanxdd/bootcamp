public class tochararray {
  public static void main(String[] args) {
    String str = "Hello";
char[] charArray = str.toCharArray();

// Accessing individual characters in the char array
char firstChar = charArray[0]; // 'H'
System.out.println(firstChar);
char secondChar = charArray[1]; // 'e'
System.out.println(secondChar);
char thirdChar = charArray[2]; // 'l'
System.out.println(thirdChar);
char fourthChar = charArray[3]; // 'l'
System.out.println(fourthChar);
char fifthChar = charArray[4]; // 'o'
System.out.println(fifthChar);

// Modifying characters in the char array
charArray[0] = 'h'; // Now the char array is ['h', 'e', 'l', 'l', 'o']
  }
}
