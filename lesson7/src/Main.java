public class Main {

    public static void main(String[] args) {
        System.out.println("Enter day of week!");
        System.out.println();

        int a = 4;
        String duyWeek;
        switch (a){
        case 1: duyWeek = "monday"; break;
        case 2: duyWeek = "вторник"; break;
        case 3: duyWeek = "среда"; break;
        case 4: duyWeek = "чт"; break;
        case 5: duyWeek = "пт"; break;
        case 6: duyWeek = "сб"; break;
        case 7: duyWeek = "вс"; break;
        default: duyWeek =  ""; break;

    }
        System.out.println(duyWeek);
        int c = 1;
        String mast;
        switch (c){
            case 1: mast = "cherva"; break;
            case 2: mast = "krest"; break;
            case 3: mast = "pika"; break;
            case 4: mast = "bubn"; break;
            default: mast = ""; break;
        }
        System.out.println(mast);


//        for (int j = 1; j <= 6; j++) {
//
//            for (int i = 1; i <= 6; i++) {
//
//                if (j != 1 || j != 6){
//
//                if(i == 1 || i == 6) System.out.print("*");
//                    else System.out.print(" ");
//                    System.out.print();
//                System.out.print("*");System.out.print("*");
//                } else System.out.print("*");
//            }
//
//            System.out.println();
//        }
        String email = "denis.kivalov@gmail.com";
        System.out.println(email.length());
        System.out.println(email.indexOf("@"));
        System.out.println(email.substring(0, email.indexOf("@")));
        System.out.println();
        char[] arr = email.toCharArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(email.charAt());
        }
    }



}
