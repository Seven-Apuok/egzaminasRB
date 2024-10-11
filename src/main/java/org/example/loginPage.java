package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends WebSettings{
    public loginPage(WebDriver driver) {
        super(driver);
    }

                    //Login page objects

       @FindBy(xpath = "/html/body/div/form/div/input[1]")
                private WebElement userN;

       @FindBy(xpath = "/html/body/div/form/div/input[2]")
                private WebElement passN;

       @FindBy(xpath = "/html/body/div/form/div/button")
                private WebElement submit;



                 //Login page objects properties


    public void entUser() {
        this.userN.clear();
        this.userN.sendKeys("Robertas");

        this.passN.clear();
        this.passN.sendKeys("pass321");

        this.submit.click();
    }



}
