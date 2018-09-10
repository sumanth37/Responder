import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by sumanth on 25/10/17.
 */
public class InputUtils {
    public static class SettingsUtils {
        private static final String decision_support="off";
        public static String getDecision_support(){
            return decision_support;
        }
        private static final String additional_findings="on";
        public static String getAdditional_findings(){
            return additional_findings;
        }
        private static final String fingerprint_recording="off";
        public static String getFingerprint_recording(){
            return fingerprint_recording;
        }
        private static final String mal_guide="off";
        public static String getMal_guide(){
            return mal_guide;
        }
        private static final String dehy_guide="";

    }

    public static class PatientInfoUtils{
         private static final String name="I";
         public static String getName(){
             return name;
         }
         private static final String ageyears="19";
         public static String getAgeyears() {
             return ageyears;
         }
         private static final String agemonths="2";
         public static String getAgemonths() {
             return agemonths;
         }
         private static final String phnnumber="2313";
         public static String getPhnnumber() {
             return phnnumber;
         }
         private static final String id="07s0068";
         public static String getId() {
             return id;
         }
         private static final String gender="female";
         public static String getGender(){
             return gender;
         }
         private static final String birthorder="1";
         public static String getBirthorder(){
             return birthorder;
         }
         private static final String district="Netrakona";
         public static String getDistrict(){
             return district;
         }
         private static final String upazilla="Atpara";
         public static String getUpazilla(){
             return upazilla;
         }
         private static final String union="";
         public static String getUnion(){
             return union;
         }
     }
    public static class HistoryUtils{
        private static String watery="yes";
        public static String getWatery(){
            return watery;
        }
        private static String bloody="no";
        public static String getBloody(){
            return bloody;
        }
        private static String timeofonset="This morning";
        public static String getTimeofonset(){
            return timeofonset;
        }
        private static String loosestoolcount="7 - 12";
        public static String getLoosestoolcount(){
            return loosestoolcount;
        }
    }
    public static class ExamUtils{
        private static final String weight="75";
        public static String getWeight(){
            return weight;
        }
        private static final String weightunit="kg";
        public static String getWeightunit(){
            return weightunit;
        }
        private static final String muac="";
        public static String getMuac(){
            return muac;
        }
        private static final String muacunit="";
        public static String getMuacunit(){
            return muacunit;
        }
        static GENERALCONDITION selectedcondition=GENERALCONDITION.FIRST;
        private enum GENERALCONDITION{
            FIRST,SECOND,THIRD
        }
        public static String getGENERALCONDITION(){
            if(selectedcondition == GENERALCONDITION.FIRST){
                return Locators.ExamLocators.generalcondition_1;
            }
            else if (selectedcondition == GENERALCONDITION.SECOND){
                return Locators.ExamLocators.generalcondition_2;

            }
            else {
                return Locators.ExamLocators.generalcondition_3;
            }
        }
        static EYECONDITION selectedeyecondition=EYECONDITION.SECOND;
        private enum EYECONDITION{
            FIRST,SECOND
        }
        public static String getEYECONDITION(){
            if(selectedeyecondition == EYECONDITION.FIRST){
                return Locators.ExamLocators.eye_condition_1;
            }
            else if (selectedeyecondition == EYECONDITION.SECOND){
                return Locators.ExamLocators.eye_condition_2;

            }
            else {
                return "";
            }

        }
        static THIRSTCONDITION selectedthirstcondition=THIRSTCONDITION.SECOND;
        private enum THIRSTCONDITION{
            FIRST,SECOND,THIRD
        }
        public static String getTHIRSTCONDITION(){
            if(selectedthirstcondition == THIRSTCONDITION.FIRST){
                return Locators.ExamLocators.thirst_condition_1;
            }
            else if (selectedthirstcondition == THIRSTCONDITION.SECOND){
                return Locators.ExamLocators.thirst_condition_2;

            }
            else {
                return Locators.ExamLocators.thirst_condition_3;
            }

        }
        static SKINPINCHCONDITION selectedskinpinchcondition=SKINPINCHCONDITION.FIRST;
        private enum SKINPINCHCONDITION{
            FIRST,SECOND,THIRD
        }
        public static String getSKINPINCHCONDITION(){
            if(selectedskinpinchcondition == SKINPINCHCONDITION.FIRST){
                return Locators.ExamLocators.skinpinch_condition_1;
            }
            else if (selectedskinpinchcondition == SKINPINCHCONDITION.SECOND){
                return Locators.ExamLocators.skinpinch_condition_2;

            }
            else {
                return Locators.ExamLocators.skinpinch_condition_2;
            }

        }

        private static final String tearsvalue="Normal";
        public static String getTearsvalue(){
            return tearsvalue;
        }
        private static final String respirationsvalue="Deep";
        public static String getRespirationsvalue(){
            return respirationsvalue;
        }
        private static final String radialpulse="Low Volume";
        public static String getRadialpulse(){
            return radialpulse;
        }
        private static final String urinated="No";
        public static String getUrinated(){
            return urinated;
        }
        static TEMP selectedTemp=TEMP.MEDIUM;
        public enum TEMP{
            HIGH, LOW,MEDIUM
        }
        public static String getTemp(){
            if(selectedTemp == TEMP.HIGH){
                return Locators.ExamLocators.temp_high;
            }
            else if (selectedTemp == TEMP.LOW){
                return Locators.ExamLocators.temp_low;

            }
            else {
                return Locators.ExamLocators.temp_normal;
            }}
        private static final String fastBreathing="no";
        public static String getFastBreathing(){
            return fastBreathing;
        }
        private static final String vomiting="no";
        public static String getVomiting(){
            return vomiting;
        }
        private static final String convulsions="no";
        public static String getConvulsions(){
            return convulsions;
        }


        }
    public static class LoginUtils{
        private static final String uname="u1";
        public static String getUname(){
            return uname;
        }
        private static final String upassword="Live123";
        public static String getUpassword(){
            return upassword;
        }
    }
    public static class QiUtils {
        static DEHYDRATIONSTATUS selecteddehystatus = DEHYDRATIONSTATUS.THIRD;

        private enum DEHYDRATIONSTATUS {
            FIRST, SECOND, THIRD, FOURTH
        }

        public static String getDehydrationStatus() {
            if (selecteddehystatus == DEHYDRATIONSTATUS.FIRST) {
                return Locators.QiLocators.dehystatus_1;
            } else if (selecteddehystatus == DEHYDRATIONSTATUS.SECOND) {
                return Locators.QiLocators.dehystatus_2;
            } else if (selecteddehystatus == DEHYDRATIONSTATUS.THIRD) {
                return Locators.QiLocators.dehystatus_3;
            } else {
                return Locators.QiLocators.dehystatus_4;
            }
        }

        static ORS selected_ors = ORS.YES;

        static enum ORS {
            YES, NO
        }

        public static int getOrs() {
            if (selected_ors == ORS.YES) {
                return Locators.QiLocators.ors_yes;
            } else {
                return Locators.QiLocators.ors_no;
            }
        }

        static ORS_UNIT selectedorsunit = ORS_UNIT.PAC;

        private enum ORS_UNIT {
            LIT, PAC
        }

        public static String getOrsUnit() {
            if (selectedorsunit == ORS_UNIT.LIT) {
                return Locators.QiLocators.ors_unit_ltr;
            } else {
                return Locators.QiLocators.ors_unit_packets;
            }
        }

        private static final String ors_value = "1";

        public static String getOrs_value() {
            return ors_value;
        }

        static IVFLUIDS selected_ivfluids = IVFLUIDS.YES;

        static enum IVFLUIDS {
            YES, NO
        }

        public static int getIVFluids() {
            if (selected_ivfluids == IVFLUIDS.YES) {
                return Locators.QiLocators.iv_yes;
            } else {
                return Locators.QiLocators.iv_no;
            }
        }

        static IV1_UNIT selectediv1unit = IV1_UNIT.ML;

        private enum IV1_UNIT {
            LIT, ML
        }

        public static String getIv1Unit() {
            if (selectediv1unit == IV1_UNIT.LIT) {
                return Locators.QiLocators.iv1_unit_ltr;
            } else {
                return Locators.QiLocators.iv1_unit_ml;
            }
        }

        private static final String iv1_value = "1";

        public static String getIv1_value() {
            return iv1_value;
        }

        private static final String iv1hrs = "1";

        public static String getIv1hrs() {
            return iv1hrs;
        }

        private static final String iv2_value = "1";

        public static String getIv2_value() {
            return iv2_value;
        }

        private static final String iv2hrs = "1";

        public static String getIv2hrs() {
            return iv2hrs;
        }

        private static final String total_iv = "2";

        public static String getTotal_iv() {
            return total_iv;
        }

        static ANTI antibiotics_input = ANTI.YES;

        static enum ANTI {
            YES, NO;
        }

        public static int getAntiinput() {
            if (antibiotics_input == ANTI.YES) {
                return Locators.QiLocators.anti_yes;
            } else {
                return Locators.QiLocators.anti_no;
            }
        }

        static int antiarray[] = {0, 1, 2, 3, 4, 5, 6, 7};
        static ZINC zinc_input = ZINC.NO;
        static enum ZINC {
            YES, NO;
        }

        public static int getZincinput() {
            if (zinc_input == ZINC.YES) {
                return Locators.QiLocators.zinc_yes;
            } else {
                return Locators.QiLocators.zinc_no;
            }
        }
        static VITAMINA vitaminA_input = VITAMINA.NO;
        static enum VITAMINA {
            YES, NO;
        }

        public static int getVitaminAinput() {
            if (vitaminA_input == VITAMINA.YES) {
                return Locators.QiLocators.vitaminA_yes;
            } else {
                return Locators.QiLocators.vitaminA_no;
            }
        }
        private static String father_available="notnone";
        public static String getFather_available(){
            return father_available;
        }
        public static String fathers_edu="others";
        public static void getFathers_edu() throws InterruptedException {

                if (fathers_edu.equalsIgnoreCase("illiterate"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Illiterate")).click();
                else if (fathers_edu.equalsIgnoreCase("PSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Primary School Certificate (PSC)")).click();
                else if (fathers_edu.equalsIgnoreCase("JSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Junior School Certificate (JSC)")).click();
                else if (fathers_edu.equalsIgnoreCase("SSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Secondary School Certificate (SSC)")).click();
                else if (fathers_edu.equalsIgnoreCase("HSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Higher Secondary Certificate (HSC)")).click();
                else if (fathers_edu.equalsIgnoreCase("Graduate"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Graduate")).click();
                else if (fathers_edu.equalsIgnoreCase("Postgraduate"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Post-graduate")).click();
                else if (fathers_edu.equalsIgnoreCase("Others")){
                    AddARecord.verticalSwipe();
                    Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Others")).click();
                }
                else if(fathers_edu.equalsIgnoreCase("unknown")){
                    AddARecord.verticalSwipe();
                    Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Unknown")).click();
                }


       }
        private static String mother_available="none";
        public static String getMother_available(){
            return mother_available;
        }
        public static String mothers_edu="others";
        public static void getMothers_edu() throws InterruptedException {

                if (mothers_edu.equalsIgnoreCase("illiterate"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Illiterate")).click();
                else if (mothers_edu.equalsIgnoreCase("PSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Primary School Certificate (PSC)")).click();
                else if (mothers_edu.equalsIgnoreCase("JSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Junior School Certificate (JSC)")).click();
                else if (mothers_edu.equalsIgnoreCase("SSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Secondary School Certificate (SSC)")).click();
                else if (mothers_edu.equalsIgnoreCase("HSC"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Higher Secondary Certificate (HSC)")).click();
                else if (mothers_edu.equalsIgnoreCase("Graduate"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Graduate")).click();
                else if (mothers_edu.equalsIgnoreCase("Postgraduate"))
                     Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Post-graduate")).click();
                else if (mothers_edu.equalsIgnoreCase("Others")){
                    AddARecord.verticalSwipe();
                    Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Others")).click();
                }
                else if(mothers_edu.equalsIgnoreCase("unknown")){
                    AddARecord.verticalSwipe();
                    Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Unknown")).click();
                }


       }private static String patient_available="notnone";
        public static String getPatient_available(){
            return patient_available;
        }
        public static String patients_edu="others";
        public static void getPatients_edu() throws InterruptedException {

            if (patients_edu.equalsIgnoreCase("illiterate"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Illiterate")).click();
            else if (patients_edu.equalsIgnoreCase("PSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Primary School Certificate (PSC)")).click();
            else if (patients_edu.equalsIgnoreCase("JSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Junior School Certificate (JSC)")).click();
            else if (patients_edu.equalsIgnoreCase("SSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Secondary School Certificate (SSC)")).click();
            else if (patients_edu.equalsIgnoreCase("HSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Higher Secondary Certificate (HSC)")).click();
            else if (patients_edu.equalsIgnoreCase("Graduate"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Graduate")).click();
            else if (patients_edu.equalsIgnoreCase("Postgraduate"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Post-graduate")).click();
            else if (patients_edu.equalsIgnoreCase("Others")){
                AddARecord.verticalSwipe();
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Others")).click();
            }
            else if(patients_edu.equalsIgnoreCase("unknown")){
                AddARecord.verticalSwipe();
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Unknown")).click();
            }


        }
        private static String spouse_available="notnone";
        public static String getSpouse_available(){
            return spouse_available;
        }
        public static String spouse_edu="others";
        public static void getSpouse_edu() throws InterruptedException {

            if (spouse_edu.equalsIgnoreCase("illiterate"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Illiterate")).click();
            else if (spouse_edu.equalsIgnoreCase("PSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Primary School Certificate (PSC)")).click();
            else if (spouse_edu.equalsIgnoreCase("JSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Junior School Certificate (JSC)")).click();
            else if (spouse_edu.equalsIgnoreCase("SSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Secondary School Certificate (SSC)")).click();
            else if (spouse_edu.equalsIgnoreCase("HSC"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Higher Secondary Certificate (HSC)")).click();
            else if (spouse_edu.equalsIgnoreCase("Graduate"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Graduate")).click();
            else if (spouse_edu.equalsIgnoreCase("Postgraduate"))
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Post-graduate")).click();
            else if (spouse_edu.equalsIgnoreCase("Others")){
                AddARecord.verticalSwipe();
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Others")).click();
            }
            else if(spouse_edu.equalsIgnoreCase("unknown")){
                AddARecord.verticalSwipe();
                Utils.locateByXpath(StringUtils.getCheckedTexViewtByText("Unknown")).click();
            }


        }

    }
    public static class SigninUtils {
        public static String signup_uname = "";
        public static String signup_name = "";
        public static String signup_password = "";
        public static String confirmpassword= "";
        public static String valid_signup_key = "key2";
        public static String invalid_signup_key = "34";
    }
    public static class CalcInputUtils{
        public static  String is_pregnant="yes";
        static FEVER is_temp=FEVER.HIGH;
        public enum FEVER{
            HIGH,LOW,MEDIUM
        }


    }


}
