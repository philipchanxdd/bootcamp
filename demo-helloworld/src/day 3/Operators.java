public class Operators {
    public static void main(String[] args) {
        int a = 1;
        a = a + 1; // 2
        a = a - 2; // 0
        int b = 8 / 4; // 2
        b = b * 3 + 5; // 11
        System.out.println("a append b= " + a + b);// ?)

        int x = 1;
        x = x + 1;
        x++; // means x = x + 1;
        ++x; // means x = x + 1;
        x += 1; // means x = x + 1;
        System.out.println("x=" + x); // x=5

        int y = 10;
        y = y - 1;
        y--;
        --y;
        y -= 1;
        System.out.println("y=" + y); // y=6

        // Other +,-,*,/,%
        int z = 4;
        z = z + 2; // 6
        z += 2;
        int i = 6;
        i = i - 3;
        i -= 3;
        int w = 9;
        w = w * 3;
        w *= 3;
        int u = 81;
        u = u / 9;
        w /= 3;

        int integer = 12 % 5; // 2
        int integer2 = 12;
        integer2 %= 5; // 2

        // , ++, --
        int m = 3;
        m++; // 4

        int preIncrement = ++m; // +1 first , assignment later
        System.out.println("preIncrement=" + preIncrement); // 5

        int postIncrement = m++; // assignment first, +1 later
        System.out.println("postIncrement=" + postIncrement); // 5

        System.out.println("m+" + m); // 6
    
        int p = 5;
        p--; // 4
        int preIncrement5 = --p;
        System.out.println("preIncrement=" + preIncrement5); // 3
        int postIncrement6 = p--; // assignment first, -1 later
        System.out.println("postIncrement=" + postIncrement6); // 3
        System.out.println("p-" + p); // 2

        //String +=
        String str = "hello";
        str += "world"; // hello world
}
}