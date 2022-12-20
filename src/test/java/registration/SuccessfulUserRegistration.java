package registration;

import Utilis.ChromeRunner;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class UserRegistration extends ChromeRunner {
    @Test
    public static void registrationUsingChrome(){
//        შემოწმდეს გვერდი გაიხსნა თუ არა
        $(By.linkText("Signup / Login")).click();
//        5. Verify 'New User Signup!' is visible
//        Enter name and email address
        $(By.name("name")).sendKeys("TestName");
        $(By.)
    }
}
