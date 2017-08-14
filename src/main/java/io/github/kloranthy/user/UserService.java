package io.github.kloranthy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import io.github.kloranthy.user.model.User;
import io.github.kloranthy.user.model.UserCreationResult;
import io.github.kloranthy.user.model.UserJson;
import io.github.kloranthy.user.model.UserType;
import io.github.kloranthy.user.repository.UserRepository;
import io.github.kloranthy.user.repository.UserTypeRepository;

/**
 */
@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private UserTypeRepository userTypeRepository;

  public UserService() {
    UserType admin = new UserType()
      .setUserTypeId( "admin" )
      .setName( "admin" )
      .setDescription( "administrator" );
    UserType client = new UserType()
      .setUserTypeId( "client" )
      .setName( "client" )
      .setDescription( "client" );
    this.userTypeRepository.save( admin );
    this.userTypeRepository.save( client );
  }

  public List<User> getAllUsers() {
    List<User> users = new LinkedList<User>();
    this.userRepository
      .findAll()
      .forEach( users::add );
    return users;
  }

  public User getUserById( String userId ) {
    User user = this.userRepository.findUserByUserId( userId );
    return user;
  }

  public User getUserByUserName( String userName ) {
    User user = this.userRepository.findUserByUserName( userName );
    return user;
  }

  public UserCreationResult createUser( User user ) {
    UserCreationResult userCreationResult = new UserCreationResult();
    String userId = user.getUserId();
    if ( userId != null && !userId.isEmpty() ) {
      userCreationResult.setUserCreated( false )
                        .setMessage( "userId must be set by server" )
                        .setUserId( "" );
      return userCreationResult;
    }
    String userName = user.getUserName();
    if ( userName == null || userName.isEmpty() ) {
      userCreationResult.setUserCreated( false )
                        .setMessage( "userName is required" )
                        .setUserId( "" );
      return userCreationResult;
    }
    if ( this.userRepository.findUserByUserName( userName ) != null ) {
      userCreationResult.setUserCreated( false )
                        .setMessage( "userName is taken" )
                        .setUserId( "" );
      return userCreationResult;
    }
    userId = UUID.randomUUID().toString();
    user.setUserId( userId );
    this.userRepository.save( user );
    userCreationResult.setUserCreated( true )
                      .setUserId( userId )
                      .setMessage( "user created successfully" );
    return userCreationResult;
  }

  public User userFromUserJson( UserJson userJson ) {
    User user = new User();
    return user;
  }

  public UserJson userToUserJson( User user ) {
    UserJson userJson = new UserJson();
    userJson
      .setUserId( user.getUserId() )
      .setUserTypeId(
        user
          .getUserType()
          .getUserTypeId()
      )
      .setUserName( user.getUserName() );
    return userJson;
  }
}
