package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedTest
{
    String emailId;
    public ParameterisedTest(String emailId){
        super();
        this.emailId = emailId;
    }
    UserRegistrationTest user ;
    @Before
    public void initialize(){
        user = new UserRegistrationTest();
    }


    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList( new String[] {"prathmesh.32@gmai.com","prathmesh123@gmail.com"});
    }
    @Test
    public void checkEmailWithMultipleInputs(){
        Assert.assertEquals(true,user.equals("nagrajsubhash@gmail.com"));
    }
}
