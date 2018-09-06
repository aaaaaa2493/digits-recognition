package recognition;

public class Main {

    static int getNumber(int a1, int a2, int a3,
                         int a4, int a5, int a6,
                         int a7, int a8, int a9) {

        int w1 = 2, w2 = 1, w3 = 2;
        int w4 = 4, w5 = -4, w6 = 4;
        int w7 = 2, w8 = -1, w9 = 2;

        int b = -5;

        int res = a1 * w1 + a2 * w2 + a3 * w3 +
                  a4 * w4 + a5 * w5 + a6 * w6 +
                  a7 * w7 + a8 * w8 + a9 * w9 + b;

        return res > 0 ? 0 : 1;

    }

    public static void main(String[] args) {

        System.out.println(getNumber(
                1, 1, 1,
                1, 0, 1,
                1, 1, 1
        ));

        System.out.println(getNumber(
                0, 1, 0,
                0, 1, 0,
                0, 1, 0
        ));

        System.out.println(getNumber(
                1, 1, 0,
                0, 1, 0,
                0, 1, 0
        ));

        System.out.println(getNumber(
                1, 1, 0,
                1, 0, 1,
                0, 1, 0
        ));

    }

}