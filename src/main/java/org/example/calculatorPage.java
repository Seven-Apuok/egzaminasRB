package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class calculatorPage extends WebSettings {
    public calculatorPage(WebDriver driver) {
        super(driver);
    }
    //calculator page objects

    @FindBy(xpath = "/html/body/nav/div/div/a")
    private WebElement mainP;

    @FindBy(xpath = "//*[@id=\"sk1\"]")
    private WebElement numI;

    @FindBy(xpath = "//*[@id=\"sk2\"]")
    private WebElement numII;

    @FindBy(xpath = "//*[@id=\"number\"]/select")
    private WebElement func;

    //funcPl Plus
    @FindBy(xpath = "//*[@id=\"number\"]/select/option[1]")
    private WebElement funcPl;

    //funcMi Minus
    @FindBy(xpath = "//*[@id=\"number\"]/select/option[2]")
    private WebElement funcMi;

    //funcMu Multiplication
    @FindBy(xpath = "//*[@id=\"number\"]/select/option[3]")
    private WebElement funcMu;

    //funcDe Divide
    @FindBy(xpath = "//*[@id=\"number\"]/select/option[4]")
    private WebElement funcDe;

    //Done page

    @FindBy(xpath = "/html/body/nav/div/ul[1]/li/a")
    private WebElement doneP;

    @FindBy(xpath = "/html/body/div/table/tbody/tr[2]/td[5]/a[1]")
    private WebElement chage;

    @FindBy(xpath = "//*[@id=\"command\"]/p[1]/input")
    private WebElement chageNumI;

    @FindBy(xpath = "//*[@id=\"command\"]/p[2]/input")
    private WebElement changeSym;

    @FindBy(xpath = "//*[@id=\"command\"]/p[3]/input")
    private WebElement chageNumII;

    @FindBy(xpath = "//*[@id=\"command\"]/p[4]/input")
    private WebElement chageResult;

    @FindBy(xpath = "//*[@id=\"command\"]/p[5]/input")
    private WebElement conf;

    @FindBy(xpath = "/html/body/div/table/tbody/tr[2]/td[5]/a[2]")
    private WebElement del;

    @FindBy(xpath = "/html/body/div/table/tbody/tr[2]/td[5]/a[3]")
    private WebElement show;


    //Submit
    @FindBy(xpath = "//*[@id=\"number\"]/input[3]")
    private WebElement numSub;

    // calculator progression
    public void calProg() {
        this.numI.clear();
        this.numI.sendKeys("10");

        this.numII.clear();
        this.numII.sendKeys("2");

        this.func.click();
        this.funcPl.click();

        this.numSub.click();

        this.mainP.click();

        this.numI.clear();
        this.numI.sendKeys("10");

        this.numII.clear();
        this.numII.sendKeys("2");

        this.func.click();
        this.funcMi.click();

        this.numSub.click();

        this.mainP.click();

        this.numI.clear();
        this.numI.sendKeys("10");

        this.numII.clear();
        this.numII.sendKeys("2");

        this.func.click();
        this.funcMu.click();

        this.numSub.click();

        this.mainP.click();

        this.numI.clear();
        this.numI.sendKeys("10");

        this.numII.clear();
        this.numII.sendKeys("10");

        this.func.click();
        this.funcDe.click();

        this.numSub.click();

        this.mainP.click();
    }

    //calculation changes
    public void calCha() {
        this.doneP.click();
        this.chage.click();
        this.chageNumI.clear();
        this.chageNumI.sendKeys("10");
        this.chageNumII.clear();
        this.chageNumII.sendKeys("2");
        this.chageResult.clear();
        this.chageResult.sendKeys("");
        this.changeSym.clear();
        this.changeSym.sendKeys("");
        this.conf.click();
        this.doneP.click();
        this.show.click();
        this.doneP.click();
        this.del.click();

    }
}