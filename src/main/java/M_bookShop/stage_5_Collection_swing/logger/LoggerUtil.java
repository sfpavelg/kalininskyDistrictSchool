package M_bookShop.stage_5_Collection_swing.logger;

import java.util.logging.Logger;

public class LoggerUtil {

    private static final Logger LOGGER = Logger.getLogger(LoggerUtil.class.getName());

    public static void logInfo(String message) {
        LOGGER.info(message);
    }
}

