package cn.imp.bootplus.controller.system;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SystemController {
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView model = new ModelAndView();
		model.setViewName("layout/login");
		return model;
	}
	
	@RequestMapping("/sign")
	public ModelAndView sign() {
		ModelAndView model = new ModelAndView();
		model.setViewName("layout/index");
		return model;
	}
}
