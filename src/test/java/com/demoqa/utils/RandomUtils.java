package com.demoqa.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import javax.xml.crypto.Data;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static String getRandomString(int length) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }

        return result.toString();
    }

    public static String getRandomString1(int length) {
        return RandomStringUtils.randomAlphabetic(length);

    }

    public static String getRandomEmail() {
        return getRandomString(10) + "@mail.ru";
    }

    public static Long getRandomLong(Long min, Long max) {
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    public static String getRandomPhone() {
        return "+7" + getRandomLong(1111111111L, 9999999999L).toString();
    }

    public static String getRandomStringFromArray(String[] array) {
        Random ran = new Random();
        String randomValue = "";
        int value = ran.nextInt(array.length);
        for (int i = 0; i < array.length; i++) {
            if (value == i) {
                randomValue = array[i];
            }
        }
        return randomValue;
    }
}
 /*   public static String getRandomHobbies() {
        return getRandomStringFromArray(DataClass.hobbies);
    }
}*/