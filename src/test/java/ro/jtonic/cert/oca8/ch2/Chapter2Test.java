package ro.jtonic.cert.oca8.ch2;

import org.junit.*;

/**
 * Antonel Pazargic (pazaran)
 * <p>Date: 04/09/2014
 * <p>Time: 08:46
 */
public class Chapter2Test {

    @Test
    public void testEquality()throws Exception {
        String a = null;
        org.junit.Assert.assertTrue(a == null);
    }

    @Test
    public void testTernary() throws Exception {
        int y = 1;
        System.out.println((y > 0 ? true : "hurray"));

//        int a = (y > 0) ? 9 : ("hurray"); // compilation error
    }

}
