package JavaRegexTest;

import javaRegex.LambdaVerify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LambdaVerifyTest {

    LambdaVerify lambdaVerify;

    @Before
    public void init() {
        lambdaVerify = new LambdaVerify();
    }


    @Test
    public void firstName() {
        boolean result;
        result = lambdaVerify.verifyFirstName.validate("Raghav");
        Assert.assertTrue(result);
    }
//    @Test
//    public void lastName() {
//        boolean result ;
//        result =  lambdaVerify.verifyFirstName.validate("");
//        Assert.assertTrue(result);
//    }    @Test
//    public void email() {
//        boolean result ;
//        result =  lambdaVerify.verifyFirstName.validate("");
//        Assert.assertTrue(result);
//    }    @Test
//    public void mobile() {
//        boolean result ;
//        result =  lambdaVerify.verifyFirstName.validate("");
//        Assert.assertTrue(result);
//    }
//    @Test
//    public void password() {
//        boolean result ;
//        result =  lambdaVerify.verifyFirstName.validate("");
//        Assert.assertTrue(result);
//    }

}
