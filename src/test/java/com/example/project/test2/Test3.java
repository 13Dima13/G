package com.example.project.test2;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test3 {
    @BeforeAll
    public static void setup(){
        Configuration.browser="chrome";
    }

    @Test
    @Tag("smoke")
    public void test44444() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(Condition.appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(Condition.text("License"));
        assertEquals("Maven Repository: log4j » log4j » 1.2.17", title());
        out.println("test1 Passed");
    }
}
