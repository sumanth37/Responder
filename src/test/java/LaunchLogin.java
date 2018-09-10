import java.util.concurrent.TimeUnit;

/**
 * Created by sumanth on 21/8/17.
 */
public class LaunchLogin extends Test1{

    private static LaunchLogin loginActivityInstance;

    private LaunchLogin(){}

    public static LaunchLogin getInstance(){
        if(loginActivityInstance == null){
            loginActivityInstance = new LaunchLogin();
        }
        return loginActivityInstance;
    }
    public void appLaunch() throws InterruptedException{
        Utils.waitFor(StringUtils.getEditTextById(Locators.LauchLocators.secret_key_text));
//        Utils.locateByXpath(StringUtils.getEditTextById(Locators.LauchLocators.secret_key_text)).sendKeys(InputUtils.SigninUtils.invalid_signup_key);
//        Thread.sleep(2000);
        Utils.locateByXpath(StringUtils.getEditTextById(Locators.LauchLocators.secret_key_text)).sendKeys(InputUtils.SigninUtils.valid_signup_key);
        Utils.locateById(StringUtils.getById(Locators.LauchLocators.press_secret_key)).click();
        allowAppPermission();
        //Entered the key and navigated to TermsAndConditions activity
        Utils.waitFor(StringUtils.getButtonById(Locators.LauchLocators.accept_terms_button));
        Utils.locateById(StringUtils.getById(Locators.LauchLocators.accept_terms_button)).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        allowAppPermission();
        Thread.sleep(3000);
        Thread.sleep(3000);
        Test1.allowAppPermission();
    }

    public void performLogin() throws InterruptedException {

        Utils.waitFor(StringUtils.getEditTextById(Locators.LoginLocators.username));
        Utils.locateById(StringUtils.getById(Locators.LoginLocators.username)).sendKeys(InputUtils.LoginUtils.getUname());
        Thread.sleep(3000);
        Utils.locateById(StringUtils.getById(Locators.LoginLocators.password)).sendKeys(InputUtils.LoginUtils.getUpassword());
        Thread.sleep(3000);
        Utils.locateById(StringUtils.getById(Locators.LoginLocators.login_button)).click();
    }


}