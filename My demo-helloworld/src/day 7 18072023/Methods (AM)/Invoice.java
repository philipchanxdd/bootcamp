
public class Invoice {

     //Task 1: A method to calculate total prices for an item
   public static double calcTotalItemPrice(int quantity, double unitPrice){
    //Early return
    //Parameters control
    if (quantity < 0 || unitPrice < 0){
     return 0;
    }
     // 5 x 10.9
     return quantity*unitPrice;

   }
   //Task 2: A method to calculate total amount of the invoice
   public static double calcTotalInvoiceAmount(double[] totalItemPrices){
    double total = 0.0d;
    for (int i = 0; i < totalItemPrices; i++){
      total += totalItemPrices[i];

    }
    return total;
   }
   //A method to calculate item total prices
  public static void main(String [] args){
    int[] quantities = new int[] {5,10,4,7,20};
    System.out.println("")
    double[] unitPrices = new double[] {20.9, 100.2, 5.1, 8.8, 99.3};

    double[] totalPricesItems = new double(unitPrices.length); //[54.5,..]
    for (int i = 0; i < totalItemPrices[i]; ++i){
      double j = calcTotalItemPrice(quantities[i], unitPrices[i]);
    }

    //Loop

  }
  
}
