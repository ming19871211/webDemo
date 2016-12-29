package com.mqm.biz.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mqm.biz.model.HStudent;
import com.mqm.biz.model.Student;
import com.mqm.biz.service.UserService;

/**
 * <p>HelloWorld控制层</p>
 * @author meiqiming
 * @since 1.0 create 2016-11-4
 * @version 1.0
 */
@Controller
public class HelloWorldController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/helloWorld.mqm")
    public String helloWorld(HttpServletRequest request,HttpServletResponse response,Model model) {
        model.addAttribute("message", "Hello World!!!,sessionId:"+request.getSession().getId()+",port:"+
    request.getServerPort());
        model.addAttribute("userMap",userService.getUserToMap("402880f25450a9ad015450ae87cd0002"));
        model.addAttribute("user",userService.getUser("402880f25450a9ad015450ae87cd0002"));
        model.addAttribute("hUser",userService.getHUser("402880f25450a9ad015450ae87cd0002"));
        return "/WEB-INF/helloWorld.jsp";
    }
	@RequestMapping("/save.mqm")
	public void save(HttpServletResponse response){
		try {
			Student s = new Student();
			s.setSno("01");
			s.setSdept("hh");
			s.setSsex("g");
			s.setSname("hello");
			s.setSage((short)20);		
			HStudent hs = new HStudent();
			hs.setSno("02h");
			hs.setSdept("2h_hh");
			hs.setSsex("g");
			hs.setSname("2H_hello");
			hs.setSage((short)20);	
			userService.saveStudy(s, hs);
			response.getOutputStream().print("save ok");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
