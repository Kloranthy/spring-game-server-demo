package io.github.kloranthy.command;

/**
 */
public abstract class Command {
  private String userId;
  private String commandId;
  private CommandType commandType;

  public Command() {}

  // todo command result
  public abstract void execute();
}
