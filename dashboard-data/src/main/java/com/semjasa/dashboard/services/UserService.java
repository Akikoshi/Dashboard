package com.semjasa.dashboard.services;

import com.semjasa.dashboard.models.User;

public interface UserService extends CrudService<User, Long> {

    User findByEmail(String email);

}
