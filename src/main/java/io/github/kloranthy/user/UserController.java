package io.github.kloranthy.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import io.github.kloranthy.user.model.User;
import io.github.kloranthy.user.model.UserCreationResult;

/**
 */
@RestController
public class UserController {
  @Autowired
  private UserService userService;

  public UserController() {
  }

  @RequestMapping(
    method = RequestMethod.POST,
    value = "/api/users"
  )
  public UserCreationResult createUser(
    @RequestBody User user
  ) {
    // I really hate using the same model for creation as use
    // but in the interest of keeping this simple I'm doing it
    System.out.println( "userId: " + user.getUserId() );
    System.out.println( "userName: " + user.getUserName() );
    UserCreationResult userCreationResult = this.userService.createUser( user );
    return userCreationResult;
  }

  @RequestMapping(
    method = RequestMethod.GET,
    value = "/api/users"
  )
  public List<User> getAllUsers() {
    List<User> users = this.userService.getAllUsers();
    return users;
  }

  @RequestMapping(
    method = RequestMethod.GET,
    value = "/api/user/{userId}"
  )
  public void getUserById(
    @PathVariable String userId
  ) {
    User user = this.userService.getUserById( userId );
    return;
  }

  public void getUserByUserName() {}

}
