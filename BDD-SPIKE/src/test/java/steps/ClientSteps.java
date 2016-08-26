package steps;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.*;
import org.junit.*;
import domain.*;
import pages.HomePage;
import pages.LandingPage;
import pages.SignupPage;
import utilities.PropertyReader;

import java.util.List;

/**
 * Created by abhayda on 07/08/16.
 */


public class ClientSteps {

    WebDriver driver = new FirefoxDriver();;

//    String br = new PropertyReader().readProperty("browser");
//
//
//
//    if (br.equals("firefox")) {
//        driver = new FirefoxDriver();
//    } else {
//        System.out.println("can't read browser type");
//    }

    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
    }


    @When("^she chooses to sign up$")
    public void she_chooses_to_sign_up() throws Throwable {
        new LandingPage(driver).she_chooses_to_sign_up();
    }


    @And("^she provides the first name as ([^\"]*)$")
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        new SignupPage(driver).she_provides_the_first_name_as(firstName);
    }


    @And("^she provides the last name as ([^\"]*)$")
    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        new SignupPage(driver).she_provides_the_last_name_as(lastName);
    }

    @And("^she provides the email as ([^\"]*)$")
    public void she_provides_the_email_as(String email) throws Throwable {
        new SignupPage(driver).she_provides_the_email_as(email);
    }

    @And("^she provides the password as ([^\"]*)$")
    public void she_provides_the_password_as(String password) throws Throwable {
        new SignupPage(driver).she_provides_the_password_as(password);
    }

    @And("^she provides the confirm password again as ([^\"]*)$")
    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        new SignupPage(driver).she_provides_the_confirm_password_again_as(confirmPassword);
    }


    @And("^she signs-up$")
    public void she_signs_up() throws Throwable {
        new SignupPage(driver).she_signs_up();
    }

    @And("^she provides the her details as follows:$")
    public void she_provides_the_her_details_as_follows(List<UserDetails> users) throws Throwable {
        UserDetails userToBeSignedUp = users.get(0);

        new SignupPage(driver).she_provides_the_first_name_as(userToBeSignedUp.firstName);
        new SignupPage(driver).she_provides_the_last_name_as(userToBeSignedUp.lastName);
        new SignupPage(driver).she_provides_the_email_as(userToBeSignedUp.email);
        new SignupPage(driver).she_provides_the_password_as(userToBeSignedUp.password);
        new SignupPage(driver).she_provides_the_confirm_password_again_as(userToBeSignedUp.password);

    }

    @Then("^she should be logged in to the application$")
    public void she_should_be_logged_in_to_the_application() throws Throwable {
        Assert.assertTrue(new HomePage(driver).isSignOutLinkDisplayed());
    }

    @Then("^close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
    }

    @Before
    public void beforeScenario(){
        System.out.println("this will run before the actual scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("this will run after scneario is finished, even if it failed");
        driver.quit();

    }

}