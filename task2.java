import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        if (isIncreasing() == true) {
            System.out.println("Subsequence is increasing.");
        } else {
            System.out.println("Subsequence is NOT increasing.");
        }
    }

    public static boolean isIncreasing() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = scanner.nextInt();
        System.out.println("Enter numbers: ");
        boolean flag = true;
        int num1 = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                flag = false;
            }
            num1 = num2;
        }
        scanner.close();
        return flag;
    }
}