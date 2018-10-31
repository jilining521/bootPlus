package cn.imp.bootplus.controller.system;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import cn.imp.bootplus.config.WebMvcConfig;
import cn.imp.bootplus.entity.user.User;
import cn.imp.bootplus.service.user.IUserService;
import cn.imp.bootplus.util.MD5Utils;

@RestController
public class SystemController {

	@Autowired
	private IUserService userService;

	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("layout/login");
		return model;
	}

	@RequestMapping("/sign")
	public void sign(String userName, String password, HttpServletRequest request, HttpSession session,
			HttpServletResponse response) throws Exception {
		User condition = new User();
		condition.setUserName(userName);
		condition.setPassword(MD5Utils.md5Password(password));
		List<User> userList = userService.findUserByCondition(condition);
		if (userList.size() == 1) {
			session.setAttribute("loginUser", userList.get(0));
			response.sendRedirect(WebMvcConfig.PROJECT_NAME + "/index");
		} else {
			response.sendRedirect(WebMvcConfig.PROJECT_NAME + "/login");
		}
	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.setViewName("layout/index");
		return model;
	}

}
