import io.appium.java_client.android.AndroidKeyCode;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sumanth on 23/8/17.
 */
public class AddARecord extends Test1{
    static String novalue="none";
    static String a1="male";
    static String a2="female";
    static int i= Integer.parseInt(InputUtils.PatientInfoUtils.getAgeyears());
    static String stools="yes";
    static String weightunit="kg";
    static String muacunit="mm";
    private static AddARecord recordinstance;
    private AddARecord(){}
    public static AddARecord getInstance(){
        if(recordinstance == null){
            recordinstance = new AddARecord();
        }
        return recordinstance;
    }
    @Test
      public static void enterinfodata(int finalWait) throws InterruptedException{
        Settings.changeSettings();
        Utils.waitFor(StringUtils.getButtonById(Locators.PatientListLocators.new_record_button));
        Utils.locateById(StringUtils.getById(Locators.PatientListLocators.new_record_button)).click();
        Thread.sleep(3000);
        Utils.waitFor(StringUtils.getEditTextById(Locators.PatientInfoLocators.admission_time));
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.admission_time)).click();
        Thread.sleep(1000);
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.current_time_button)).click();
        Thread.sleep(2000);
        if(novalue.equalsIgnoreCase(InputUtils.PatientInfoUtils.getName())){
            Utils.locateById(Locators.PatientInfoLocators.check_name_none).click();
        }
        else {
            Utils.locateByXpath(StringUtils.getEditTextById(Locators.PatientInfoLocators.enter_name)).sendKeys(InputUtils.PatientInfoUtils.getName());
            Thread.sleep(2000);
        }
        if(novalue.equalsIgnoreCase(InputUtils.PatientInfoUtils.getPhnnumber())){
            WebElement none1= Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.check_phnnumber_none));
            none1.click();
        }
        else {
            Utils.locateById(Locators.PatientInfoLocators.enter_phn_number).click();
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.first_entry)).sendKeys(InputUtils.PatientInfoUtils.getPhnnumber());
            Thread.sleep(1000);
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.second_entry)).sendKeys(InputUtils.PatientInfoUtils.getPhnnumber());
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.save_double_entry)).click();
            Thread.sleep(2000);
        }
        if(novalue.equalsIgnoreCase(InputUtils.PatientInfoUtils.getId())){
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.check_id_none)).click();
            Thread.sleep(1000);
        }
        else{
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.enter_id)).click();
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.first_entry)).sendKeys(InputUtils.PatientInfoUtils.getId());
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.second_entry)).sendKeys(InputUtils.PatientInfoUtils.getId());
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.save_double_entry)).click();
            Thread.sleep(1000);
        }

        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.click_on_age)).click();
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.age_in_years)).sendKeys(InputUtils.PatientInfoUtils.getAgeyears());
        if(i<5) {
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.age_in_months)).sendKeys(InputUtils.PatientInfoUtils.getAgemonths());
        }
        else{
            System.out.println("0 months");
        }
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.save_age)).click();
        Thread.sleep(2000);
        if(a1.equalsIgnoreCase(InputUtils.PatientInfoUtils.getGender())){
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.male)).click();//Selects Male as Gender
            Thread.sleep(2000);
        }
        if(a2.equalsIgnoreCase(InputUtils.PatientInfoUtils.getGender())){
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.female)).click();//Selects Female as Gender
            Thread.sleep(2000);
        }
        verticalSwipe();
        if(InputUtils.SettingsUtils.getFingerprint_recording().equalsIgnoreCase("on")) {
            if (i < 10) {
                Utils.locateById(Locators.PatientInfoLocators.click_birth_order).click();
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.PatientInfoUtils.getBirthorder())).click();
            } else {
                System.out.println("No BirthOrder");
            }
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.scan_none)).click();
        }
        else {
            System.out.println("Fingerprint recording is off");
        }
        Thread.sleep(2000);
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.district_spinner)).click();
        Thread.sleep(1000);
        Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.PatientInfoUtils.getDistrict())).click();
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.upazilla_spinner)).click();
        Thread.sleep(1000);
        Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.PatientInfoUtils.getUpazilla())).click();
        Thread.sleep(1000);
        verticalSwipe();
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.union_spinner)).click();
        Thread.sleep(1000);
        Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.PatientInfoUtils.getUnion())).click();
        Utils.locateByXpath(StringUtils.getButtonById(Locators.PatientInfoLocators.nav_to_history)).click();
        Thread.sleep(finalWait);
       }

      public void enterhistorydata() throws InterruptedException {
          Utils.waitFor(StringUtils.getTextViewByText(Locators.HistoryLocators.chief_comp_text));
          Thread.sleep(2000);

          if(stools.equalsIgnoreCase(InputUtils.HistoryUtils.getWatery())) {
              Utils.clickOnYesButton(0);
          }
          else{
              Utils.clickOnNoButton(0);
          }
          if(stools.equalsIgnoreCase(InputUtils.HistoryUtils.getBloody())) {
              Utils.clickOnYesButton(1);
          }
          else{
              Utils.clickOnYesButton(1);
          }
          Utils.locateById(StringUtils.getById(Locators.HistoryLocators.click_time_of_onset)).click();
          Thread.sleep(1000);
          Utils.locateByXpath(StringUtils.getRadioButtontByText(InputUtils.HistoryUtils.getTimeofonset())).click();
          Thread.sleep(2000);
          Utils.locateById(StringUtils.getById(Locators.HistoryLocators.loose_stools_spinner)).click();
          Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.HistoryUtils.getLoosestoolcount())).click();
          Utils.locateById(StringUtils.getById(Locators.HistoryLocators.nav_to_exam)).click();
      }

      public void enterexamdata() throws InterruptedException {
          if(InputUtils.ExamUtils.getWeightunit().equalsIgnoreCase(weightunit)) {
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.weight_kg)).click();
          }
          else{
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.weight_lbs)).click();
          }
          Utils.locateById(StringUtils.getById(Locators.ExamLocators.enter_weight)).sendKeys(InputUtils.ExamUtils.getWeight());
          if(i<5) {
              if(InputUtils.ExamUtils.getMuacunit().equalsIgnoreCase(muacunit)) {
                  Utils.locateById(StringUtils.getById(Locators.ExamLocators.muac_mm)).click();
              }
              else{
                  Utils.locateById(StringUtils.getById(Locators.ExamLocators.muac_cm)).click();
              }
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.enter_muac)).sendKeys(InputUtils.ExamUtils.getMuac());
              driver.hideKeyboard();
          }
          else{
              System.out.println("No MUAC");
          }
          Utils.locateById(StringUtils.getById(Locators.ExamLocators.general_condition)).click();//Dehydration Status
          Thread.sleep(1000);
          Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getGENERALCONDITION())).click();
          Thread.sleep(1000);
          Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_eye)).click();
          Utils.locateByXpath(StringUtils.getTextViewByText(InputUtils.ExamUtils.getEYECONDITION())).click();
          Thread.sleep(2000);
          verticalSwipe();
          Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_thirst)).click();
          Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getTHIRSTCONDITION())).click();
          Thread.sleep(2000);
          Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_skin_pinch)).click();
          Thread.sleep(1000);
          Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getSKINPINCHCONDITION())).click();
          Thread.sleep(1000);
          if(i<5) {
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_tears)).click();
              Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getTearsvalue())).click();
              Thread.sleep(2000);
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_respirations)).click();
              Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getRespirationsvalue())).click();
              Thread.sleep(1000);
              verticalSwipe();
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_radial_pulse)).click();
              Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getRadialpulse())).click();
          }
          else {
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_respirations)).click();
              Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getRespirationsvalue())).click();
              Thread.sleep(1000);
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_radial_pulse)).click();
              Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getRadialpulse())).click();
              verticalSwipe();
              Utils.locateById(StringUtils.getById(Locators.ExamLocators.click_urinated)).click();
              Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getUrinated())).click();
          }

          Thread.sleep(1000);
          Utils.locateById(StringUtils.getById(InputUtils.ExamUtils.getTemp())).click();
          Thread.sleep(1000);
          Utils.clickOnYesButton(0);
          Utils.clickOnYesButton(1);
          Utils.clickOnNoButton(2);
          Utils.locateById(StringUtils.getById(Locators.ExamLocators.save_record)).click();
          Utils.locateByAccesibilityId(Locators.PatientListLocators.nav_back).click();
      }
      public void verifyAddedRecord() throws InterruptedException {
          Utils.waitFor("//android.widget.ImageView[contains(@resource-id,'android:id/search_button')]");
//          Utils.locateById("android:id/search_button").click();
//          Thread.sleep(2000);
//          Utils.locateById("android:id/search_src_text").sendKeys(InputUtils.PatientInfoUtils.getName());
//          driver.pressKeyCode(AndroidKeyCode.ENTER);
//          Thread.sleep(2000);
//          Utils.locateByXpath(StringUtils.getTextViewByText(InputUtils.PatientInfoUtils.getName())).click();
          System.out.println("Record Added");
          driver.pressKeyCode(AndroidKeyCode.BACK);
          List<WebElement> outbreak_list= driver.findElementsByXPath(".//android.support.v7.widget.RecyclerView/android.widget.LinearLayout");
          System.out.println(outbreak_list.size()-1);
      }
      public void recordSynced() throws InterruptedException{
          Utils.waitFor("//android.widget.ImageView[contains(@resource-id,'android:id/search_button')]");
          Thread.sleep(2000);
          List<WebElement> unsynced_records= driver.findElementsById("com.stooltool:id/sync_indicator");
          System.out.println(unsynced_records.size()+"records are not synced");

      }

      public static void verticalSwipe(){
        Dimension size= driver.manage().window().getSize();
        int starty=(int)(size.height*0.83);
        int endy=(int)(size.height*0.23);
        int startx=size.width/2;
        driver.swipe(startx, starty, startx, endy, 3000);
    }
    public static void min_verticalSwipe(){
        Dimension size= driver.manage().window().getSize();
        int starty=(int)(size.height*0.60);
        int endy=(int)(size.height*0.10);
        int startx=size.width/2;
        driver.swipe(startx, starty, startx, endy, 3000);
    }
    public static void max_verticalSwipe(){
        Dimension size= driver.manage().window().getSize();
        int starty=(int)(size.height*0.90);
        int endy=(int)(size.height*0.30);
        int startx=size.width/2;
        driver.swipe(startx, starty, startx, endy, 3000);
    }
      public static void pullToRefresh() throws InterruptedException {
          Dimension size = driver.manage().window().getSize();
          int starty = (int) (size.height * 0.90);
          int endy = (int) (size.height * 0.20);
          int startx = size.width / 2;
          Thread.sleep(5000);
          driver.swipe(startx, endy, startx, starty, 3000);
      }
      public static void dummy() throws InterruptedException {
          pullToRefresh();
          Utils.waitFor(StringUtils.getButtonById(Locators.PatientListLocators.new_record_button));
          AddARecord.getInstance().pullToRefresh();
          Utils.waitFor(StringUtils.getButtonById(Locators.PatientListLocators.new_record_button));
          Thread.sleep(3000);
          Utils.locateById(StringUtils.getById(Locators.PatientListLocators.new_record_button)).click();
          Thread.sleep(3000);
          Utils.locateById("android:id/action_bar_title").click();
          Utils.waitFor("//android.widget.Button[contains(@resource-id,'com.stooltool:id/discharge_clicker')]");
          driver.pressKeyCode(AndroidKeyCode.BACK);
          Utils.locateById("android:id/button1").click();
          pullToRefresh();

      }


}
