package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration
{
    static Pattern firstName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    static Pattern lastName = Pattern.compile("^([A-Z]{1}+)([a-z]{2,}+)$");

    static Pattern eMailId = Pattern.compile("^([A-Za-z0-9]{3,}+)((?:[\\.\\+\\-][a-zA-Z0-9]+)*)@([a-z0-9]{1,}+)\\.([a-z]{2,}+)((?:\\.[a-zA-Z]+)?)$");

    static Pattern mobileNumber = Pattern.compile("^(91 )[0-9]{10}$");

    static Pattern password = Pattern.compile("^(?=.*[A-z])(?=.*[0-9])(?=.+[~`!@#$%^&*_])[a-zA-Z0-9~`!@#$%^&*_]{8,}$");


    public boolean validateFirstName(String testFirstName){
        Matcher matcher = firstName.matcher(testFirstName);
        return matcher.matches();
    }
    public boolean validateLastName(String testLastName){
        Matcher matcher = lastName.matcher(testLastName);
        return matcher.matches();
    }

    public boolean validateEmailId(String testEmailId){
        Matcher matcher = eMailId.matcher(testEmailId);
        return matcher.matches();
    }

    public boolean validateMobileNumber(String testMobileNumber){
        Matcher matcher = mobileNumber.matcher(testMobileNumber);
        return matcher.matches();
    }

    public boolean validatePassword(String testPassword){
        Matcher matcher = password.matcher(testPassword);
        return matcher.matches();
    }

}
