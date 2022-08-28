package com.demoqa.Pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.Pages.Components.Calendar;
import com.demoqa.Pages.Components.Locators;
import com.demoqa.Pages.Components.ResultWindow;
import net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {
    private final Calendar calendar = new Calendar();
    private ResultWindow resultsTableComponent = new ResultWindow();
    private final Locators locators = new Locators();
    private SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            email = $("#userEmail"),
            gender = $("#genterWrapper"),
            bday = $("#dateOfBirthInput"),
            phnumber = $("#userNumber"),
            address = $("#currentAddress"),
            finalPhrase = $("#modal-title h4");

    public void openPage() {
        open("/automation-practice-form");
    }

    public RegistrationFormPage inputFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

     public RegistrationFormPage inputLastName(String value){
        lastName.setValue(value);
        return this;
     }

     public RegistrationFormPage inputGender(String value) {
         gender.$(byText(value)).click();
        return this;
     }

     public RegistrationFormPage inputAddress(String value) {
        address.setValue(value);
        return this;
     }

     public RegistrationFormPage inputEmail(String value) {
         email.setValue(value);
         return this;
     }

    public RegistrationFormPage inputPhNum(String value) {
        phnumber.setValue(value);
        return this;
    }

    public RegistrationFormPage inputBirthD(String day, String month, String year) {
        bday.click();
        calendar.inputDate(day, month, year);
        return this;
    }

    public RegistrationFormPage inputHobbies(String value) {
        locators.hobbies(value);

        return this;
    }
    public RegistrationFormPage inputState(String value) {
        locators.state(value);

        return this;
    }

    public RegistrationFormPage inputCity(String value) {
        locators.city(value);

        return this;
    }


    public RegistrationFormPage downloadPicture(String fileName) {
        locators.pictureDownload(fileName);

        return this;
    }

    public RegistrationFormPage submit() {
        locators.submitButton();

        return this;
    }

    public RegistrationFormPage inputSubject(String value) {
        locators.subjectsInsert(value);

        return this;
    }

    public RegistrationFormPage checkResult(String key, String value) {
        resultsTableComponent.checkResultWindow(key, value);

        return this;
    }

}
