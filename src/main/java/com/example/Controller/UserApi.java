package com.example.Controller;

import com.alibaba.fastjson.JSONObject;
import com.example.Interceptor.UserLoginToken;
import com.example.entity.User;
import com.example.service.TokenService;
import com.example.service.UserService;
import com.example.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserApi {
	@Autowired
	UserService userService;
	@Autowired
	TokenService tokenService;

	// 登录
	@RequestMapping(value = "/login" ,method = RequestMethod.GET)
	public Object login(User user, HttpServletResponse response) {
		JSONObject jsonObject = new JSONObject();
		User userForBase = new User();
		userForBase.setId(userService.findByUsername(user).getId());
		userForBase.setUserName(userService.findByUsername(user).getUserName());
		userForBase.setPassWord(userService.findByUsername(user).getPassWord());
		if (!userForBase.getPassWord().equals(user.getPassWord())) {
			jsonObject.put("message", "登录失败,密码错误");
			return jsonObject;
		} else {
			String token = tokenService.getToken(userForBase);
			jsonObject.put("token", token);

			Cookie cookie = new Cookie("token", token);
			cookie.setPath("/");
			response.addCookie(cookie);

			return jsonObject;

		}
	}
	/***
	 * 这个请求需要验证token才能访问
	 * 
	 * @author: qiaoyn
	 * @date 2019/06/14
	 * @return String 返回类型
	 */
	@UserLoginToken
	@RequestMapping(value = "/getMessage" ,method = RequestMethod.GET)
	public String getMessage() {

		// 取出token中带的用户id 进行操作
		System.out.println(TokenUtil.getTokenUserId());

		return "您已通过验证";
	}
}