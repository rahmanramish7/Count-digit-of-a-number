import java.util.Scanner;
public class ReverseANumber {





        public static void reversal(int digit) {
            while(digit>0) {
                int apple = digit % 10;

                System.out.println(apple);
                digit = digit / 10;
            }



        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            reversal( a);
        }
    }











