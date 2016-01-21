package ro.jtonic.cert.oca8.intro.test3;

/**
 * Antonel Pazargic (pazaran)
 * <p>Date: 04/09/2014
 * <p>Time: 08:46
 */
public class Cougar extends Puma {
    public static void main(String[] args) {
        Puma puma = new Puma();
        System.out.println(puma.getTailLength());
    }
    public int gerTailLength(int length) { return 2;}
}
