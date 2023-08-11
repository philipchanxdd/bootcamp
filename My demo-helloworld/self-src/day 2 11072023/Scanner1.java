   import java.util.Scanner;
   
public class Scanner1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        

        Scanner Scanner1 = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = Scanner1.next();
System.out.print("Enter your age: ");
int age = Scanner1.nextInt();
System.out.println("Hello, " + name + "! You are " + age + " years old.");

    }
}
