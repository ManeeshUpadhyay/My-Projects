package com.aartek.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class LoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("LoginInterceptor prHandle method () - 1");
		//UserLoginDto userLogin = (UserLoginDto) request.getSession().getAttribute("login");
		//response.sendRedirect("login.do");
		return true;

	}

	

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {

		System.out.println("LoginInterceptor postHandle () - 1");
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {

		System.out.println("LoginInterceptor afterCompletion () - 1");
	}

}
