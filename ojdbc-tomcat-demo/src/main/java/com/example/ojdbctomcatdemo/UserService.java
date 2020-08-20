package com.example.ojdbctomcatdemo;

import java.util.List;

public interface UserService {
    List findByName();
    String addUser(UserModel userModel);
    String updateUser(UserModel userModel);
}
