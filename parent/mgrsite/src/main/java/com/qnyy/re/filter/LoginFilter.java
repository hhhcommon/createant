package com.qnyy.re.filter;


import com.qnyy.re.controller.base.BaseController;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**登录验证过滤器(废弃  com.fh.interceptor替代)
 * @author FH QQ 313596790[青苔]
 *
 */
public class LoginFilter extends BaseController implements Filter {

	/**
	 * 初始化
	 */
	public void init(FilterConfig fc) throws ServletException {
		//FileUtil.createDir("d:/FH/topic/");
	}
	
	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		chain.doFilter(req, res); // 调用下一过滤器
	}

}
