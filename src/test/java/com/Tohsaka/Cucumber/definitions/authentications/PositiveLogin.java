package com.Tohsaka.Cucumber.definitions.authentications;

import com.Tohsaka.pages.BookingPage;
import com.Tohsaka.pages.LoginPage;
import com.Tohsaka.utils.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PositiveLogin {
    LoginPage loginPage;
    BookingPage bookingPage;

    @Given("Saat ingin membuat janji temu, pengguna masuk ke halaman login.")
    public void step01(){
        DriverUtil.getDriver().get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        loginPage = new LoginPage(DriverUtil.getDriver());
    }

    @When("pengguna memasukkan username {string} dan password {string} yang valid.")
    public void step02(String username, String password){
        loginPage.performLogin(username, password);
    }

    @Then("pengguna akan dibawa ke halaman booking janji temu {string}.")
    public void step03(String url){
        bookingPage = new BookingPage(DriverUtil.getDriver());
        Assert.assertEquals(bookingPage.getCurrentURL(),url);
    }
}
