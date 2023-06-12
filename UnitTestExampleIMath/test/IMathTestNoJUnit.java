package test;

/** A class to test the class IMath.IMathTestNoJUnit.IMath. */
public class IMathTestNoJUnit {
    /** Runs the tests. */
    public static void main(String[] args) {
        printTestResult(0);
        printTestResult(1);
        printTestResult(2);
        printTestResult(3);
        printTestResult(4);
        printTestResult(7);
        printTestResult(9);
        printTestResult(100);
    }
    private static void printTestResult(int arg) {
        System.out.print("isqrt(" + arg + ") ==> ");
        System.out.println(IMath.isqrt(arg));
    }

    public static final class IMath {
        /**
         * Returns an integer approximation to the square root of x. */
        public static int isqrt(int x) { int guess = 1;
            while (guess * guess < x) {
                guess++; }
            return guess; }
    }
}
