package test.automation.cucumber.page.common;

import org.openqa.selenium.WebDriver;

public abstract class Component extends Page {
    public Component(WebDriver driver) {
        super(driver);
    }
}
