import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isExit = true;

        while (true) {
            System.out.print("Enter operator: ");

            String operator = scanner.next();

            System.out.print("Enter first operand: ");
            int a = scanner.nextInt();

            System.out.print("Enter second operand: ");
            int b = scanner.nextInt();

            switch (operator) {
                case "+":
                    System.out.println((a+operator+b)+ " = " + Calc.sum(a,b));
            }

            System.out.print("Would you like to continus? Enter y/n");

            String exitWord = scanner.nextLine();
            if (exitWord != null && exitWord.length() > 0 && !exitWord.equalsIgnoreCase("y"))isExit = true;
        }

    }
}
