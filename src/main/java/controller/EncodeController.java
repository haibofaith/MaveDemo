package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.UserInfo;
import service.UserService;

@Controller
public class EncodeController {
	@RequestMapping(value="j.do")
	public String viewAll(UserInfo userInfo) {
		System.out.println(userInfo.getUsername());
		System.out.println(userInfo.getPassword());
		return "successlogin";
	}
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="h.do")
	public String viewAll2(UserInfo userInfo) {
		System.out.println(userService.getUserInfo("bobo").toString());
		return "successlogin";
	}
	
	@RequestMapping(value="i.do")
	public String viewAll3() {
		UserInfo user = new UserInfo();
		user.setId(2);
		user.setUsername("xiaoming");
		System.out.println(userService.getUserByUser(user).toString());
		return "successlogin";
	}
}
