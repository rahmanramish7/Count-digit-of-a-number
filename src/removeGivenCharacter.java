public class removeGivenCharacter {
//    public static void main(String[] args) {
//        String s ="efusnejf#@0";
//        String something= s.replace("n", "");
//        System.out.println(something);
//    }
public static void main(String[] args) {

    String result = "";
    String str = "appie";
    int n = str.length();
    char ch = 'i';
    for (int i = 0; i < n; i++)
    {
                 if (str.charAt(i) != ch)
                 {
                        result += str.charAt(i);
                 }
    }
    System.out.println(result);

}

}

