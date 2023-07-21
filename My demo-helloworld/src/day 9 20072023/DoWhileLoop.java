public class DoWhileLoop {
  public static void main(String[] args) {
    //do-while, do first, and then check condition to start looping
    int count = 0;
    do{
      System.out.println("hello, count= " + count);
      count++;
    }while(count < 3);

    do{
      Scanner scn = new Scanner(System.in);//read input
      int input = scanner.nextInt();//read input

      
    }while (input % 2 == 0);

    if(input % 2 ==1){
      System.out.println("input = " + input);
    }
  }
  
}
