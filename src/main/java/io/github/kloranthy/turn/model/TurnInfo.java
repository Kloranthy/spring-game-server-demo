package io.github.kloranthy.turn.model;

/**
 */
public class TurnInfo {

  private String currentTurnId;
  private String previousTurnId;
  private int currentTurnAvailableOn;
  private int nextTurnAvailableOn;

  TurnInfo() {}

  public String getCurrentTurnId() {
    return this.currentTurnId;
  }

  public TurnInfo setCurrentTurnId( String currentTurnId ) {
    this.currentTurnId = currentTurnId;
    return this;
  }

  public String getPreviousTurnId() {
    return this.previousTurnId;
  }

  public TurnInfo setPreviousTurnId( String previousTurnId ) {
    this.previousTurnId = previousTurnId;
    return this;
  }

  public int getCurrentTurnAvailableOn() {
    return this.currentTurnAvailableOn;
  }

  public TurnInfo setCurrentTurnAvailableOn( int currentTurnAvailableOn ) {
    this.currentTurnAvailableOn = currentTurnAvailableOn;
    return this;
  }

  public int getNextTurnAvailableOn() {
    return this.nextTurnAvailableOn;
  }

  public TurnInfo setNextTurnAvailableOn( int nextTurnAvailableOn ) {
    this.nextTurnAvailableOn = nextTurnAvailableOn;
    return this;
  }
}
