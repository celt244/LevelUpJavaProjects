import java.util.Arrays;

public class Main {
    public static int[] modeArr (int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] *= 2;
        }
        return arr;
    }
    public static void main(String[] args) {

//        for (int i = 10; i >= 0; i--) {
//            int sqrt = i * i;
//            int cqrt = sqrt * i;
//
//            System.out.println("Квадрат числа " + i + " = " + (sqrt));
//            System.out.println("Куб числа " + i + " = " + (cqrt));
//
//
//        }

        int[] arr2 = {2, 4, 5, 6, 7,};
        modeArr(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}



