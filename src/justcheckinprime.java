public class justcheckinprime {
    public static void toCheckPrime (int number) {

        if (number == 1) {
            System.out.println("number is prime");
        } else if (number == 2) {
            System.out.println("number is prime");
        } else {
            for (int i = 3; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println("number is not prime");
                } else {
                    System.out.println("number is prime");
                }
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("hello eorlsv");
    }
}
