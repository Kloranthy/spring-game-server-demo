package io.github.kloranthy.user.model;

/**
 */
public class UserJson {
  private String userId;
  private String userTypeId;
  private String userName;

  public UserJson() {}

  public String getUserId() {
    return this.userId;
  }

  public UserJson setUserId( String userId ) {
    this.userId = userId;
    return this;
  }

  public String getUserTypeId() {
    return this.userTypeId;
  }

  public UserJson setUserTypeId( String userTypeId ) {
    this.userTypeId = userTypeId;
    return this;
  }

  public String getUserName() {
    return this.userName;
  }

  public UserJson setUserName( String userName ) {
    this.userName = userName;
    return this;
  }
}
