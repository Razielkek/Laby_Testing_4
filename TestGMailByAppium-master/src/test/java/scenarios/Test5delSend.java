package scenarios;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Valeriya on 25.01.2017.
 */
public class Test5delSend extends AndroidSetup {
    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void DelSend() throws InterruptedException {
        driver.findElement(By.id("com.google.android.gm:id/search")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("android:id/search_src_text")).sendKeys("lol"+"\n");
        Thread.sleep(20000);
        driver.findElement(By.id("com.google.android.gm:id/delete")).click();
    }
}
