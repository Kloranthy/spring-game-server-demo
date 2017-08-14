package io.github.kloranthy.user.model;

/**
 */
public class UserType {
  private String userTypeId;
  private String name;
  private String description;

  public UserType() {
  }

  public String getUserTypeId() {
    return this.userTypeId;
  }

  public UserType setUserTypeId( String userTypeId ) {
    this.userTypeId = userTypeId;
    return this;
  }

  public String getName() {
    return this.name;
  }

  public UserType setName( String name ) {
    this.name = name;
    return this;
  }

  public String getDescription() {
    return this.description;
  }

  public UserType setDescription( String description ) {
    this.description = description;
    return this;
  }
}
