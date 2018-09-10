import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/**
 * Created by sumanth on 21/8/17.
 */
public class Utils extends Test1 {

    public static void waitFor(String s1) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Test1.driver, 20);
        wait.until(presenceOfElementLocated(By.xpath(s1)));
        Thread.sleep(100);
    }
    public static void waitForId(String s2) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Test1.driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(s2)));
        Thread.sleep(100);
    }
    public static WebElement locateById(String s2){

        return  Test1.driver.findElement(By.id(s2));
    }
    public static WebElement locateByXpath(String s3){

        return Test1.driver.findElement(By.xpath(s3));
    }
    public static WebElement locateByAccesibilityId(String s4){
        return Test1.driver.findElementByAccessibilityId(s4);
    }
    public static void clickOnYesButton(int i){
        List<WebElement> yes= driver.findElements(By.id("com.stooltool:id/radio_layout_btn_yes"));
        yes.get(i).click();
    }
    public static void clickOnNoButton(int i){
        List<WebElement> yes= driver.findElements(By.id("com.stooltool:id/radio_layout_btn_no"));
        yes.get(i).click();
    }

}
