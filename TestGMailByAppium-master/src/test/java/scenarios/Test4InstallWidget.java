package scenarios;

import org.testng.annotations.Test;
import pages.InstallWidget;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test4InstallWidget extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void MailTestInstallWidget() throws InterruptedException {
        new InstallWidget(driver).start();
    }

}
