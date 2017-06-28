public class Main {

    public static void main(String[] args) {

        int a = 90;
        while (a >= 0){
            System.out.print(a + " ");
            a -=5;
        }
        System.out.println();
//////////////////////////////////////////
        int b = 257;
        int nextD;
        do {
            nexstD = b % 10;
            System.out.println(b);
            b /= 10;

        } while (b < 0);
/////////////////////////////////////////////////////////////////////
        String [] name = {"Ethan Hawke", "Julie Deply"};

        for(String s : name){
            System.out.println("Name: " + s);}
///////////////////////////////////////////////////////////////////////
        String[] str = {"this", "is", "a", "very", "long", "array", "which", "has", "absolutely", "no", "sense"};

        for (String s1 : str){

            System.out.println(s1 + " - " + s1.length());
        }





    }
}
