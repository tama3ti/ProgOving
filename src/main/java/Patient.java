public class Patient extends Person implements Diagnosable {
    private String diagnosis = "";

    public Patient(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     Returns the diagnosis
     **/
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     Sets diagnosis on a patient
     Surgeon and GeneralPractitioner can use this
     **/
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String toString() {
        return getFullName();
    }
}
