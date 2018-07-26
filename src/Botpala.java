import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.time.Instant;


public class Botpala extends Thread {


    public Botpala() {

    }


    public static volatile boolean manaHighEnable;
    public static volatile boolean spiritEnable;
    public static volatile boolean hpEnable;
    public static volatile boolean masCdEnable;
    public static volatile boolean avaCdEnable;
    public static volatile boolean strzalastrzelona = false;
    public static volatile boolean battle1enable = false;
    public static volatile boolean battle2enable = false;
    public static volatile boolean chcerzucicava = false;
    public static volatile boolean conjureenable = false;
    public static volatile boolean atkCD = false;
    public static volatile boolean healCD = false;
    public static volatile boolean potCD = false;
    public static volatile int r = 0, g = 0, b = 0, sumared = 0, sumablue = 0, sumagreen = 0, sumared2 = 0, sumablue2 = 0, sumagreen2 = 0, counter = 0, wybor = 0;

    public static Robot robot, robots, roboth, robotm, robota, robotm2, robots2, roboth2;


    public static Instant poczatek, koniec;
    public static Duration czasWykonania;


    static {
        try {
            robot = new Robot();
            robots = new Robot();
            roboth = new Robot();
            robotm = new Robot();
            robota = new Robot();
            robots2 = new Robot();
            roboth2 = new Robot();
            robotm2 = new Robot();


        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public static boolean spirytus() throws InterruptedException {

        Color getSpirit = robots.getPixelColor(1813, 9);


//        if (counter % 10 == 0) {
//            System.out.println("Red   = " + getSpirit.getRed());
//            System.out.println("Green = " + getSpirit.getGreen());
//            System.out.println("Blue  = " + getSpirit.getBlue());
//            System.out.println("loop hp poty : " + counter);
//        }

        if ((getSpirit.getGreen() == 76) && (getSpirit.getRed() == 43) && (getSpirit.getBlue() == 152)) {
            spiritEnable = true;
        } else spiritEnable = false;


//        Color getPotCD2 = robots2.getPixelColor(529, 947);
//
//        if ((getPotCD2.getGreen() == 223) && (getPotCD2.getRed() == 223) && (getPotCD2.getBlue() == 223)) {
//            potCD = true;
//        } else potCD = false;


        if (spiritEnable) {
            robots.keyPress(KeyEvent.VK_F8);
            Thread.sleep(50);
            robots.keyRelease(KeyEvent.VK_F8);
            Thread.sleep(50);
        }


        return spiritEnable;

    }


    public static boolean heal() throws InterruptedException {


        Color getHpHigh = roboth.getPixelColor(1839, 9);


        if ((getHpHigh.getGreen() == 72) && (getHpHigh.getRed() == 38) && (getHpHigh.getBlue() == 148)) {
            hpEnable = true;
        } else hpEnable = false;

//        Color getHealCD = roboth2.getPixelColor(212, 974);
//
//
//                    if ((getHealCD.getGreen() == 252) && (getHealCD.getRed() == 234) && (getHealCD.getBlue() == 255)) {
//                healCD = true;
//            } else healCD = false;


        if (hpEnable) {
            roboth.keyPress(KeyEvent.VK_F5);
            Thread.sleep(50);
            roboth.keyRelease(KeyEvent.VK_F5);
            Thread.sleep(100);
        }


        return hpEnable;

    }


    public static boolean mananahigh() throws InterruptedException {

        Color getManaHigh = robotm.getPixelColor(1844, 26);


        if ((getManaHigh.getGreen() == 95) && (getManaHigh.getRed() == 89) && (getManaHigh.getBlue() == 106)) {
            manaHighEnable = true;
        } else manaHighEnable = false;

//        Color getPotCD = robotm2.getPixelColor(529, 947);
//
//                   if ((getPotCD.getGreen() == 223) && (getPotCD.getRed() == 223) && (getPotCD.getBlue() == 223)) {
//                potCD = true;
//           } else potCD = false;
        System.out.println(getManaHigh.getGreen());
        System.out.println(getManaHigh.getBlue());
        System.out.println(getManaHigh.getGreen());


        if (manaHighEnable && !spiritEnable) {
            robotm.keyPress(KeyEvent.VK_F10);
            Thread.sleep(150);
            robotm.keyRelease(KeyEvent.VK_F10);
            Thread.sleep(150);

        }

        return manaHighEnable;

    }


    public static boolean arrowsy() throws InterruptedException {

        Color getArrowsy = robota.getPixelColor(289, 973);


        if (!((getArrowsy.getGreen() == 162) && (getArrowsy.getRed() == 186) && (getArrowsy.getBlue() == 204))) {
            conjureenable = true;
        } else conjureenable = false;


        if (conjureenable && !spiritEnable) {
            robota.keyPress(KeyEvent.VK_F7);
            Thread.sleep(100);
            robota.keyRelease(KeyEvent.VK_F7);
            Thread.sleep(100);
        }

        return conjureenable;

    }


    public static void antiafk() throws InterruptedException {


        arrowsy();


        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        Thread.sleep(3000);
        arrowsy();
        robot.keyPress(KeyEvent.VK_F12);
        robot.keyRelease(KeyEvent.VK_F12);

        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);

        arrowsy();
        Thread.sleep(200000);
        arrowsy();

    }


    public static boolean atak() throws InterruptedException {


        Color getMasCd = robot.getPixelColor(317, 976);
        Color getMasRdy = robot.getPixelColor(342, 979);
        Color getMasRdy2 = robot.getPixelColor(370, 971);
        Color getAtkCD = robot.getPixelColor(186, 976);   //186 976
        Color getHealCD = robot.getPixelColor(212, 974);  // 212 974
        Color getPotCD = robot.getPixelColor(535, 931);  //535 931

        if (((getMasCd.getGreen() == 234) && (getMasCd.getRed() == 250) && (getMasCd.getBlue() == 108)) || ((getMasRdy.getGreen() == 205) && (getMasRdy.getRed() == 236) && (getMasRdy.getBlue() == 110)) || ((getMasRdy2.getGreen() == 227) && (getMasRdy2.getRed() == 255) && (getMasRdy2.getBlue() == 42))) {
            masCdEnable = true;
        } else masCdEnable = false;

        if (((getMasCd.getGreen() == 121) && (getMasCd.getRed() == 65) && (getMasCd.getBlue() == 165)) || ((getMasRdy.getGreen() == 83) && (getMasRdy.getRed() == 46) && (getMasRdy.getBlue() == 133)) || ((getMasRdy2.getGreen() == 89) && (getMasRdy2.getRed() == 43) && (getMasRdy2.getBlue() == 139))) {
            avaCdEnable = true;
        } else avaCdEnable = false;


        if ((getAtkCD.getGreen() == 121) && (getAtkCD.getRed() == 65) && (getAtkCD.getBlue() == 165)) {
            atkCD = true;
        } else atkCD = false;

        if ((getHealCD.getGreen() == 252) && (getHealCD.getRed() == 234) && (getHealCD.getBlue() == 255)) {
            healCD = true;
        } else healCD = false;

        if ((getPotCD.getGreen() == 21) && (getPotCD.getRed() == 21) && (getPotCD.getBlue() == 21)) {
            potCD = true;
        } else potCD = false;


        if (!masCdEnable && !avaCdEnable) {
            wybor = 0;
            chcerzucicava = true;
        }    // spamuj mas san
        if (masCdEnable && !avaCdEnable) {
            wybor = 1;
            chcerzucicava = false;
        }     // spamuj ava
        if (!masCdEnable && avaCdEnable) {
            wybor = 2;
            chcerzucicava = true;
        }       // spamuj mas san
        if (masCdEnable && avaCdEnable) {
            wybor = 3;
            chcerzucicava = true;
        }       // nic nie rob
        if (avaCdEnable) {
            chcerzucicava = true;
        }


//        Color getMasCd = robot.getPixelColor(317, 976);
//        Color getMasRdy = robot.getPixelColor(342, 979);
//        Color getMasRdy2 = robot.getPixelColor(370, 971);
        Color getBattle1 = robot.getPixelColor(16, 50);
        Color getBattle2 = robot.getPixelColor(16, 74);


        if (((getBattle1.getGreen() == 68) && (getBattle1.getRed() == 68) && (getBattle1.getBlue() == 68))) {
            battle1enable = true;
        } else battle1enable = false;

        if (((getBattle2.getGreen() == 69) && (getBattle2.getRed() == 69) && (getBattle2.getBlue() == 69))) {
            battle2enable = true;
        } else battle2enable = false;


        Color color, color2;
        for (int j = 1845; j < 1856; j = j + 1) {


            color = robot.getPixelColor(j, 336);

            r = color.getRed();
            g = color.getBlue();
            b = color.getGreen();

            sumablue = sumablue + b;
            sumagreen = sumagreen + g;
            sumared = sumared + r;

        }

        for (int k = 1845; k < 1856; k = k + 1) {


            color2 = robot.getPixelColor(k, 340);

            r = color2.getRed();
            g = color2.getBlue();
            b = color2.getGreen();

            sumablue = sumablue + b;
            sumagreen = sumagreen + g;
            sumared = sumared + r;

        }

//        if (((getMasCd.getGreen() == 234) && (getMasCd.getRed() == 250) && (getMasCd.getBlue() == 108))||((getMasRdy.getGreen() == 205) && (getMasRdy.getRed() == 236) && (getMasRdy.getBlue() == 110))||((getMasRdy2.getGreen() == 227) && (getMasRdy2.getRed() == 255) && (getMasRdy2.getBlue() == 42))) {
//            masCdEnable = true;
//        } else masCdEnable = false;
//
//        if (((getMasCd.getGreen() == 121) && (getMasCd.getRed() == 65) && (getMasCd.getBlue() == 165))||((getMasRdy.getGreen() == 83) && (getMasRdy.getRed() == 46) && (getMasRdy.getBlue() == 133))||((getMasRdy2.getGreen() == 89) && (getMasRdy2.getRed() == 43) && (getMasRdy2.getBlue() == 139))) {
//            avaCdEnable = true;
//        } else avaCdEnable = false;


        if (!(sumablue == sumablue2) || !(sumagreen == sumagreen2) || !(sumared == sumared2)) {
            System.out.println("strzelilem strzale w loopie : " + counter);
            strzalastrzelona = true;
        } else {
            strzalastrzelona = false;
        }


        sumablue2 = sumablue;
        sumagreen2 = sumagreen;
        sumared2 = sumared;

        sumablue = 0;
        sumagreen = 0;
        sumared = 0;


//        System.out.println("red : " + getMasCd.getRed()+ "green: " + getMasCd.getGreen()+ "blue: " +getMasCd.getBlue());
//
//        System.out.println(masCdEnable);


        if (!battle2enable) {


            if (strzalastrzelona && !atkCD) {


                switch (wybor) {
                    case 0:
                        robot.keyPress(KeyEvent.VK_F6);
                        robot.keyRelease(KeyEvent.VK_F6);
                        // Thread.sleep(50);

                        break;

                    case 1:

                        robot.keyPress(KeyEvent.VK_F3);
                        robot.keyRelease(KeyEvent.VK_F3);
                        // Thread.sleep(50);
                        break;

                    case 2:
                        robot.keyPress(KeyEvent.VK_F6);
                        robot.keyRelease(KeyEvent.VK_F6);
                        //     Thread.sleep(50);

                        break;
                    case 3:

                        break;


                }

                wybor = 3;


//
//
//                robot.keyPress(KeyEvent.VK_F6);
//                robot.keyRelease(KeyEvent.VK_F6);
//                Thread.sleep(100);
//
//
//                getMasCd = robot.getPixelColor(317, 976);
//                getMasRdy = robot.getPixelColor(342, 979);
//                getMasRdy2 = robot.getPixelColor(370, 971);
//
//
//                if (((getMasCd.getGreen() == 234) && (getMasCd.getRed() == 250) && (getMasCd.getBlue() == 108)) || ((getMasRdy.getGreen() == 205) && (getMasRdy.getRed() == 236) && (getMasRdy.getBlue() == 110)) || ((getMasRdy2.getGreen() == 227) && (getMasRdy2.getRed() == 255) && (getMasRdy2.getBlue() == 42))) {
//                    masCdEnable = true;
//                } else masCdEnable = false;
//
//
//                if (masCdEnable){
//                    strzalastrzelona=false;
//                }
//
//chcerzucicava=true;
//
//                robot.keyPress(KeyEvent.VK_F3);
//                robot.keyRelease(KeyEvent.VK_F3);
//                Thread.sleep(100);
//
//                getMasCd = robot.getPixelColor(317, 976);
//                getMasRdy = robot.getPixelColor(342, 979);
//                getMasRdy2 = robot.getPixelColor(370, 971);
//
//
//
//
//                if (((getMasCd.getGreen() == 121) && (getMasCd.getRed() == 65) && (getMasCd.getBlue() == 165)) || ((getMasRdy.getGreen() == 83) && (getMasRdy.getRed() == 46) && (getMasRdy.getBlue() == 133)) || ((getMasRdy2.getGreen() == 89) && (getMasRdy2.getRed() == 43) && (getMasRdy2.getBlue() == 139))) {
//                    avaCdEnable = true;
//                } else avaCdEnable = false;
//
//
//                if (avaCdEnable){
//                    strzalastrzelona=false;
//                    chcerzucicava=false;
//                }

//                   if (!masCdEnable) {
//
//
//                robot.keyPress(KeyEvent.VK_F6);
//                robot.keyRelease(KeyEvent.VK_F6);
//                Thread.sleep(100);
//
//
//          }
//
//
//
//
//
//            if (masCdEnable && !avaCdEnable) {
//
//
//                robot.keyPress(KeyEvent.VK_F3);
//                robot.keyRelease(KeyEvent.VK_F3);
//                Thread.sleep(100);
//               // System.out.println(masCdEnable);
//
//
//                getMasCd = robot.getPixelColor(317, 976);
//                getMasRdy = robot.getPixelColor(342, 979);
//                getMasRdy2 = robot.getPixelColor(370, 971);
//
//
//                if (((getMasCd.getGreen() == 234) && (getMasCd.getRed() == 250) && (getMasCd.getBlue() == 108)) || ((getMasRdy.getGreen() == 205) && (getMasRdy.getRed() == 236) && (getMasRdy.getBlue() == 110)) || ((getMasRdy2.getGreen() == 227) && (getMasRdy2.getRed() == 255) && (getMasRdy2.getBlue() == 42))) {
//                    masCdEnable = true;
//                } else masCdEnable = false;
//
//                if (((getMasCd.getGreen() == 121) && (getMasCd.getRed() == 65) && (getMasCd.getBlue() == 165)) || ((getMasRdy.getGreen() == 83) && (getMasRdy.getRed() == 46) && (getMasRdy.getBlue() == 133)) || ((getMasRdy2.getGreen() == 89) && (getMasRdy2.getRed() == 43) && (getMasRdy2.getBlue() == 139))) {
//                    avaCdEnable = true;
//                } else avaCdEnable = false;
//
//
//
//
//
//            }
//
//
//
//        }


            }
        }


        return strzalastrzelona;

    }

    public static String testpix() throws InterruptedException {

        Color testpix = robot.getPixelColor(289, 973);


        System.out.println("Red   = " + testpix.getRed());
        System.out.println("Green = " + testpix.getGreen());
        System.out.println("Blue  = " + testpix.getBlue());
        System.out.println("loop hp : " + counter);


        return "podkontrolo";

    }


    public static String nazwa = "";

    public static void zczytaj(String nazwain) {

        nazwa = nazwain;

        koniec = Instant.now();
        czasWykonania = Duration.between(poczatek, koniec);
        System.out.println(nazwa + czasWykonania.getSeconds() +
                " sek., " + czasWykonania.getNano() + "nanosek.");

    }


    public static void main(String[] args) throws InterruptedException {


//            Thread t = new Thread(new Runnable() {
//                public void run() {
//
//
//                    try {
//
//                        for (int i = 0; i < 999999999; i++) {
//
//
//
//                            System.out.println("loop heala" + i);
//
//
//                            heal();
//                        }
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//
//                }
//            });
//
//            t.start();
//
//            Thread t2 = new Thread(new Runnable() {
//                public void run() {
//
//
//                    try {
//
//                        for (int i = 0; i < 999999999; i++) {
//
//
//                            System.out.println("loop spirita" + i);
//
//
//
//                            spirytus();
//
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//
//            t2.start();
//
//            Thread t3 = new Thread(new Runnable() {
//                public void run() {
//
//
//                    try {
//
//                        for (int i = 0; i < 999999999; i++) {
//
//                            System.out.println("loop many" + i);
//
//
//                            mananahigh();
//
//
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//
//
//                }
//            });
//
//            t3.start();

//            Thread t4 = new Thread(new Runnable() {
//                public void run() {
//
//
//                    try {
//                        for (int i = 0; i < 999999999; i++) {
//
//
//                            System.out.println("loop arrowow" + i);
//
//
//                            arrowsy();
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            });
//
//            t4.start();

//            Thread t5 = new Thread(new Runnable() {
////            public void run() {
////
////
////                try {
////                    for (int i = 0; i < 999999999; i++) {
////
////
////                          System.out.println("loop arrowow" + i);
////
////
////                        atak();
////                    }
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
////
////            }
////        });
////
////            t5.start();


        Thread t6 = new Thread(new Runnable() {
            public void run() {


                try {
                    for (int i = 0; i < 999999999; i++) {


                        System.out.println("loop test" + i);


                        testpix();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        t6.start();


    }


}


