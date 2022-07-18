package test;

import com.generation.model.Student;
import com.generation.service.StudentService;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @Test
    public void StudentServiceTest() {

        StudentService test = new StudentService();
        assertEquals(test.findStudent("12"), "Student {12', name='Giuseppe', email='joe@gmail.com', birthDate=Thu Jan 12 00:12:00 EST 1212}");
    }
}
