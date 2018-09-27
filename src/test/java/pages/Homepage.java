package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
    @FindBy(how = How.CSS, using = "a.sf-with-ul")
    public static WebElement Women;


    @FindBy(how = How.CSS, using = ".sf-menu > li:nth-child(3) > a:nth-child(1)")
    public static WebElement Tshirt;

    @FindBy(how = How.ID, using = "header_logo")
    public static WebElement Logo;




    public void click_women_button(){
       Women.click();
    }

    public void click_Tshirt_button(){
        Tshirt.click();
    }



    public void verify_Logo(){
        Logo.isDisplayed();
    }



}