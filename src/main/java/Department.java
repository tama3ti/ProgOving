import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Department(String departmentName){
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     Set get get methods, adds Patients and Employees
     to the Arraylists above
     **/

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient){
        patients.add(patient);
    }

    /**
     checks if the person is in the patients or employee list, is so removes them,
     if not throws an exception.
     **/

    public void remove(Person person) throws RemoveException {
        if (patients.contains(person))
            patients.remove(person);

        else if (employees.contains(person))
            employees.remove(person);

        else
            throw new RemoveException(person + " does not exist");
    }

    public String toString() {
        return "Department: " + getDepartmentName();
    }
}