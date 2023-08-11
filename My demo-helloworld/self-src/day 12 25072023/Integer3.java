public class Integer3 {
  public static void main(String [] args){
    // Internal Cache (-128 to 127)
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2); //true (within -128 to 127)

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4);//false (beyond -128 to 127)

    Integer i5 = 127;
    Integer i6 = 127;
    System.out.println(i5 == i6);//true (within -128 to 127)

    Byte b1 = 127;
    //Byte b2 = new Byte(127);

    Boolean bool1 = true;
    Boolean bool2 = true;
    System.out.println(bool1 == bool2);//true, same address

    Boolean bool3 = true;
    Boolean bool4 = false;
    System.out.println(bool3 == bool4);//false

    // Internal Cache -> ASCII
    Character c1 = 'a';
    Character c2 = 'a';//common character
    Character c3 = 'Ϩ';
    Character c4 = 'Ϩ';
    Character c5 = '!';
    Character c6 = '!';
    System.out.println(c1 == c2);// true, same address
    System.out.println("c3c4 = " + (c3 == c4));//false, not common character
    System.out.println(c5 == c6);//true

    Integer i7 = Integer.valueOf(127); //127
    Integer i8 = 127;
    System.out.println(i7==i8); //true

    Integer i9 = Integer.valueOf(128); //128
    Integer i10 = 128;
    System.out.println(i9 == i10);//false
  }
}
