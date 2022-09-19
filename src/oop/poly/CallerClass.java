package oop.poly;

public class CallerClass {

    private CollegeClass cs = null;

    public CallerClass(){
        cs = new CollegeClass();
    }

    public CollegeClass getCs(){
        return cs;
    }
}
