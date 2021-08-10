package com.FireDragon4k.UtilsForTests;

public class RandomIntegerNumber {

    public static int randomNumber;

    public static int getRandomNumber(int minValue, int maxValue){
        randomNumber = minValue + (int)Math.round(Math.random() * (maxValue - minValue));
        return randomNumber;
    }
}
