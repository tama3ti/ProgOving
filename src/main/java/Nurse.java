public class Nurse extends Employee {
    public Nurse(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    public String toString() {
        return "Nurse: " + getFullName();
    }
}
