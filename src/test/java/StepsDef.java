package source;

//import PageObjects.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;

import static org.junit.Assert.*;

public class StepsDef {

    public WebDriver driver;

    @Given("^I make a booking from “DUB” to “SXF” on (\\d+)/(\\d+)/(\\d+) for (\\d+) adults and (\\d+) child$")
    public void i_make_a_booking_from_DUB_to_SXF_on_for_adults_and_child(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I pay for booking with card details “(\\d+) (\\d+) (\\d+) (\\d+)”, “(\\d+)/(\\d+)” and “(\\d+)”$")
    public void i_pay_for_booking_with_card_details_and(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should get payment declined message$")
    public void i_should_get_payment_declined_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
