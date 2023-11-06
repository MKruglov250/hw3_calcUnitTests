package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeClass
    public void before() {
        Configuration.baseUrl = "https://www.sharelane.com";
        Configuration.browser = "firefox";
        Configuration.headless = false;
        open("/cgi-bin/main.py");
    }
}
