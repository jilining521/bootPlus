package cn.imp.bootplus.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.imp.bootplus.config.WebMvcConfig;
import cn.imp.bootplus.entity.user.User;
import cn.imp.bootplus.util.StringUtils;

public class UrlInterceptor implements HandlerInterceptor {

	private static final Logger log = LoggerFactory.getLogger(UrlInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.info("---------------------开始进入请求地址拦截----------------------------");
		log.info("请求url:" + request.getRequestURI());
		User user=(User) request.getSession().getAttribute("loginUser");
		if(null!=user&&StringUtils.isNotBlank(user.getUserId())) {
				return true;
		}else {
			response.sendRedirect(WebMvcConfig.PROJECT_NAME+"/login");
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
