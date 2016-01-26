package ro.jtonic.cert.oca8.intro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Antonel Pazargic (pazaran)
 * <p>Date: 04/09/2014
 * <p>Time: 08:46
 */
public class IntroTest {

    @Test
    public void testLocalVariable() {
        int a_b;
//        System.out.println(a_b); //Error:(16, 28) java: variable a_b might not have been initialized
    }

    @Test
    public void testSwitch() throws Exception {
        byte a = 1;
        Assert.assertTrue(a == 1);
        switch(a) {
            case 1:
                System.out.println("it's one!");
                break;
            default:
                System.out.println("it's not!");
        }

        int dayOfTheWeek = 5;
        switch(dayOfTheWeek){
            case 0:
                System.out.println("week day");
            default:
                System.out.println("other day");
            case 6:
                System.out.println("saturday");
        }
    }

}
