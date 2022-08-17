package variables;

import claculator.Calculator2;
import claculator.CalculatorClass;
import contra.Camry;
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

        calculator.subtractions(15, 2);

        calculator.divide();


        Car rr = new Car();


        rr.breaks();
        rr.dashBoards();

        rr.name = "Jhon";
        rr.number = 10;


        Car.testMethod();


        Car.name = "Robert";
        Car.breaks();

        Car.Toyota.innerClassMethod();


        Camry cc = new Camry();


        Camry con2 = new Camry("Jhon", 4.00);


        Camry con3 = new Camry("Jhon", 25);


        Calculator2 calculator2 = new Calculator2();


        int total = calculator2.addition(106347632, 379734);

        System.out.println(total);


    }


}
