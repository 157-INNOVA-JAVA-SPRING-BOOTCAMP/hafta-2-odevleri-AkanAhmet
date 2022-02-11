package com.akanahmet.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@IInterceptorInterface
@Interceptor
public class InterceptorMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("Previous state: " + context.getMethod().getName() + " " + context.getClass());
		
		boolean isLogin = false;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Sign up first !!! routing member page");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println(" After login : routing to Admin page");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return isContinue;
	}
	
}
