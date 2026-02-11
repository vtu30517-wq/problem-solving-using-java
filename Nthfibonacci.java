public class Nthfibonacci {
    public static void fibonacci(int num) {
        int firstnum = 0;
        int secondnum = 1;
        int result;
        if (num == 0) {
            System.out.println(firstnum);
            return;
        }
        else if (num == 1) {
            System.out.println(secondnum);
            return;
        }
        for (int i = 2; i <= num; i++) {
            result = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = result;
        }
        System.out.print(secondnum);
    }
    public static void main(String[] args) {
        Nthfibonacci n1 = new Nthfibonacci();
        n1.fibonacci(6);
    }
}
