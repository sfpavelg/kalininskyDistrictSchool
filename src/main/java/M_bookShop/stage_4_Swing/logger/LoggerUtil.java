package M_bookShop.stage_4_Swing.logger;

import java.util.logging.Logger;

public class LoggerUtil {

    private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

    public static void logInfo(String message) {
        LOGGER.info(message);
    }
}

