package day21;

public class task7 {  // Class names should follow PascalCase

    static final int P = 31;
    static final long M = 100000007L;

    public static int compute(String s) {
        long hash = 0;
        long pow = 1;

        for (char ch : s.toCharArray()) {
            int val = ch - 'a' + 1;
            hash = (hash + val * pow) % M;
            pow = (pow * P) % M;
        }

        return (int) hash;
    }

    public static void main(String args[]) {
        String str1 = "hello";
        String str2 = "world";

        System.out.println(compute(str1));
        System.out.println(compute(str2));
    }
}
