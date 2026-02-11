class Main {
    public static boolean isPalindrome(int num) {
        int original = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return original == rev;
    }
    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num))
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
