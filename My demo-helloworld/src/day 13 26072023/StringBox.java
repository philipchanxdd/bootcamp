public class StringBox {
   
  private String string;

  // constructor, getter, setter
  public StringBox() {

  }
 
  public StringBox(String string){
    this.string = string;
  }
  public String getString(){
    return this.string;
  }
  public void setString(String string) {
    this.string = string;
  }
  public StringBox append(String str) { //append = add
       if (str == null || "ABC".equals(str))//null cannot be on the right side!
    //return this.string;
    return this;
    //if (str !=)

    public StringBox insert(int idx, String s){

    }
      /**

    public String toString() {
      return this.String;
    }
  }


  public static void main(String [] args){
    StringBox stringBox = new StringBox(); //empty constructor
    s.setString("Java");
    System.out.println(s.append("Python")); //JavaPython
    s.append("Javascript").append("HTML"); //????
   }
 }

