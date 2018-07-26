import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;


public class Botknight extends Thread {


    public Botknight() {

    }


    public static volatile boolean manaHighEnable;
    public static volatile boolean manaLou;
    public static volatile boolean spiritEnable;
    public static volatile boolean hpEnable;
    public static volatile boolean conjureenable = false;


    public static Robot robot, robots, roboth, robotm, robota, robota2, robotm2, robots2, roboth2, roboth3, robotlouakahaj;


    static {
        try {
            robot = new Robot();
            robots = new Robot();
            roboth = new Robot();
            robotm = new Robot();
            robota = new Robot();
            robota2 = new Robot();
            robots2 = new Robot();
            roboth2 = new Robot();
            roboth3 = new Robot();
            robotm2 = new Robot();
            robotlouakahaj = new Robot();


        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public static boolean spirytus() throws InterruptedException {

        Color getSpirit = robots.getPixelColor(1839, 288);


        //    System.out.println("Green = " + getSpirit.getGreen());
        //  System.out.println("Red   = " + getSpirit.getRed());
        //  System.out.println("Blue  = " + getSpirit.getBlue());

        if ((getSpirit.getGreen() == 81) && (getSpirit.getRed() == 68) && (getSpirit.getBlue() == 108) || ((getSpirit.getGreen() == 93) && (getSpirit.getRed() == 81) && (getSpirit.getBlue() == 121))) {
            spiritEnable = true;
        } else spiritEnable = false;


        if (spiritEnable && !conjureenable) {

            robots.keyPress(KeyEvent.VK_F8);
            Thread.sleep(100);
            robots.keyRelease(KeyEvent.VK_F8);
            Thread.sleep(200);
        }


        return spiritEnable;

    }


    public static boolean heal() throws InterruptedException {


        Color getHpHigh = roboth.getPixelColor(1854, 288);


        if ((getHpHigh.getGreen() == 85) && (getHpHigh.getRed() == 72) && (getHpHigh.getBlue() == 113) || (getHpHigh.getGreen() == 81) && (getHpHigh.getRed() == 68) && (getHpHigh.getBlue() == 108)) {
            hpEnable = true;
        } else hpEnable = false;


        //   System.out.println("Green = " + getHpHigh.getGreen());
        //    System.out.println("Red   = " + getHpHigh.getRed());
        //   System.out.println("Blue  = " + getHpHigh.getBlue());

        if (conjureenable) {

            roboth.keyPress(KeyEvent.VK_F9);
            Thread.sleep(100);
            roboth.keyRelease(KeyEvent.VK_F9);
            Thread.sleep(200);


        } else if (hpEnable && !manaLou && !conjureenable) {


            roboth.keyPress(KeyEvent.VK_F3);
            Thread.sleep(100);
            roboth.keyRelease(KeyEvent.VK_F3);
            Thread.sleep(200);
        }


        return hpEnable;

    }


    public static boolean mananahigh() throws InterruptedException {


        Color getManaHigh = robotm.getPixelColor(1815, 301);


        if ((getManaHigh.getGreen() == 80) && (getManaHigh.getRed() == 68) && (getManaHigh.getBlue() == 108) || (getManaHigh.getGreen() == 76) && (getManaHigh.getRed() == 57) && (getManaHigh.getBlue() == 120)) {
            manaHighEnable = true;
        } else manaHighEnable = false;


        Color getManaLou = robotlouakahaj.getPixelColor(1849, 300);


        if ((getManaLou.getGreen() == 74) && (getManaLou.getRed() == 54) && (getManaLou.getBlue() == 117) || (getManaLou.getGreen() == 76) && (getManaLou.getRed() == 57) && (getManaLou.getBlue() == 120)) {
            manaLou = true;
        } else manaLou = false;


        //  System.out.println("Green = " + getManaHigh.getGreen());
        //   System.out.println("Red   = " + getManaHigh.getRed());
        //   System.out.println("Blue  = " + getManaHigh.getBlue());

        if (manaHighEnable && !spiritEnable && !conjureenable) {
            robotm.keyPress(KeyEvent.VK_F10);
            Thread.sleep(100);
            robotm.keyRelease(KeyEvent.VK_F10);
            Thread.sleep(200);

        }

        return manaHighEnable;

    }


    public static boolean arrowsy() throws InterruptedException {

        Color getArrowsy = robota.getPixelColor(1813, 288);


        //  System.out.println("Green = " + getArrowsy.getGreen());
        //  System.out.println("Red   = " + getArrowsy.getRed());
        //  System.out.println("Blue  = " + getArrowsy.getBlue());


        if (((getArrowsy.getGreen() == 80) && (getArrowsy.getRed() == 68) && (getArrowsy.getBlue() == 108)) || ((getArrowsy.getGreen() == 82) && (getArrowsy.getRed() == 70) && (getArrowsy.getBlue() == 110))) {
            conjureenable = true;
        } else conjureenable = false;


        if (conjureenable) {
            robota.keyPress(KeyEvent.VK_F2);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F2);
            Thread.sleep(200);
        }

        return conjureenable;

    }


    public static String testpix() throws InterruptedException {

        Color testpix = robot.getPixelColor(1815, 301);

        System.out.println("Green = " + testpix.getGreen());
        System.out.println("Red   = " + testpix.getRed());
        System.out.println("Blue  = " + testpix.getBlue());


        return "t";

    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("pajszlo !!");

        Thread t = new Thread(new Runnable() {
            public void run() {


                try {

                    for (int i = 0; i < 999999999; i++) {


                        heal();
                        Thread.sleep(100);

                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

        t.start(); // heal

        Thread t2 = new Thread(new Runnable() {
            public void run() {


                try {

                    for (int i = 0; i < 999999999; i++) {


                        spirytus();
                        Thread.sleep(100);


                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //   t2.start(); // great hp

        Thread t3 = new Thread(new Runnable() {
            public void run() {


                try {

                    for (int i = 0; i < 999999999; i++) {

                        mananahigh();
                        Thread.sleep(100);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

        t3.start();  //mana

        Thread t4 = new Thread(new Runnable() {
            public void run() {


                try {
                    for (int i = 0; i < 999999999; i++) {


                        arrowsy();
                        Thread.sleep(100);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        t4.start(); //supreme hp


        Thread t6 = new Thread(new Runnable() {
            public void run() {


                try {
                    for (int i = 0; i < 999999999; i++) {


                        testpix();
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        // t6.start();   // testpix


    }


}


