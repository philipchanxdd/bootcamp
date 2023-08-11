public class animal {
  //Fields
  private String name;
  private int age;
  private boolean gender;

  //Constructor
  public animal(String name, int age){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  //Getter
   public String getName() { //getName  
      return name;
   }

   public int getAge() { //getAge
       return age;
   }

   public boolean getGender() { //getGender
    return gender;
    }

    //setter
    public void setName(String name) {
      this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
      }

      public void setGender(boolean gender) {
        this.gender = gender;
      }

    //Method
    public void sayHi() {
      System.out.println("Hi, my name is " + name + ". I'm " + age + "years old" + gender + ". And I'm female.");
    }
    
    animal animal1 = new animal("Capoo", 3, Male);
    System.out.println(person1.getName()); // Output: John

    person1.setName("Jane");
    System.out.println(person1.getName()); // Output: Jane

    person1.setAge(30);
   System.out.println(person1.getAge()); // Output: 30

person1.sayHello(); // Output: Hello, my name is Jane and I am 30 years old.
}
