public class Task1 {

    public static int sumSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumSquares(n - 1);
    }
}
