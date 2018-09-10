import java.beans.Statement;
import java.io.StringReader;

/**
 * Created by sumanth on 27/10/17.
 */
public class Locators {
    public static class LauchLocators {
         static String secret_key_text ="app_key";
         static String press_secret_key ="confirm_app_key";
         static String accept_terms_button ="acceptTermsBtn";
    }
    public static class LoginLocators {
         static String username="set_username";
         static String password="set_password";
         static String login_button ="btn_login";
         static String rehy_calc="com.stooltool:id/calculator_layout";
    }
    public static class SettingsLocators{
         static String assesment_card ="Assessment";
         static String antibiotics_card="Antibiotics";
         static String account_card="Account";
         static String advanced_card="Advanced";
         static String weight_estimate_spinner="settings_weight_estimates";
         static String default_weight_estimator="settings_weight_estimates";
         static String dehy_assesment_spinner="settings_dehy_assessment_method";
         static String default_assesment_method="WHO Method";
         static String dehy_guide_spinner_calc="dehydration_guide_cal";
         static String dehy_guide_value_calc="Required on calculator";
         static String dehy_guide_spinner_fullplatform="dehydration_guide_full";
         static String dehy_guide_value_fullplatform="Required on full platform";
         static String mal_guide_spinner_calc="malnutrition_guide_cal";
         static String mal_guide_value_calc="Off (calculator)";
         static String mal_guide_spinner_fullplatform="malnutrition_guide_full";
         static String mal_guide_value_fullplatform="Off (full platform)";
         static String abx_spinner_lessthan2="drug_acute_watery_diarrhoea_less_than_2";
         static String abx_value_lessthan2="Azithromycin";
         static String default_dehy_lessthan2_spinner="severe_moderatel_less_than_2";
         static String default_dehy_lessthan2_value="Severe dehydration only";
         static String abx_spinner_above2="drug_acute_watery_diarrhoea_greater_than_2_closed";
         static String abx_value_above2="Azithromycin; Doxycycline";
         static String default_dehy_over2_spinner="severe_moderatel_greater_than_2";
         static String default_dehy_over2_value="Some and severe dehydration";
         static String abx_spinner_bloody="drug_bloody_diarrhoea_less_than_2_closed";
         static String abx_bloody_default_value="Azithromycin; Ciprofloxacin";
         static String mal_abx_spinner="drug_acute_watery_diarrhoea_and_malnutrition_less_than_2";
         static String mal_abx_default_value="Ampicillin + Gentamicin";
         static String language_spinner="app_language_settings";
         static String default_lang="English(Global)";
         static String data_collection_button="platform_radio_2";
         static String additional_findings_on="additional_findings_on";
         static String discharge_notifications_on="discharge_nudges_on";
         static String discharge_edu_materials_off="edu_mat_radio_2";
         static String fingerprint_off="fingerprint_nudges_no";
         static String inpatient_notifications_no="inpatient_nudges_no";
         static String mapit_off="map_it_off";
         static String sort_by_id="sorting_style_1";
         static String stockout_off="stock_out_radio_2";
    }
    public static class PatientListLocators {
         static String new_record_button ="new_outbreak_clicker";
         static String nav_back ="Patient Chart, Navigate up";
         static String patient_list_text="Patient List";
         static String settings_icon="android:id/action_bar_title";
    }
    public static class PatientInfoLocators {
         static String admission_time ="admission_time_text";
         static String current_time_button ="set_current_time_btn";
         static String check_name_none ="nameNoneCheckbox";
         static String check_phnnumber_none ="phoneNoneCheckbox";
         static String check_id_none ="iDNoneCheckbox";
         static String enter_name ="signup_name";
         static String enter_phn_number ="phone_number";
         static String enter_id ="patient_id";
         static String first_entry ="info_first_entry";
         static String second_entry ="info_second_entry";
         static String save_double_entry ="check_info_save";
         static String click_on_age ="age_text";
         static String age_in_months ="age_month";
         static String age_in_years ="age_year";
         static String save_age ="done_btn";
         static String male="radio_layout_btn_yes";
         static String female="radio_layout_btn_no";
         static String click_birth_order ="birth_order";
         static String scan_none ="scanner_checkBox";
         static String district_spinner ="map_district_spinner";
         static String upazilla_spinner ="map_upazilla_spinner";
         static String union_spinner ="map_union_spinner";
         static String nav_to_history ="next_illness_history";

    }
    public static class HistoryLocators {
         static String chief_comp_text ="Chief Complaint";
         static String water_yes ="[404,313][532,409]";
         static String watery_no ="[552,313][680,409]";
         static String blood_yes ="[404,441][532,537]";
         static String bloody_no ="[552,441][680,537]";
         static String click_time_of_onset ="diarrhea_onset_time";
         static String loose_stools_spinner ="loose_stools_spinner";
         static String nav_to_exam ="next_assessment";
         static String yes_button="radio_layout_btn_yes";
         static String no_button="radio_layout_btn_no";
    }
    public static class ExamLocators {
         static String weight_kg="assessment_weight_unit_kg";
         static String weight_lbs="assessment_weight_unit_lbs";
         static String enter_weight="weight_text";
         static String muac_mm="muac_unit_mm";
         static String muac_cm="muac_unit_cm";
         static String enter_muac="muac_text";
         static String general_condition="general_condition_spinner";
         static final String generalcondition_1="Well / Alert";
         static final String generalcondition_2="Restless / Irritable";
         static final String generalcondition_3="Lethargic / Unconscious";
         static String click_eye ="eye_spinner_text";
         static final String eye_condition_1="Normal";
         static final String eye_condition_2="Sunken";
         static String click_thirst ="thirst_spinner";
         static final String thirst_condition_1="Normal";
         static final String thirst_condition_2="Drinks Eagerly/ Thirsty";
         static final String thirst_condition_3="Drinks Poorly/ Not able to drink";
         static String click_skin_pinch ="skin_pinch_spinner";
         static final String skinpinch_condition_1="Normal(<2 sec)";
         static final String skinpinch_condition_2="Slow(2-3 sec)";
         static final String skinpinch_condition_3="Very Slow(> 3 sec)";
         static String click_tears ="tears_spinner";
         static String click_respirations ="respiration_spinner";
         static String click_radial_pulse ="additional_findings_radial_pulse_spinner";
         static String click_urinated ="urinated_spinner";
         static String temp_normal ="radio_layout_btn_first";
         static String temp_low ="radio_layout_btn_second";
         static String temp_high ="radio_layout_btn_third";
         static String save_record="next_plan";

    }
     public static class QiLocators {
          static final String qiIcon="qi_improvement";
          static final String admin_card="Admin";
          static final String consent_yes= "yesButton";
          static final String consent_no= "noButton";
          static final String consent_na= "naButton";
          static final String clinician_name="clinician_id";
          static final String clinician_none="clinicianNoneCheckbox";
          static final String cc_number="calculation_code_number";
          static final String cc_number_none="ccnNoneCheckbox";
          static final String cc_firstentry="info_first_entry";
          static final String cc_secondentry="info_second_entry";
          static final String hospital_card="Hospital";
          static final String dehydration_status_spinner="dehydration_status_spinner";
          static final String dehystatus_1="No";
          static final String dehystatus_2="Some";
          static final String dehystatus_3="Severe";
          static final String dehystatus_4="Not available";
          static final int ors_yes=0;
          static final int ors_no=0;
          static final String ors_input="qi_ordered_ors_given_text";
          static final String ors_unit_ltr="qi_ordered_ors_unit_lt";
          static final String ors_unit_packets="qi_ordered_ors_unit_packets";
          static  final String save_qi="qi_save";
          static final int iv_yes=1;
          static final int iv_no=1;
          static final String iv1_unit_ltr="qi_ordered_first_iv_unit_ltr";
          static final String iv1_unit_ml="qi_ordered_first_iv_unit_ml";
          static final String iv1_input="qi_ordered_first_iv_fluids_given_text";
          static final String iv1duration="qi_ordered_first_iv_fluids_given_duration";
          static final String iv2_unit_ltr="qi_ordered_second_iv_unit_ltr";
          static final String iv2_unit_ml="qi_ordered_second_iv_unit_ml";
          static final String iv2_input="qi_ordered_second_iv_fluids_given_text";
          static final String iv2duration="qi_ordered_second_iv_fluids_given_duration";
          static final String totaliv="qi_ordered_total_iv_fluids_given_text";
          static final int anti_yes=0;
          static final int anti_no=0;
          static final String metronidazole="qi_ordered_metronidazole";
          static final String ciprofloxacin="qi_ordered_ciprofloxacin";
          static final String azithromycin="qi_ordered_azithromycin";
          static final String tetracyclne="qi_ordered_paracetamol";
          static final String gentamicin="qi_ordered_gentamicin";
          static final String ampicillin="qi_ordered_ampicillin";
          static final String pivmecillinam="qi_ordered_pivmecillinam";
          static final String other="qi_ordered_other_medicine";
          static final int zinc_yes=0;
          static final int zinc_no=0;
          static final int vitaminA_yes=1;
          static final int vitaminA_no=1;
          static final String household_card="Household";
          static final String father_none="fatherNoneCheckbox";
          static final String father_education_spinner="father_highest_education_spinner";
          static final String father_salary="father_salary_last_month";
          static final String mother_none="motherNoneCheckbox";
          static final String mother_education_spinner="mother_highest_education_spinner";
          static final String mother_salary="mother_salary_last_month";
          static final String patient_none="patientNoneCheckbox";
          static final String patient_education_spinner="patient_highest_education_spinner";
          static final String patient_salary="patient_salary_last_month";
          static final String spouse_none="spouseNoneCheckbox";
          static final String spouse_education_spinner="spouse_highest_education_spinner";
          static final String spouse_salary="spouse_salary_last_month";


     }
     public static class SignupLocators{
          static final String create_accnt_btn="tv_signup";
          static final String sign_up_text="Sign In";
          static final String signup_uname="set_username";
          static final String signup_name="set_name";
          static final String signup_password="set_password";
          static final String confirm_password="set_confirm_password";
          static final String signupkey="secret_key";
          static final String register="btn_register";
     }
    public static class PateientChartLocators{
        static final String patient_chart_txt="action_bar_title";
    }
    public static class CalculatorInputLocators{
        static final String new_input_icon="com.stooltool:id/new_input";
        static final String click_on_age="com.stooltool:id/input_age_text";
        static final String click_on_weight="com.stooltool:id/input_weight_text";
        static final String kg_weight="com.stooltool:id/input_weight_unit_kg";
        static final String lbs_weight="com.stooltool:id/input_weight_unit_lb";
        static final String preg_text="com.stooltool:id/radio_layout_text";
        static final String preg_text_reid="Pregnant?";
        static final String general_condition_spinner="com.stooltool:id/input_general_condition_spinner";
        static final String eyes_spinner="com.stooltool:id/input_eyes_spinner";
        static final String thirst_spinner="com.stooltool:id/input_thirst_spinner";
        static final String skin_pinch_spinner="com.stooltool:id/input_skin_pinch_spinner";
        static final String calculate_btn="com.stooltool:id/input_next_output";
        static final String high_temp="com.stooltool:id/radio_layout_btn_third";
        static final String med_temp="com.stooltool:id/radio_layout_btn_no";
        static final String low_temp="com.stooltool:id/radio_layout_btn_yes";

     }
    public static class CalculatorOutputLocators{
        static final String first_antibiotic="com.stooltool:id/first_sub_text";
        static final String danger_signs_text="Danger Signs";
        static final String fever_text="Fever (> 100.3 F)";
        static final String blood_stool="Blood in a Stool";
        static final String vomiting="Vomiting / Unable to drink";
        static final String fastbreathing="Fast Breathing";
        static final String convulsions="Convulsions or Seizures";
        static final String hypo_text="Hypothermia (< 95 F)";
        static final String correction_fluids="com.stooltool:id/output_ors_loss_measures";

    }



}
