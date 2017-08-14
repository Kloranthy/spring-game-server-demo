package io.github.kloranthy.command;

import io.github.kloranthy.action.ActionService;
import io.github.kloranthy.counter.CounterService;

/**
 */
public class DecrementCounterCommand {

  private CounterService counterService;
  private ActionService actionService;
  private String counterId;

  public DecrementCounterCommand() {}

  public DecrementCounterCommand setCounterService( CounterService counterService ) {
    this.counterService = counterService;
    return this;
  }

  public DecrementCounterCommand setActionService( ActionService actionService ) {
    this.actionService = actionService;
    return this;
  }

  public DecrementCounterCommand setCounterId( String counterId ) {
    this.counterId = counterId;
    return this;
  }

  public String getCounterId() {
    return this.counterId;
  }
}
