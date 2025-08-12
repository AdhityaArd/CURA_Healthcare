package com.Tohsaka.Cucumber.definitions.booking;

import com.Tohsaka.pages.BookingPage;
import com.Tohsaka.pages.LoginPage;
import com.Tohsaka.utils.DriverUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PositiveBookingAppointment {
    LoginPage loginPage;
    BookingPage bookingPage;

    @Given("Saat ingin membuat janji temu, pengguna wajib melakukan login.")
    public void step01(){
        DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage = new LoginPage(DriverUtil.getDriver());
        loginPage.performLogin();
        bookingPage = new BookingPage(DriverUtil.getDriver());
    }

    @When("pengguna mengisi form Facility {string}.")
    public void step02(String facility){
        bookingPage.setFacility(facility);
    }

    @And("pengguna memilih Healthcare Program {string}.")
    public void step03(String program){
        switch (program.toLowerCase()){
            case "medicare":
                bookingPage.setProgramMedicare();
                break;
            case "medicaid":
                bookingPage.setProgramMedicaid();
                break;
            case "none":
                bookingPage.setProgramNone();
                break;
            default:
                throw new IllegalArgumentException("error Chooose: " + program);
        }
    }

    @And("pengguna mengisi Visit Date {string}.")
    public void step04(String date){
        bookingPage.setDate(date);
    }

    @And("pengguna mengisi Comment {string}.")
    public void step05(String comment){
        bookingPage.setComment(comment);
    }

    @Then("pengguna melakukan Book Appointment.")
    public void step06(){
        bookingPage.clickBookingButton();
    }

    @Then("pengguna dibawa menuju halaman summary {string}.")
    public void step07(String url){
        WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(100));
        wait.until(ExpectedConditions.urlContains("appointment.php#summary"));
        Assert.assertEquals(bookingPage.getCurrentURL(),url);
    }
}
