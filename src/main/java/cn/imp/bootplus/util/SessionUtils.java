package cn.imp.bootplus.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * session工具类
 * @author 纪立宁
 * 2018年10月26日 09:58:08
 *
 */
public class SessionUtils {
	
	/**
	 * 	全局取得session方法
	 * 	纪立宁
	 * 2018年10月26日 10:02:14
	 * @return
	 */
	public static HttpSession getSession() {
		ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //获取到Request对象
        HttpServletRequest request = attrs.getRequest();
        //获取到Session对象
        HttpSession session = request.getSession();
        //获取到Response对象
        //HttpServletResponse response = attrs.getResponse();
        return session;
	}
}
