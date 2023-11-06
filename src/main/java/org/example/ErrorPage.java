package org.example;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ErrorPage {

    SelenideElement errorText = $(By.className("error_message"));


    public String getErrorText(){
        return errorText.getText();
    }

}
