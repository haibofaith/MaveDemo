package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.BookBean;
import model.UserInfo;
import service.UserService;

@Controller
public class EncodeController {
	@RequestMapping(value = "j.do")
	public String viewAll(UserInfo userInfo) {
		System.out.println(userInfo.getUsername());
		System.out.println(userInfo.getPassword());
		return "successlogin";
	}

	@Resource
	private UserService userService;

	@RequestMapping(value = "h.do")
	public String viewAll2(UserInfo userInfo) {
		System.out.println(userService.getUserInfo("bobo").toString());
		return "successlogin";
	}

	@RequestMapping(value = "i.do")
	public String viewAll3() {
		UserInfo user = new UserInfo();
		user.setId(2);
		user.setUsername("xiaoming");
		if (null != user)
			System.out.println(userService.getUserByUser(user).toString());
		return "successlogin";
	}

	@RequestMapping(value = "k.do")
	public String viewAll4() {
		userService.delete(2);
		return "successlogin";
	}

	// 批量删除
	@RequestMapping(value = "l.do")
	public String viewAll5() {
		List<Integer> ids = new ArrayList<>();
		ids.add(new Integer(3));
		ids.add(new Integer(4));
		ids.add(new Integer(5));
		ids.add(new Integer(6));
		userService.deleteBatch(ids);
		return "successlogin";
	}

	// 批量删除
	@RequestMapping(value = "m.do")
	public String viewAll6() {
		BookBean book = new BookBean();
//		book.setIdbook(1);
//		book.setBookname("鹿鼎记");
		System.out.println(userService.selectBookBean(book));
		return "successlogin";
	}
}
