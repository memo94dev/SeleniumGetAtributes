package com.seleniumjavatest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MainTest {

    WebDriver driver;

    @BeforeEach

    public void setup(){

        driver = new EdgeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        driver.manage().window().maximize();

    }

    @Test

    public void AtributosGet() throws InterruptedException {

        WebElement searchInput = driver.findElement(By.id("search"));

        searchInput.sendKeys("shirt");
        searchInput.clear();
        searchInput.sendKeys("trousers");

        Thread.sleep(2000);

        System.out.println("Atributo id: " + searchInput.getAttribute("id"));
        System.out.println("Atributo type: " + searchInput.getAttribute("type"));
        System.out.println("Atributo name: " + searchInput.getAttribute("name"));
        System.out.println("Atributo value: " + searchInput.getAttribute("value"));
        System.out.println("Atributo placeholder: " + searchInput.getAttribute("placeholder"));
        System.out.println("Atributo class: " + searchInput.getAttribute("class"));
        System.out.println("Atributo maxlength: " + searchInput.getAttribute("maxlength"));
        System.out.println("Atributo role: " + searchInput.getAttribute("role"));
        System.out.println("Atributo aria-haspopup: " + searchInput.getAttribute("aria-haspopup"));
        System.out.println("Atributo aria-autocomplete: " + searchInput.getAttribute("aria-autocomplete"));
        System.out.println("Atributo autocomplete: " + searchInput.getAttribute("autocomplete"));
        System.out.println("Atributo aria-expanded: " + searchInput.getAttribute("aria-expanded"));

    }

    @AfterEach

    public void tearDown(){

        driver.close();

    }

}
