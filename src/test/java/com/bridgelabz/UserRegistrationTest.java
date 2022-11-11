// JUnit Parameterised Test to validate multiple entry for the Email Address.

package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class UserRegistrationTest
{
    UserRegistration user = new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateFirstName("Nagraj");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateFirstName("nagraj");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateLastName("Panchal");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateLastName("panchal");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateEmailId("abc.xyz@bl.co.on");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateEmailId("abc@xyz@bl.co.on");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue(){
        boolean result = user.validateMobileNumber("91 9999999999");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validateMobileNumber("999999 9999");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue(){
        boolean result = user.validatePassword("Nagraj@Panchal@123");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnFalse(){
        boolean result = user.validatePassword("NagrajPanchal");
        Assert.assertFalse(result);
    }
}
