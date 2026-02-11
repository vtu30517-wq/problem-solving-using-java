import java.util.*;
public class Main {
    public static int isEven(int input1) {
        if (input1 % 2 == 0) {
            return 2;   
        } else {
            return 1;   
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = isEven(number);
        System.out.println(result);
        sc.close();
    }
}
