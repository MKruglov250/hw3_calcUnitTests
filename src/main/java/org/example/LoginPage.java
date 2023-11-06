package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    SelenideElement emailInput = $x("//input[@name='email']");

    SelenideElement passwordInput = $("input[name='password']");

    SelenideElement login = $("input[value='Login']");

    public ErrorPage login(String email, String password){
        emailInput.setValue(email);
        passwordInput.setValue(password);
        login.click();
        return new ErrorPage();
    }

    public LoginPage validatePage(){
        emailInput.shouldBe(visible);
        passwordInput.shouldBe(visible);
        login.shouldBe(visible);
        return this;
    }
}
