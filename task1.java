// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // System.out.printf("Sum of simple numbers = " + getSum(0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subsequence lenght: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.println("Enter numbers: ");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        // System.out.println(Arrays.toString(array));
        
        for (int i = 0; i < n; i++) {
            if (array[i] == 1 || array[i] == 2 || array[i] == 3) {
                sum += array[i];
            } else if (array[i] % 2 == 0) {
                break;
            } else {
                for (int j = 3; j < (array[i] / 2 + 1); j = j + 2) {
                    if (array[i] % j == 0) {
                        break;
                    } 
                sum += array[i];
                
                    
                }
            }

        }
        System.out.println(sum);

    }

    // public static int getSum(int sum) {

    // return sum;
    // }
}