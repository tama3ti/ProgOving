public class HospitalClient {
    public static void main(String[] args) {
        removeEmployee();
        removePatient();
    }

    /**
     prints employee list before removal
     prints the employee that is about to get removed
     prints employee list after removal of the employee
     **/
    public static void removeEmployee(){
        Hospital hospital = new Hospital("Alesund Sjuk");
        HospitalTestData.fillRegisterWithTestData(hospital);
        try{
            int personToRemove = 0;
            Department department = hospital.getDepartments().get(personToRemove);
            System.out.println(department.getEmployees());
            System.out.println(department.getEmployees().get(personToRemove) + " WILL BE REMOVED");
            department.remove(department.getEmployees().get(personToRemove));
            System.out.println(department.getEmployees());

        }catch (RemoveException e){
            //Catches the exception and prints out the output
            System.out.println(e.getMessage());
        }
    }

    /**
     Creates a new patient and tries to remove him from a list he does not exist in
     **/
    public static void removePatient(){
        Patient patient = new Patient("Mateusz", "Picheta", "121200");
        try {
            Department department = new Department("Alzheimers");
            department.remove(patient);
        }catch (RemoveException e){
            System.out.println(e.getMessage());
        }
    }
}
