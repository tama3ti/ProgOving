public class GeneralPractitioner extends Doctor {
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber){
        super(firstName, lastName, socialSecurityNumber);
    }
    /**
     Sets diagnosis on a patient
     Surgeon also has this function
     **/
    @Override
    public void setDiagnosis(Patient patient, String Diagnosis) {
        patient.setDiagnosis(Diagnosis);
    }
}
