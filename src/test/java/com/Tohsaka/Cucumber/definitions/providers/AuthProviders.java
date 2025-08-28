package com.Tohsaka.Cucumber.definitions.providers;

import com.Tohsaka.pages.LoginPage;
import com.Tohsaka.utils.DriverUtil;
import org.openqa.selenium.WebDriver;

public class AuthProviders extends DriverUtil {
    protected DriverUtil driverUtil;
    protected WebDriver driver;
    protected LoginPage loginPage;

    public void preTest(){
        driverUtil = new DriverUtil();
        driver = driverUtil.getDriver();
        loginPage = new LoginPage(driver);
    }

    public void openSignIn(){
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php");
    }

    public void preCondition(){
        preTest();
        openSignIn();
    }

    public void openSignIn(String url){
        driver.get(url);
    }

    public void afterTest(){
        driverUtil.quitDriver();
    }
}
