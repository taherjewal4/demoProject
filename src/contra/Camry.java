package contra;

public class Camry {

    public final static String name = "Robert";

    public Camry() {

    }

    public Camry(String name, double gpa) {
        System.out.println(name + " got gpa : " + gpa);
    }

    public Camry(String name, int age) {
        System.out.println(name + " is  " + age + " years old");

    }

    private void testFinal(){
        System.out.println();
    }
}
