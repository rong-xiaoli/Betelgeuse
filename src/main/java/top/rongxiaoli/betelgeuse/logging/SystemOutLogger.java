package top.rongxiaoli.betelgeuse.logging;

import top.rongxiaoli.betelgeuse.utils.time.Clock;

import java.util.Arrays;

/**
 * My own logger, but it has been overwritten by Log4J?
 */
class SystemOutLogger {
    /**
     * Write a verbose level log.
     *
     * @param message Log message.
     */
    public void verbose(String message) {
        System.out.println(Clock.getPresentTime() + "[Betelgeuse.logger/VERB]" + message);
    }

    /**
     * Write a verbose level log, with an exception behind.
     *
     * @param message Log message.
     */
    public void verbose(String message, Exception e) {
        String builder = Clock.getPresentTime() + "[Betelgeuse.logger/VERB]" + message + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/VERB]" + "Also, an exception came out: " + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/VERB]" + e.toString() + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/VERB]" + "Stack trace:" + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/VERB]" + Arrays.toString(e.getStackTrace());
        System.out.println(builder);
    }

    /**
     * Write a debug level log.
     *
     * @param message Log message.
     */
    public void debug(String message) {
        System.out.println(Clock.getPresentTime() + "[Betelgeuse.logger/DEBG]" + message);
    }

    /**
     * Write a debug level log, with an exception behind.
     *
     * @param message Log message.
     */
    public void debug(String message, Exception e) {
        String builder = Clock.getPresentTime() + "[Betelgeuse.logger/DEBG]" + message + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/DEBG]" + "Also, an exception came out: " + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/DEBG]" + e.toString() + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/DEBG]" + "Stack trace:" + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/DEBG]" + Arrays.toString(e.getStackTrace());
        System.out.println(builder);
    }

    /**
     * Write an info level log.
     *
     * @param message Log message.
     */
    public void info(String message) {
        System.out.println(Clock.getPresentTime() + "[Betelgeuse.logger/INFO]" + message);
    }

    /**
     * Write an info level log, with an exception behind.
     *
     * @param message Log message.
     */
    public void info(String message, Exception e) {
        String builder = Clock.getPresentTime() + "[Betelgeuse.logger/INFO]" + message + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/INFO]" + "Also, an exception came out: " + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/INFO]" + e.toString() + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/INFO]" + "Stack trace:" + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/INFO]" + Arrays.toString(e.getStackTrace());
        System.out.println(builder);
    }

    /**
     * Write a warning level log.
     *
     * @param message Log message.
     */
    public void warning(String message) {
        System.out.println(Clock.getPresentTime() + "[Betelgeuse.logger/WARN]" + message);
    }

    /**
     * Write a warning level log, with an exception behind.
     *
     * @param message Log message.
     */
    public void warning(String message, Exception e) {
        String builder = Clock.getPresentTime() + "[Betelgeuse.logger/WARN]" + message + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/WARN]" + "Also, an exception came out: " + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/WARN]" + e.toString() + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/WARN]" + "Stack trace:" + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/WARN]" + Arrays.toString(e.getStackTrace());
        System.out.println(builder);
    }

    /**
     * Write an error level log.
     *
     * @param message Log message.
     */
    public void error(String message) {
        System.out.println(Clock.getPresentTime() + "[Betelgeuse.logger/ERROR]" + message);
    }

    /**
     * Write an error level log, with an exception behind.
     *
     * @param message Log message.
     */
    public void error(String message, Exception e) {
        String builder = Clock.getPresentTime() + "[Betelgeuse.logger/ERROR]" + message + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/ERROR]" + "Also, an exception came out: " + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/ERROR]" + e.toString() + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/ERROR]" + "Stack trace:" + "\n" +
                Clock.getPresentTime() + "[Betelgeuse.logger/ERROR]" + Arrays.toString(e.getStackTrace());
        System.out.println(builder);
    }

}
