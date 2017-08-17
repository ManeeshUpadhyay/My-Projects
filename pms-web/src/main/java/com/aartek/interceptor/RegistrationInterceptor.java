package com.aartek.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RegistrationInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {

		System.out.println("Registration preHandle() interceptor - 2");
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {

		System.out.println("Regixstration postHandle() interceptor - 2");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("Registration afterCompletion() interceptor - 2");
	}

}
