public class revision5 {
  public static void main(String[] args){
    String firstName = "John";
String lastName = "";
String fullName = firstName + " " + lastName;

if (lastName.isEmpty()) {
    System.out.println("Last name is empty.");
}

String defaultString = lastName.isEmpty() ? "Unknown" : lastName;

  }
  
}
