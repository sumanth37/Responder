import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import javafx.scene.layout.Priority;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by sumanth on 16/8/17.
 */
public class Test1  {
    static AndroidDriver driver;
    @Before
    public void setup() throws MalformedURLException {
        //Installs and opens the app and navigated to SecretKey activity
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "57fada85");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("appPackage", "com.stooltool");
        capabilities.setCapability("appActivity", "com.stooltool.activities.SecretKeyActivity");
        File appDir = new File("/home/sumanth/testfolder");
        File app = new File(appDir, "app-universal-debug-29-08-19-08.apk");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @After
    public void die(){
        driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        LaunchLogin.getInstance().appLaunch();
        //LaunchLogin.getInstance().performLogin();
        Thread.sleep(4000);
        CalculatorInput.navToCalc();
        Thread.sleep(3000);
        CalculatorInput.enterInput();
        Thread.sleep(2000);
        CalculatorOutput.VerifyDangerSigns();
        CalculatorOutput.recalculate();
        CalculatorOutput.VerifyCorrectionalFluids();
        CalculatorOutput.VerifyAntibiotics();
//        TestDefaultSettings.goToSettings();
//        TestDefaultSettings.defaultSettings();

    }
    public static void allowAppPermission() throws InterruptedException {
        try{
        Thread.sleep(2000);
        while (driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).size()>0)

        {  driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
        }
        }
        catch (Exception e){
            System.out.println("Unable to close the pop up");
        }
    }



}
