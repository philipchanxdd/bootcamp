public class Person {  // Person is like a template
  //public is STATIC, main is DYNAMIC
  //Week 3 - skills last 2 weeks can be employed to JavaScript & Python
  //yellow=class,red=name,blue=method
  //person has age,gender,personality (Describe the person by attributes)
  //
  int age;  //not in memory 
  char gender; //not in memory
  //people have many attributes like weight and height
  //main is a tool for JVM to develop
  //main does not belong to Person, it can exist in other contexts

   public void setAge(int age){//setAge defines the following String&Person
      this.age = age;
   }


  public static void main(String [] args){
     String s = "abc";
     Person p = new Person();//produce empty person object without attributes
     Person p2 = new Person();//produce empty person object2 with default values
     p.setAge(13);

       //Static vs non-static
       //Static (no this.age in the public)
       //isMale('F') --> false
     
      Computer computer = new Computer(); //Computer()-> empty constructor
      
  }
}
