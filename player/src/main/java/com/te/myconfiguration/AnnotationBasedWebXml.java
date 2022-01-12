package com.te.myconfiguration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AnnotationBasedWebXml extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AnnotationBasedDispatcherServlet.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
