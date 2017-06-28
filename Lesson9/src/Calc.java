public class Calc {

    public static int sum(int a, int b){
        return  a+b;
}
    public static double sum (double x, double y){
        return x+y;
    }

    public static String sum (String st1, String st2){
        return Integer.parseInt(st1) + Integer.parseInt(st2) + "";
    }
///////////////////////////////////////////////////////////////
    public static int minus (int a, int b){
        return a-b;
    }
    public static double minus (double x, double y){
        return x-y;
    }
    public static String minus (String st1, String st2){
        return Integer.parseInt(st1) - Integer.parseInt(st2) + "";
    }

   ///////////////////////////////////////////////////
   public static int multiply (int a, int b){
       return a*b;
   }
    public static double multiply (double x, double y){
        return x*y;
    }
    public static String multiply (String st1, String st2) {
        return Integer.parseInt(st1) * Integer.parseInt(st2) + "";
    }

  ////////////////////////////////////////////////////////
    public static int divide (int a, int b){
        return a/b;
    }
    public static double divide (double x, double y){
        return x/y;
    }
    public static String divide (String st1, String st2) {
        return Integer.parseInt(st1) / Integer.parseInt(st2) + "";
    }
}

