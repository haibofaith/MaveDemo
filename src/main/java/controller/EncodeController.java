package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.UserInfo;

@Controller
public class EncodeController {
	@RequestMapping(value="j.do")
	public String viewAll(UserInfo userInfo) {
		System.out.println(userInfo.getUsername());
		System.out.println(userInfo.getPassword());
		return "successlogin";
	}
}
