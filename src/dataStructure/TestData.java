package dataStructure;

public class TestData {

//    String names = "Jhon", "Bob","David", "Sulaiman";


    public static void main(String[] args) {
        String[] names = {"Jhon", "Bob", "David", "Sulaiman"};

        System.out.println(names[0]);

//        try {
//
//            System.out.println(names[4]);
//            System.out.println("After error");
//
//
//        }catch (Exception exe){
//            System.out.println("inside catch");
//            System.out.println(exe.getMessage());
//        }


        int money = 20;

        if (money == 10) {
            System.out.println("Burger I can buy");

        } else if (money == 20) {
            System.out.println("I can but grocery");

        } else if (money == 20) {
            System.out.println("I can but Clothes");

        }


        for (int i = 0; i < 5; i++) {

            System.out.println(i);


        }
//        0 yes
//        1  yes
//        2  yes
//        3  yes
//        4  yes
//         no

        int j = 0;

        //while loop
        while (j<5){
            System.out.println("Hello While");
            j++;
        }


        //  do while loop
        int n = 0;
        do {
            System.out.println("Do while");
            n++;
        }while (n<5);






    }


}
