import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

    // Logic to check ODD or EVEN
    public static PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return a -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return a -> {
            int original = a, reverse = 0;
            while (a > 0) {
                reverse = reverse * 10 + a % 10;
                a /= 10;
            }
            return original == reverse;
        };
    }
}
