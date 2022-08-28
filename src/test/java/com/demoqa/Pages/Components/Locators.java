package com.demoqa.Pages.Components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

    public class Locators {
        public Locators hobbies(String value) {
            $("#hobbiesWrapper").$(byText(value)).click();

            return this;
        }

        public Locators state(String value) {
            $("#state").click();
            $(byText(value)).click();

            return this;
        }

        public Locators city(String value) {
            $("#city").click();
            $("#stateCity-wrapper").$(byText(value)).click();

            return this;
        }

        public Locators pictureDownload(String fileName) {
            $("#uploadPicture").uploadFromClasspath(fileName);

            return this;
        }

        public Locators submitButton() {
            $("#submit").click();

            return this;
        }

        public Locators subjectsInsert(String value) {
            $("#subjectsInput").setValue(value).pressEnter();

            return this;
        }
    }

