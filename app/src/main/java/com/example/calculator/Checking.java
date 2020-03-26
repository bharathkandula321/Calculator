package com.example.calculator;

import java.util.regex.Pattern;

public class Checking extends MainActivity {

    boolean validation (String input) {

        if (Pattern.matches("[[0-9]|[.][0-9]]+[+-/*][[0-9]|[.][0-9]]+",input)) {

            return true;
        }
        else {

            return false;
        }

    }
}
