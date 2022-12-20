package registration;
import Utilis.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfulUserRegistration extends ChromeRunner {
    @Test
    public static void registrationUsingChrome(){
        signupLoginButton.click();
        Assert.assertTrue(signupButton.is(Condition.visible), "Verify if 'New User Signup!' is visible");
        userNameInput.sendKeys("TestName1122334455");
        userEmailInput.sendKeys("TestEmail1122334455@gmail.com");
        signupButton.click();
        Assert.assertTrue(enterAccountInfo.isDisplayed(), "Verify if 'ENTER ACCOUNT INFORMATION' is visible");
        titleRadioButton.click();
        nameLabel.clear();
        nameLabel.sendKeys("TestFirstName TestLastName");
        Assert.assertTrue(emailField.is(Condition.not(Condition.empty)), "Verifi if email field is not empty");
        passwordInput.sendKeys("TestPassword123");
        DayOfBirthInput.selectOptionByValue("29");
        MonthOfBirthInput.selectOptionByValue("5");
        YearOfBirthInput.selectOptionByValue("1997");
        newsLetterCheck.click();
        offersCheck.click();
        fNameInput.sendKeys("Tato");
        lNameInput.sendKeys("Topuria");
        companyInput.sendKeys("Smart");
        addressInput.sendKeys("SomeTest Address st. 16");
        countrySelect.selectOptionByValue("United States");
        stateInput.sendKeys("Test State");
        cityInput.sendKeys("Test City");
        zipCodeInput.sendKeys("177");
        mobileNumberInput.sendKeys("555555555");
        createAccountButton.click();
        Assert.assertTrue(accCreated.isDisplayed(), "Verify if 'ACCOUNT CREATED!' is visible");
        continueButton.click();
        if(dismissButton.isDisplayed()){
            dismissButton.click();
        }
        deleteAcc.click();
        Assert.assertTrue(accDeleted.isDisplayed(), "Verify if 'Logged in as username' is visible");
        continueButton.click();
        String currentUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(BASEURL, currentUrl, "Verify if base url and last page url is same");
    }
}
