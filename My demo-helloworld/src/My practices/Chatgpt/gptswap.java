public class gptswap {
  public static void main(String[] args) {
    // for practice 1
    int tom = 25000;
    int van = 30000;
    int ray = 40000;

    System.out.println("Before swap: ");
    System.out.println("tom = " + tom);
    System.out.println("van = " + van);

    int temp = tom;// temp is a temporary variable(avoid losing the original tom)
    tom = van;
    van = temp;// copy of tom, not override

    System.out.println("After swap: ");
    System.out.println("tom = " + tom);
    System.out.println("van = " + van);

  }
}
