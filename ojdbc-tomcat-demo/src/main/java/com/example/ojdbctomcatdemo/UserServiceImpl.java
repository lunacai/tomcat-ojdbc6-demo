package com.example.ojdbctomcatdemo;

import com.pamirs.pradar.Pradar;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List findByName() {
        return userDao.findByName();
    }

    @Override
    public String addUser(UserModel userModel) {
        System.out.println(">>>>>>>>>>>>>>>>>."+Pradar.isClusterTest());
        return userDao.addUser(userModel);
    }

    @Override
    public String updateUser(UserModel userModel) {
        System.out.println(">>>>>>>>>>>>>>>>>."+Pradar.isClusterTest());
        return userDao.updateUser(userModel);
    }
}