package scratch1.subpackage;

import java.util.logging.Logger;

public class Thing {
    private static final Logger log = Logger.getLogger(Thing.class.getName());
    public static void performSomeAction() {
        log.severe("Thing-performSomeAction sever log message.");
        log.warning("Thing-performSomeAction warning log message.");
        log.info("Thing-performSomeAction fine log message.");
        log.config("Thing-performSomeAction config log message.");
        log.fine("Thing-performSomeAction fine log message.");
    }
}
