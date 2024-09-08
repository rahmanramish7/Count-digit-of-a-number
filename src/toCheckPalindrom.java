public class toCheckPalindrom {
    public static void toCheckPalindrome(int num) {
        int original_number  = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(rev);
        if (original_number == rev) {
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is not");
        }
    }

    public static void main(String[] args) {
        toCheckPalindrome(1112111);

    }
}
