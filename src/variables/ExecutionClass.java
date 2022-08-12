package variables;

import claculator.CalculatorClass;
import vehicles.Car;

public class ExecutionClass {




    public static void main(String[] args) {

        //Type Variable  value
        String str; //dec
        String name = "IIT-NY7153276125^%$$&^%$^"; // initialization

        System.out.println(name);

        int number = 10; //Integer

        System.out.println(number);

        double dec = 10.25;
        System.out.println(dec);


        char cr = 'A'; //Character

        System.out.println(cr);



        boolean isTrue = true;
        boolean isReady = false;













        CalculatorClass calculator = new CalculatorClass();

        calculator.addition();

        calculator.subtractions(15,2);

        calculator.divide();



        Car rr  = new Car();


        rr.breaks();
        rr.dashBoards();


    }





}
