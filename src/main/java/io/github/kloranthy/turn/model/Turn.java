package io.github.kloranthy.turn.model;

import java.util.Date;

/**
 */
public class Turn {
  private String turnId;
  private long availableOn;
  // initial state
  // end state
  // turn results

  public Turn() {
    this.availableOn = new Date().getTime();
  }

  public String getTurnId() {
    return this.turnId;
  }

  public Turn setTurnId( String turnId ) {
    this.turnId = turnId;
    return this;
  }

  public long getAvailableOn() {
    return this.availableOn;
  }
}
