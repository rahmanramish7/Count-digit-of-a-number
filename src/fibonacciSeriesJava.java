import java.util.Scanner;

public class fibonacciSeriesJava {
    public static void fibbonacci(int n )
    {
        int a = 0 , b =1;
        System.out.println(a  + " " + b);
        for (int i = 2 ; i < n ; i++)
        {

            int c = a+b;
            System.out.println(", " + c);
            a=b;
            b=c;


        }

//       / System.out.println();

        return;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibbonacci(n);


    }








}
