import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalClientTest {

    @Test
    public void testCorrectRemoval(){
        Hospital hospital = new Hospital("Alesund Sjuk");
        HospitalTestData.fillRegisterWithTestData(hospital);
        Department department = hospital.getDepartments().get(0);



    }
}