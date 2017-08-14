package io.github.kloranthy.user.repository;

import org.springframework.data.repository.CrudRepository;

import io.github.kloranthy.user.model.UserType;

/**
 */
public interface UserTypeRepository
  extends CrudRepository<UserType, String> {

  UserType findUserTypeById( String userTypeId );
}
