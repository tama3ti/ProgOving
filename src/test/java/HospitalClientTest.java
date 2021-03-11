import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HospitalClientTest {

    /**
     Tests if we can correctly remove a employee
     from the list of employees.
     **/
    @Test
    public void correctRemovalOfEmployee() throws RemoveException {
        Department emergencyRoom = new Department("Akutten");
        emergencyRoom.addEmployee(new Employee("Odd Even", "Primtallet", "260327 38456"));
        emergencyRoom.addEmployee(new Employee("Huppasahn", "DelFinito", "030436 47452"));
        emergencyRoom.addEmployee(new Employee("Rigmor", "Mortis", "121267 453678"));
        emergencyRoom.remove(emergencyRoom.getEmployees().get(0));
        assertEquals(2, emergencyRoom.getEmployees().size());
    }


    /**
     Tests if we can remove a person that does not
     exist in the list of patients.
     Negative Test
     **/
    @Test
    public void removalOfNonExistingPatient() throws RemoveException {
        try {
            Department emergencyRoom = new Department("Akutten");
            Patient patient = new Patient("Rigmor", "Mortis", "121267 453678");
            emergencyRoom.remove(patient);
            assertEquals(0, emergencyRoom.getPatients().size());
        }catch (RemoveException e){

        }
    }

    /**
     Positive test version of the method above
     **/
    @Test
    public void positiveRemovalOfExistingPatient() throws RemoveException {
        try {
            Department emergencyRoom = new Department("Akutten");
            Patient patient = new Patient("", "", "");
            emergencyRoom.addPatient(patient);
            emergencyRoom.remove(patient);
            assertEquals(0, emergencyRoom.getPatients().size());
        }catch (RemoveException e){

        }
    }
}