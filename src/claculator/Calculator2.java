package claculator;

public class Calculator2 {


    public int addition(int num1, int num2) {
        int result = 0;
        try {

            result = num1 / num2;


        } catch (Exception ar) {
            ar.getMessage();
        }

        System.out.println("After Calculator");

        return result;
    }

}
