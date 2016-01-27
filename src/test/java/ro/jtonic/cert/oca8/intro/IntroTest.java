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

        int tuesday = 1;

        switch(dayOfTheWeek){
            case 0:
                System.out.println("week day");
            default:
                System.out.println("other day");
            case 6:
                System.out.println("saturday");
//            case tuesday: // compilation error - constant expression required
//                System.out.println("tuesday");
        }

    }

    @Test
    public void testXXX() throws Exception {
        long x = 10;
        byte y = 11;

        byte a = 1;
        byte b = 2;
        // byte z = a + b; this does not compile but the byte z = 1 + 2; DOES!!!
        // float q = 0.1; THIS DOES NOT COMPILE BUT THE F... long y = 10; DOES!!!
    }

    @Test
    public void testStrings(){
        final String name = "animal";
//        name.charAt(7);  //RUNTIME: java.lang.StringIndexOutOfBoundsException: String index out of range: 7
        System.out.printf("'%s'", name.substring(3, 3));
//        System.out.println(name.substring(3, 2)); //RUNTIME java.lang.StringIndexOutOfBoundsException: String index out of range: -1
//        System.out.println(name.substring(3, 8)); //RUNTIME java.lang.StringIndexOutOfBoundsException: String index out of range: 8
    }


}
