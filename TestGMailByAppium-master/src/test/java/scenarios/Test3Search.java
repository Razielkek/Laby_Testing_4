package scenarios;

import org.testng.annotations.Test;
import pages.MainPageSearch;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Test3Search extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void MailTestSearch() throws InterruptedException {
        new MainPageSearch(driver).start();
    }

}
