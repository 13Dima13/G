package com.example.project;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeEngines;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;





@IncludeEngines("jupiter-engine")
public class TestThreads {

    @BeforeAll
    public static void setup(){
        Configuration.browser="chrome";
    }

    @Test
//    @Tag("smoke")
    public void test1() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(Condition.appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(Condition.text("License"));
        assertEquals("Maven Repository: log4j » log4j » 1.2.17", title());
        out.println("test1 Passed");
    }


    @Test
    @Tag("regression")
    public void test2() {
        open("https://mvnrepository.com/");
        $("#maincontent > h1").waitUntil(Condition.appears, 120000);
        $("#maincontent > h1").shouldBe(Condition.text("What's New in Maven"));
        assertEquals("Maven Repository: Search/Browse/Explore", title());
        out.println("test2 Passed");
    }

    @Test
    public void test3() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(Condition.appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(Condition.text("License"));
        assertEquals("Maven Repository: log4j » log4j » 1.2.17", title());
        out.println("test3 Passed");
    }

    @Test
    public void test4() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(Condition.appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(Condition.text("License"));
        assertEquals("Maven Repository: log4j » log4j » 1.2.17", title());
        out.println("test4 Passed");
    }

    @Test
    public void test5() {
        open("https://mvnrepository.com/");
        $("#maincontent > h1").waitUntil(Condition.appears, 120000);
        $("#maincontent > h1").shouldBe(Condition.text("What's New in Maven"));
        assertEquals("Maven Repository: Search/Browse/Explore", title());
        out.println("test5 Passed");
    }

    @Test
    @Tag("regression")
    public void test6() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(Condition.appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(Condition.text("License"));
        assertEquals("Maven Repository: log4j » log4j » 1.2.17", title());
        out.println("test6 Passed");
    }

    @Test
    public void test7() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(Condition.appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(Condition.text("License"));
        assertEquals("Maven Repository: log4j » log4j » 1.2.17", title());
        out.println("test7 Passed");
    }

    @Test
    public void test8() {
        open("https://mvnrepository.com/");
        $("#maincontent > h1").waitUntil(Condition.appears, 120000);
        $("#maincontent > h1").shouldBe(Condition.text("What's New in Maven"));
        assertEquals("Maven Repository: Search/Browse/Explore", title());
        out.println("test8 Passed");
    }

    @Test
    @Tag("regression")
    public void test9() {
        open("https://mvnrepository.com/artifact/log4j/log4j/1.2.17");
        $("#maincontent > table > tbody > tr:nth-child(1) > th").waitUntil(Condition.appears, 120000);
        $("#maincontent > table > tbody > tr:nth-child(1) > th").shouldBe(Condition.text("License"));
        assertEquals("Maven Repository: log4j » log4j » 1.2.17", title());
        out.println("test9 Passed");
    }
}
