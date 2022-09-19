package oop.sigletonExample;

public class SingletonClassName {

    private static SingletonClassName sc = new SingletonClassName();

    private SingletonClassName(){

    }

    public static SingletonClassName getInstence(){
        return sc;
    }


    public void printFromSingleton(){
        System.out.println("Print form singleton");
    }



}
