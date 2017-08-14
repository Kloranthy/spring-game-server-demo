package io.github.kloranthy.state;

import java.util.TimerTask;

import io.github.kloranthy.turn.TurnService;

/**
 */
public class GameUpdateTask
  extends TimerTask {

  private GameStateService gameStateService;
  private TurnService turnService;

  public GameUpdateTask() {}

  public GameUpdateTask setGameStateService( GameStateService gameStateService ) {
    this.gameStateService = gameStateService;
    return this;
  }

  public GameUpdateTask setTurnService( TurnService turnService ) {
    this.turnService = turnService;
    return this;
  }

  @Override
  public void run() {
//    GameState gameState = this.gameStateService.getGameState();
//    if( gameState.getGameState().equals( GameState.RUNNING ) ) {
//      this.turnService.calculateTurn();
//    }
  }
}
