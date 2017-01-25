package scenarios;

import org.testng.annotations.Test;
import pages.MainPageSendMain;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test2SendMail extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void MailTestSendLetter() throws InterruptedException {
        new MainPageSendMain(driver).start();
    }

}
