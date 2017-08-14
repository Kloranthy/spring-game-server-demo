package io.github.kloranthy.state.model;

/**
 */
public class GameState {
  public static final String RUNNING = "running";
  public static final String PAUSED = "paused";
  public static final String STOPPED = "stopped";
  private String gameState;

  public GameState() {
    this.gameState = GameState.STOPPED;
  }

  public String getGameState() {
    return this.gameState;
  }

  public void startGame() {
    if( !this.gameState.equals( GameState.STOPPED ) ) {
      return;
    }
    this.gameState = GameState.RUNNING;
  }

  public void pauseGame() {
    if( !this.gameState.equals( GameState.RUNNING ) ) {
      return;
    }
    this.gameState = GameState.PAUSED;
  }

  public void resumeGame() {
    if( !this.gameState.equals( GameState.PAUSED ) ) {
      return;
    }
    this.gameState = GameState.RUNNING;
  }

  public void stopGame() {
    this.gameState = GameState.STOPPED;
  }
}
