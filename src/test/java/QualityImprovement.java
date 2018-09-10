import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sumanth on 18/10/17.
 */
public class QualityImprovement extends Test1 {
    static int ageOfRecord;
    private static QualityImprovement qiinstance;
    public static QualityImprovement getInstance(){
        if(qiinstance== null){
            qiinstance = new QualityImprovement();
        }
        return qiinstance;
    }
    public void navToQi() throws InterruptedException {
        Utils.waitFor("//android.widget.ImageView[contains(@resource-id,'android:id/search_button')]");
        Utils.locateById("android:id/search_button").click();
        Thread.sleep(2000);
        Utils.locateById("android:id/search_src_text").sendKeys(InputUtils.PatientInfoUtils.getName());
        driver.pressKeyCode(AndroidKeyCode.ENTER);
        Thread.sleep(2000);
        Utils.locateByXpath(StringUtils.getTextViewByText(InputUtils.PatientInfoUtils.getName())).click();
        Utils.locateById(StringUtils.getById(Locators.QiLocators.qiIcon)).click();
    }
    public void enterAdminData() throws InterruptedException {
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.QiLocators.admin_card)).click();
        Thread.sleep(2000);
        Utils.locateById(StringUtils.getById(Locators.QiLocators.consent_yes)).click();
        Thread.sleep(2000);
        Utils.locateById(StringUtils.getById(Locators.QiLocators.clinician_name)).sendKeys("doctor");
        driver.pressKeyCode(AndroidKeyCode.BACK);
        Thread.sleep(3000);
        Utils.locateById(StringUtils.getById(Locators.QiLocators.cc_number)).click();
        Utils.locateById(StringUtils.getById(Locators.QiLocators.cc_firstentry)).sendKeys("22");
        Utils.locateById(StringUtils.getById(Locators.QiLocators.cc_secondentry)).sendKeys("22");
        Utils.locateById(StringUtils.getById(Locators.PatientInfoLocators.save_double_entry)).click();
        checkSavePerAccordion();

    }
    public void enterHospitalData() throws InterruptedException {
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.QiLocators.hospital_card)).click();
        Thread.sleep(3000);
        Utils.locateById(StringUtils.getById(Locators.QiLocators.dehydration_status_spinner)).click();
        Thread.sleep(2000);
        Utils.locateByXpath(StringUtils.getCheckedTexViewtByText(InputUtils.QiUtils.getDehydrationStatus())).click();
        if(InputUtils.QiUtils.selected_ors== InputUtils.QiUtils.ORS.YES){
            Utils.clickOnYesButton(InputUtils.QiUtils.getOrs());
            Thread.sleep(3000);
            Utils.locateById(InputUtils.QiUtils.getOrsUnit()).click();
            Thread.sleep(2000);
            Utils.locateById(Locators.QiLocators.ors_input).sendKeys(InputUtils.QiUtils.getOrs_value());
            driver.pressKeyCode(AndroidKeyCode.BACK);
        }
        else{
            Utils.clickOnNoButton(Locators.QiLocators.ors_no);
            System.out.println("ORS not given");
        }
        if(InputUtils.QiUtils.selected_ivfluids== InputUtils.QiUtils.IVFLUIDS.YES){
            Utils.clickOnYesButton(InputUtils.QiUtils.getIVFluids());
            Thread.sleep(3000);
            AddARecord.verticalSwipe();
            Utils.locateById(InputUtils.QiUtils.getIv1Unit()).click();
            Thread.sleep(2000);
            Utils.locateById(Locators.QiLocators.iv1_input).sendKeys(InputUtils.QiUtils.getIv1_value());
            Utils.waitFor(StringUtils.getEditTextById(Locators.QiLocators.iv1duration));
            Utils.locateById(Locators.QiLocators.iv1duration).sendKeys(InputUtils.QiUtils.getIv1hrs());
            Utils.locateById(Locators.QiLocators.iv2_input).sendKeys(InputUtils.QiUtils.getIv2_value());
            AddARecord.verticalSwipe();
            Utils.waitFor(StringUtils.getEditTextById(Locators.QiLocators.iv2duration));
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Utils.locateById(Locators.QiLocators.iv2duration).sendKeys(InputUtils.QiUtils.getIv2hrs());
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Utils.locateById(Locators.QiLocators.totaliv).sendKeys(InputUtils.QiUtils.getTotal_iv());
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(3000);
        }
        else{
            Utils.clickOnNoButton(Locators.QiLocators.iv_no);
            System.out.println("IV fluids not given");
        }
        Thread.sleep(3000);
        AddARecord.verticalSwipe();
        if(InputUtils.QiUtils.antibiotics_input== InputUtils.QiUtils.ANTI.YES){
            Utils.clickOnYesButton(InputUtils.QiUtils.getAntiinput());
            selectAllAntibiotics();
            Thread.sleep(2000);
        }
        else{
            Utils.clickOnNoButton(Locators.QiLocators.anti_no);
        }
        Thread.sleep(2000);
        AddARecord.verticalSwipe();
        if(InputUtils.QiUtils.zinc_input==InputUtils.QiUtils.ZINC.YES) {
            Utils.clickOnYesButton(Locators.QiLocators.zinc_yes);
        }
        else{
            Utils.clickOnNoButton(Locators.QiLocators.zinc_no);
        }
        Thread.sleep(2000);
        if(InputUtils.QiUtils.vitaminA_input==InputUtils.QiUtils.VITAMINA.YES) {
            Utils.clickOnYesButton(Locators.QiLocators.vitaminA_yes);

        }
        else {
            Utils.clickOnNoButton(Locators.QiLocators.vitaminA_no);
        }
        Thread.sleep(2000);
        checkSavePerAccordion();
    }
    public void enterHouseholdData() throws InterruptedException {
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.QiLocators.household_card)).click();
        if(ageOfRecord<18){
            if(InputUtils.QiUtils.getFather_available().equalsIgnoreCase("none")){
                Utils.locateById(StringUtils.getById(Locators.QiLocators.father_none)).click();
            }
            else{
                Utils.locateById(Locators.QiLocators.father_education_spinner).click();
                InputUtils.QiUtils.getFathers_edu();
                Utils.locateById(StringUtils.getById(Locators.QiLocators.father_salary)).sendKeys("1");
            }
            Thread.sleep(2000);
            if(InputUtils.QiUtils.getMother_available().equalsIgnoreCase("none")){
                Utils.locateById(StringUtils.getById(Locators.QiLocators.mother_none)).click();
            }
            else{
                Utils.locateById(Locators.QiLocators.mother_education_spinner).click();
                InputUtils.QiUtils.getMothers_edu();
                Utils.locateById(StringUtils.getById(Locators.QiLocators.mother_salary)).sendKeys("2");
            }

        }
        else{
            if(InputUtils.QiUtils.getPatient_available().equalsIgnoreCase("none")){
                Utils.locateById(StringUtils.getById(Locators.QiLocators.patient_none)).click();
            }
            else{
                Utils.locateById(Locators.QiLocators.patient_education_spinner).click();
                InputUtils.QiUtils.getPatients_edu();
                Utils.locateById(StringUtils.getById(Locators.QiLocators.patient_salary)).sendKeys("1");
            }
            Thread.sleep(2000);
            if(InputUtils.QiUtils.getSpouse_available().equalsIgnoreCase("none")){
                Utils.locateById(StringUtils.getById(Locators.QiLocators.spouse_none)).click();
            }
            else{
                Utils.locateById(Locators.QiLocators.spouse_education_spinner).click();
                InputUtils.QiUtils.getSpouse_edu();
                Utils.locateById(StringUtils.getById(Locators.QiLocators.spouse_salary)).sendKeys("2");
            }
        }
        checkSavePerAccordion();
    }
    private static void checkSavePerAccordion() throws InterruptedException {
        Utils.locateById(Locators.QiLocators.save_qi).click();
        WebElement age=driver.findElement(By.id("com.stooltool:id/age"));
        String s= age.getText();
        if(s.contains(" ")){
            s= s.substring(0, s.indexOf(" "));
            ageOfRecord=Integer.parseInt(s);
        }
        Utils.locateById(StringUtils.getById(Locators.QiLocators.qiIcon)).click();
    }


    public static void selectAllAntibiotics(){
        List<WebElement> antilist= driver.findElements(By.className("android.widget.CheckBox"));
        for(int i=0;i<antilist.size();i++){
            antilist.get(i).click();
        }
    }



}
