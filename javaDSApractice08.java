import java.util.*;

class Main {

    static void PrintArr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    static void PrintArr2D(int[][] arr) {
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    static void differenceofSum(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        int diff = Math.abs(sum1 - sum2);
        System.out.println("Difference is: " + diff);
    }

    static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    static void subarraywithequalsum(int[] arr) {
        PrintArr(arr);
        int n = arr.length;
        int totalSum = 0;
        boolean found = false;
        for (int value : arr) {
            totalSum += value;
        }
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == totalSum - prefixSum) {
                found = true;
                break;
            }
        }
        System.out.println("Equal subarray sum exists? " + found);
    }

    static void prefixsum(int[] arr) {
        PrintArr(arr);
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + arr[i];
        }
        System.out.print("Prefix Sum: ");
        PrintArr(ans);
    }

    static void LargeSmallSum(int[] arr) {
        int n = arr.length;
        int[] even = new int[n];
        int[] odd = new int[n];
        int j = 0, k = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even[j++] = arr[i];
            } else {
                odd[k++] = arr[i];
            }
        }

        Arrays.sort(even, 0, j);
        Arrays.sort(odd, 0, k);

        if (j >= 2 && k >= 2) {
            int sum = even[j - 2] + odd[1];
            System.out.println("LargeSmallSum: " + sum);
        } else {
            System.out.println("Not enough elements to calculate LargeSmallSum.");
        }
    }

    static void pryamid(int n) {
        System.out.println("Pyramid:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 3, 2, 6, 3, 1};
        int arr3[] = {8, 0, 2, 3, 5, 6};

        prefixsum(arr);
        subarraywithequalsum(arr2);
        differenceofSum(4, 20);
        differenceofSum(3, 10);
        LargeSmallSum(arr3);
        pryamid(3);
    }
}
