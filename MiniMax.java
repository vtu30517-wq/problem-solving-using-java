import java.util.*;
public class Solution {
    public static void miniMaxSum(int[] arr) {
        long totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        long minSum = totalSum - arr[0]; 
        long maxSum = totalSum - arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            long sumExcluding = totalSum - arr[i];
            if (sumExcluding < minSum) {
                minSum = sumExcluding;
            }
            if (sumExcluding > maxSum) {
                maxSum = sumExcluding;
            }
        }
        System.out.println(minSum + " " + maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        miniMaxSum(arr);
    }
}
