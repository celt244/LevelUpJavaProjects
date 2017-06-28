public class Main {

    public static void main(String[] args) {



    }

    public static String convertToString(int n){
        String res = null;
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "thieteen", "fourteen", "fifiteen", "sixteen", "seventeen", "eightin", "nineteen"};
        String[] tens = {"", "", "tweenty", "thirte", "fourty", "fifity", "sixty", "seventy", "eighty", "ninety"};
        String[] hundreds = {"", " one hundred", ""};
        String[] thousands = {"", "one thousands"};

        String un = n%100 < 20 ?  units[n%100] : tens[n%100/10];
        String th = n/100%100 < 20 ? units[n%100] + " thousends" : tens[n%100/10] + " " + units[n%10];
        return th + " " + hundreds[n/100%10] + " " + un;
    }
}
