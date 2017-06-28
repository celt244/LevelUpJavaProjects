public class Main {

    static String someGame (int score){
        String resalt = null;

        if (score == 3) resalt = "WIN";
        else if (score == 1) resalt = "Ничья";
        else if (score == 0) resalt = "Game Over";
        else resalt = "no resalt";
     System.out.println(resalt);
       return resalt;
    }

    static String wichIsGreater (int num){

        String res = null;
        String res2 = null;

        int firstNun = num/10;
        int secondNum = num%10;

        if (firstNun > secondNum) res = "First bigger";
        else res = "second bigger";
        System.out.println(res);

        if (firstNun == secondNum) System.out.println("одинаковы");
        else System.out.println("-");

        return res;

    }


    static String floatNum (float m, float n){

        String res3 = null;

        if (m>n) res3 = "Первое больше";
        else res3 = "Второе больше";
        System.out.println(res3);

        return res3;

        static String happyNum (int num){
            String res4 = null;

           int a = num/1000000;
           int b = (num/10000)%10;
            int c = (num/1000)%10;
            int d = (num/100)%10;
            int e = (num/10)%10;
            int f = (num/1)%10;

            if ((a+b+c) == (c+e+f)) return "happy";

            return res4;

        }

    }

    public static void main(String[] args) {

        int a = 25;
        if (a%2==0)
            System.out.println("четное");
        else
            System.out.println("ncht");


        int numMounth = 9;

        for (int i = 1; i < 13; i++) {

            if (i == numMounth)
                System.out.println("В этом месяце день програмиста");
            else System.out.println(i + " месяц не день програмиста");
        }

       someGame(3);
        wichIsGreater(23);
        floatNum(4.3f, 45.46f);

    }

}
