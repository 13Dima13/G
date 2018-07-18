package com.example.project;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.example.project.OversPage.*;
import static java.lang.System.*;

public class FastTest {
    @BeforeAll
    public static void setup(){
        Configuration.browser = "chrome";
    }
    @Test
    @Tag("regression")
    public void shortTest(){
        open("https://forum.overclockers.ua/");
        searchField()
                .exists();
        openMenu()
                .click();
        menu()
                .isDisplayed();
        users("Пользователи")
                .click();
        titleH1()
                .shouldBe(Condition.text("Пользователи"));
        out.println("Overs checked");
    }
}