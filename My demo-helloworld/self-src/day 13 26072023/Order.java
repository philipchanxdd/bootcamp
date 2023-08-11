public class Order {
  
   private Transaction[] transactions; //transaction becomes array[]

   public Transaction() {
     transactions = new transactions;
   }

   public Order(Transaction[] transactions) {
    //Pass by reference
    this.transactions = transactions;

    //getTotal() --> sum up subtotal
    public double getTotal() {
      int total = 0;
      for (int i = 0; i < this.transactions.length; i++) {
        total += transactions[i]; //transaction[i].subtotal -> ?
      }
    }
   }
}
