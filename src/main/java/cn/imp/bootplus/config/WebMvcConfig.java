package cn.imp.bootplus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import cn.imp.bootplus.interceptor.UrlInterceptor;

@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {
	
	public static final String PROJECT_NAME = "/bootPlus"; //项目名称
	private static final String VIEW_PREFIX = "/view/";// 视图前缀
	private static final String VIEW_SUFFIX = ".jsp";// 视图后缀
	private static final String VIEW_CONTENT_TYPE = "text/html;charset=UTF-8";// 视图的内容类型。

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new UrlInterceptor()).addPathPatterns("/**")
			.excludePathPatterns("/static/**","/login","*.js","*.css","/sign");  //设置排除的路径
	}

	/**
	 * 配置 视图解析器
	 * 
	 * @return
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setCache(true);
		resolver.setPrefix(VIEW_PREFIX);
		resolver.setSuffix(VIEW_SUFFIX);
		resolver.setExposeContextBeansAsAttributes(true);
		resolver.setContentType(VIEW_CONTENT_TYPE);
		return resolver;
	}
	
	/**
	 * 设置欢迎页面
	 * 2018年10月26日 15:21:48
	 */
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index"); //如果访问跟路径，则自动定位到index页面
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    } 

	/**
	 * 设置静态资源
	 */
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}

	/**
	 * 配置静态资源处理
	 * 
	 * @param configurer
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

}
