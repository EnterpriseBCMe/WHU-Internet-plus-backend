package org.whu.backend.dao;

import org.springframework.data.repository.CrudRepository;

import org.whu.backend.pojo.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}