import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testSettings {
    protected WebDriver driver;



    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:8080/prisijungti");
    }
//    @AfterEach
//    void closeDown(){
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.quit();
//    }
}
