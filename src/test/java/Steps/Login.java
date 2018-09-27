package Steps;

import Base.testBase;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.Homepage;
import pages.LoginPage;
import pages.MyAccountPage;

import java.io.IOException;

public class Login extends testBase{

    @When("^i click on sign in$")
    public void iClickOnSignIn() throws Throwable {
//        driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
//        Thread.sleep(3000);
        CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
        commonpage.click_Signin_button();
    }


    @And("^i enter email in the email field$")
    public void iEnterEmailInTheEmailField() throws Throwable {
        //driver.findElement(By.id("email")).sendKeys("maxtest964@gmail.com");
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_email();

    }

    @And("^i enter password in the password field$")
    public void iEnterPasswordInThePasswordField() throws Throwable {
       // driver.findElement(By.id("passwd")).sendKeys("Today1");
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_password();


    }

    @And("^i click on login button$")
    public void iClickOnLoginButton() throws Throwable {
       //driver.findElement(By.id("SubmitLogin")).click();
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.click_login();

    }

    @Then("^i should be successfully logged in$")
    public void iShouldBeSuccessfullyLoggedIn() throws Throwable {
        MyAccountPage myaccountpage = PageFactory.initElements(driver, MyAccountPage.class);
        myaccountpage.verify_Account_holder();

    }
}
