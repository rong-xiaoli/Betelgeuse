package top.rongxiaoli.betelgeuse.logging;

import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.Slf4JLoggerFactory;
import org.apache.commons.logging.impl.Log4JLogger;

public class Logger {
    private final LoggerFrameworkName frameworkName;
    private Log4JLogger log4JLogger;
    private SystemOutLogger systemOutLogger;
    private InternalLogger slf4JLogger;

    /**
     * Default logger construction.
     */
    public Logger() {
        this.frameworkName = LoggerFrameworkName.Slf4J;
        slf4JLogger = new Slf4JLoggerFactory().newInstance("Betelgeuse");    // Default is SystemOut logger.
        log(Level.Verbose, "Using Slf4J.");
        log(Level.Debug, "Logger initialized.");
    }

    /**
     * Customize logger framework.
     *
     * @param frameworkName The chosen framework.
     */
    public Logger(LoggerFrameworkName frameworkName) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger = new SystemOutLogger();
                break;
            case Log4J:
                log4JLogger = new Log4JLogger();
                break;
            case Slf4J:
                slf4JLogger = new Slf4JLoggerFactory().newInstance("Betelgeuse");
                break;
        }
        this.frameworkName = frameworkName;
        log(Level.Verbose, "Using " + frameworkName + ".");
        log(Level.Debug, "Logger initialized.");
    }

    public void log(Level logLevel, String message) {
        switch (logLevel) {
            case Verbose:
                verbose(message);
                break;
            case Debug:
                debug(message);
                break;
            case Info:
                info(message);
                break;
            case Warning:
                warning(message);
                break;
            case Error:
                error(message);
                break;
        }
    }

    public void log(Level logLevel, String message, Exception e) {
        switch (logLevel) {
            case Verbose:
                verbose(message, e);
                break;
            case Debug:
                debug(message, e);
                break;
            case Info:
                info(message, e);
                break;
            case Warning:
                warning(message, e);
                break;
            case Error:
                error(message, e);
                break;
        }
    }

    private void verbose(String message) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.verbose(message);
                break;
            case Log4J:
                log4JLogger.trace(message);
                break;
            case Slf4J:
                slf4JLogger.trace(message);
                break;
        }
    }

    private void verbose(String message, Exception e) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.verbose(message, e);
                break;
            case Log4J:
                log4JLogger.trace(message, e);
                break;
            case Slf4J:
                slf4JLogger.trace(message, e);
                break;
        }
    }

    private void debug(String message) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.debug(message);
                break;
            case Log4J:
                log4JLogger.debug(message);
                break;
            case Slf4J:
                slf4JLogger.debug(message);
                break;
        }
    }

    private void debug(String message, Exception e) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.debug(message, e);
                break;
            case Log4J:
                log4JLogger.debug(message, e);
                break;
            case Slf4J:
                slf4JLogger.debug(message, e);
                break;
        }
    }

    private void info(String message) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.info(message);
                break;
            case Log4J:
                log4JLogger.info(message);
                break;
            case Slf4J:
                slf4JLogger.info(message);
                break;
        }
    }

    private void info(String message, Exception e) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.info(message, e);
                break;
            case Log4J:
                log4JLogger.info(message, e);
                break;
            case Slf4J:
                slf4JLogger.info(message, e);
                break;
        }
    }

    private void warning(String message) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.warning(message);
                break;
            case Log4J:
                log4JLogger.warn(message);
                break;
            case Slf4J:
                slf4JLogger.warn(message);
                break;
        }
    }

    private void warning(String message, Exception e) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.warning(message, e);
                break;
            case Log4J:
                log4JLogger.warn(message, e);
                break;
            case Slf4J:
                slf4JLogger.warn(message, e);
                break;
        }
    }

    private void error(String message) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.error(message);
                break;
            case Log4J:
                log4JLogger.error(message);
                break;
            case Slf4J:
                slf4JLogger.error(message);
                break;
        }
    }

    private void error(String message, Exception e) {
        switch (frameworkName) {
            case SystemOut:
                systemOutLogger.error(message, e);
                break;
            case Log4J:
                log4JLogger.error(message, e);
                break;
            case Slf4J:
                slf4JLogger.error(message, e);
                break;
        }
    }

    /**
     * Level of logging.
     * <p>
     * Level Verbose: Additional information of debugging.
     * Level Debug: Debugging info.
     * Level Info: Basic logging level.
     * Level Warning: Some errors happened, but we can handle or some exploits cannot be performed.
     * Level Error: Some errors we cannot handle.
     */
    public enum Level {
        Verbose,
        Debug,
        Info,
        Warning,
        Error,
    }

    public enum LoggerFrameworkName {
        SystemOut,
        Log4J,
        Slf4J,
    }

}
