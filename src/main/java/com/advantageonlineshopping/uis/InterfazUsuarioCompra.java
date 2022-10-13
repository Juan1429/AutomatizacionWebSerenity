package com.advantageonlineshopping.uis;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class InterfazUsuarioCompra {

    public static final Target BTN_USER = Target.the("Button UserInterface").locatedBy("//a[@id='menuUserLink']");
    public static final Target TXT_USER_NAME = Target.the("Label User Name").locatedBy("//input[@name='username']");
    public static final Target TXT_PASSWORD = Target.the("Label Password").locatedBy("//input[@name='password']");
    public static final Target BTN_SIGN_IN = Target.the("Button Sign In").locatedBy("//button[@id='sign_in_btnundefined']");
    public static final Target BTN_IMG = Target.the("Button Img").locatedBy("//div[@id='laptopsImg']");
    public static final Target TXT_PRODUCT1 = Target.the("Txt Product 1").locatedBy("//a[contains(text(),'HP Chromebook 14 G1(ENERGY STAR)')]");
    public static final Target TXT_PRODUCT2 = Target.the("Txt Product 2").locatedBy("//a[contains(text(),'HP Chromebook 14 G1(ES)')]");
    public static final Target TXT_PRODUCT3 = Target.the("Txt Product 3").locatedBy("//a[contains(text(),'HP ENVY - 17t Touch Laptop')]");
    public static final Target TXT_PRODUCT4 = Target.the("Txt Product 4").locatedBy("//a[contains(text(),'HP ENVY x360 - 15t Laptop')]");
    public static final Target TXT_PRODUCT5 = Target.the("Txt Product 5").locatedBy("//a[contains(text(),'HP Pavilion 15t Touch Laptop')]");
    public static final Target TXT_PRODUCT6 = Target.the("Txt Product 6").locatedBy("//a[contains(text(),'HP Pavilion 15z Laptop')]");
    public static final Target TXT_PRODUCT7 = Target.the("Txt Product 7").locatedBy("//a[contains(text(),'HP Pavilion 15z Touch Laptop')]");
    public static final Target TXT_PRODUCT8 = Target.the("Txt Product 8").locatedBy("//a[contains(text(),'HP Pavilion x360 - 11t Touch Laptop')]");
    public static final Target TXT_PRODUCT9 = Target.the("Txt Product 9").locatedBy("//a[contains(text(),'HP Spectre x360 - 13-4102dx')]");
    public static final Target TXT_PRODUCT10 = Target.the("Txt Product 10").locatedBy("//a[contains(text(),'HP Stream - 11-d020nr Laptop')]");
    public static final Target TXT_PRODUCT11 = Target.the("Txt Product 11").locatedBy("//a[contains(text(),'HP ZBook 17 G2 Mobile Workstation')]");
    public static final Target BTN_AGGCAR = Target.the("Button Agg Car").locatedBy("//button[@name='save_to_cart']");
    public static final Target BTN_CAR = Target.the("Button Car").locatedBy("//a[@id='shoppingCartLink']");
    public static final Target BTN_CHECKOUT = Target.the("Button Checkout").locatedBy("//button[@id='checkOutButton']");

}

