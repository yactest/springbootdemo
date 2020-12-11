package com.example.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */
 
@RestController
@RequestMapping("/testBoot")
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @RequestMapping("getUser/{id}")
    @ResponseBody
    public JSONObject GetUser(@PathVariable int id){
        JSONObject jsonParam ;
        jsonParam = (JSONObject) JSONObject.toJSON(userService.Sel(id));
        System.out.println(jsonParam);
        return jsonParam;
    }




}