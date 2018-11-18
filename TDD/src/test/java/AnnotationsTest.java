import org.junit.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AnnotationsTest {

    private ArrayList testList;

    @BeforeClass
    public static void executeBeforeAll(){
        System.out.println("@BeforeClass executes before class");
    }

    @Before
    public void executeBeforeEach(){
        System.out.println("@Before");
        testList = new ArrayList();

    }
    @Test
    public void test(){
        String obj1 = "junit";
        String obj2 = "junit";

        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = {1,2,3};
        int[] arithmetic2 = {1,2,3};

        Assert.assertEquals(obj1, obj2);
        Assert.assertNull(obj5);
        Assert.assertSame(obj1,obj2);
        Assert.assertArrayEquals(arithmetic1,arithmetic2);

    }


    @Test
    public void emptyCollection(){
        Assert.assertTrue(testList.isEmpty());
        System.out.println("@Test EmptyCollection");

    }

    @Test(timeout = 1)
    public void oneItemCollection() throws InterruptedException {
        testList.add("oneItem");
        TimeUnit.SECONDS.sleep(2);
        Assert.assertFalse(testList.isEmpty());
        Assert.assertEquals(1, testList.size());
        System.out.println("@Test One item collection");

    }

    @After
    public void executedAfterEach(){
        System.out.println("@After executed after each method");
    }

    @AfterClass
    public static void executedAfterAll(){
        System.out.println("@AfterClass executed after everything");
    }

}
