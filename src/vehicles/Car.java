package vehicles;

public class Car {

    public static String name;
    public static int number;

    public Car(){

    }

    public static void testMethod() {
        System.out.println(name + " got avg: " + number + " number");
    }


    public static void breaks() {
        System.out.println("This is a break of my car");
    }


    public void dashBoards() {
        System.out.println("THis is my dash board");
    }

    public void dashBoards1() {
        System.out.println("THis is my dash board");
    }


    public void dashBoards3() {
        System.out.println("THis is my dash board");
    }


    public static class Toyota { // inner class

        public static void innerClassMethod() {
            System.out.println("Calling from inner class");
        }

    }


}
