public class Circle2 {
  
  private double radius;
   //static -> public -> shared variable
   //final -> one time initialization ONLY
   private static double pi = 3.14159;

  public double area() {
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumsference() { //instance method
    return 2 * radius * pi;
  }

  public static void main(String[] args) {
    Circle circle = new Circle(); //Constructor
    //circle.raidus =  1;
    c.setRadius (2);
    c.area();
    c.circumference();
    Circle c2
  }
}
