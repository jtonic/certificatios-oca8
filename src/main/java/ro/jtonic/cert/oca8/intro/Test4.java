package ro.jtonic.cert.oca8.intro;

/**
 * Antonel Pazargic (pazaran)
 * <p>Date: 04/09/2014
 * <p>Time: 08:46
 */
public class Test4 {
    public static void main(String[]args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        while(count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch(y) {
                default:
                case 0: x -= 1; break;
                case 1: x += 5;
            }
        }
        System.out.println(x);
    }
}
