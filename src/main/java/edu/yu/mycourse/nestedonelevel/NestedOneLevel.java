package edu.yu.mycourse.nestedonelevel;

/** Class in a package nested under Driver's package
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NestedOneLevel {
  public NestedOneLevel() {
    logger.debug("a debug msg");
    logger.info("an info msg");
    logger.error("an error message");
  }

  private static final Logger logger =
    LogManager.getLogger(NestedOneLevel.class);
} // class
