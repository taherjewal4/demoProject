package oop.encaps;

public class EncapsulationEmployee {

    private String firstName;
    private String lastName;
    private String dob;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }

    public String getFirstName(){
        return firstName;
    }


}
