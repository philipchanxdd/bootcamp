public class Numbers3 {
  //instance variables:
  int number1;
  int number2;
  int number3;

  //instance methods:
  public void setNumber1(int number1) {
    //(int number1) is an integer parameter
    this.number1 = number1;
  }
    public void setNumber2(int number2) {
     this.number2 = number2;
    }
     public void setNumber3(int number3) {
      this.number3 = number3;
     }

     public int divide() { //A method called division operation
       this.print();
       System.out.println(Numbers.add(this.number1, this.number2, this.number3));
       return (this.number1 + this.number2) / this.number3;
      }

      //static method with 3 integer parameters
      public static int divide(int number1, int number2, int number3) {
        return (number1 + number2) / number3;
      }

      public void print() {
        System.out.println("this.number1 = " + this.number1);
        System.out.println("this.number2 = " + this.number2);
        System.out.println("this.number3 = " + this.number3);
      }

     public static int add(int number1, int number2, int number3) {
      return number1, number2, number3;
     }

     public static void main(String[] args) {
      Number3 n1 = new Number3();
      n1.setNumber1(13);
      n1.setNumber2(26);
      n1.setNumber3(38);

      Number3 n2 = new Number3();
          n2.setNumber1(10);
          n2.setNumber2(100);
          n2.setNumber3(200);

          System.out.println(n.);
     }
  

