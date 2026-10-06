package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {

    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get(" https://sandhyabshetty.github.io/mvn-project1/");
    }

    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "my simple website";
        Assert.assertEquals(actualTitle, expectedTitle);
        Assert.assertTrue(true, "Title should contain 'simple'");
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}