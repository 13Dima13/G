package com.example.project;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class OversPage {

    public static  SelenideElement searchField(){
        return $("inputbox search tiny");}

    public static SelenideElement openMenu(){
        return $("#quick-links > a");
    }
    public static SelenideElement menu(){
        return $("dropdown-contents dropdown-nonscroll");
    }

    public static SelenideElement users(String users){
        return $(By.linkText(users));
    }
    public static SelenideElement titleH1(){
        return $("#page-body > form > h2");
    }
}
