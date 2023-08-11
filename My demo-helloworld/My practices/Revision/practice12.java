import java.util.Person;
public class Person {
    // Fields
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Methods
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
    
    public void celebrateBirthday() {
        age++;
        System.out.println("Happy birthday! I am now " + age + " years old.");
    }
}