package me.wanpin.springboot.service;

import me.wanpin.springboot.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUseras();

    User updateUser(User user);

    void deleteUser(Long userId);
}
