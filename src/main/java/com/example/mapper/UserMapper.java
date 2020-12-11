package com.example.mapper;
 
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
 
/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
//    @Mapper
public interface UserMapper {
 
    User Sel(int id);
    User findByUsername(String username);

    User findUserById(String id);
}