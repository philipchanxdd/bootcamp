public class practice11 {
  public static void main(String[] args) {
    String str = "Apple tart";
    char firstDuplicate = firstLetterToAppearTwice(str);
    if (firstDuplicate != '\0') {
        System.out.println("The first letter to appear twice is: " + firstDuplicate);
    } else {
        System.out.println("No letter appears twice in the string.");
    }
}

private static char firstLetterToAppearTwice(String str) {
    return 0;
}
}
