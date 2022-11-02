public class LogicalOperatorMadness {
    public static void main(String[]args)
    {
        int x = 6;
        int y = 15;
        boolean m = true;
        boolean n = false;

        System.out.println("-- Set A --");
        System.out.println(x > y && y == 15);
        System.out.println(y > x && y == 15);
        System.out.println(x <= 5 || y % 2 == 1);
        System.out.println(y < x || !(y == x));
        System.out.println(m && !n);
        System.out.println(!(m && n));
        System.out.println("- part 2 -");
        System.out.println((x > 2) && (x < 8));
        System.out.println(x > 3 && x < 6);
        System.out.println(x + 2 == 8 && m);
        System.out.println((x > 2) || (x % 2 == 1));
        System.out.println(x >= 7 || !m);
        System.out.println(!(x > 2));
        System.out.println(!(x > 7));

    }
}
