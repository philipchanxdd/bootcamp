public class Demo {
   public static void main(String[] args){

   Car car = new Car();
   Car car2 = new Car(4, 7, "RED");
   //print car2
   System.out.println(car2.getCapacity()); //sysout
   System.out.println(car2.getColor()); //RED
   System.out.println(car2.getNoOfWheel());

   //car2= new Car(5, 10, "Yellow"); //later
   car2.setColor("YELLOW");
   car.setColor("BLUE");
   //car2 -> YELLOW
   //car -> BLUE
   System.out.println(car2);//Car@6bxxxx ->Onject reference storing object

   CarFactory carFactory = new CarFactory();
   carFactory.changeColor(car2, "WHITE");
   System.out.println(car2.getColor()); //white

   Person person = new Person(); //constructor - construct a person
   Computer computer = new Computer();
   String str = new String("Hello");//str-> object reference
   //new=generate new product
   }
}
