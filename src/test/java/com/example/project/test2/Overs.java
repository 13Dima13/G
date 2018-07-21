package com.example.project.test2;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.example.project.test2.OversPage.*;
import static java.lang.System.out;

public class Overs {
    @BeforeAll
    public static void setup(){
        Configuration.browser = "chrome";
    }
    @Test
    //@Tag("smoke")
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