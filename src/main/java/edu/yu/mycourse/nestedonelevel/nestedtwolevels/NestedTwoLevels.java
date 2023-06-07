package edu.yu.mycourse.nestedonelevel.nestedtwolevels;

/** Class in a package nested two levels under Driver's package
 */

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NestedTwoLevels {
  public NestedTwoLevels() {
    logger.debug("a debug msg");
    logger.info("an info msg");
    logger.error("an error message");
  }

  private static final Logger logger =
    LogManager.getLogger(NestedTwoLevels.class);
} // class
