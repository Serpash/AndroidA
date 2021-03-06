package com.example.sergey.androidapp;

import android.content.Context;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class LoginTestWithWrongLogin {

    private static final String FAKE_STRING = "Invalid login!";

    @Mock
    Context mMockContext;

    @Test(expected = RuntimeException.class)
    public void readStringFromContext_LocalizedString() {

        MainActivity myObjectUnderTest = new MainActivity();
        String result = myObjectUnderTest.validate("user@ail","1234");
        Assert.assertEquals(result, is(FAKE_STRING));
    }

}