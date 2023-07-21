public class datatype {
    public static void main(String[] args) {
        // Number, Text
        // Declaration
        // print out something
        System.out.println("I'm Vincent"); // end with semi-colon
        System.out.println("Hello"); // end with semi-colon
        System.out.println("Git is good"); // end with semi-colon
        // Number, Text
        int num; // int is a way to declare a variable
        // from now on, you can only put integer to variable num.
        num = 3; // from right to left -> Action: assignment
        System.out.println("3");
        System.out.println(3);
        System.out.println(num);

        // Text
        String str = "hello man";
        System.out.println(str);

        // String str2 = 1; // error
        // int num 2 = "hello";

        // Re-assignment
        num = 18;
        // floating point
        int num3 = 11; // error, int can not only store Integer
        System.out.println(num3);
        double f = 1.03;
        double f2 = 1; // OK! will explain later...
        // byte, short, long
        byte b = 127;
        // byte b2 = 128; //error, out of range
        byte b3 = -128;
        // byte b4 = -128; // error
System.out.println("f + b = " + f+f2+b+b3);
        short s = 23;
        short s2 = -68;
System.out.println("s = " + s+s2);
        long l = 400;
        long l2 = 1000;
        long l3 = 30L; //
        System.out.println(l2);

        // floating
        float f3 = 1.00000000000000003f; // norm -> f, but not F
        double d4 = 23.9;

        // char, involves single character
        char gender = 'M';
        char s10 = ' '; // char empty = ''; // error

        // boolean
        boolean isMale = true;
        boolean isSalaryGreaterThan1000 = true;
        boolean isValid = false;
        // String + operation

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "There is Philip";
        String result = str1 +" "+ str2 +" "+ str3;
        System.out.println(result); // result is "Hello World There is Philip"

        String result2 = "Hello" + "World" + "There is Philip";
        System.out.println(result2); // Hello World There is Philip

        System.out.println(result + "     " + result2);

        //
        int a = 1 + 3; // 4
        int b10 = 1 - 3; // -2
        int c10 = 2 - 88; // -78
        int i = 2 * 181; // 282
        int p = 10 / 3; // 3
        int o = 10 % 3; // 1,1 is reminder
        System.out.println(a + b10 + c10 + i + p + o);

        int a10 = 10000;
        System.out.println(o); // 1
        System.out.println(a10); // 10000

        String str7 = "" + 13 + 13; // 13 -> String "13", result: 1313 

        //testing
        //int num = 5
        
    }
}