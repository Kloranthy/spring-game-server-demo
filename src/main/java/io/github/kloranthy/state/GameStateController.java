package io.github.kloranthy.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

import io.github.kloranthy.state.model.GameState;
import io.github.kloranthy.turn.model.TurnInfo;
import io.github.kloranthy.turn.TurnService;

/**
 */
@RestController
public class GameStateController {

  @Autowired
  private GameStateService gameStateService;
  //
  private TurnService turnService;

  public GameStateController() {}

  // whether the game is running, paused, etc
  @RequestMapping(
    method = RequestMethod.GET,
    value = "/api/game-state"
  )
  public GameState getGameState() {
    GameState gameState = this.gameStateService.getGameState();
    return gameState;
  }
  // get the state of all the actions, entities, etc
  public void getCompleteStateOfWorld() {}
  // get the state of actions, entities, etc in a scene
  public void getCompleteStateOfScene() {}
  // get the turn result for a scene
  public void getTurnResultForScene(
    String turnId,
    String sceneId
  ) {}

  @RequestMapping(
    method = RequestMethod.GET,
    value = "/test"
  )
  public List<String> test() {
    List<String> testList = new LinkedList<String>();
    testList.add( "wtf" );
    testList.add( "wtf" );
    testList.add( "wtf" );
    testList.add( "wtf" );
    testList.add( "really tho" );
    return testList;
  }

  @RequestMapping(
    method = RequestMethod.GET,
    value = "/api/turn-info"
  )
  public TurnInfo getTurnInfo() {
    TurnInfo turnInfo = this.turnService.getTurnInfo();
    return turnInfo;
  }

  public void startGame() {
    this.gameStateService.startGame();
  }
  public void pauseGame() {
    this.gameStateService.pauseGame();
  }
  public void resumeGame() {
    this.gameStateService.resumeGame();
  }
  public void stopGame() {
    this.gameStateService.stopGame();
  }
}
