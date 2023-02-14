// 1) Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        
        System.out.printf("Sum of simple numbers = %d", getSum(0));
    }

    public static int getSum(int sum) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subsequence lenght: ");
        int n = scanner.nextInt();
        System.out.println("Enter numbers: ");
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (Math.abs(num)==1 || Math.abs(num)==2 || Math.abs(num)==3) {
                sum+=num;
            } else if (num%2==0) {
                continue;
            } else {
                int j = 3;
                while (j < (Math.abs(num)/2+1)) {
                    if (num%j==0) {
                        break;
                    }
                    j=j+2;
                }

                if (num%j !=0) {
                    sum+=num;
                }
            }
        }
        scanner.close();
        return sum;
    }
}