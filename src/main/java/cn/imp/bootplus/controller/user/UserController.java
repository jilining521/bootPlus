package cn.imp.bootplus.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;

import cn.imp.bootplus.entity.user.User;
import cn.imp.bootplus.service.user.IUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2018-10-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@GetMapping(value = "/show")
	public JSONObject testEnum() {
		Page<User> users = userService.selectPage(new Page<>(1, 10));
		JSONObject result = new JSONObject();
		result.put("users", users);

		return result;
	}

}
