package com.example.project.test2;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;


public class GoogleSearch {


    @BeforeAll
    public static void browserSetup() {
        Configuration.browser="chrome";
    }

    @Test
    @Tag("smoke")
    public void simpleGoogleSearch() {
        open("http://www.google.com");
        $(By.name("q")).setValue("Cheese").pressEnter();
        System.out.println("Page title is: " + title());
        screenshot("G");
        $$(By.xpath("//*[@id=\"rso\"]/div/div/div")).shouldHave(size(9));
    }
}



