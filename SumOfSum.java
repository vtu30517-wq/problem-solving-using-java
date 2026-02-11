import java.util.*;
public class Sumofsum {
    public int sumOfSumsOfDigits(int input1) {
        List<Integer> digits = new ArrayList<>();
        int temp = input1;
        while (temp != 0) {
            digits.add(0, temp % 10);
            temp = temp / 10;
        }

        int result = 0;
        for (int i = 0; i < digits.size(); i++) {
            int sum = 0;
            for (int j = i; j < digits.size(); j++) {
                sum += digits.get(j);
            }
            result += sum;
        }
        return result;
    }
    public static void main(String args[]) {
        Sumofsum s1 = new Sumofsum();
        System.out.print(s1.sumOfSumsOfDigits(3344));
    }
}
