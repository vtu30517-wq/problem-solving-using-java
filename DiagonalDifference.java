public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];           // primary diagonal
            secondarySum += arr[i][n - 1 - i]; // secondary diagonal
        }

        return Math.abs(primarySum - secondarySum);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
        };

        int result = diagonalDifference(arr);
        System.out.println(result); // Output: 15
    }
}
