import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sumanth on 6/8/18.
 */
public class TestDefaultSettings extends Test1 {

    @Test
    public static void goToSettings() throws InterruptedException {
        Utils.waitFor(StringUtils.getTextViewByText(Locators.PatientListLocators.patient_list_text));
        Utils.locateById(Locators.PatientListLocators.settings_icon).click();//Opens the about,settings,Qreference
        Thread.sleep(2000);
        List<WebElement> textviews= driver.findElements(By.id("android:id/text1"));//about,settings,Qreference,resources...
        Thread.sleep(2000);
        textviews.get(1).click();//Clicks on Settings option
        driver.findElementByAccessibilityId("lock").click();//Opens the lock to change settings
        Thread.sleep(2000);
    }
    @Test
    public static void defaultSettings()throws InterruptedException{
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.SettingsLocators.assesment_card)).click();
        WebElement weight_source= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.weight_estimate_spinner));
        if(weight_source.getText().equalsIgnoreCase(Locators.SettingsLocators.default_weight_estimator)){
            System.out.println("Default weight estimate is selected");
        }
        else{
            System.out.println("Weight estimate is non-default");
        }
        WebElement dehydration_assesment= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.dehy_assesment_spinner));
        if(dehydration_assesment.getText().equalsIgnoreCase(Locators.SettingsLocators.default_assesment_method)){
            System.out.println("Default dehydration assesmnent method is selected");
        }
        else{
            System.out.println("Dehydration assesment_card method is non-default");
        }
        WebElement dehydration_guide_calc= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.dehy_guide_spinner_calc));
        if(dehydration_guide_calc.getText().equalsIgnoreCase(Locators.SettingsLocators.dehy_guide_value_calc)){
            System.out.println("Dehydration guide is Required on calculator:default");
        }
        else{
            System.out.println("Dehydration guide is Optional on calculator:non-default");
        }
        WebElement dehydration_guide= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.dehy_guide_spinner_fullplatform));
        if(dehydration_guide.getText().equalsIgnoreCase(Locators.SettingsLocators.dehy_guide_value_fullplatform)){
            System.out.println("Dehydration guide is Required:default");
        }
        else{
            System.out.println("Dehydration guide is Optional:non-default");
        }
        WebElement mal_guide_cal= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.mal_guide_spinner_calc));
        if(mal_guide_cal.getText().equalsIgnoreCase(Locators.SettingsLocators.mal_guide_value_calc)){
            System.out.println("Malnutrition guide is Off on calculator:default");
        }
        else{
            System.out.println("Malnutrition guide is Required on calculator:non-default");
        }
        WebElement mal_guide= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.mal_guide_spinner_fullplatform));
        if(mal_guide.getText().equalsIgnoreCase(Locators.SettingsLocators.mal_guide_value_fullplatform)){
            System.out.println("Malnutrition guide is Off:default");
        }
        else{
            System.out.println("Malnutrition guide is Required:non-default");
        }
        Thread.sleep(3000);
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.SettingsLocators.antibiotics_card)).click();
        AddARecord.verticalSwipe();
        WebElement abx_watery1= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.abx_spinner_lessthan2));
        if(abx_watery1.getText().equalsIgnoreCase(Locators.SettingsLocators.abx_value_lessthan2)){
            System.out.println("Default antibiotic for watery diarrhea under 2 years is selected");
        }
        else{
            System.out.println("Non-default antibiotic for watery diarrhea under 2 years is selected");
        }
        WebElement abx_watery1_dehy= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.default_dehy_lessthan2_spinner));
        if(abx_watery1_dehy.getText().equalsIgnoreCase(Locators.SettingsLocators.default_dehy_lessthan2_value)){
            System.out.println("Default dehydration status for watery diarrhea under 2 years is selected");
        }
        else{
            System.out.println("Non-default dehydration status for watery diarrhea under 2 years is selected");
        }
        WebElement abx_watery2= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.abx_spinner_above2));
        if(abx_watery2.getText().equalsIgnoreCase(Locators.SettingsLocators.abx_value_above2)){
            System.out.println("Default antibiotic for watery diarrhea over 2 years is selected");
        }
        else{
            System.out.println("Non-default antibiotic for watery diarrhea over 2 years is selected");
        }
        WebElement abx_watery2_dehy= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.default_dehy_over2_spinner));
        if(abx_watery2_dehy.getText().equalsIgnoreCase(Locators.SettingsLocators.default_dehy_over2_value)){
            System.out.println("Default dehydration status for watery diarrhea over 2 years is selected");
        }
        else{
            System.out.println("Non-default dehydration status for watery diarrhea over 2 years is selected");
        }
        WebElement abx_bloody= Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.abx_spinner_bloody));
        if(abx_bloody.getText().equalsIgnoreCase(Locators.SettingsLocators.abx_bloody_default_value)){
            System.out.println("Default antibiotics for bloody diarrhea over 2 years is selected");
        }
        else{
            System.out.println("Non-default antibiotics for bloody diarrhea over 2 years is selected");
        }
        WebElement abx_mal = Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.mal_abx_spinner));
        if(abx_mal.getText().equalsIgnoreCase(Locators.SettingsLocators.mal_abx_default_value)){
            System.out.println("Default antibiotics for malnutrion is selected");
        }
        else{
            System.out.println("Non-default antibiotics for malnutrion is selected");
        }
        Thread.sleep(3000);
        AddARecord.verticalSwipe();
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.SettingsLocators.account_card)).click();
        WebElement default_lang = Utils.locateByXpath(StringUtils.getTextInSpinner(Locators.SettingsLocators.language_spinner));
        if(default_lang.getText().equalsIgnoreCase(Locators.SettingsLocators.default_lang)){
            System.out.println("Default language is selected");
        }
        else{
            System.out.println("Non-default language is selected");
        }
        Thread.sleep(3000);
        AddARecord.verticalSwipe();
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.SettingsLocators.advanced_card)).click();
        AddARecord.verticalSwipe();
        String s=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.data_collection_button)).getAttribute("checked");
        if(s.equalsIgnoreCase("true")){

          System.out.println("Data collection only is selected by default");
        }
        else{
            System.out.println("Non-default value for decision support is selected");
        }
        String s1=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.additional_findings_on)).getAttribute("checked");
        if(s1.equalsIgnoreCase("true")){

          System.out.println("Additional findings is on by default");
        }
        else{
            System.out.println("Non-default value for additional clinical findings is  selected");
        }
        String s2=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.discharge_notifications_on)).getAttribute("checked");
        if(s2.equalsIgnoreCase("true")){

          System.out.println("Discharge notifications is on by default");
        }
        else{
            System.out.println("Non-default value for discharge notifications is  selected");
        }
        Thread.sleep(2000);
        AddARecord.verticalSwipe();
        String s3=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.discharge_edu_materials_off)).getAttribute("checked");
        if(s3.equalsIgnoreCase("true")) {

            System.out.println("Discharge education materials is off by default");
        }
        else{
            System.out.println("Non-default value for discharge education materials is selected");
        }
        String s4=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.fingerprint_off)).getAttribute("checked");
        if(s4.equalsIgnoreCase("true")) {

            System.out.println("Fingerprint recording is off by default");
        }
        else{
            System.out.println("Non-default value for fingerprint recording is selected");
        }
        String s5=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.inpatient_notifications_no)).getAttribute("checked");
        if(s5.equalsIgnoreCase("true")) {

            System.out.println("Inpatient notifications is off by default");
        }
        else{
            System.out.println("Non-default value for inpatient notifications  is selected");
        }
        Thread.sleep(2000);
        AddARecord.verticalSwipe();
        String s6=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.mapit_off)).getAttribute("checked");
        if(s6.equalsIgnoreCase("true")) {

            System.out.println("Map-it is off by default");
        }
        else{
            System.out.println("Non-default value for map-it is selected");
        }
        String s7=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.sort_by_id)).getAttribute("checked");
        if(s7.equalsIgnoreCase("true")) {

            System.out.println("Patient list is ordered by ID by default");
        }
        else{
            System.out.println("Non-default value for patient list order is selected");
        }
        String s8=Utils.locateById(StringUtils.getById(Locators.SettingsLocators.stockout_off)).getAttribute("checked");
        if(s8.equalsIgnoreCase("true")) {

            System.out.println("Stock out is off by default");
        }
        else{
            System.out.println("Non-default value for stock out is selected");
        }


    }



}
