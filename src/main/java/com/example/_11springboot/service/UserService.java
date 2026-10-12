package com.example._11springboot.service;

import com.example._11springboot.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void delete(Long id);
    void update(User user);
}