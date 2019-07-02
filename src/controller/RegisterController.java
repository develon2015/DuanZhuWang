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
        	// ����ע������
        	String name = request.getParameter("name"),
        			form_passwd = request.getParameter("form_passwd"),
        					form_passwd_two = request.getParameter("form_passwd_two");
        	SysUtil.log("ע��, �û���", name);
        	if (form_passwd.equals(form_passwd_two)) {
        		mv.addObject("register_result", "ע��ʧ��, ������������벻һ��");
        		return mv;
        	}
        }
        return mv;
    }
}