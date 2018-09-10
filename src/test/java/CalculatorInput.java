import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by sumanth on 23/8/18.
 */
public class CalculatorInput extends Test1{
    public static void navToCalc() throws InterruptedException{
        Utils.locateById(Locators.LoginLocators.rehy_calc).click();
        driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][2]")).click();
    }
    public static void enterInput() throws InterruptedException{
        Utils.locateById(Locators.CalculatorInputLocators.click_on_age).click();
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.age_in_years)).sendKeys(InputUtils.PatientInfoUtils.getAgeyears());
        if(AddARecord.i<5) {
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.age_in_months)).sendKeys(InputUtils.PatientInfoUtils.getAgemonths());
        }
        else{
            System.out.println("0 months");
        }
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.save_age)).click();

        if(AddARecord.a1.equalsIgnoreCase(InputUtils.PatientInfoUtils.getGender())){
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.male)).click();//Selects Male as Gender
            Thread.sleep(2000);
        }
        else {
            Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.female)).click();//Selects Female as Gender
            Thread.sleep(2000);
            if((AddARecord.i>=12 && AddARecord.i<=50)){
                Utils.locateByXpath(StringUtils.getByTextAndID(Locators.CalculatorInputLocators.preg_text_reid,Locators.CalculatorInputLocators.preg_text));
                if(InputUtils.CalcInputUtils.is_pregnant.equalsIgnoreCase("yes")){
                    Utils.clickOnYesButton(1);
                }
                else{
                    Utils.clickOnNoButton(1);
                }
            }
            else{
                System.out.println("Not likely pregnant");
            }
        }
        Thread.sleep(2000);
        if((AddARecord.i>=12 && AddARecord.i<=50)&&InputUtils.PatientInfoUtils.getGender().equalsIgnoreCase("female")){
            AddARecord.verticalSwipe();
            Thread.sleep(2000);
        }
        else{
            System.out.print("No need of vertical swipe");
        }
        if(InputUtils.HistoryUtils.getWatery().equalsIgnoreCase("yes")){
            Utils.clickOnYesButton(1);
        }
        else{
            Utils.clickOnNoButton(1);
        }
        Thread.sleep(2000);
        if(InputUtils.HistoryUtils.getBloody().equalsIgnoreCase("yes")){
            Utils.clickOnYesButton(2);
        }
        else{
            Utils.clickOnNoButton(2);
        }
        Thread.sleep(2000);
        if(InputUtils.PatientInfoUtils.getGender().equalsIgnoreCase("male")){
            AddARecord.min_verticalSwipe();
        }
        Utils.locateById(Locators.CalculatorInputLocators.general_condition_spinner).click();//Dehydration Status
        Thread.sleep(1000);
        Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getGENERALCONDITION())).click();
        Thread.sleep(1000);
        Utils.locateById(Locators.CalculatorInputLocators.eyes_spinner).click();
        Utils.locateByXpath(StringUtils.getTextViewByText(InputUtils.ExamUtils.getEYECONDITION())).click();
        Thread.sleep(2000);
        AddARecord.verticalSwipe();
        Thread.sleep(2000);
        Utils.locateById(Locators.CalculatorInputLocators.thirst_spinner).click();
        Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getTHIRSTCONDITION())).click();
        Thread.sleep(2000);
        Utils.locateById(Locators.CalculatorInputLocators.skin_pinch_spinner).click();
        Thread.sleep(1000);
        Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.ExamUtils.getSKINPINCHCONDITION())).click();
        Thread.sleep(1000);
        Utils.clickOnNoButton(0);//Marking Allergies as No
        AddARecord.verticalSwipe();
        if(InputUtils.CalcInputUtils.is_temp== InputUtils.CalcInputUtils.FEVER.HIGH){
            Utils.locateById(Locators.CalculatorInputLocators.high_temp).click();
        }
        else if(InputUtils.CalcInputUtils.is_temp== InputUtils.CalcInputUtils.FEVER.LOW){
            Utils.clickOnYesButton(1);
        }
        else{
            Utils.clickOnNoButton(1);
        }
        Thread.sleep(1000);
        driver.findElements(By.id("com.stooltool:id/radio_layout_btn_yes")).size();
        driver.findElements(By.id("com.stooltool:id/radio_layout_btn_no")).size();
        if(InputUtils.ExamUtils.getFastBreathing().equalsIgnoreCase("yes")){
            Utils.clickOnYesButton(2);
        }
        else{
            Utils.clickOnNoButton(2);
        }
        if(InputUtils.ExamUtils.getVomiting().equalsIgnoreCase("yes")){
            Utils.clickOnYesButton(3);
        }
        else{
            Utils.clickOnNoButton(3);
        }
        if(InputUtils.ExamUtils.getConvulsions().equalsIgnoreCase("yes")){
            Utils.clickOnYesButton(4);
        }
        else{
            Utils.clickOnNoButton(4);
        }
        Thread.sleep(2000);
        Utils.locateById(Locators.CalculatorInputLocators.calculate_btn).click();
    }
}
