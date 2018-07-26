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


public class Keytest implements NativeKeyListener {

    static Robot robot;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void nativeKeyPressed(NativeKeyEvent e) {

        if (e.getKeyCode() == NativeKeyEvent.VC_F6) {
            robot.keyPress(KeyEvent.VK_F10);
            robot.keyRelease(KeyEvent.VK_F10);
        }

    }

    public void nativeKeyReleased(NativeKeyEvent e) {
    }

    public void nativeKeyTyped(NativeKeyEvent e) {
    }

    public static void main(String[] args) {

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

        GlobalScreen.addNativeKeyListener(new Keytest());


    }

}
