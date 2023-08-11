public class Object {
    //Create a Person class that has the following properties:
    //name (a string)
    //age (an integer)
    //gender (a string)

    //Properties
    private String name;
    private int age;
    private String gender;

    public Object(){ //empty constructor

    }
    //Constructor// setting up a condition
    public Object(String name, int age, String gender){
      this.name = name;
      this.age = age;
      this.gender = gender;
    }

    //Methods
    public void sayHello() {
      System.out.println("Hello, my name is Philip" + name + "I am 26" + age + "I am male" + gender);
    
      // Person person1 = new Person("John", 25);
      // Person person2 = new Person("Jane", 30);

//       person1.sayHello(); // Output: Hello, my name is John and I am 25 years old.
// person2.sayHello(); // Output: Hello, my name is Jane and I am 30 years old.
    }
public static void main(String[] args) {
  Object a = new Object("ABC", 20, "m");
  a.sayHello();
}
public int nextInt() {
  return 0;
}





}
