package starter.account.testcase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginfailedsteps {

    @Steps
    starter.account.javaclass.loginfailed loginfailed;

    @Given("I am on the Login page with failed case")
    public void i_am_on_the_Login_page() {

    }

    @When("I enter my username correctly and Password Blank")
    public void i_enter_username_and_Password_Blank() {
        loginfailed.setBodyReqBlankPass();


    }

    @When("I click {string} buttom with failed")
    public void i_click_button_in_page(String string) {

        loginfailed.hitEndPointLoginBlankPass();




    }

    @Then("Warning Password invalid and stay Sign in page")
    public void i_am_stay_in_login_page() {

    }



}
