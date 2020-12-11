package com.example.service;
 
import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUserName());
    }
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }
}