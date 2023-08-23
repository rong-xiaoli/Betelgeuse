package top.rongxiaoli.betelgeuse.utils.time;

import java.text.SimpleDateFormat;

// Todo
public class Clock {
    /**
     * What time is it now?
     *
     * @return Current time in hh:mm:ss.
     */
    public static String getPresentTime() {
        return new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis());
    }

}
