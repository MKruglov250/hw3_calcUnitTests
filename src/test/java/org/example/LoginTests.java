package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class LoginTests extends BaseTest {

    @Test
    public void loginTest() {

        var errorText =
                new LoginPage()
                        .login("user", "password")
                        .getErrorText();

        Assert.assertEquals(errorText, "Oops, error. Email and/or password don't match our");
    }
}
