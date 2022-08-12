package claculator;

public class CalculatorClass {
    int num1 = 4;  // global variables
    int num2 = 6;

    public void addition() { // Method
        int number3 = 15;
        System.out.println(num1 + num2 + number3);
    }


    public void subtractions(int num2, int num1) { // Method
        System.out.println(num2 - this.num1 );
    }

    public void divide() { // Method
        System.out.println(num2 / num1);
    }

}
