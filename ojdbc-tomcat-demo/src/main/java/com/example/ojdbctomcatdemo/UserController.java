package com.example.ojdbctomcatdemo;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUserName")
    public List getUser() {
        return userService.findByName();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserModel userModel) {
        return userService.addUser(userModel);
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody UserModel userModel) {
        return userService.updateUser(userModel);
    }
}