public class LogicalOperators {

    public static void main(String[] args) {
        boolean isExpensive = true;
        boolean isWorthyToBuy = false;
        // && Operator --> means AND
        // true , true -> true
        // true, false -> false
        // false, true -> false
        // false, false -> flase
        boolean result = isExpensive && isWorthyToBuy; // false

        // ||Operator -> OR
        // true, true -> true
        // true, flase -> true
        // false, true -> true
        // false, false -> false
        boolean result2 = isExpensive || isWorthyToBuy; // true

        int a = 5;
        int b = 10;
        int c = 13;
        boolean result3 = a > 6 && b < 12; // false
        // Logical Operator
        boolean result4 = (c < 15 || a > 6 && b < 12; // true
        boolean result5 = c < 15 || (a > 6 && b < 12); //true
        boolean result6 = a < 6 || b < 9 || c < 9; // true
        boolean result7 = b < 8 && (c > 10 && a > 2); // false
        boolean result8 = a == 5 || (b > 9 && c > 8); // true
        System.out.print("result4 : " + result4);

        // ==, >=, <=
        // ==, means asking if a equals b? -> true/false
        // =, assignment
        boolean result9 = a ==b; // false
        boolean result10 = a >= 5; // true
        boolean result11 = c <= 13; // true
        boolean result12 = c != 13; // false
        // ! -> NOT
        // Result13: asking if the event of (c < 13) is false [Re: Yes(True)! It is false.]
        boolean result13 = !(c < 13); // true
        // Practice 1 more
        // Result 14: asking if the event of (b = 10) is false [Re: No(False)! It is true b=10.]
        boolean result14 = !(b == 10); // false
        boolean result15 = !(b == 9) && c !=13; // true && false -> false
        System.out.println(result15);

        // Operators Precedence
        int result16 = (1 + 9) * 3; // 30
        int result17 = ++result16 + 1; // 32
        int result18 = result16++ +1; //32
        int i = 27;
        int result19 = i++ +1; // result19=28, i=28
        
        boolean result20 = 25 + 2 < result19 + 1; //true

        //
        int x = 5;
        int y = 10;
        int z = x += 3 * y; // means 10*3+5=35
        int result21 = (x++ + 2) * x++; // result21= 36*37 = 1332
        System.out.println("result21 : " + result21);

        x = 5;
        int result21 = (x++ + 2) * x++; // result21=
        // (x++ + 2) ->, x become 6
        // 7 * 6 -> 42, x become 7
        System.out.println("result21" + result21); //42
        System.out.println("x=" + x); //7

    }
}
