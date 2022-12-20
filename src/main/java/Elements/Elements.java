package Elements;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

//კლასი გამოვაცხადე როგორც აბსტრაქტული, ვინაიდან მის საფუძველზე ობიექტის შექმნა არ გვჭირდება
public abstract class Elements {
//    ცვლადები გამოვაცხადე როგორც final, რადგან არის ძირითადი ლინკი და ის არ უნდა შეიცვალოს სხვა კლასებში
    public static final String BASEURL = "https://automationexercise.com/";
    public static final SelenideElement signupLoginButton = $(By.linkText("Signup / Login"));
    public static final SelenideElement userNameInput= $(By.name("name"));
    public static final SelenideElement userEmailInput = $(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
    public static final SelenideElement signupButton = $(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
    public static final SelenideElement enterAccountInfo = $(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/h2/b"));
    public static final SelenideElement titleRadioButton = $(By.id("id_gender1"));
    public static final SelenideElement nameLabel = $(By.id("name"));
    public static final SelenideElement emailField = $(By.id("email"));
    public static final SelenideElement passwordInput = $(By.id("password"));
    public static final SelenideElement DayOfBirthInput = $(By.id("days"));
    public static final SelenideElement MonthOfBirthInput = $(By.id("months"));
    public static final SelenideElement YearOfBirthInput = $(By.id("years"));
    public static final SelenideElement newsLetterCheck = $(By.id("newsletter"));
    public static final SelenideElement offersCheck = $(By.id("optin"));
    public static final SelenideElement fNameInput = $(By.id("first_name"));
    public static final SelenideElement lNameInput = $(By.id("last_name"));
    public static final SelenideElement companyInput = $(By.id("company"));
    public static final SelenideElement addressInput = $(By.id("address1"));
    public static final SelenideElement countrySelect = $(By.id("country"));
    public static final SelenideElement stateInput = $(By.id("state"));
    public static final SelenideElement cityInput = $(By.id("city"));
    public static final SelenideElement zipCodeInput = $(By.id("zipcode"));
    public static final SelenideElement mobileNumberInput = $(By.id("mobile_number"));
    public static final SelenideElement createAccountButton = $(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
    public static final SelenideElement accCreated = $(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
    public static final SelenideElement continueButton = $(By.linkText("Continue"));
    public static final SelenideElement dismissButton = $(By.id("dismiss-button"));
    public static final SelenideElement loggedAsField = $(By.linkText("Logged in as"));
    public static final SelenideElement deleteAcc = $(By.linkText("Delete Account"));
    public static final SelenideElement accDeleted = $(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
}
