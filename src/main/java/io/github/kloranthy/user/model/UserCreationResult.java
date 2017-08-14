package io.github.kloranthy.user.model;

/**
 */
public class UserCreationResult {
  private boolean userCreated;
  private String userId;
  private String message;

  public UserCreationResult() {}

  public boolean isUserCreated() {
    return this.userCreated;
  }

  public UserCreationResult setUserCreated( boolean userCreated ) {
    this.userCreated = userCreated;
    return this;
  }

  public String getUserId() {
    return this.userId;
  }

  public UserCreationResult setUserId( String userId ) {
    this.userId = userId;
    return this;
  }

  public String getMessage() {
    return this.message;
  }

  public UserCreationResult setMessage( String message ) {
    this.message = message;
    return this;
  }
}
