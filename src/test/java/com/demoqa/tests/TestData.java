package com.demoqa.tests;

import com.github.javafaker.Faker;

public class TestData {

    public Faker faker = new Faker();

    public String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = faker.demographic().sex(),
            phoneNumber = faker.phoneNumber().subscriberNumber(10),
            day = faker.number().numberBetween(10, 31) + "",
            month = "August",
            year = faker.number().numberBetween(1950, 2022) + "",
            subjects = "Physics",
            firstHobby = "Sports",
            secondHobby = "Music",
            fileName = "1st.jpg",
            address = faker.address().fullAddress(),
            state = "NCR",
            city = "Delhi";

}

