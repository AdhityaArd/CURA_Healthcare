package com.Tohsaka.Cucumber.definitions.authentications;

import com.Tohsaka.utils.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hook {
    @Before
    public static void setup(){
        DriverUtil.getDriver();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }

    @After
    public void teardown(Scenario scenario) throws InterruptedException {
        final byte[] screenshoot = ((TakesScreenshot) DriverUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshoot,"image/png",scenario.getName());
        Thread.sleep(100);
        DriverUtil.quitDriver();
    }
}
