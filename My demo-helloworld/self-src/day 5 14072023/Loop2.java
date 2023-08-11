import java.util.Loop2;

public class Loop2 {
     public static void main(String[] args){
    //break
   for (int i = 0; i < 6; i++) {// 0,1,2,3,4,5
   for (int j = 0; j < 3; j++) {// 0,1,2
      System.out.println("i=" + i + " " + "j=" + j);
      if (i == j) {
        break; // this break statement just break the inner loop
      }

   }
 }
// i = 0, j = 0, yes, break
// i = 0, j = 1, no
// i = 0, j = 2, no
// i = 1, j = 0, yes
// i = 1, j = 1, yes, break
// i = 1, j = 2, no

}

// continue
   for (int i = 0; i < 6; i++){ // 0,1,2,3,4,5
   for (int j = 0; j < 3; j++){ //0,1,2
      if (i == j){
         continue; //Skip the rest in inner loop, go to next iteration
      }
    System.out.println("i=" + i + " " + "j=" + j);

   }

   } 

   //i = 0, j = 0, continue (skip)
   //i = 0, j = 1, print
   //i = 0, j = 1, print
   //i = 0, j = 1, print
   //i = 0, j = 1, print
   //...

   String str = "I love programming. I love Java.";
   System.out.println("str length=" + str.length());
   //for loop iteration times, based on the length of the string(line 40)
   for (int i = 0; i < str.length(); i++) { //very important! i < 32(0-31)
      System.out.println("Bye");

   }
   //Print the index of the first occurence of the character "e"
   //Another example: str.charAt(int index)
   for (int i = 0; i < str.length(); ++i){

   }
   // check if 'y' exists in the string
   // Found or Not found

   String str2 = "Yummy food.";
   System.out.println("str length= " + str2. length ());
   boolean found = false;
   for (int i = 0; i < str2.length(); ++i){
      if (str2.charAt(i) == 'y'){
         found = true;
         break;
      }
      }
      if (found == true){
         System.out.println("Found");
               } else{
         System.out.println("Not Found");
               }
   // if the number of occurence of target >=3, print Yes
   // Otherwse, print No
   char target = 'o';
   int count = 0;
   boolean found2 = false;
   for (int i = 0; i < str.length(); ++i) {
      if(str.charAt(i) == target){
         count++;
      }
      //nice to have
      if (count >=3){
         found2 = true;
         break;
      }
    
   }
   if (found2 == true){
      System.out.println("Yes");
   } else{
      System.out.println("No");
   }

  }
}

