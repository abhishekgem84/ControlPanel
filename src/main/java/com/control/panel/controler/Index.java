package com.control.panel.controler;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.control.panel.controler.pojo.Login;

@Controller
public class Index {
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@PostMapping(value="/valLogin")
	public ModelAndView validateLogin(Model model,@Valid Login login,BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
	       	mav.setViewName("login");
	        mav.addObject("login", login);
	        return mav;
	    }		
		mav.setViewName("redirect:welcome");
		//System.out.println(login.getUserName());
		//model.addAttribute("login", login);
		return mav;//"redirect:welcome";
	}
	
	@GetMapping("/welcome")
	public String welcomePage(Model model) {
		return "welcome";
	}
}
