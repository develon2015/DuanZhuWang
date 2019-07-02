package controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import common.SysUtil;

@Controller
public class RegisterController {
	
    @RequestMapping("/user/register")
    public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response) {
    	try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
        SysUtil.log("Hello");
        ModelAndView mv = new ModelAndView("register.jsp");
        String req = request.getParameter("request");
        if (req != null && "register".equals(req)) {
        	// 处理注册请求
        	String name = request.getParameter("name"),
        			form_passwd = request.getParameter("form_passwd"),
        					form_passwd_two = request.getParameter("form_passwd_two");
        	SysUtil.log("注册, 用户名", name);
        	if (form_passwd.equals(form_passwd_two)) {
        		mv.addObject("register_result", "注册失败, 两次输入的密码不一致");
        		return mv;
        	}
        }
        return mv;
    }
}