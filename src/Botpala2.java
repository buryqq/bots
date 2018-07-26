import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;


public class Botpala2 {


    static boolean manaHighEnable;
    static boolean spiritEnable;
    static boolean hpEnable;
    static boolean conjureenable;
    static Robot robot, robot2, robot3, robot4;


    static {
        try {
            robot = new Robot();
            robot2 = new Robot();
            robot3 = new Robot();
            robot4 = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public static void spirytus() throws InterruptedException {


        Color getSpirit = robot.getPixelColor(1813, 9);


        if ((getSpirit.getGreen() == 74) && (getSpirit.getRed() == 40) && (getSpirit.getBlue() == 150) || (getSpirit.getGreen() == 76) && (getSpirit.getRed() == 43) && (getSpirit.getBlue() == 152)) {
            spiritEnable = true;
        } else if (!hpEnable) spiritEnable = false;


        //      System.out.println("Green = " + getSpirit.getGreen());
        //   System.out.println("Red   = " + getSpirit.getRed());
        //   System.out.println("Blue  = " + getSpirit.getBlue());


        if (spiritEnable) {
            robot.keyPress(KeyEvent.VK_F8);
            Thread.sleep(100);
            robot.keyRelease(KeyEvent.VK_F8);
            Thread.sleep(200);
        }


    }


    public static void heal() throws InterruptedException {


        Color getHpHigh = robot2.getPixelColor(1839, 9);


        if ((getHpHigh.getGreen() == 77) && (getHpHigh.getRed() == 43) && (getHpHigh.getBlue() == 153) || (getHpHigh.getGreen() == 72) && (getHpHigh.getRed() == 38) && (getHpHigh.getBlue() == 148)) {
            hpEnable = true;
        } else hpEnable = false;

        //  System.out.println("Green = " + getHpHigh.getGreen());
        // System.out.println("Red   = " + getHpHigh.getRed());
        // System.out.println("Blue  = " + getHpHigh.getBlue());


        if (hpEnable) {
            robot2.keyPress(KeyEvent.VK_F5);
            Thread.sleep(100);
            robot2.keyRelease(KeyEvent.VK_F5);
            Thread.sleep(200);
        }


    }


    public static void mana() throws InterruptedException {


        Color getManaHigh = robot3.getPixelColor(1844, 26);


        if ((getManaHigh.getGreen() == 89) && (getManaHigh.getRed() == 84) && (getManaHigh.getBlue() == 100) || (getManaHigh.getGreen() == 95) && (getManaHigh.getRed() == 89) && (getManaHigh.getBlue() == 106)) {
            manaHighEnable = true;
        } else manaHighEnable = false;


        //  System.out.println("Green = " + getManaHigh.getGreen());
        // System.out.println("Red   = " + getManaHigh.getRed());
        // System.out.println("Blue  = " + getManaHigh.getBlue());


        if (manaHighEnable && !spiritEnable) {
            robot3.keyPress(KeyEvent.VK_F10);
            Thread.sleep(100);
            robot3.keyRelease(KeyEvent.VK_F10);
            Thread.sleep(200);

        }


    }


    public static void arrows() throws InterruptedException {


        Color getArrowsy = robot4.getPixelColor(289, 973);


        if (((getArrowsy.getGreen() == 47) && (getArrowsy.getRed() == 37) && (getArrowsy.getBlue() == 72)) || ((getArrowsy.getGreen() == 49) && (getArrowsy.getRed() == 56) && (getArrowsy.getBlue() == 62))) {
            conjureenable = true;
        } else conjureenable = false;


//        System.out.println("Green = " + getArrowsy.getGreen());
//        System.out.println("Red   = " + getArrowsy.getRed());
//        System.out.println("Blue  = " + getArrowsy.getBlue());


        if (conjureenable && !spiritEnable) {
            robot4.keyPress(KeyEvent.VK_F7);
            Thread.sleep(500);
            robot4.keyRelease(KeyEvent.VK_F7);
            Thread.sleep(500);
        }


    }

    public static void main(String[] args) throws InterruptedException, AWTException {


        System.out.println("poszlo !!");

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

        t.start(); //heal


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

        t2.start();  //spiryt


        Thread t3 = new Thread(new Runnable() {
            public void run() {


                try {

                    for (int i = 0; i < 999999999; i++) {


                        mana();
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


                        arrows();
                        Thread.sleep(100);

                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        });

        t4.start();  // arrows


    }
}