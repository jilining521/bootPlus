package cn.imp.bootplus.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class WebMvcControllerAdvice {
	@ExceptionHandler(Exception.class)
	public ModelAndView error(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView model = new ModelAndView("layout/404");
		return model;
	}
	
}
