package com.iamvickyav;

import org.apache.commons.lang3.StringUtils;

public class CardMask {

    String mask(String cardNumber) {

        String s1 = cardNumber.substring(0, 6);
        String s2 = "XXXXXX";
        String s3 = cardNumber.substring(cardNumber.length() - 4, cardNumber.length());

        return s1 + s2 + s3;
    }

    String mask2(String cardNumber) {
       return StringUtils.overlay(cardNumber, StringUtils.repeat("X", cardNumber.length()-4), 0, cardNumber.length()-4);
    }
}
