package io.github.kloranthy.turn;

import java.util.List;

import io.github.kloranthy.action.ActionResult;
import io.github.kloranthy.action.ActionService;
import io.github.kloranthy.command.CommandResult;
import io.github.kloranthy.command.CommandService;
import io.github.kloranthy.turn.model.Turn;
import io.github.kloranthy.turn.model.TurnInfo;

/**
 */
public class TurnService {

  private CommandService commandService;
  private ActionService actionService;

  private TurnInfo turnInfo;
  private Turn currentTurn;

  TurnService() {}

  public TurnService setCommandService( CommandService commandService ) {
    this.commandService = commandService;
    return this;
  }

  public TurnService setActionService( ActionService actionService ) {
    this.actionService = actionService;
    return this;
  }

  public TurnInfo getTurnInfo() {
    return this.turnInfo;
  }

  public void calculateTurn() {
    Turn turn = new Turn();
    List<CommandResult> commandResults = this.commandService.executeCommandQueue();
    List<ActionResult> actionResults = this.actionService.executeCommandQueue();
    this.currentTurn = turn;

  }

  private void updateTurnInfo() {
    this.turnInfo.setCurrentTurnId( this.currentTurn.getTurnId() );
  }
}
