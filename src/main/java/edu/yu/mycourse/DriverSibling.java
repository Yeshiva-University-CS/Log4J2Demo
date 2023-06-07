package edu.yu.mycourse;

/** Class in the same package as Driver.
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DriverSibling {
  public DriverSibling() {
    logger.debug("a debug msg");
    logger.info("an info msg");
    logger.error("an error message");
  }

  private static final Logger logger =
    LogManager.getLogger(DriverSibling.class);
} // class
