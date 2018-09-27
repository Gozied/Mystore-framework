package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how = How.ID, using = "email")
    public static WebElement MyEmail;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement Password;

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
    public static WebElement ForgotPassword;

    @FindBy(how = How.NAME, using = "SubmitLogin")
    public static WebElement loginButton;

    @FindBy(how = How.NAME, using = "email_create")
    public static WebElement RegisterEmail;

    @FindBy(how = How.NAME, using = "SubmitCreate")
    public static WebElement createaccount;


    public void type_email(){
        MyEmail.sendKeys("maxtest964@gmail.com");
    }

    public void type_password(){
        Password.sendKeys("Today1");
    }

    public void click_login(){
        loginButton.click();
    }

    public void click_forgot_password() {
        ForgotPassword.click();
    }

    public void type_register_email(){
        RegisterEmail.sendKeys("john964@gmail.com");
    }


}