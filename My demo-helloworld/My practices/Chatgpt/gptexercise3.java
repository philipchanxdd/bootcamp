package Chatgpt;
public class gptexercise3 {
  public static void main(String [] args){
   //Write a program that prompts the user to enter a sentence, 
   //converts the sentence to lowercase, and then counts 
   //and displays the number of occurrences of each vowel in the sentence.
   //Use an array of int to store the vowel counts.
    Scanner scn = new Scanner(System.in);
    String[] str = new String[];
    System.out.println("Enter a sentence: ");
    String sentence = scanner.nextLine().toLowerCase();

    int [] vowelCounts = new int[5];
     for (int i = 0; i < sentence.length(); i++){
      char c = sentence.charAt(i);
         if(c == 'a') {
           vowelcounts[0]++;
         }else if (c == 'e'){
          
         }
     }
    


        String sentence = scanner.nextLine().toLowerCase();

        int[] vowelCounts = new int[5];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c == 'a') {
                vowelCounts[0]++;
            } else if (c == 'e') {
                vowelCounts[1]++;
            } else if (c == 'i') {
                vowelCounts[2]++;
            } else if (c == 'o') {
                vowelCounts[3]++;
            } else if (c == 'u') {
                vowelCounts[4]++;
            }
        }

        System.out.println("Number of occurrences of each vowel:");
        System.out.println("a: " + vowelCounts[0]);
        System.out.println("e: " + vowelCounts[1]);
        System.out.println("i: " + vowelCounts[2]);
        System.out.println("o: " + vowelCounts[3]);
        System.out.println("u: " + vowelCounts[4]);
    }
}
  }
}





