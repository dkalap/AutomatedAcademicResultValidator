import org.junit.Test;
import static org.junit.Assert.*;

public class ResultTest {

    Result result = new Result();

    // Test 1: Check total marks calculation
    @Test
    public void testCalculateTotal() {
        Student s = new Student("Test Student", 1, 80, 70, 90);
        int total = result.calculateTotal(s);
        assertEquals(240, total);
    }

    // Test 2: Student should PASS when all marks above 35
    @Test
    public void testStudentShouldPass() {
        Student s = new Student("Pass Student", 2, 50, 60, 70);
        String status = result.getStatus(s);
        assertEquals("PASS", status);
    }

    // Test 3: Student should FAIL when one subject below 35
    @Test
    public void testStudentShouldFail() {
        Student s = new Student("Fail Student", 3, 30, 80, 75);
        String status = result.getStatus(s);
        assertEquals("FAIL", status);
    }

    // Test 4: Check percentage calculation
    @Test
    public void testCalculatePercentage() {
        Student s = new Student("Percent Student", 4, 90, 90, 90);
        double percentage = result.calculatePercentage(s);
        assertEquals(90.0, percentage, 0.01);
    }

    // Test 5: Check grade A is given for 75%+
    @Test
    public void testGradeA() {
        Student s = new Student("Grade Student", 5, 80, 75, 80);
        String grade = result.getGrade(s);
        assertEquals("A", grade);
    }
}