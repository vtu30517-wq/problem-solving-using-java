public class Palindromecheck {
    public int isPalindrome(String input1) {
        if (input1 == null) {
            return 0;   // not a palindrome
        }
        String str = input1.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return 0;   // not palindrome
            }
            left++;
            right--;
        }
        return 1;   // palindrome
    }
    public static void main(String[] args) {
        Palindromecheck p = new Palindromecheck();
        System.out.println(p.isPalindrome("Madam"));   // 1
        System.out.println(p.isPalindrome("Hello"));   // 0
        System.out.println(p.isPalindrome("Level"));   // 1
    }
}

