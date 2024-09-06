package smapp.java;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author masik
 */
public class StudentDatabaseTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

public class SMAppJavaTest {

    private SMAppJava smAppJava;
    private StudentDatabase database;
    private Scanner scanner;

    @BeforeEach
    public void setup() {
        smAppJava = new SMAppJava();
        database = new StudentDatabase();
        scanner = smAppJava.getScanner();
    }

    @Test
    public void testSaveStudent() {
        System.out.println("SaveStudent");
        String studentId = "001";
        String studentName = "John Doe";
        int studentAge = 20;
        String studentEmail = "johndoe@example.com";
        String studentCourse = "Computer Science";

        Student instance = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);

        // Expected result
        Student expResult = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);

        // Actual result
        Student result = instance;

        // Compare individual fields
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getAge(), result.getAge());
        assertEquals(expResult.getEmail(), result.getEmail());
        assertEquals(expResult.getCourse(), result.getCourse());
    }

    @Test
    public void testSearchStudent_Found() {
        System.out.println("SearchStudent - Found");

        // Setup: Create a student and add it to the Student instance
        String studentId = "001";
        String studentName = "John Doe";
        int studentAge = 20;
        String studentEmail = "johndoe@example.com";
        String studentCourse = "Computer Science";

        Student student = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);
        database.addStudent(student);

        // Test: Search for the student
        Student result = database.searchStudent("001");

        // Assert: Check that the returned student matches the expected student
        assertNotNull(result);
        assertEquals("001", result.getId());
        assertEquals("John Doe", result.getName());
        assertEquals(20, result.getAge());
        assertEquals("johndoe@example.com", result.getEmail());
        assertEquals("Computer Science", result.getCourse());
    }

    @Test
    public void testSearchStudent_NotFound() {
        System.out.println("SearchStudent - Not Found");

        // Setup: Create an empty Student instance
        String studentId = "999";

        // Test: Search for a student that doesn't exist
        Student result = database.searchStudent("999");

        // Assert: Check that the result is null (or an empty StudentModel based on your logic)
        assertNull(result);
    }

    @Test
    public void testAddStudent() {
        // Test adding a student
        String studentId = "001";
        String studentName = "John Doe";
        int studentAge = 20;
        String studentEmail = "johndoe@example.com";
        String studentCourse = "Computer Science";

        Student student = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);
        database.addStudent(student);

        assertEquals(1, database.getStudents().size());
    }

    @Test
    public void testDeleteStudent() {
        // Test deleting a student
        String studentId = "001";
        String studentName = "John Doe";
        int studentAge = 20;
        String studentEmail = "johndoe@example.com";
        String studentCourse = "Computer Science";

        Student student = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);
        database.addStudent(student);

        database.deleteStudent("001");

        assertEquals(0, database.getStudents().size());
    }

    @Test
    public void testPrintStudentReport() {
        // Test printing the student report
        String studentId = "001";
        String studentName = "John Doe";
        int studentAge = 20;
        String studentEmail = "johndoe@example.com";
        String studentCourse = "Computer Science";

        Student student = new Student(studentId, studentName, studentAge, studentEmail, studentCourse);
        database.addStudent(student);

        // This test is a bit tricky, as it involves printing to the console.
             
        assertNotNull(database.getStudents());
    }
}

    /**
     * Test of addStudent method, of class StudentDatabase.
     */
    @org.junit.Test
    public void testAddStudent() {
        System.out.println("addStudent");
        Student student = null;
        StudentDatabase instance = new StudentDatabase();
        instance.addStudent(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchStudent method, of class StudentDatabase.
     */
    @org.junit.Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        String id = "";
        StudentDatabase instance = new StudentDatabase();
        Student expResult = null;
        Student result = instance.searchStudent(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printStudentReport method, of class StudentDatabase.
     */
    @org.junit.Test
    public void testPrintStudentReport() {
        System.out.println("printStudentReport");
        StudentDatabase instance = new StudentDatabase();
        instance.printStudentReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentDatabase.
     */
    @org.junit.Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        String id = "";
        StudentDatabase instance = new StudentDatabase();
        instance.deleteStudent(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class StudentDatabase.
     */
    @org.junit.Test
    public void testGetStudents() {
        System.out.println("getStudents");
        StudentDatabase instance = new StudentDatabase();
        ArrayList<Student> expResult = null;
        ArrayList<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}