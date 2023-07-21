package Methods;
public class Rectangle {

    public static double area(double length, double width){
      return length * width;

    }

    public static double perimeter(double length, double width){
      return 2 * (length + width);

    }
  public static void main(String [] args){

    //area
    double area1 = area(5,8d, 3.8d);
    double area2 = area(13,8d, 5.8d);
    //perimeter
    double perimeter1 = perimeter(18,8d, 90.8d);
    double perimeter2 = perimeter(55,8d, 44.8d);

  }
}
