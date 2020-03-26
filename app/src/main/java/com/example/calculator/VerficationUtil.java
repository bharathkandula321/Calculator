package com.example.calculator;

import android.widget.Toast;

import java.util.regex.Pattern;

public class VerficationUtil {

    String verfication(String firstName,String lastName,String emailID,String phoneNumber,String password,String confirmPassword) {

        if (Pattern.matches("^[A-Za-z][A-Za-z0-9]+", firstName)) {

            if (Pattern.matches("^[A-Za-z][A-Za-z0-9]+", lastName)) {

                if (Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", emailID)) {

                    if (Pattern.matches("^[6-9]{1}[0-9]{9}$", phoneNumber)) {

                        if (password.length() > 6 && password.length() < 20) {

                            if (Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})", password)) {

                                if (password.equals(confirmPassword)) {

                                    return "valid";
                                }
                                return "password , confirm Password does not match";
                            }
                            return "password contains \n must contains one digit from 0-9 \n must contains one lowercase characters \n  must contains one uppercase characters \n must contains one special symbols in the list '@#$%'";

                        }
                        return "Password length must in 6-20";
                    }
                    return "Enter Vaid Phone Number";
                }
                return "Enter Valid Email ID";
            }
            return "last Name contains Only Alphabets and numbers or must starts with Alphabets";
        } else {
            return "First Name contains Only Alphabets and numbers or must starts with Alphabets";
        }
    }
}
