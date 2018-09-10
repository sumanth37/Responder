/**
 * Created by sumanth on 24/10/17.
 */
public class StringUtils {
    public static String getById(String id) {
        return "com.stooltool:id/"+id;
    }
    public static String getTextViewByText(String text){
        return "//android.widget.TextView[@text='"+text+"']";
    }
    public static String getCheckedTexViewtByText(String checkedtext){
        return "//android.widget.CheckedTextView[@text='"+checkedtext+"']";}
    public static String getButtonByBounds(String bounds){
        return "//android.widget.Button[@bounds='"+bounds+"']";
    }
    public static String getButtonById(String rid){
        return "//android.widget.Button[contains(@resource-id, 'com.stooltool:id/"+rid+"')]";
    }
    public static String getTextViewById(String vid){
        return "//android.widget.TextView[contains(@resource-id, 'com.stooltool:id/"+vid+"')]";
    }
    public static String getEditTextById(String eid){
        return "//android.widget.EditText[contains(@resource-id, 'com.stooltool:id/"+eid+"')]";
    }
    public static String getRadioButtontByText(String rid){
        return "//android.widget.RadioButton[(@text='"+rid+"')]";
    }
    public static String getTextInSpinner(String sid){
        return ".//android.widget.Spinner[@resource-id='com.stooltool:id/"+sid+"']/android.widget.TextView";
    }
    public static String getByTextAndID(String tid,String reid){
        return "//android.widget.TextView[contains(@resource-id, "+reid+") and @text='"+tid+"']";
    }
}
