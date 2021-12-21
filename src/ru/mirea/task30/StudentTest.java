package ru.mirea.task30;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @BeforeClass
    public static void setUpClass(){
        // JDBC: Setup DB connection
        // JDBC: Open connection
        System.out.println("Calling the @BeforeClass Method ");
    }
    @AfterClass
    public static void tearDownClass(){
        // JDBC: Finalize commit
        // JDBC: Close connection
        System.out.println("Calling the @AfterClass Method ");
    }
    @Before
    public void setUp()  {
        System.out.println("Calling the @Before Method (Before each test method)!");
    }

    @After
    public void tearDown()  {
        System.out.println("Calling the @After Method (After each test method)!");
    }

    @Test
    public void testGetId(){
        System.out.println("getId()");
        Student instance = new Student(01,"Thanh",5);
        int expResult = 01; // min_value, middle_value, max_value
        int result = instance.getId();
        assertEquals(expResult,result);
        //fail("The test case is a prototype");
    }

    @Test
    public void testSetId(){
        System.out.println("SetId()");
        int id = 30 ;
        Student instance = new Student(16,"Alex",3.75);
        instance.setId(id);
        int expResult = 30;
        int result = instance.getId();
        assertEquals(expResult,result);
        //fail("The test case is prototype");
    }

    @Test
    public void testGetName(){
        System.out.println("getName()");
        Student instance = new Student(100,"Anna",4);
        String expResult = "Anna";
        String result = instance.getName();
        assertEquals(expResult,result);
        //fail("The test case is a prototype");
    }

    @Test
    public void testSetName(){
        System.out.println("SetName()");
        String name = "John";
        Student instance = new Student(111,"John",2.5);
        String expResult = "John";
        instance.setName(name);
        String result = instance.getName() ;
        assertEquals(expResult,result);
        //fail("The test case is prototype");
    }

    @Test
    public void testGetGPA(){
        System.out.println("getGPA()");
        Student instance = new Student(529,"Alin",3.25);
        double expResult = 3.25;
        double result = instance.getGpa();
        assertEquals(expResult,result, 1e-7);
        //fail("The test case is a prototype");
    }

    @Test
    public void testSetGPA(){
        System.out.println("SetGPA()");
        double expResult = 5;
        Student instance = new Student(529,"Alin",3.25);
        instance.setGpa(5);
        double result = instance.getGpa();
        assertEquals(expResult,result, 1e-7);
        //fail("The test case is prototype");
    }

    @Test
    public void testToString(){
        System.out.println("toString()");
        Student instance = new Student(9999,"Jennie",4.25);
        String expResult = "Student{" +
                "id = '9999" +  '\'' +
                ", name = 'Jennie" +  '\'' +
                ", gpa = 4.25" +
                '}';
        String result = instance.toString();
        assertEquals(expResult,result);
        //fail("The test case is a prototype");
    }

    @Test
    public void testEquals(){
        System.out.println("equals()");
        Student other = new Student(98765,"Chloe",4);
        Student instance = new Student(98765,"Chloe",4);
        Boolean expResult = true;
        Boolean result = instance.equals(other);
        assertEquals(expResult,result);
        //fail("The test case is a prototype");
    }

    @Test
    public void testHashCode(){
        System.out.println("hashCode");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult,result);
        //fail("The test case is a prototype");
    }

}