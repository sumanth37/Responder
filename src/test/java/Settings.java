import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sumanth on 10/10/17.
 */
public class Settings extends Test1 {
    private static Settings settingsinstance;
    public static Settings getInstance(){
        if(settingsinstance == null){
            settingsinstance = new Settings();
        }
        return settingsinstance;
    }

//    public void defaultSettings() throws InterruptedException {
//        goToSettings();
//        Utils.locateByXpath("//android.widget.TextView[@text='Assessment']").click();//Clicks on assesment_card option in settings
//        Thread.sleep(1000);
//        List<WebElement> defaultTexts= driver.findElements(By.id("android:id/text1"));//about,settings,Qreference,resources...
//        Thread.sleep(2000);
//        if(defaultTexts.get(1).getText().equalsIgnoreCase("WHO method")){
//            System.out.println("Default method is true");
//        }
//        else{
//            System.out.println("Fail");
//        }
//        if(defaultTexts.get(3).getText().equalsIgnoreCase("Required on full platform")){
//            System.out.println("Dehydration guide is ON by default");
//        }
//        else{
//            System.out.println("Fail");
//        }
//        if(defaultTexts.get(4).getText().equalsIgnoreCase("off (full platform)")){
//            System.out.println();
//        }
//        else{
//            System.out.println("Fail");
//        }
//        driver.pressKeyCode(AndroidKeyCode.BACK);
//    }
    public static void changeSettings() throws InterruptedException {
        List<WebElement> htexts=driver.findElements(By.id("com.stooltool:id/heading_text"));
        Thread.sleep(3000);
        htexts.get(3).click();
        if(InputUtils.SettingsUtils.getDecision_support().equalsIgnoreCase("on")){
            Utils.locateById(StringUtils.getById("platform_radio_1")).click();
        }
        else{
            Utils.locateById(StringUtils.getById("platform_radio_2")).click();
        }
        if(InputUtils.SettingsUtils.getAdditional_findings().equalsIgnoreCase("on")){
            Utils.locateById(StringUtils.getById("additional_findings_on")).click();
        }
        else{
            Utils.locateById(StringUtils.getById("additional_findings_off")).click();
        }
        AddARecord.verticalSwipe();
        if(InputUtils.SettingsUtils.getFingerprint_recording().equalsIgnoreCase("on")){
            Utils.locateById(StringUtils.getById("fingerprint_nudges_yes")).click();
        }
        else {
            Utils.locateById(StringUtils.getById("fingerprint_nudges_no")).click();
        }
        Thread.sleep(3000);
        driver.pressKeyCode(AndroidKeyCode.BACK);
        htexts.get(0).click();
        Thread.sleep(3000);
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }


}
