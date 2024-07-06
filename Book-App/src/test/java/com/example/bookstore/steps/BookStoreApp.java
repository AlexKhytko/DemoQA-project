package com.example.bookstore.steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class BookStoreApp {

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
    }
    @Given("user is on the Book Store Application home page")
    public void userIsOnTheBookStoreApplicationHomePage() {
        open("https://demoqa.com/books");
    }

    @When("user searches for {string}")
    public void userSearchesFor(String bookName) {
        $("#searchBox").setValue(bookName).pressEnter();
    }

    @Then("book {string} should be displayed")
    public void bookShouldBeDisplayed(String bookName) {
        $$(".book-title").findBy(text(bookName)).shouldBe(visible);
    }
}