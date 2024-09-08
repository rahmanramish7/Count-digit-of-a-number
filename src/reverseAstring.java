public class reverseAstring
    {
        public static void main(String[] args)
        {

            String s1 = " apple";
            String result  = " ";
            for (int i = s1.length()-1 ; i>=0 ; i--)
            {
                result = result + s1.charAt(i);

            }
            System.out.println(result + " ");

        }


    }



