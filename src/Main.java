import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        task1(sc);
        task2(sc);
        task3(sc);
        task4(sc);

        sc.close();
    }

    public static void task1(Scanner sc) {
        System.out.println("Task 1");
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        System.out.println("Answer = " + sumSquares(n));
    }

    public static void task2(Scanner sc) {
        System.out.println("\nTask 2");

        int[] arr = {5, 2, 7, 4, 1};

        System.out.print("Enter how many elements to sum: ");
        int k = sc.nextInt();

        System.out.println("Answer = " + sumArray(arr, k));
    }

    public static void task3(Scanner sc) {
        System.out.println("\nTask 3");

        System.out.print("Enter base b: ");
        int b = sc.nextInt();

        System.out.print("Enter power n: ");
        int n = sc.nextInt();

        System.out.println("Answer = " + sumPowers(b, n));
    }

    public static void task4(Scanner sc) {
        System.out.println("\nTask 4");

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter numbers:");

        reverseNumbers(size, sc);

        System.out.println();
    }


    public static int sumSquares(int n) {

        if (n == 1) {
            return 1;
        }

        return n * n + sumSquares(n - 1);
    }


    public static int sumArray(int[] arr, int n) {

        if (n == 0) {
            return 0;
        }

        return arr[n - 1] + sumArray(arr, n - 1);
    }


    public static int sumPowers(int b, int n) {

        if (n == 0) {
            return 1;
        }

        return power(b, n) + sumPowers(b, n - 1);
    }

    public static int power(int b, int n) {

        if (n == 0) {
            return 1;
        }

        return b * power(b, n - 1);
    }


    public static void reverseNumbers(int n, Scanner sc) {

        if (n == 0) {
            return;
        }

        int x = sc.nextInt();

        reverseNumbers(n - 1, sc);

        System.out.print(x + " ");
    }
}