import java.awt.*;
import java.awt.event.KeyEvent;


import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.NativeInputEvent;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;


public class Botknight3 extends Thread implements NativeKeyListener {


    private static boolean manaHighEnable, manaLou, spiritEnable, hpEnable, hpLouenable, exminrdy, exorirdy, granrdy, utitordy1, utitordy2, utitordy3, utitordy4, utitordy5, utitordy6, manalouloulvl, mighttrigger, ssatrigger, zalozssa, zalozmight, hpred, battle, paral1, paral2, paral3, paral4, paral5, paral6, paral7, niemana, manascd, atkcd, healcd;

    private static Robot robot, robots, roboth, robotm, robota, robotlouakahaj, robotexori, robotmin, robotgran, robotu1, robotu2, robotu3, robotu4, robotu5, robotu6, robotmanalouloulvl, robothpred, robotssatrigger, robotmighttrigger, robotbattle, robotparal, robotmanacd, robotatkcd, robothealcd;

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
            robotgran = new Robot();
            robotu1 = new Robot();
            robotu2 = new Robot();
            robotu3 = new Robot();
            robotu4 = new Robot();
            robotu5 = new Robot();
            robotu6 = new Robot();
            robotmanalouloulvl = new Robot();
            robotssatrigger = new Robot();
            robotmighttrigger = new Robot();
            robothpred = new Robot();
            robotbattle = new Robot();
            robotparal = new Robot();
            robotmanacd = new Robot();
            robotatkcd = new Robot();
            robothealcd = new Robot();

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    static class VoidDispatchService extends AbstractExecutorService {
        private boolean running = false;

        public VoidDispatchService() {
            running = true;
        }

        public void shutdown() {
            running = false;
        }

        public List<Runnable> shutdownNow() {
            running = false;
            return new ArrayList<Runnable>(0);
        }

        public boolean isShutdown() {
            return !running;
        }

        public boolean isTerminated() {
            return !running;
        }

        public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            return true;
        }

        public void execute(Runnable r) {
            r.run();
        }
    }


    public void nativeKeyPressed(NativeKeyEvent e) {

        if (e.getKeyCode() == NativeKeyEvent.VC_F12) {


            System.out.print("Attempting to consume B event...\t");
            try {
                Field f = NativeInputEvent.class.getDeclaredField("reserved");
                f.setAccessible(true);
                f.setShort(e, (short) 0x01);

                System.out.print("[ OK ]\n");
            } catch (Exception ex) {
                System.out.print("[ !! ]\n");
                ex.printStackTrace();
            }


            System.out.println(utitordy1 + "+" + utitordy2 + "+" + utitordy3 + "+" + utitordy4 + "+" + utitordy5 + "+" + utitordy6);


            if (atkcd) {

                if (!battle) {

                    robot.keyPress(KeyEvent.VK_F1);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    robot.keyRelease(KeyEvent.VK_F1);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }


                if (!utitordy1 && !utitordy2 && !utitordy3 && !utitordy4 && !utitordy5 && !utitordy6 && !manaHighEnable) {

                    robot.keyPress(KeyEvent.VK_F4);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    robot.keyRelease(KeyEvent.VK_F4);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                } else if (granrdy) {

                    robot.keyPress(KeyEvent.VK_F6);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    robot.keyRelease(KeyEvent.VK_F6);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                } else if (exminrdy) {
                    robot.keyPress(KeyEvent.VK_F5);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    robot.keyRelease(KeyEvent.VK_F5);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }

                } else if (exorirdy) {
                    robot.keyPress(KeyEvent.VK_F9);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    robot.keyRelease(KeyEvent.VK_F9);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }

                }


                if (utitordy1 || utitordy2 || utitordy3 || utitordy4 || utitordy5 || utitordy6) {

                    robot.keyPress(KeyEvent.VK_F3);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    robot.keyRelease(KeyEvent.VK_F3);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }

            }
            //////////////////////////////////////


//                        if (exorirdy){
//                robot.keyPress(KeyEvent.VK_F9);
//                robot.keyRelease(KeyEvent.VK_F9);
//
//            }
//
//            else {
//                robot.keyPress(KeyEvent.VK_F5);
//                robot.keyRelease(KeyEvent.VK_F5);
//
//            }

//////////////////////////////////////////////////////////////////

        }


        if (e.getKeyCode() == NativeKeyEvent.VC_ALT) {

            niemana = true;


        }


    }

    public void nativeKeyReleased(NativeKeyEvent e) {
        if (e.getKeyCode() == NativeKeyEvent.VC_F12) {
            System.out.print("Attempting to consume B event...\t");
            try {
                Field f = NativeInputEvent.class.getDeclaredField("reserved");
                f.setAccessible(true);
                f.setShort(e, (short) 0x01);

                System.out.print("[ OK ]\n");
            } catch (Exception ex) {
                System.out.print("[ !! ]\n");
                ex.printStackTrace();
            }
        }

        if (e.getKeyCode() == NativeKeyEvent.VC_ALT) {

            niemana = false;


        }

    }

    public void nativeKeyTyped(NativeKeyEvent e) {
    }

    private static void check() {


        Color getmanacd = robotmanacd.getPixelColor(530, 933);
        manascd = ((getmanacd.getGreen() == 74) && (getmanacd.getRed() == 74) && (getmanacd.getBlue() == 74));


        Color getatkcd = robotatkcd.getPixelColor(191, 975);
        atkcd = ((getatkcd.getGreen() == 51) && (getatkcd.getRed() == 44) && (getatkcd.getBlue() == 45));


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

        Color getExorigrancd = robotgran.getPixelColor(384, 933);  // exori scooldownowane

        granrdy = (getExorigrancd.getGreen() == 34) && (getExorigrancd.getRed() == 108) && (getExorigrancd.getBlue() == 12);


        Color getmanalouloulvl = robotmanalouloulvl.getPixelColor(1833, 302);  // exori scooldownowane

        manalouloulvl = (getmanalouloulvl.getGreen() == 93) && (getmanalouloulvl.getRed() == 88) && (getmanalouloulvl.getBlue() == 105);


        Color getu1 = robotu1.getPixelColor(1758, 269);  // utito on scooldownowane

        utitordy1 = (getu1.getGreen() == 93) && (getu1.getRed() == 37) && (getu1.getBlue() == 32);
        paral1 = (getu1.getGreen() == 0) && (getu1.getRed() == 255) && (getu1.getBlue() == 0);

        Color getu2 = robotu2.getPixelColor(1768, 269);  // utito on scooldownowane

        utitordy2 = (getu2.getGreen() == 93) && (getu2.getRed() == 37) && (getu2.getBlue() == 32);
        paral2 = (getu2.getGreen() == 0) && (getu2.getRed() == 255) && (getu2.getBlue() == 0);

        Color getu3 = robotu3.getPixelColor(1778, 269);  // utito on scooldownowane

        utitordy3 = (getu3.getGreen() == 93) && (getu3.getRed() == 37) && (getu3.getBlue() == 32);
        paral3 = (getu3.getGreen() == 0) && (getu3.getRed() == 255) && (getu3.getBlue() == 0);

        Color getu4 = robotu4.getPixelColor(1788, 269);  // utito on scooldownowane

        utitordy4 = (getu4.getGreen() == 93) && (getu4.getRed() == 37) && (getu4.getBlue() == 32);
        paral4 = (getu4.getGreen() == 0) && (getu4.getRed() == 255) && (getu4.getBlue() == 0);

        Color getu5 = robotu5.getPixelColor(1798, 269);  // utito on scooldownowane

        utitordy5 = (getu5.getGreen() == 93) && (getu5.getRed() == 37) && (getu5.getBlue() == 32);
        paral5 = (getu5.getGreen() == 0) && (getu5.getRed() == 255) && (getu5.getBlue() == 0);

        Color getu6 = robotu6.getPixelColor(1808, 269);  // utito on scooldownowane

        utitordy6 = (getu6.getGreen() == 93) && (getu6.getRed() == 37) && (getu6.getBlue() == 32);
        paral6 = (getu1.getGreen() == 0) && (getu6.getRed() == 255) && (getu6.getBlue() == 0);


        Color getbattle = robotbattle.getPixelColor(24, 56);  // utito on scooldownowane

        battle = ((getbattle.getGreen() == 0) && (getbattle.getRed() == 255) && (getbattle.getBlue() == 0)) || ((getbattle.getGreen() == 128) && (getbattle.getRed() == 255) && (getbattle.getBlue() == 128)) || ((getbattle.getGreen() == 255) && (getbattle.getRed() == 255) && (getbattle.getBlue() == 255));

        Color getHealcd = robothealcd.getPixelColor(213, 975);  // heal scooldownowane

        healcd = (getHealcd.getGreen() == 229) && (getHealcd.getRed() == 192) && (getHealcd.getBlue() == 245);


//System.out.println(healcd);


///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Color testpix = robot.getPixelColor(1815, 301);

        System.out.println("Green = " + testpix.getGreen());
        System.out.println("Red   = " + testpix.getRed());
        System.out.println("Blue  = " + testpix.getBlue());


////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

    private static void utamo() throws InterruptedException {
/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
//        robot.keyPress(KeyEvent.VK_F4);
//        robot.keyRelease(KeyEvent.VK_F4);                                                                  // TUTTTTEEEJJJJ
//        Thread.sleep(9000);
///////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////


//        Color gethpred = robothpred.getPixelColor(1805, 288);  // redzik hpek
//
//
//        hpred=(gethpred.getGreen() == 82) && (gethpred.getRed() == 70) && (gethpred.getBlue() == 110);


        Color getring = robotmighttrigger.getPixelColor(1767, 224);  // mightringtrigger

        if ((getring.getGreen() == 214) && (getring.getRed() == 244) && (getring.getBlue() == 95)) {
            mighttrigger = true;
            zalozmight = false;
        } else if ((getring.getGreen() == 143) && (getring.getRed() == 121) && (getring.getBlue() == 170)) {

            mighttrigger = false;
            zalozmight = false;
        } else zalozmight = true;

        Color getamulet = robotssatrigger.getPixelColor(1770, 159);   // ssatrigger


        if (((getamulet.getGreen() == 153) && (getamulet.getRed() == 153) && (getamulet.getBlue() == 153)) || ((getamulet.getGreen() == 156) && (getamulet.getRed() == 160) && (getamulet.getBlue() == 151)))

        {
            ssatrigger = true;
            zalozssa = false;
        } else if (((getamulet.getGreen() == 40) && (getamulet.getRed() == 40) && (getamulet.getBlue() == 41))) {
            ssatrigger = false;
            zalozssa = false;
        } else zalozssa = true;

        /////////////////////////////////////////////////////////

//        if (hpred) {
//            mighttrigger=true;
//            ssatrigger=true;
//            zalozmight=true;
//            zalozssa=true;
//        }
///////////////////////////////////////////////////////////


        //  System.out.println(niemana);


//        System.out.println("might: " + mighttrigger);
//        System.out.println("ssa: " +ssatrigger);
//
//        System.out.println("zalozmight: " + zalozmight);
//        System.out.println("zalozssa: " +zalozssa);


        if (mighttrigger && zalozmight) {

            robotmighttrigger.keyPress(KeyEvent.VK_F8);
            Thread.sleep(100);
            robotmighttrigger.keyRelease(KeyEvent.VK_F8);

            Thread.sleep(100);

        }

        if (ssatrigger && zalozssa) {

            robotssatrigger.keyPress(KeyEvent.VK_F7);
            Thread.sleep(100);
            robotssatrigger.keyRelease(KeyEvent.VK_F7);

            Thread.sleep(100);


        }


    }


    private static void act() throws InterruptedException {
/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
//        if (!utitordy1 && !utitordy2 && !utitordy3 && !utitordy4 && !utitordy5 && !utitordy6){
//            robot.keyPress(KeyEvent.VK_F4);
//        Thread.sleep(50);
//            robot.keyRelease(KeyEvent.VK_F4);                                                                // utito auto
//            Thread.sleep(50);
//
//        }

/////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////


//
//                if ((paral1 || paral2 || paral3 || paral4 || paral5 || paral6 )&&!healcd){
//            robot.keyPress(KeyEvent.VK_F3);
//        Thread.sleep(50);
//            robot.keyRelease(KeyEvent.VK_F3);                                                                // antyparal
//            Thread.sleep(50);
//
//        }


//        if (hpLouenable&&!healcd) {
//            robota.keyPress(KeyEvent.VK_F2);
//            Thread.sleep(50);
//            robota.keyRelease(KeyEvent.VK_F2);
//            Thread.sleep(50);
//            robota.keyPress(KeyEvent.VK_F3);
//            Thread.sleep(50);
//            robota.keyRelease(KeyEvent.VK_F3);
//            Thread.sleep(50);
//        }

        if (spiritEnable) {   ////hp


            robots.keyPress(KeyEvent.VK_F2);
            Thread.sleep(50);
            robots.keyRelease(KeyEvent.VK_F2);
            Thread.sleep(50);
        } else if (manaLou && !niemana) {
            robotm.keyPress(KeyEvent.VK_F10);
            Thread.sleep(50);
            robotm.keyRelease(KeyEvent.VK_F10);
            Thread.sleep(150);
        }

//        else if  (hpEnable && !manaLou &&!healcd ) {
//
//            roboth.keyPress(KeyEvent.VK_F3);
//            Thread.sleep(50);
//            roboth.keyRelease(KeyEvent.VK_F3);
//            Thread.sleep(50);
//        }


    }

    public Botknight3() throws NativeHookException {


        GlobalScreen.setEventDispatcher(new Botknight3.VoidDispatchService());
        GlobalScreen.addNativeKeyListener(this);
        GlobalScreen.registerNativeHook();

        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);

        Handler[] handlers = Logger.getLogger("").getHandlers();
        for (Handler handler : handlers) {
            handler.setLevel(Level.OFF);
        }


    }


    public static void main(String[] args) throws InterruptedException, NativeHookException {

        System.out.println("poszlo !!");
        new Botknight3();

        Thread t = new Thread(() -> {


            try {

                for (int i = 0; i < 999999999; i++) {


                    check();
                    Thread.sleep(50);

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
                    Thread.sleep(50);


                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t2.start(); //act


        Thread t3 = new Thread(() -> {


            try {

                for (int i = 0; i < 999999999; i++) {


                    utamo();
                    Thread.sleep(50);


                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t3.start(); //act


    }

}


