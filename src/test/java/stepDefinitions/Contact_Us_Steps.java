package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;

public class Contact_Us_Steps extends Base_PO {

    private Contact_Us_PO contact_us_po;

    public Contact_Us_Steps(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;
    }

    @Given("I access the webdriver univeristy contact us page")
    public void i_access_the_webdriver_univeristy_contact_us_page() {
        contact_us_po.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contact_us_po.setUnique_FirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contact_us_po.setUnique_LastName();
    }

    @And("I enter a unique email adress")
    public void i_enter_a_unique_email_adress() {
        contact_us_po.setUnique_emailAdress();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contact_us_po.setUnique_Comment();
    }

    @And("I click on submit button")
    public void i_click_on_submit_button() {
        contact_us_po.clickOn_SubmitButton();

    }

    @And("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contact_us_po.validateSuccessfulSubmissionMessageText();
    }

    //****************** parameters

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
//        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
        contact_us_po.setSpecific_FirstName(firstName);
    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
//        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
        contact_us_po.setSpecific_LastName(lastName);
    }

    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String eMail) {
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(eMail);
        contact_us_po.setSpecific_EmailAddress(eMail);
    }

    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
//        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(comment);
        contact_us_po.setSpecific_comment(comment);
    }
}