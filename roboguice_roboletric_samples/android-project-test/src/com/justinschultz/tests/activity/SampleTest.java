package com.justinschultz.tests.activity;

import android.util.Log;

import com.justinschultz.androidproject.MainActivity;
import com.justinschultz.androidproject.R;
import com.justinschultz.tests.runner.SampleTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

//import static org.hamcrest.CoreMatchers.;
//import static org.junit.Assert.assertThat;
import org.junit.Assert;

@RunWith(SampleTestRunner.class)
public class SampleTest {
	@Test
    public void testBasicResourceValue() throws Exception {
        String helloFromActivity = new MainActivity().getResources().getString(R.string.ok);
        Log.d("aa", helloFromActivity);
        Log.d("aa", "ok");
        
        Assert.assertEquals("hello", helloFromActivity, new String("ok"));
        Assert.assertEquals("hello", "ok", "ok");
    }
    @Test
    public void testAdd() {
        Assert.assertTrue("hello testAdd",  true);

    }

    @Test
    public void testEqual() {
        Assert.assertTrue("Euqal should not be true", true);
    }
    
    @Test
    public void testLoginFailure() {
    	Assert.assertNotNull("login failed", null);
    }
}
