public class removeDuplicateFromString {
    public static void main(String[] args) {
//        String result = "";
//        String s = "ABCABCABvfgbfgC";
//
//        for (int i =0 ; i <s.length(); i++)
//        {
//            String apple = "" + s.charAt(i);
//            if (result.contains(apple)) {
//            continue;
//            }
//            result += apple;
//        }
//
//        System.out.println(result);
//    }


        String result = "";
        String s = "ABCABgggkjkjkC";
        for (int i = 0; i < s.length(); i++) {
            String str = "" + s.charAt(i);
            if (result.contains(str))
                continue;
            result += str;
        }
        System.out.println(result);

    }
}
