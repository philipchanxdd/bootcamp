public class ItemDesc {
  
  private String header;

  private String body;

  public ItemDesc(String header, String body) {
    this.header = header;
    this.body = body;
  }

  public static void main(String [] args){
    ItemDesc itemdesc = new ItemDesc("Item A", "90% Discount, just for today");
    Transaction t = new Transaction(1,  itemdesc, 3, 10.5);
    Transaction t2 = new Transaction(1, itemdesc)
  }
}
