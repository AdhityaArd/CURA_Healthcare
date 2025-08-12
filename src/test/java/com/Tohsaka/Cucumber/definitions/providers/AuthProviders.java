package com.Tohsaka.Cucumber.definitions.providers;

import com.Tohsaka.pages.LoginPage;
import com.Tohsaka.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class AuthProviders {
    protected DriverManager driverManager;
    protected WebDriver driver;
    protected LoginPage loginPage;

    public void preTest(){
        driverManager = new DriverManager();
        driver = driverManager.getDriver();
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
        driverManager.quitDriver();
    }
}
