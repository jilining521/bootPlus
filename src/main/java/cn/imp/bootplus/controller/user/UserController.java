package cn.imp.bootplus.controller.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;

import cn.imp.bootplus.entity.user.User;
import cn.imp.bootplus.service.user.IUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jln
 * @since 2018-10-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

	protected static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private IUserService userService;

	@GetMapping(value = "/show")
	public JSONObject show() {
		Page<User> users = userService.selectPage(new Page<>(1, 10));
		JSONObject result = new JSONObject();
		result.put("users", users);
		logger.info("访问Controller");
		return result;
	}
	
	@RequestMapping(value = "/index")
	public ModelAndView index() throws Exception {
		ModelAndView mvc = new ModelAndView("index");
		mvc.addObject("hello", "hello world");
		userService.getUser("");
		return mvc;
	}

}
