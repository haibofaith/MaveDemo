package controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import model.BookBean;
import model.StudentBean;
import model.User;
import model.UserInfo;
import service.MongoService;
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

	// 查询
	@RequestMapping(value = "m.do")
	public String viewAll6() {
		BookBean book = new BookBean();
//		book.setBookname("鹿鼎记");
//		book.setIdbook(2);
		System.out.println(userService.selectBookBean(book));
		return "successlogin";
	}
	
	// 批量删除
	@RequestMapping(value = "n.do")
	public String viewAll7() {
		BookBean book = new BookBean();
		book.setIdbook(2);
		book.setBookname("天龙八部");
//		book.setBookwriter("金庸");
		userService.updateBookListById(book);
		return "successlogin";
	}
	
	// 批量删除
	@RequestMapping(value = "o.do")
	public String viewAll8() {
//		BookBean book = new BookBean();
//		book.setIdbook(2);
//		book.setBookname("天龙八部");
////		book.setBookwriter("金庸");
		System.out.println(userService.selectBooklistById(1).toString());
		return "successlogin";
	}
	
	// 查询
	@RequestMapping(value = "p.do")
	public String viewAll9() {
//		BookBean book = new BookBean();
//		book.setIdbook(2);
//		book.setBookname("天龙八部");
////		book.setBookwriter("金庸");
		StudentBean studentBean = new StudentBean();
//		studentBean.setIdstudent(1);
		studentBean.setStudentname("bobo");
		System.out.println(userService.selectStudentBean(studentBean));
		return "successlogin";
	}
	

	@Resource
	private MongoService mongoService;	
	// 查询
	@RequestMapping(value = "q.do")
	public String viewAll10() {
		User user = new User();
		user.setName("hehe");
		user.setAge(30);
		mongoService.insert(user);
		return "successlogin";
	}
}
