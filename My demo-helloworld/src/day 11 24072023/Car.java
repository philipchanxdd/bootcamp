public class Car {

  int noOfwheel; // 0
  int capacity; // 0
  String color; // null

  // Empty Constructor
  public Car() {

  }

  // All-arguements Constructor (with all attributes, not parameters
  public Car(int noOfWheel, int capacity, String color) {
    this.noOfwheel = noOfWheel; 
    this.capacity = capacity;
    this.color = color;
  }

  public int getNoOfWheel() {
    return this.noOfwheel;
  }

  public void setNoOfWheel(int noOfwheel) {
    this.noOfwheel = noOfwheel;
  }

  public int getCapacity() {
    return this.capacity;
  }


    public void setCapacity (int capacity) {
    this.capacity = capacity;
    }

     public void setColor (String color) {
      this.color = color;
     }

    public String getColor() {
     return this.color;


    }

  }
