package com.advantageonlineshopping.uis;

import net.serenitybdd.screenplay.targets.Target;

public class InterfazUsuario {


    //son los selectores Xpath para usar en la clase de tasks

    public static final Target BTN_MENU_USER = Target.the("Button UserInterface").locatedBy("//a[@id='menuUserLink']");
    public static final Target BTN_CREATE_ACCOUNT = Target.the("Create Account").locatedBy("//a[@translate='CREATE_NEW_ACCOUNT']");
    public static final Target TXT_USERNAME = Target.the("Label User Name").locatedBy("//input[@name='usernameRegisterPage']");
    public static final Target TXT_EMAIL = Target.the("Email Label").locatedBy("//input[@name='emailRegisterPage']");
    public static final Target TXT_PASSWORD = Target.the("PassWord").locatedBy("//input[@name='passwordRegisterPage']");
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("Confirm PassWord").locatedBy("//input[@name='confirm_passwordRegisterPage']");
    public static final Target TXT_NAME = Target.the("First Name Label").locatedBy("//input[@name='first_nameRegisterPage']");
    public static final Target TXT_LASTNAME = Target.the("Last Name Label").locatedBy("//input[@name='last_nameRegisterPage']");
    public static final Target TXT_PHONE = Target.the("Phone Number Label").locatedBy("//input[@name='phone_numberRegisterPage']");
    public static final Target BTN_COUNTRY = Target.the("DopDownList Countries").locatedBy("//select[@role='listbox']");
    public static final Target VALIDATE_DROPDOWN = Target.the("Validate Items Is Visible").locatedBy("//option[@label='Afganistan']");
    public static final Target LI_ITEM = Target.the("Country Select").locatedBy("//option[@label='Colombia']");
    public static final Target TXT_CITY = Target.the("City Label").locatedBy("//input[@name='cityRegisterPage']");
    public static final Target TXT_ADDRESS = Target.the("Address Label").locatedBy("//input[@name='addressRegisterPage']");
    public static final Target TXT_STATE = Target.the("State / Regio Label").locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
    public static final Target TXT_POSTAL = Target.the("Postal Code Label").locatedBy("//input[@name='postal_codeRegisterPage']");
    public static final Target BOX_ACCEPT = Target.the("Accept Terms Box").locatedBy("//input[@name='i_agree']");
    public static final Target BTN_REGISTER = Target.the("Register Button").locatedBy("//button[@id='register_btnundefined']");
    public static final Target VALIDATE_REGISTER = Target.the("Validate Register Text").locatedBy("//a[@id='menuUserLink']/span");

}
