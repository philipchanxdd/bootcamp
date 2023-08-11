public class myphone {
  private String brand;
  private String model;//
  private int year; //2022

  public myphone () {

  }

  public myphone(String brand, String model, int year) {
    this.brand = brand;
    //setting the values of the make instance variables of the current object
    this.model = model;
    this.year = year;
      }

    //getter and setter
    public String getBrand() {
      return this.brand;
    }
    public void setBrand(String brand) {//no return type string & return value
      this.brand = brand;
    }

    public String getModel() {
      return this.model;
    }
    public void setModel(String model) {
      this.model = model;
    }

     public int getYear() {
      return this.year;
     }
    public void setYear(int year) {
      this.year = year;
       }

    public static void main(String [] args) {
       myphone myphone = new myphone("Iphone", "13", 2022);
       myphoneaccessories myphoneaccessories = new myphoneaccessories(13, 2021);
    myphone myphone2 = new myphone();
    myphone2.setBrand(null);
    myphone2.setModel(null);
    myphone2.setYear(0);

    myphoneaccessories.setBrand(null);
    myphoneaccessories.setModel(null);
    myphone2.setYear(0);
    
    System.out.println("Iphone: " + myphone.getBrand() + " " + myphone.getModel() + " (" + myphone.getYear()+ ")");
    
    }
}


