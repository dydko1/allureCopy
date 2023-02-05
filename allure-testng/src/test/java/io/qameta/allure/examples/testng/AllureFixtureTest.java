package io.qameta.allure.examples.testng;

import io.qameta.allure.*;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;

import static io.qameta.allure.Allure.step;

public class AllureFixtureTest {

    @BeforeGroups
    public void beforeGroups() {
        step("Step inside beforeGroups");

    }

    @BeforeSuite
    public void beforeSuite() {
        step("Step inside beforeSuite111111111111");
    }

    @BeforeClass
    public void beforeClass() {
        step("Step inside beforeClass");
    }

    @BeforeTest
    public void beforeTest() {
        step("Step inside beforeTest");
        takeScreenShot("dddqqqqqqqqqqqqqqqdddd");

        byte[] arr = {56, 99, 87, 77, 73, 90, 105, -23, -52, -85, -9, -55, -115, 11, -127, -127};
        saveScreenshot(arr);
    }

    @BeforeMethod
    public void beforeMethod() {
        step("Step inside beforeMethod");
    }

    @Test
    @Description("xxxxxxxxxxxxxxxxxxxxxxxxxxx")
    public void allureFixtureTest() {
        step("Step inside allureFixtureTest111");

    }

    @Test
    public void allureFixtureTest2() {
        step("Step inside allureFixtureTest2");
    }

    @Description("Validate the Contents of Manage Service Types Tabular Data")
    @Severity(SeverityLevel.CRITICAL)
    @Story("US_001 OpenMRS ->Manage Service Types -> Tabular Data")
    @Test (description = "Validate the Tabular Data")
    public void miroTest(){
        System.out.println("Mirooooooooooooooooooooo");
    }

    @AfterMethod
    public void afterMethod() {
        step("Step inside afterMethod");
    }

    @AfterTest
    public void afterTest() {
        step("Step inside afterTest");
    }

    @AfterClass
    public static void afterClass() {
        step("Step inside afterClass");
    }

    @AfterSuite
    public void afterSuite() {
        step("Step inside afterSuite");
    }

    @AfterGroups
    public void afterGroups() {
        step("Step inside afterGroups");
    }

    @Link("https://example.org")
    @Link(name = "allure", type = "mylink")
    public void takeScreenShot(String name) {
        Allure.addAttachment(name, "Miroooooooooooooo222oooooo!!!!");
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
