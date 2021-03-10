public class HospitalClient {
    public static void main(String[] args) {
        removeEmployee();
        removePatient();
    }

    public static void removeEmployee(){
        Hospital hospital = new Hospital("Alesund Sjuk");
        HospitalTestData.fillRegisterWithTestData(hospital);
        try{
            /**
            prints employee list before removal
            prints the employee that is about to get removed
            prints employee list after removal of the employee
            **/
            Department department = hospital.getDepartments().get(0);
            System.out.println(department.getEmployees());
            System.out.println(department.getEmployees().get(0) + " WILL BE REMOVED");
            Department.remove(department.getEmployees().get(0));
            System.out.println(department.getEmployees());

        }catch (RemoveException e){
            /**
             Catches the exception and prints out the output
             **/
            System.out.println(e.getMessage());
        }
    }

    public static void removePatient(){
        /**
         Creates a new patient and tries to remove him from a list he does not exist in
         **/
        Patient patient = new Patient("Mateusz", "Picheta", "121200");
        try {
            Department.remove(patient);
        }catch (RemoveException e){
            System.out.println(e.getMessage());
        }
    }
}
