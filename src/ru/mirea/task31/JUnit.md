# Methods in JUnit 

I used annotation

| Name Annotation | Mean                                                         |
| :-------------- | :----------------------------------------------------------- |
| @Before         | With this annotation, the method will be executed before each test method. public  void |
| @BeforeClass    | With this annotation, the method will only run once and before all methods of the class (EX: connect database). public static void |
| @After          | With this annotation, the method will be executed after each test method. public void |
| @AfterClass     | With this annotation, the method will only run once and after all methods of the class. public static void |
| @Test           | Mark a method for testing.                                   |

<h5 style="color:white;text-align:left;">
    In the program Java,  I'm using the method assertXXX() 
in the library org.junit.Assert.assertEquals,  
   the method assertEquals(object expected, object actual)  
  is used to compare two values to check for equality. Test will be accepted if the values are equal.</h5>

###### JUNIT   Finished Student test
- [x] testSetID <h6 style="color:pink;">(3ms)</h6>                   
- [x] testGetName <h6 style="color:pink;">(4ms)</h6>
- [x] testSetName <h6 style="color:pink;">(4ms)</h6>
- [x] testGetGPA <h6 style="color:pink;">(3ms)</h6>
- [x] testSetGPA <h6 style="color:pink;">(3ms)</h6>
- [x] testToString <h6 style="color:pink;">(24ms)</h6>
- [x] testEquals <h6 style="color:pink;">(4ms)</h6>
- [x] testHashCode <h6 style="color:pink;">(3ms)</h6>
