public class Surgeon extends Doctor {
    public Surgeon(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }
    /**
     Sets diagnosis on a patient
     GeneralPractitioner also has this function
     **/
    @Override
    public void setDiagnosis(Patient patient, String Diagnosis) {
        patient.setDiagnosis(Diagnosis);
    }
}
