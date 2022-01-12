package com.te.myservletconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.te")
@EnableWebMvc // This is equal to <mvc:annotation-driven/>
public class AnnotationBasedDispatcherServlet {

	@Bean
	public LocalEntityManagerFactoryBean getFactory() {
		LocalEntityManagerFactoryBean beanFactory = new LocalEntityManagerFactoryBean();
		beanFactory.setPersistenceUnitName("Jiggs");
		return beanFactory;
	}

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver myViewResolver = new InternalResourceViewResolver();
		myViewResolver.setPrefix("/WEB-INF/views/");
		myViewResolver.setSuffix(".jsp");
		return myViewResolver;
	}

}
