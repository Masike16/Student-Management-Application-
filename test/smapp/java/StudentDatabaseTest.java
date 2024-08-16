/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package smapp.java;

import java.util.ArrayList;
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
    
    public StudentDatabaseTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class StudentDatabase.
     */
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
