import com.adc.varsity.fw.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {

    static public ApplicationManager app;

    @BeforeTest
    public void setUp() throws Exception
    {
        app = new ApplicationManager();

    }

    @BeforeMethod
    public void beforeMethod(){
        app.driver.get("http://emvm06.emedia.cv.net:8080/gamereplays");
    }




        @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(20000);

        app.driver.quit();
    }




}

