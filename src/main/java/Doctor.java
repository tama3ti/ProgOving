public abstract class Doctor extends Employee {
    public Doctor(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     Abstract class
     **/

    public void setDiagnosis(Patient patient, String Diagnosis){}

    public String toString() {
        return "Doctor: " + getFullName();
    }
}
