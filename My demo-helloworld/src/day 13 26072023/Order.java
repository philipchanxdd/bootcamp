public class Order {
  
   private Transaction[] transactions; //transaction becomes array[]

   public Transaction() {
     transactions = new transactions;
   }

   public Order(Transaction[] transactions) {
    //Pass by reference
    this.transactions = transactions;
   }
}
