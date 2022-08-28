package com.demoqa.Pages.Components;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class ResultWindow {
    private final static String TITLE_TEXT = "Thanks for submitting the form";

    private SelenideElement
            tableResults = $(".table-responsive"),
            tableTitle = $("#example-modal-sizes-title-lg");


    public ResultWindow checkResultWindow(String key, String value) {
        tableTitle.shouldHave(text(TITLE_TEXT));
        tableResults.$(byText(key))
                .parent().shouldHave(text(value));
        return this;
    }
}

