import java.util.*;

public class StringBox2 {
  
  char[] string;

  public StringBox2() {

  }
  public StringBox2(char[] sources) {
    this.string = new char[sources.length];//new object
    //Approach 1:
    for (int i = 0; i < sources.length; i++) {
      string[i] = sources[i];
    }
    //Approach 2:
    //copyOf() -> new array object, and with the copy values of the original and
    this.string = Arrays.copyOf(sources, sources.length);
  }
    
      public StringBox2 append(String s) {//hello -> helloworld
       // String -> toCharArray()
       char[] res = new char [this.string.length + s.length()];
       int idx = 0;
       int j = 0;
       while (idx < this.string.length){
        res[idx] = string[j];
        idx++;
        j++;
       }
       j = 0;
       return this;
      }

      
  public String toString() {
    return Arrays.toString(this.string); // [a,c,b]
  }

  public static void main(String [] args) {
    char[] chars = new char[] {'a', 'c', 'b'};

    StringBox2 box = new StringBox2(chars);
  }
}
