package com.demoqa.tests;

import com.demoqa.Pages.RegistrationFormPage;
import com.demoqa.Pages.Components.ResultWindow;
import com.github.javafaker.Faker;
import com.demoqa.tests.TestData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.demoqa.utils.RandomUtils.getRandomEmail;
import static com.demoqa.utils.RandomUtils.getRandomString;
import static java.lang.String.format;

public class RegistrationFormWithFakerTests extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    TestData testData = new TestData();

    @Test
            void registrationFormWithFaker() {
        registrationFormPage.openPage();
        registrationFormPage.inputFirstName(testData.firstName)
                .inputLastName(testData.lastName)
                .inputEmail(testData.email)
                .inputGender(testData.gender)
                .inputPhNum(testData.phoneNumber)
                .inputBirthD(testData.day, testData.month, testData.year)
                .inputSubject(testData.subjects)
                .inputHobbies(testData.firstHobby)
                .inputHobbies(testData.secondHobby)
                .downloadPicture(testData.fileName)
                .inputAddress(testData.address)
                .inputState(testData.state)
                .inputCity(testData.city)
                .submit()
                .checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.phoneNumber)
                .checkResult("Date of Birth", testData.day + " " + testData.month + "," + testData.year)
                .checkResult("Subjects", testData.subjects)
                .checkResult("Hobbies", testData.firstHobby + ", " + testData.secondHobby)
                .checkResult("Picture", testData.fileName)
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);
    }

    }
