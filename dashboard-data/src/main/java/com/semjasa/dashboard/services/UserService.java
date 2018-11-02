package com.semjasa.dashboard.services;

import com.semjasa.dashboard.models.User;

import java.util.Set;

public interface UserService {

    User findByEmail(String email);

    User findById(Long Id);

    User save(User user);

    Set<User> findAll();
}
