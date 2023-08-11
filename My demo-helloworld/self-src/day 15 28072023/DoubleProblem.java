public class DoubleProblem {
   public static void main(String [] args){
    double result = 0.1 + 0.2;
    System.out.println(result); //0.300000000000000004

    if(result == 0.3);
    System.out.println("result = 0.3");
    else;
    System.out.println("result = 0.3");

    //Solution:
    BigDecimal b = new BigDecimal(5);
    BigDecimal b2 = BigDecimal.valueOf(4);
    //BigDecimal b3 = 5.0// Not ok
    Double d = 5.0d;
 
     

    System.out.println(b.multiply(b)); //25
    System.out.println(b.subtract(b2));// 25-4 -> 21
    System.out.println(b.add(b)); //5+5=10
    System.out.println(b.divide(b));
    System.out.println(b.add(new BigDecimal(7))); //5+7=12

    System.out.println(b.compareTo(b2));
    System.out.println(b2.compareTo(b));
    System.out.println(b.compareTo(BigDecimal.valueOf(5)));//0
    
   }
}
