package io.qameta.allure.examples.testng;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;
import org.testng.annotations.Test;

import static io.qameta.allure.Allure.step;

public class AllureSimpleTest {

    @Test(description = "allureSimpleTest displayName")
    @Step("dddd")
    public void allureSimpleTest() {
        step("Simple step");
        step("Simple step with status", Status.FAILED);
        step("Simple step with status", Status.BROKEN);
        step("Simple step with status", Status.SKIPPED);
        Allure.getLifecycle().stopStep();
        Allure.getLifecycle().startStep("dddd", new StepResult());
        step("Simple lambda step", () -> {
            step("Simple step inside lambda step");
        });
        simpleTestMethod("method parameter");
    }

    @Step("Simple test method with step annotation")
    public void simpleTestMethod(String param) {
        step("Method parameter: " + param);
        step("Simple step inside test method");
    }

}
