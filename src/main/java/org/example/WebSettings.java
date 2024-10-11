package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebSettings {

    WebDriver driver;
    public WebSettings(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}