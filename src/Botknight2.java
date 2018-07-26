import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;


import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;


public class Botknight2 extends Thread implements NativeKeyListener {


    private static boolean manaHighEnable, manaLou, spiritEnable, hpEnable, hpLouenable, exminrdy, exorirdy, utitordy1, utitordy2, utitordy3, utitordy4, utitordy5, utitordy6;

    private static Robot robot, robots, roboth, robotm, robota, robotlouakahaj, robotexori, robotmin, robotu1, robotu2, robotu3, robotu4, robotu5, robotu6;

    static {
        try {
            robot = new Robot();
            robots = new Robot();
            roboth = new Robot();
            robotm = new Robot();
            robota = new Robot();
            robotexori = new Robot();
            robotmin = new Robot();
            robotlouakahaj = new Robot();
            robotu1 = new Robot();
            robotu2 = new Robot();
            robotu3 = new Robot();
            robotu4 = new Robot();
            robotu5 = new Robot();
            robotu6 = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public void nativeKeyPressed(NativeKeyEvent e) {

        if (e.getKeyCode() == NativeKeyEvent.VC_F12) {


            if (!utitordy1 && !utitordy2 && !utitordy3 && !utitordy4 && !utitordy5 && !utitordy6) {
                robot.keyPress(KeyEvent.VK_F8);
                robot.keyRelease(KeyEvent.VK_F8);

            } else if (exminrdy) {
                robot.keyPress(KeyEvent.VK_F5);
                robot.keyRelease(KeyEvent.VK_F5);

            } else if (exorirdy) {
                robot.keyPress(KeyEvent.VK_F9);
                robot.keyRelease(KeyEvent.VK_F9);

            } else {

                robot.keyPress(KeyEvent.VK_F6);
                robot.keyRelease(KeyEvent.VK_F6);
            }
        }

    }

    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
    }


    private static void check() {


        Color getHPLou = robota.getPixelColor(1813, 288);   // supreme hp

        hpLouenable = ((getHPLou.getGreen() == 80) && (getHPLou.getRed() == 68) && (getHPLou.getBlue() == 108)) || ((getHPLou.getGreen() == 82) && (getHPLou.getRed() == 70) && (getHPLou.getBlue() == 110));


        Color getSpirit = robots.getPixelColor(1829, 286);  // great hp

        spiritEnable = (getSpirit.getGreen() == 80) && (getSpirit.getRed() == 53) && (getSpirit.getBlue() == 141) || ((getSpirit.getGreen() == 93) && (getSpirit.getRed() == 81) && (getSpirit.getBlue() == 121));


        Color getHpHigh = roboth.getPixelColor(1854, 288);  // exura ico

        hpEnable = (getHpHigh.getGreen() == 85) && (getHpHigh.getRed() == 72) && (getHpHigh.getBlue() == 113) || (getHpHigh.getGreen() == 81) && (getHpHigh.getRed() == 68) && (getHpHigh.getBlue() == 108);


        Color getManaHigh = robotm.getPixelColor(1815, 301);  // pol many

        manaHighEnable = (getManaHigh.getGreen() == 80) && (getManaHigh.getRed() == 68) && (getManaHigh.getBlue() == 108) || (getManaHigh.getGreen() == 76) && (getManaHigh.getRed() == 57) && (getManaHigh.getBlue() == 120);


        Color getManaLou = robotlouakahaj.getPixelColor(1849, 300);  // mana prawie cala

        manaLou = (getManaLou.getGreen() == 74) && (getManaLou.getRed() == 54) && (getManaLou.getBlue() == 117) || (getManaLou.getGreen() == 76) && (getManaLou.getRed() == 57) && (getManaLou.getBlue() == 120);


        Color getExorimincd = robotmin.getPixelColor(352, 933);  // min scooldownowane

        exminrdy = (getExorimincd.getGreen() == 76) && (getExorimincd.getRed() == 76) && (getExorimincd.getBlue() == 74);


        Color getExoricd = robotexori.getPixelColor(497, 935);  // exori scooldownowane

        exorirdy = (getExoricd.getGreen() == 23) && (getExoricd.getRed() == 67) && (getExoricd.getBlue() == 11);


        Color getu1 = robotu1.getPixelColor(1758, 269);  // utito on scooldownowane

        utitordy1 = (getu1.getGreen() == 93) && (getu1.getRed() == 37) && (getu1.getBlue() == 32);

        Color getu2 = robotu2.getPixelColor(1768, 269);  // utito on scooldownowane

        utitordy2 = (getu2.getGreen() == 93) && (getu2.getRed() == 37) && (getu2.getBlue() == 32);

        Color getu3 = robotu3.getPixelColor(1778, 269);  // utito on scooldownowane

        utitordy3 = (getu3.getGreen() == 93) && (getu3.getRed() == 37) && (getu3.getBlue() == 32);

        Color getu4 = robotu4.getPixelColor(1788, 269);  // utito on scooldownowane

        utitordy4 = (getu4.getGreen() == 93) && (getu4.getRed() == 37) && (getu4.getBlue() == 32);

        Color getu5 = robotu5.getPixelColor(1798, 269);  // utito on scooldownowane

        utitordy5 = (getu5.getGreen() == 93) && (getu5.getRed() == 37) && (getu5.getBlue() == 32);

        Color getu6 = robotu6.getPixelColor(1808, 269);  // utito on scooldownowane

        utitordy6 = (getu6.getGreen() == 93) && (getu6.getRed() == 37) && (getu6.getBlue() == 32);


///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Color testpix = robot.getPixelColor(1829, 286);

        System.out.println("Green = " + testpix.getGreen());
        System.out.println("Red   = " + testpix.getRed());
        System.out.println("Blue  = " + testpix.getBlue());


////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    private static void act() throws InterruptedException {


        if (hpLouenable) {
            robota.keyPress(KeyEvent.VK_F2);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F2);
            Thread.sleep(100);
            robota.keyPress(KeyEvent.VK_F3);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F3);
            Thread.sleep(200);
        } else if (spiritEnable) {

            robots.keyPress(KeyEvent.VK_F2);
            Thread.sleep(100);
            robots.keyRelease(KeyEvent.VK_F2);
            Thread.sleep(200);
        } else if (manaLou) {
            robotm.keyPress(KeyEvent.VK_F10);
            Thread.sleep(200);
            robotm.keyRelease(KeyEvent.VK_F10);
            Thread.sleep(300);
        }


        if (hpEnable && !manaLou) {

            roboth.keyPress(KeyEvent.VK_F3);
            Thread.sleep(100);
            roboth.keyRelease(KeyEvent.VK_F3);
            Thread.sleep(200);
        }


    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println("poszlo !!");


        try {
            GlobalScreen.registerNativeHook();

            Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
            logger.setLevel(Level.OFF);

            Handler[] handlers = Logger.getLogger("").getHandlers();
            for (Handler handler : handlers) {
                handler.setLevel(Level.OFF);
            }
        } catch (NativeHookException ignored) {
        }

        GlobalScreen.addNativeKeyListener(new Botknight2());


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


