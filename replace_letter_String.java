package com.company;

public class replace_letter_String {
    public static void main(String[] args) {
        String letter = "Dear < |name| > thanks a lot!";
        letter = letter.replace("< |name| >", "SAHIB");
        System.out.println(letter);
    }
}
