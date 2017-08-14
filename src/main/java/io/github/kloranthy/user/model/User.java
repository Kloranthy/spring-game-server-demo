package io.github.kloranthy.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 */
@Entity
public class User {
  @Id
  private String userId;
  private UserType userType;
  private String userName;

  public User() {
  }

  public String getUserId() {
    return userId;
  }

  public User setUserId( String userId ) {
    this.userId = userId;
    return this;
  }

  public UserType getUserType() {
    return this.userType;
  }

  public User setUserType( UserType userType ) {
    this.userType = userType;
    return this;
  }

  public String getUserName() {
    return this.userName;
  }

  public User setUserName( String userName ) {
    this.userName = userName;
    return this;
  }
}
