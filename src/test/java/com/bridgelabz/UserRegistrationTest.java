// UC12 - Refactor the Code to throw custom exceptions in case of Invalid User Details - Rewrite all Test Cases to take in Custom

package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest
{
    @Test
    public void FirstName_WhenNotProperFormat_ShouldThrowException() throws CustomException {
        UserRegistration validator = new UserRegistration();
        try {
            boolean result = validator.validateFirstName("Nagr@j");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenNotProperFormat_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {
            boolean result = validator.validateLastName("Nagraj Panchal");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenMobileNumber_WhenNotProperFormat_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {

            boolean result = validator.vaildateMobileNumber("91 9739713842");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotProperFormat_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {
            boolean result = validator.vaildatePassword("Password123");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {
            boolean result = validator.vaildateEmail("nagraj@panchal.com");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
