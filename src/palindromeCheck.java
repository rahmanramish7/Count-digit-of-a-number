import java.util.Scanner;

public class palindromeCheck {
    public static void palindromeCheck(int num)

    {    int apple = num ;
        int rev = 0 ;
        while(num>0)
        {


            rev =  (rev * 10) + num% 10;
            num = num /10;

        }
        if (rev == apple) {
            System.out.println("Yes number is palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check if it is palindrome");
        int desirednumber = sc.nextInt();
        palindromeCheck(desirednumber);


    }






















//    int rev = 0 ;
//     while (num ! = 0)
//    {
//        rev = rev*10 + num%10;
//    }
//     num = num/10;

}
