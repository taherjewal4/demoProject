package fileReading;

import java.util.Scanner;

public class ReaderClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is num1 value?");
        int num1 = sc.nextInt();

        System.out.println("What is num2 value?");

        int num2 = sc.nextInt();

        System.out.print("This is your Total : ");
        System.out.print(num1+num2);

    }
}
