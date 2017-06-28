package model;

/**
 * Created by java on 13.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        //Employee j = new Junior();

        Employee[] employees = {new Junior(), new Middle(), new Senior()};

        for(Employee emp : employees){
            emp.calculateSalary();
        }


    }
}
