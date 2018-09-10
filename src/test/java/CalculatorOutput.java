import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by sumanth on 6/9/18.
 */
public class CalculatorOutput extends Test1{
    public static void VerifyAntibiotics() throws InterruptedException {
        AddARecord.verticalSwipe();
        Thread.sleep(2000);
        AddARecord.verticalSwipe();
        Utils.locateById(Locators.CalculatorOutputLocators.first_antibiotic).isDisplayed();
    }
    public static void VerifyDangerSigns() throws InterruptedException{
        AddARecord.verticalSwipe();
        Thread.sleep(2000);
        Utils.locateByXpath(StringUtils.getTextViewByText(Locators.CalculatorOutputLocators.danger_signs_text)).isDisplayed();
        Thread.sleep(2000);
        if(InputUtils.CalcInputUtils.is_temp== InputUtils.CalcInputUtils.FEVER.HIGH){
            Utils.locateByXpath(StringUtils.getTextViewByText(Locators.CalculatorOutputLocators.fever_text)).isDisplayed();
            System.out.println("Danger Sign:Fever is displayed as expected");
        }
        else if(InputUtils.CalcInputUtils.is_temp== InputUtils.CalcInputUtils.FEVER.LOW){
            Utils.locateByXpath(StringUtils.getTextViewByText(Locators.CalculatorOutputLocators.hypo_text)).isDisplayed();
            System.out.println("Danger Sign:Hypothermia is displayed as expected");
        }
        else{
            System.out.println("No fever and hypothermia");
        }
        if(InputUtils.ExamUtils.getConvulsions().equalsIgnoreCase("yes")){
            Utils.locateByXpath(StringUtils.getTextViewByText(Locators.CalculatorOutputLocators.convulsions)).isDisplayed();
            System.out.println("Danger Sign:Convulsion/Seizures is displayed as expected");
        }
        else {
            System.out.println("No convulsions");
        }
        AddARecord.min_verticalSwipe();
        if(InputUtils.ExamUtils.getFastBreathing().equalsIgnoreCase("yes")){
            Utils.locateByXpath(StringUtils.getTextViewByText(Locators.CalculatorOutputLocators.fastbreathing)).isDisplayed();
            System.out.println("Danger Sign:Pnuemonia/fast breathing is displayed as expected");
        }
        else {
            System.out.println("No fast breathing");
        }
        if(InputUtils.ExamUtils.getVomiting().equalsIgnoreCase("yes")){
            Utils.locateByXpath(StringUtils.getTextViewByText(Locators.CalculatorOutputLocators.vomiting)).isDisplayed();
            System.out.println("Danger Sign:Vomitings/Unable to drink is displayed as expected");
        }
        else {
            System.out.println("No vomitings");
        }
        if(InputUtils.HistoryUtils.getBloody().equalsIgnoreCase("yes")){
            Utils.locateByXpath(StringUtils.getTextViewByText(Locators.CalculatorOutputLocators.blood_stool)).isDisplayed();
            System.out.println("Danger Sign:Bloody stool is displayed as expected");
        }
        else{
            System.out.println("No blood in stool");
        }}
    public static void recalculate(){
        Utils.locateById("android:id/action_bar_title").click();
        Utils.locateById(Locators.CalculatorInputLocators.calculate_btn).click();
    }
    public static void VerifyCorrectionalFluids(){
        WebElement dehy_status=Utils.locateByXpath(StringUtils.getTextViewByText("Severe"));
        if(dehy_status.getText().equalsIgnoreCase("Severe")){
            AddARecord.min_verticalSwipe();
        }
        else{
            System.out.println("No need of scrolling");
        }
        Utils.locateByXpath(StringUtils.getTextViewByText("ORS")).isDisplayed();
        String correctional_fluid_msg=Utils.locateById(Locators.CalculatorOutputLocators.correction_fluids).getText();
        if(AddARecord.i>=10){
            String msg1="Atleast one glass or At least 200 ml per stool";
            if(msg1.equalsIgnoreCase(correctional_fluid_msg)){
                System.out.println("As Expected");
            }
        }
        else if(AddARecord.i>=2){
            String msg2="1/2 to 1 glass or 100-200 ml per stool";
            if(msg2.equalsIgnoreCase(correctional_fluid_msg)){
                System.out.println("As Expected");
            }
        }
        else{
            String msg3="10-20 teaspoons or 50-100 ml per stool";
            if(msg3.equalsIgnoreCase(correctional_fluid_msg)){
                System.out.println("As Expected");
            }
        }

    }


}
