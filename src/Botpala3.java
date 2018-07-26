import java.awt.*;
import java.awt.event.KeyEvent;


public class Botpala3 {


    static boolean manaHighEnable;
    static boolean spiritEnable;
    static boolean hpEnable;
    static boolean conjureenable;
    static boolean utito1;
    static boolean utito2;

    static Robot robot, robot2, robot3, robot4, robot5, robot6;


    static int r, g, b, sumablue = 0, sumagreen = 0, sumared = 0, sumablue2 = 0, sumagreen2 = 0, sumared2 = 0;
    static boolean strzalastrzelona = false;


    static {
        try {
            robot = new Robot();
            robot2 = new Robot();
            robot3 = new Robot();
            robot4 = new Robot();
            robot5 = new Robot();
            robot6 = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    private static void check() {

        Color getSpirit = robot.getPixelColor(1813, 9);


        if ((getSpirit.getGreen() == 74) && (getSpirit.getRed() == 40) && (getSpirit.getBlue() == 150) || (getSpirit.getGreen() == 76) && (getSpirit.getRed() == 43) && (getSpirit.getBlue() == 152)) {
            spiritEnable = true;
        } else if (!hpEnable) spiritEnable = false;


        Color getHpHigh = robot2.getPixelColor(1839, 9);


        if ((getHpHigh.getGreen() == 77) && (getHpHigh.getRed() == 43) && (getHpHigh.getBlue() == 153) || (getHpHigh.getGreen() == 72) && (getHpHigh.getRed() == 38) && (getHpHigh.getBlue() == 148)) {
            hpEnable = true;
        } else hpEnable = false;

        Color getManaHigh = robot3.getPixelColor(1844, 26);


        if ((getManaHigh.getGreen() == 89) && (getManaHigh.getRed() == 84) && (getManaHigh.getBlue() == 100) || (getManaHigh.getGreen() == 95) && (getManaHigh.getRed() == 89) && (getManaHigh.getBlue() == 106)) {
            manaHighEnable = true;
        } else manaHighEnable = false;

        Color getArrowsy = robot4.getPixelColor(289, 973);


        if (((getArrowsy.getGreen() == 47) && (getArrowsy.getRed() == 37) && (getArrowsy.getBlue() == 72)) || ((getArrowsy.getGreen() == 49) && (getArrowsy.getRed() == 56) && (getArrowsy.getBlue() == 62))) {
            conjureenable = true;

        } else conjureenable = false;


        Color getUtito1 = robot5.getPixelColor(213, 977);


        if (((getUtito1.getGreen() == 234) && (getUtito1.getRed() == 203) && (getUtito1.getBlue() == 246))) {
            utito1 = true;
        } else utito1 = false;


        Color getUtito2 = robot6.getPixelColor(243, 977);


        if (((getUtito2.getGreen() == 235) && (getUtito2.getRed() == 37) && (getUtito2.getBlue() == 226))) {
            utito2 = true;
        } else utito2 = false;


/////////////////////////////////////////////////////////////////////


//        Color color,color2;
//
//        for (int j = 1845; j < 1856; j = j + 1) {
//
//
//            color = robot.getPixelColor(j, 336);
//
//            r = color.getRed();
//            g = color.getBlue();
//            b = color.getGreen();
//
//            sumablue = sumablue + b;
//            sumagreen = sumagreen + g;
//            sumared = sumared + r;
//
//
//        }
//
//        for (int k = 1845; k < 1856; k = k + 1) {
//
//
//            color2 = robot.getPixelColor(k, 340);
//
//            r = color2.getRed();
//            g = color2.getBlue();
//            b = color2.getGreen();
//
//            sumablue = sumablue + b;
//            sumagreen = sumagreen + g;
//            sumared = sumared + r;
//
//
//        }
//
//
//
//        if (!(sumablue == sumablue2 )||!( sumagreen == sumagreen2 )||!( sumared == sumared2)) {
//            System.out.println("strzelilem strzale w loopie : ");
//            strzalastrzelona = true;
//            Toolkit.getDefaultToolkit().beep();
//
//        }
//        else {strzalastrzelona=false;}
//
//
//        sumablue2 = sumablue;
//        sumagreen2 = sumagreen;
//        sumared2 = sumared;
//
//        sumablue = 0;
//        sumagreen = 0;
//        sumared = 0;


//////////////////////////////////////////////////////////////////////////


    }

    private static void act() throws InterruptedException {


        if (spiritEnable) {
            robot.keyPress(KeyEvent.VK_F8);
            Thread.sleep(100);
            robot.keyRelease(KeyEvent.VK_F8);
            Thread.sleep(200);
        } else if (manaHighEnable) {
            robot3.keyPress(KeyEvent.VK_F10);
            Thread.sleep(100);
            robot3.keyRelease(KeyEvent.VK_F10);
            Thread.sleep(200);

        }


        if (hpEnable && utito1 && utito2) {
            robot2.keyPress(KeyEvent.VK_F8);
            Thread.sleep(100);
            robot2.keyRelease(KeyEvent.VK_F8);
            Thread.sleep(200);
        } else if (hpEnable) {
            robot2.keyPress(KeyEvent.VK_F5);
            Thread.sleep(100);
            robot2.keyRelease(KeyEvent.VK_F5);
            Thread.sleep(200);
        }


        if (conjureenable && !spiritEnable && !manaHighEnable) {
            robot4.keyPress(KeyEvent.VK_F7);
            Thread.sleep(500);
            robot4.keyRelease(KeyEvent.VK_F7);
            Thread.sleep(500);
        }

    }


    public static void main(String[] args) throws InterruptedException, AWTException {


        System.out.println("poszlo !!");


        Thread t = new Thread(() -> {


            try {

                for (int i = 0; i < 999999999; i++) {


                    check();
                    Thread.sleep(100);

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        });

        t.start(); //check

        Thread t2 = new Thread(() -> {


            try {

                for (int i = 0; i < 999999999; i++) {


                    act();
                    Thread.sleep(100);


                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start(); //act

    }

}
