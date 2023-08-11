public class replace {
  public static void main(String [] args){
    String s = "Java is a programming language";
    System.out.println(s.replace("Java", "Python"));

    String p = "Pavla is a dog";
    System.out.println(p.replace("Pavla", "Capoo"));
    //capoo is new, not in the original sentence
    //^replace code + my practice

    //equals(), equalsIgnorCase()
    String str3 = "hello";
    if ("hello".equals(str3)){ //false, case sensitive
      System.out.println("str3 = Hello");
       }
  if ("Hello!!!!".equalsIgnoreCase(str3)){ //true, non case sensitive
      System.out.println("test str3 = Hello");

      if ("hello".equals(str3)){ //f/???
      System.out.println("str3 = Hello");
      if ("hello".equals(str3)){ //f???
      System.out.println("str3 = Hello");

      // concar(String, append )
      String newString = str3.concat("Java!"); // +operation
      System.out.println("newString= " + newString); //hellow Java!
      str3 = str3.concat("Java!");
      System.out.println("str3= " + str3); //hello Java!

      //compareTo
      String apple = "apple";
      String facebook = "facebook";
      System.out.println(apple.compareTo(facebook)); //-5, 1, -6('a' - 'f')

      
        }
        
      }
      
  }

}

  }

