package io.github.kloranthy.state;

import org.springframework.stereotype.Service;

import java.util.Timer;

import io.github.kloranthy.state.model.GameState;

/**
 */
@Service
public class GameStateService {

  private GameState gameState;
  private int tickRate;
  private int minTickRate;
  private int maxTickRate;
  private Timer timer;
  private GameUpdateTask updateTask;

  public GameStateService() {
    this.gameState = new GameState();
    this.timer = new Timer();
    this.updateTask = new GameUpdateTask();
    //
    this.minTickRate = 1;
    this.maxTickRate = 10;
    this.tickRate = 6;
  }

  public GameStateService setTickRate( int tickRate ) {
    if( tickRate < this.minTickRate ) {
      return this;
    }
    if( tickRate > this.maxTickRate ) {
      return this;
    }
    this.tickRate = tickRate;
    return this;
  }

  public int getTickRate() {
    return this.tickRate;
  }

  public GameState getGameState() {
    return this.gameState;
  }

  public void startGame() {
    this.gameState.startGame();
  }
  public void pauseGame() {
    this.gameState.pauseGame();
  }
  public void resumeGame() {
    this.gameState.resumeGame();
  }
  public void stopGame() {
    this.gameState.stopGame();
  }
}
