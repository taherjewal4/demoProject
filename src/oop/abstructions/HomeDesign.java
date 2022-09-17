package oop.abstructions;


// interface is a special type of class that does not have methods body;
// we cannot create an object of interface -> HomeDesign gd = new HomeDesign();

public interface HomeDesign { //100% abstract

    // Abstract method
    // it does not have method body
    // it cannot be private and has to implement in the subclass/child class
    void doors();

    void windows();


}
