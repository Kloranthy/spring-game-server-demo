package io.github.kloranthy.action;

/**
 */
public abstract class Action {
  private String actionId;
  private ActionType actionType;

  public Action() {}

  public String getActionId() {
    return this.actionId;
  }

  public Action setActionId( String actionId ) {
    this.actionId = actionId;
    return this;
  }

  public ActionType getActionType() {
    return this.actionType;
  }

  public Action setActionType( ActionType actionType ) {
    this.actionType = actionType;
    return this;
  }

  public abstract ActionResult update();
}
