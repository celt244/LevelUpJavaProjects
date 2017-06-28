public class Main {
  int a = 10;
  int b = 3;
  int c;
  double d = 377;
  float f = 65.44f;
  String p = "Roma";
  boolean n;

  public static void main(String[] args) {
    new Main();
  }

  Main(){
    System.out.println("Hello World!");
    System.out.println(a +" "+ p);
    c=a/b;
    System.out.println("c: " + c);

    int x =1;
    x+=10;
    x-=1;
    System.out.println("X: " + x++);
    System.out.println("X: " + ++x);
    System.out.println("X: "+ x--);
    System.out.println("X: "+ --x);
    x = --x + x++;
    System.out.println("X: "+ x);
    parse();
  }

  private void toBool(){
    boolean a = true;
    boolean b = false;
    b = 7!=8;
    System.out.println("a: "+ a + "b: "+ b);
  }

  private void toChar(){
    char ch1, ch2, ch3;
    ch1 = 67; // код переменной
    ch2 = 'a'; // сам символ
    ch3 = 116; // код переменной
    System.out.println("Слово из трёх букв: " + ch1 + ch2 + ch3);

  }



  private void parse(){
    String mString = "42"; //строка
    int mInt = Integer.parseInt(mString);

    int number, number2;
   // плохой вариант
    number2 = Integer.valueOf("1");

   // отличный вариант
    number = Integer.parseInt("1");

  }

  private void equals ( boolean a, boolean b){
    boolean c = a==b;
    System.out.println("Equals: " + c);
  }
}
