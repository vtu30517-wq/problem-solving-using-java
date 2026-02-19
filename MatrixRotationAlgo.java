import java.io.*;
import java.util.*;

class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            // Top row
            for (int j = layer; j < n - layer; j++)
                elements.add(matrix.get(layer).get(j));

            // Right column
            for (int i = layer + 1; i < m - layer - 1; i++)
                elements.add(matrix.get(i).get(n - layer - 1));

            // Bottom row
            for (int j = n - layer - 1; j >= layer; j--)
                elements.add(matrix.get(m - layer - 1).get(j));

            // Left column
            for (int i = m - layer - 2; i > layer; i--)
                elements.add(matrix.get(i).get(layer));

            int size = elements.size();
            int rotation = r % size;

            List<Integer> rotated = new ArrayList<>();

            // Rotate anticlockwise
            for (int i = 0; i < size; i++)
                rotated.add(elements.get((i + rotation) % size));

            int index = 0;

            // Fill Top row
            for (int j = layer; j < n - layer; j++)
                matrix.get(layer).set(j, rotated.get(index++));

            // Fill Right column
            for (int i = layer + 1; i < m - layer - 1; i++)
                matrix.get(i).set(n - layer - 1, rotated.get(index++));

            // Fill Bottom row
            for (int j = n - layer - 1; j >= layer; j--)
                matrix.get(m - layer - 1).set(j, rotated.get(index++));

            // Fill Left column
            for (int i = m - layer - 2; i > layer; i--)
                matrix.get(i).set(layer, rotated.get(index++));
        }

        // Print final matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = bufferedReader.readLine().trim().split(" ");

        int m = Integer.parseInt(firstInput[0]);
        int n = Integer.parseInt(firstInput[1]);
        int r = Integer.parseInt(firstInput[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] row = bufferedReader.readLine().trim().split(" ");
            List<Integer> currentRow = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                currentRow.add(Integer.parseInt(row[j]));
            }

            matrix.add(currentRow);
        }

        Result.matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
