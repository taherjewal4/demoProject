package stringProblems;

public class TestStrings {


    public static void main(String[] args) {
        String str = "31 st dec is the       rainy day!!!";

        System.out.println(str.substring(0,str.indexOf("h")));

        System.out.println(str.replace("e","E"));

        System.out.println(str.trim());

        System.out.println(str.indexOf("i"));

        System.out.println(str.toUpperCase());


    }
}
