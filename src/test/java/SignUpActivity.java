/**
 * Created by sumanth on 23/10/17.
 */
public class SignUpActivity extends Test1{
    private static SignUpActivity signupinstance;

    public static SignUpActivity getInstance() {
        if (signupinstance == null) {
            signupinstance = new SignUpActivity();
        }
        return signupinstance;
    }
    public void navToSignUpPage() throws InterruptedException {
        Utils.waitFor(StringUtils.getButtonById(Locators.SignupLocators.create_accnt_btn));
        Utils.locateById(Locators.SignupLocators.create_accnt_btn).click();
    }
    public void validSignup() throws InterruptedException {
        Utils.waitFor(StringUtils.getTextViewByText(Locators.SignupLocators.sign_up_text));
        Utils.locateById(Locators.SignupLocators.signup_uname).sendKeys(InputUtils.SigninUtils.signup_uname);
        Utils.waitFor(StringUtils.getTextViewByText(Locators.SignupLocators.signup_name));
        Utils.locateById(Locators.SignupLocators.signup_name).sendKeys(InputUtils.SigninUtils.signup_name);
        Utils.waitFor(StringUtils.getTextViewByText(Locators.SignupLocators.signup_password));
        Utils.locateById(Locators.SignupLocators.signup_password).sendKeys(InputUtils.SigninUtils.signup_password);
        Utils.waitFor(StringUtils.getTextViewByText(Locators.SignupLocators.confirm_password));
        Utils.locateById(Locators.SignupLocators.confirm_password).sendKeys(InputUtils.SigninUtils.confirmpassword);

    }
}
