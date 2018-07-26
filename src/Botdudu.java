import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;


public class Botdudu extends Thread {

    private static boolean hpLouenable;
    private static boolean hpmid;
    private static boolean hpEnable;

    public Botdudu() {
    }

    public static volatile boolean manaHighEnable;
    public static volatile boolean spiritEnable;
    public static volatile boolean conjureenable = false;
    public static volatile boolean potCD2 = false;
    public static volatile boolean potCD3 = false;
    public static volatile boolean potCD4 = false;
    public static volatile boolean potCD5 = false;
    public static volatile boolean potCD6 = false;
    public static volatile boolean utamaCD2 = false;


    public static Robot robot, robots, roboth, robotm, robota, robota2, robota3, robota4, robota5, robotm2, roboth2, roboth3, robotu;

    static {
        try {
            robot = new Robot();
            robots = new Robot();
            roboth = new Robot();
            robotm = new Robot();
            robota = new Robot();
            robota2 = new Robot();
            robota3 = new Robot();
            robota4 = new Robot();
            robota5 = new Robot();
            roboth2 = new Robot();
            roboth3 = new Robot();
            robotm2 = new Robot();
            robotu = new Robot();


        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public static boolean spirytus() throws InterruptedException {

        Color getSpirit = robots.getPixelColor(115, 61);

        if ((getSpirit.getGreen() == 192) && (getSpirit.getRed() == 0) && (getSpirit.getBlue() == 0) || (getSpirit.getGreen() == 192) && (getSpirit.getRed() == 96) && (getSpirit.getBlue() == 96)) {
            spiritEnable = true;
        } else spiritEnable = false;

        //     System.out.println("Green = " + getSpirit.getGreen());
        //  System.out.println("Red   = " + getSpirit.getRed());
        //   System.out.println("Blue  = " + getSpirit.getBlue());

        Color getPotCD2 = robots.getPixelColor(16, 57);

        if ((getPotCD2.getGreen() == 68 || getPotCD2.getGreen() == 69) && (getPotCD2.getRed() == 68 || getPotCD2.getRed() == 69) && (getPotCD2.getBlue() == 68 || getPotCD2.getBlue() == 69)) {
            potCD2 = true;
        } else potCD2 = false;

        //    System.out.println("Green = " + getPotCD2.getGreen());
        //    System.out.println("Red   = " + getPotCD2.getRed());
        //   System.out.println("Blue  = " + getPotCD2.getBlue());


        if (!spiritEnable && !potCD2) {

            robots.keyPress(KeyEvent.VK_F6);
            Thread.sleep(100);
            robots.keyRelease(KeyEvent.VK_F6);
            Thread.sleep(200);
        }

        return spiritEnable;

    }

    public static boolean mananahigh() throws InterruptedException {

        Color getManaHigh = robotm.getPixelColor(1849, 300);


        //   System.out.println("Green = " + getManaHigh.getGreen());
        // System.out.println("Red   = " + getManaHigh.getRed());
        //  System.out.println("Blue  = " + getManaHigh.getBlue());


        if ((getManaHigh.getGreen() == 76) && (getManaHigh.getRed() == 57) && (getManaHigh.getBlue() == 120)) {
            manaHighEnable = true;
        } else manaHighEnable = false;


        if (manaHighEnable) {
            robotm.keyPress(KeyEvent.VK_F10);
            Thread.sleep(100);
            robotm.keyRelease(KeyEvent.VK_F10);
            Thread.sleep(200);

        }

        return manaHighEnable;

    }

    public static boolean arrowsy() throws InterruptedException {

        Color getArrowsy = robota.getPixelColor(1756, 270);
        Color getArrowsy2 = robota2.getPixelColor(1766, 270);
        Color getArrowsy3 = robota2.getPixelColor(1776, 270);
        Color getArrowsy4 = robota2.getPixelColor(1786, 270);
        Color getArrowsy5 = robota2.getPixelColor(1796, 270);


//        System.out.println("Green = " + getArrowsy2.getGreen());
//        System.out.println("Red   = " + getArrowsy2.getRed());
//        System.out.println("Blue  = " + getArrowsy2.getBlue());


        if (!(((getArrowsy.getGreen() == 85) && (getArrowsy.getRed() == 74) && (getArrowsy.getBlue() == 215)))) {
            conjureenable = true;
        } else conjureenable = false;

        if (!(((getArrowsy2.getGreen() == 85) && (getArrowsy2.getRed() == 74) && (getArrowsy2.getBlue() == 215)))) {
            potCD3 = true;
        } else potCD3 = false;
        if (!(((getArrowsy3.getGreen() == 85) && (getArrowsy3.getRed() == 74) && (getArrowsy3.getBlue() == 215)))) {
            potCD4 = true;
        } else potCD4 = false;
        if (!(((getArrowsy4.getGreen() == 85) && (getArrowsy4.getRed() == 74) && (getArrowsy4.getBlue() == 215)))) {
            potCD5 = true;
        } else potCD5 = false;
        if (!(((getArrowsy5.getGreen() == 85) && (getArrowsy5.getRed() == 74) && (getArrowsy5.getBlue() == 215)))) {
            potCD6 = true;
        } else potCD6 = false;

        if (conjureenable && potCD3 && potCD4 && potCD5 && potCD6) {
            robota.keyPress(KeyEvent.VK_F5);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F5);
            Thread.sleep(200);
        }

        return conjureenable;

    }

    public static boolean utamadwa() throws InterruptedException {

        Color getutamadwa = robotu.getPixelColor(242, 975);


        //   System.out.println("Green = " + getManaHigh.getGreen());
        // System.out.println("Red   = " + getManaHigh.getRed());
        //  System.out.println("Blue  = " + getManaHigh.getBlue());


        if ((getutamadwa.getGreen() == 255) && (getutamadwa.getRed() == 151) && (getutamadwa.getBlue() == 255)) {
            utamaCD2 = true;
        } else utamaCD2 = false;

        System.out.println(utamaCD2);


        while (!utamaCD2) {
            robotu.keyPress(KeyEvent.VK_F5);
            Thread.sleep(100);
            robotu.keyRelease(KeyEvent.VK_F5);
            Thread.sleep(200);

            getutamadwa = robotu.getPixelColor(242, 975);

            if ((getutamadwa.getGreen() == 255) && (getutamadwa.getRed() == 151) && (getutamadwa.getBlue() == 255)) {
                utamaCD2 = true;
            } else utamaCD2 = false;


        }

        Thread.sleep(95000);

        return manaHighEnable;

    }

    public static String testpix() throws InterruptedException {

        Color testpix = robot.getPixelColor(242, 975);

        System.out.println("Green = " + testpix.getGreen());
        System.out.println("Red   = " + testpix.getRed());

        System.out.println("Blue  = " + testpix.getBlue());


        return "podkontrolo";

    }

    public static String hp() throws InterruptedException {


        Color getHPLou = robota.getPixelColor(1813, 288);   // supreme hp

        hpLouenable = ((getHPLou.getGreen() == 80) && (getHPLou.getRed() == 68) && (getHPLou.getBlue() == 108)) || ((getHPLou.getGreen() == 82) && (getHPLou.getRed() == 70) && (getHPLou.getBlue() == 110));


        Color getHpmid = robots.getPixelColor(1829, 286);  // great hp

        hpmid = (getHpmid.getGreen() == 80) && (getHpmid.getRed() == 53) && (getHpmid.getBlue() == 141) || ((getHpmid.getGreen() == 93) && (getHpmid.getRed() == 81) && (getHpmid.getBlue() == 121));


        Color getHpHigh = roboth.getPixelColor(1854, 288);  // exura ico

        hpEnable = (getHpHigh.getGreen() == 85) && (getHpHigh.getRed() == 72) && (getHpHigh.getBlue() == 113) || (getHpHigh.getGreen() == 81) && (getHpHigh.getRed() == 68) && (getHpHigh.getBlue() == 108);


        if (hpLouenable) {
            robota.keyPress(KeyEvent.VK_F2);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F2);
            Thread.sleep(100);

        } else if (hpmid) {
            robota.keyPress(KeyEvent.VK_F4);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F4);
            Thread.sleep(100);

        } else if (hpEnable) {
            robota.keyPress(KeyEvent.VK_F8);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F8);
            Thread.sleep(100);

        }


        return "t";


    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("poszlo !!");

        Thread t = new Thread(() -> {


            try {

                for (int i = 0; i < 999999999; i++) {


                    utamadwa();
                    Thread.sleep(100);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //  t.start();    //utamadwa

        Thread t2 = new Thread(() -> {


            try {

                for (int i = 0; i < 999999999; i++) {


                    spirytus();
                    Thread.sleep(100);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        //t2.start();    //siooo

        Thread t3 = new Thread(() -> {


            try {

                for (int i = 0; i < 999999999; i++) {

                    mananahigh();
                    Thread.sleep(100);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });

        t3.start();  //mana

        Thread t4 = new Thread(() -> {


            try {
                for (int i = 0; i < 999999999; i++) {

                    arrowsy();
                    Thread.sleep(100);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        // t4.start();   //utama

        Thread t6 = new Thread(() -> {


            try {
                for (int i = 0; i < 999999999; i++) {

                    System.out.println("loop test" + i);
                    testpix();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        //  t6.start();  //test
        Thread t7 = new Thread(() -> {


            try {
                for (int i = 0; i < 999999999; i++) {

                    //  System.out.println("loop test" + i);
                    hp();
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        t7.start();  //hp


    }

}


