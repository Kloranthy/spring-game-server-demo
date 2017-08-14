package io.github.kloranthy.action;

/**
 */
public class ActionType {
  private String actionTypeId;
  private String name;

  public ActionType() {}

  public String getActionTypeId() {
    return this.actionTypeId;
  }

  public ActionType setActionTypeId( String actionTypeId ) {
    this.actionTypeId = actionTypeId;
    return this;
  }

  public String getName() {
    return this.name;
  }

  public ActionType setName( String name ) {
    this.name = name;
    return this;
  }
}
