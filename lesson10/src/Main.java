public class Main {

    public static void main(String[] args) {

        Country country1 = new Country("Ukraine", 42000000);
        Country country2 = new Country("Ukraine", 42000000);

        System.out.println(country1.equals(country2));
    }
}
