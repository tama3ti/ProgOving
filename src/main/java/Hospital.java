import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    List<Department> departments = new ArrayList<>();


    public Hospital(String hospitalName){
        this.hospitalName = hospitalName;
    }

    /**
     Get and set methods
     **/

    public String getHospitalName() {
        return hospitalName;
    }

    public List<Department> getDepartments(){
        return departments;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    public String toString() {
        return "Hospital: " + getHospitalName();
    }
}
