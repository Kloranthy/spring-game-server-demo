package io.github.kloranthy.user.repository;

import org.springframework.data.repository.CrudRepository;

import io.github.kloranthy.user.model.User;

/**
 */
public interface UserRepository
  extends CrudRepository<User, String> {

  User findUserByUserId( String userId );
  User findUserByUserName( String userName );
}
