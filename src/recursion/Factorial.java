package recursion;

public class Factorial {
    //1,
    // 2, 2x1
    // 6, 3x2x1
    // 24 4x3x2x1
    public int calculateFactorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int total = factorial.calculateFactorial(4);
        System.out.println(total);
    }
}
