package io.github.kloranthy.command;

import java.util.LinkedList;
import java.util.List;

/**
 */
public class CommandService {
  // commandTypesById
  private List<Command> currentCommandQueue;
  private List<Command> nextCommandQueue;

  public CommandService() {
    this.currentCommandQueue = new LinkedList<Command>();
    this.nextCommandQueue = new LinkedList<Command>();
  }

  public void getCommandTypes() {}

  public void submitCommand( Command command ) {
    this.nextCommandQueue.add( command );
  }

  public void swapCommandQueues() {
    List<Command> temp = this.currentCommandQueue;
    this.currentCommandQueue = this.nextCommandQueue;
    this.nextCommandQueue = temp;
  }

  // todo return list of command results from executing commands
  public List<CommandResult> executeCommandQueue() {
    List<CommandResult> commandResults = new LinkedList<CommandResult>();
    while( !this.currentCommandQueue.isEmpty() ) {
      Command command = this.currentCommandQueue.remove( 0 );
      // todo command result from command execution
      //commandResults.add(  );
      command.execute();
      // if command is not finished, add to next command queue
    }
    return commandResults;
  }
}
