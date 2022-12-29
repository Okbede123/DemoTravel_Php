package src2.interfacesUI;

public class LoginPageUI {

    public static final String EMAIL_LOCATOR = "css=div[class =form-group] span+input";

    public static final String CHECK_EMAIL_LOCATOR = "xpath=//input[@placeholder = 'Email']";

    public static final String CHECK_PASS_LOCATOR = "xpath=//input[@placeholder = 'Password']";

    public static final String CLICK_REMEMBER_ME_LOCATOR = "xpath=//label[text() = 'Remember Me']";

    public static final String CHECK_REMEMBER_CLICK = "xpath=//label[text() = 'Remember Me']//parent::div";

    public static final String ID_LOCATOR = "'rememberchb'";
    public static final String PASS_LOCATOR = "css= div[class ='form-group mb-2'] span+input";
    public static final String BUTTON_LOCATOR = "css= div[class = 'btn-box pt-3 pb-4'] button[type = 'submit']";
}
