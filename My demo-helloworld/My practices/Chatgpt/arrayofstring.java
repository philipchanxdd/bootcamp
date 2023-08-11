public class arrayofstring {
  public static void main(String[] args){
    //for practice 1
    String[] backpack = {"water bottle", "umbrella", "notebook", "tissue"};

    for (int i = 0; i < backpack.length; i++){
      System.out.println("Number of things: " + i);
      System.out.println("Items: " + backpack[i]);
    }
    //change the value in the array
    backpack[0] = "coffee";
    backpack[3] = "chewing gums";

    //print out the updated array
    for (int i = 0; i < backpack.length; i++){
      System.out.println("Renewed backpack: " + backpack[i]);
    }

    //for practice 2
    String [] pplImeettdy = {"Alice", "Bob", "Charlie", "Dickson", "Ethan"};
     
  //  for (int i = 0; i < pplImeettdy.length; i++){
    //  System.out.println("Today I meet: " + pplImeettdy[i]);
  //  } 
     System.out.print("Today I meet: ");
    String[] pplImeettdy = { "Alice", "Bob", "Charlie", "Dickson", "Ethan" };
    for (int i = 0; i < pplImeettdy.length - 1; i++) {
      System.out.print(pplImeettdy[i] + " , ");
       }
       System.out.print(pplImeettdy[4] + " ");
     }
   }

