package com.Tohsaka.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "txt-username")
    private WebElement username;

    @FindBy(id= "txt-password")
    private WebElement password;

    @FindBy(id = "btn-login")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/section/div/div/div[1]/p[2]")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void setUsername(String value) {
        username.sendKeys(value);
    }

    public void setPassword(String value) {
        password.sendKeys(value);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessage() {
        try {
            return errorMessage.getText();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public void performLogin() {
        setUsername("John Doe");
        setPassword("ThisIsNotAPassword");
        clickLoginButton();
    }

    public void performLogin(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
}
