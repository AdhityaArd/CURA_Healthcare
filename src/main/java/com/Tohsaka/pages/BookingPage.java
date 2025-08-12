package com.Tohsaka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
    private WebDriver driver;


    public BookingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
    @FindBy(id = "combo_facility")
    private WebElement Facility;

    @FindBy(id= "radio_program_medicare")
    private WebElement Medicare;

    @FindBy(id= "radio_program_medicaid")
    private WebElement Medicaid;

    @FindBy(id= "radio_program_none")
    private WebElement None;

    @FindBy(id = "btn-book-appointment")
    private WebElement Book;

    @FindBy(id ="txt_visit_date")
    private WebElement Date;

    @FindBy(id = "txt_comment")
    private WebElement Comment;


    public void setFacility(String value) {
        Facility.sendKeys(value);
    }

    public void setProgramMedicare() {
        Medicare.isSelected();
    }

    public void setProgramMedicaid(){
        Medicare.isSelected();
    }

    public void setProgramNone(){
        None.isSelected();
    }

    public void setDate(String value){
        Date.sendKeys(value);
    }

    public void setComment(String value){
        Comment.sendKeys(value);
    }

    public void clickBookingButton() {
        Book.click();
    }

    public String getDate(){
        return Date.getAttribute("value");
    }

    public boolean isMedicare(){
        return Medicare.isSelected();
    }

    public boolean isMedicaid(){
        return Medicaid.isSelected();
    }

    public boolean isNone(){
        return None.isSelected();
    }
}
