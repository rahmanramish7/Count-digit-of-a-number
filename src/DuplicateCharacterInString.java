import java.util.Scanner;

public class DuplicateCharacterInString {


    public static void main(String[] args) {

        String s = new String("TestingAutomation");
        char []ch = s.toCharArray(); // thats a character array bro
        int count = 0;
        for (int i = 0 ; i <ch.length; i++)
        {
            for (int j = i+1 ;  j <ch.length; j++)
            {
                if (ch[i]==ch[j])
                {
                    System.out.println("duplicate string is "  + ch[j]);
                   count++;
                }

            }
        }
        System.out.println("duplicate character count is " + count);
    }
}
