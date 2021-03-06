package com.food.composition.calculate.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Druid数据源配置: 设置数据<br>
 * 源为alibaba的Druid数据源，并加载配置中数据源相关配置
 * 
 * @author H.R.ZHAO
 *
 * @version DruidDatabaseConfig.java, v 0.1 2020年03月06日 11:47:09 H.R.ZHAO Exp $
 */
@Configuration
public class DruidDatabaseConfig {

	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource druid() {
		return new DruidDataSource();
	}

	// 配置Druid的监控
	// 1、配置一个管理后台的Servlet
	@Bean
	public ServletRegistrationBean statViewServlet() {
		ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		Map<String, String> initParams = new HashMap<>();

		initParams.put("loginUsername", "admin");
		initParams.put("loginPassword", "123456");
		initParams.put("allow", "");// 默认就是允许所有访问
		initParams.put("deny", "192.168.2.101");

		bean.setInitParameters(initParams);
		return bean;
	}

	// 2、配置一个web监控的filter
	@Bean
	public FilterRegistrationBean webStatFilter() {
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(new WebStatFilter());

		Map<String, String> initParams = new HashMap<>();
		initParams.put("exclusions", "*.js,*.css,/druid/*");

		bean.setInitParameters(initParams);

		bean.setUrlPatterns(Arrays.asList("/*"));

		return bean;
	}

}
