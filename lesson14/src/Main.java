public class Main {

    public static void main(String[] args) {

        try {
            int d = 0;
            int a = 42 / d;
            int z = a + d;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }

        String szShortString = "123";

        try {
            char sz = szShortString.charAt(10);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("В строке символов меньше");
        }


    }
}
