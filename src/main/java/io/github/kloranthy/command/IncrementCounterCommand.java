package io.github.kloranthy.command;

import io.github.kloranthy.action.ActionService;
import io.github.kloranthy.counter.CounterService;

/**
 */
public class IncrementCounterCommand {

  private CounterService counterService;
  private ActionService actionService;
  private String counterId;

  public IncrementCounterCommand() {}

  public IncrementCounterCommand setCounterService( CounterService counterService ) {
    this.counterService = counterService;
    return this;
  }

  public IncrementCounterCommand setActionService( ActionService actionService ) {
    this.actionService = actionService;
    return this;
  }

  public String getCounterId() {
    return this.counterId;
  }

  public IncrementCounterCommand setCounterId( String counterId ) {
    this.counterId = counterId;
    return this;
  }
}
