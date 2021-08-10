package com.FireDragon4k.UtilsForTests;

import java.util.Locale;
import java.util.Random;

public class RandomString {
    public static String randomString;

    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZАБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";

    public static final String lower = upper.toLowerCase(Locale.ROOT);

    public static final String digits = "0123456789";

    public static final String alphabet = upper + lower + digits;

    public static final char[] pool = alphabet.toCharArray();

    private static Random random = new Random();

    public static  char getChar(){
        return pool[random.nextInt(pool.length)];
    }

    public static String setRandomString(int minSize, int maxSize){
        StringBuilder stringBuilder = new StringBuilder();
        int lengthOfText = minSize + (int)Math.round(Math.random()*(maxSize - minSize));
        for (int i = 0; i < lengthOfText; i++){
            stringBuilder.append(getChar());
        }
        randomString = new String(stringBuilder);
        return randomString;
    }
}
