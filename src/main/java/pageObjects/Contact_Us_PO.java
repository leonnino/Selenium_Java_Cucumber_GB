package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static utils.Global_Vars.HOMEPAGE_URL;

public class Contact_Us_PO extends Base_PO {
    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    WebElement firstName_TextField;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName_TextField;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement emailAddress_TextField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comment_TextField;

    private @FindBy(xpath = "//input[@value=\"SUBMIT\"]")
    WebElement submitButton;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmessionMessageText;


    public Contact_Us_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Contact_Us_Page() {
        navigateTo_URL(HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    public void setUnique_FirstName() {
        sendKeys(firstName_TextField, "AutoFN" + generateRandomNumber(5));
    }

    public void setUnique_LastName() {
        sendKeys(lastName_TextField, "AutoLN" + generateRandomNumber(5));
    }

    public void setUnique_emailAdress() {
        sendKeys(emailAddress_TextField, "AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }

    public void setUnique_Comment() {
        sendKeys(comment_TextField, "AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }

    public void setSpecific_FirstName(String firstName) {
        sendKeys(firstName_TextField, firstName);
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastName_TextField, lastName);
    }

    public void setSpecific_EmailAddress(String emailAddress) {
        sendKeys(emailAddress_TextField, emailAddress);
    }

    public void setSpecific_comment(String comment) {
        sendKeys(comment_TextField, comment);
    }

    public void clickOn_SubmitButton() {
//        submitButton.click(); ten nie bedzie czekal
        waitForWebElementAndClick(submitButton);
    }

    public void validateSuccessfulSubmissionMessageText() {
        waitFor(successfulSubmessionMessageText);
        Assert.assertEquals(successfulSubmessionMessageText.getText(), "Thank You for your Message!");
    }
}
