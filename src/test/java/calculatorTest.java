import org.example.calculatorPage;
import org.example.loginPage;
import org.example.registerPage;
import org.junit.jupiter.api.Test;

public class calculatorTest extends testSettings {
@Test
void regTest() throws InterruptedException{
    registerPage registar = new registerPage(driver);
    registar.regUser();}
@Test
void logTest() throws InterruptedException {
    loginPage login = new loginPage(driver);
    login.entUser();
}
@Test
    void calTest () throws InterruptedException {
    loginPage login = new loginPage(driver);
    login.entUser();
    calculatorPage calculator = new calculatorPage(driver);
        calculator.calProg();
        calculator.calCha();

    }
}
