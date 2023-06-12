
/** A class to test the class IMath. */
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
}
