import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        System.out.printf("New array = " + Arrays.toString(replaceNegatives()));
    }

    public static int[] replaceNegatives() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array length: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sumIndexes = 0;
        System.out.println("Enter numbers: ");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if (Math.abs(array[i])>=10 && Math.abs(array[i])<=99) {
                sumIndexes+=i;
            }
        }
        scanner.close();

        for (int i = 0; i < n; i++) {
            if (array[i] <0) {
                array[i]=sumIndexes;
            }
        }
        return array;
    }
}
