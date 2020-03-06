package com.food.composition.calculate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * webMvc配置
 * 
 * @author H.R.ZHAO
 *
 * @version WebMvcConfig.java, v 0.1 2020年03月06日 11:48:14 H.R.ZHAO Exp $
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

	@Override
	protected void addViewControllers(ViewControllerRegistry registry) {
		// super.addViewControllers(registry);
		registry.addViewController("/").setViewName("login");
		registry.addViewController("/index.html").setViewName("login");
		registry.addViewController("/main.html").setViewName("dashboard");
	}

	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		// super.addInterceptors(registry);
		registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.htm", "/", "/user/login");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	}

	// @Bean
	// public WebMvcConfigurationSupport webMvcConfigurationSupport() {
	// WebMvcConfigurationSupport configurationSupport = new
	// WebMvcConfigurationSupport() {
	// @Override
	// protected void addViewControllers(ViewControllerRegistry registry) {
	// // super.addViewControllers(registry);
	// registry.addViewController("/").setViewName("login");
	// }
	// @Override
	// public void addInterceptors(InterceptorRegistry registry) {
	// //告知拦截器：/static/admin/** 与 /static/user/** 不需要拦截 （配置的是 路径）
	//
	// }
	// };
	// return configurationSupport;
	// }

	@Bean
	public LocaleResolver localeResolver() {

		return new WebLocaleResolver();
	}

}
