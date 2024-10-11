package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registerPage extends WebSettings {
    public registerPage(WebDriver driver) {
        super(driver);
    }
                 //Register page objects
    @FindBy(xpath = "/html/body/div/form/div/h4/a")
    private WebElement regis;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement regName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement regPss;

    @FindBy(xpath = "//*[@id=\"passwordConfirm\"]")
    private WebElement regConPss;

    @FindBy(xpath = "//*[@id=\"userForm\"]/button")
    private WebElement regSub;

    //Register page objects properties

    public void regUser() {
        this.regis.click();

        this.regName.clear();
        this.regName.sendKeys("Robertas");

        this.regPss.clear();
        this.regPss.sendKeys("pass321");

        this.regConPss.clear();
        this.regConPss.sendKeys("pass321");

        this.regSub.click();
    }

}
