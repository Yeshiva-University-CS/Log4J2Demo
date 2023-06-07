package edu.yu.mycourse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import edu.yu.mycourse.nestedonelevel.NestedOneLevel;
import edu.yu.mycourse.nestedonelevel.nestedtwolevels.NestedTwoLevels;

public class Driver {
  public final static void main(final String[] args) {
    logger.debug("a debug msg");
    logger.info("an info msg");
    logger.error("an error message");

    final DriverSibling driversibling = new DriverSibling();
    final NestedOneLevel nestedonelevel = new NestedOneLevel();
    final NestedTwoLevels nestedtwolevels = new NestedTwoLevels();
  } // main

  private static final Logger logger = LogManager.getLogger(Driver.class);
} // class

