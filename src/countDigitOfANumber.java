
import java.util.Scanner;
    public class countDigitOfANumber {
        public static int countNumber(int digit)
        {
            int count = 0 ;
            int sum = 0 ;
            while (digit > 0)
            {


                int r = digit %10;
                sum = sum + r;
                digit = digit/10 ;

            }
            System.out.println(sum);

            return 0;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the digits");
            int f =sc.nextInt();
            countNumber(f);



        }


}
