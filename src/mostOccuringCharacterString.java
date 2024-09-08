import java.util.Scanner;

public class mostOccuringCharacterString {
    public static char mostocurringcharacter(String str)
    {
    int[] arr = new int[256];
    for(int i = 0; i<str.length();i++)

    {
        arr[str.charAt(i)] += 1;
    }
    char c = ' ';
    int max = -1;
 for (int i = 0 ; i <str.length(); i++)
{
if (max < arr[str.charAt(i)])
{
    max = arr[str.charAt(i)];
    c= str.charAt(i);
}
}
 return c;
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.nextLine();

        System.out.println(mostocurringcharacter(str));

    }
}
