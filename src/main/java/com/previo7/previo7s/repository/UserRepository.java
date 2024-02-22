package com.previo7.previo7s.repository;

import com.previo7.previo7s.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAllUsers();
    User findUserById(String id);
    Optional<User> findByEmail(String email);
    User createUser(User user);
    Boolean updateUser(String id, User user);
    Boolean deleteUser(String id);
}
