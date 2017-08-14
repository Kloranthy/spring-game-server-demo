package io.github.kloranthy.action;

import java.util.LinkedList;
import java.util.List;

/**
 */
public class ActionService {
  // action types
  private List<Action> currentActionQueue;
  private List<Action> nextActionQueue;

  public ActionService() {}

  public void submitAction( Action action ) {
    this.nextActionQueue.add( action );
  }

  public List<ActionResult> executeCommandQueue() {
    List<ActionResult> actionResults = new LinkedList<ActionResult>();
    while ( !this.currentActionQueue.isEmpty() ) {
      Action action = this.currentActionQueue.remove( 0 );
      actionResults.add( action.update() );
      // if action not finished, add to next queue
    }
    return actionResults;
  }
}
