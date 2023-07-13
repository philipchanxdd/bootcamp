public class Nestedloop {


  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      //
      for (int j = 0; j < 3; j++) {
        System.out.println("Hello");
      }
    }
    
    // * , i=0
    // * * ,i=1,j=0
    // ** * ,i=2,j=1
    // *** * ,i=3,j=2
    // **** * ,i=4,j=3
    // System.out.println(); -> nextline after print out
    // System.out.print(); -> continue after print out, no nextline
    for (int i = 0; i < 6; i++) {
      System.out.println(i);
      for (int j = 5 ; j > 0; j--) {
        System.out.print(j);
}
 
}
     //System.out.println(); nextline after print out
     //System.out.print() is not allowed
    // for (int x = 0; x<)
      for (int i = 0; i < 5; i++) {
      System.out.println(i);
      for (int j = i ; j > 0; j--) {
        System.out.print(j);
     }

      }

    }


}
