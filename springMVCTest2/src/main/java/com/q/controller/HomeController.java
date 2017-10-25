package com.q.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.q.model.User;
import com.q.service.InService;
import com.q.model.Antique;
import com.q.model.Instrument;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(value="/toUser")
	public String test(){
		return "home";
	}
	
	@RequestMapping(value="/toAntique")
	public String toAntique(){
		return "antique";
	}
	
	@RequestMapping(value="/toSearch")
	public String toSearch(){
		return "select";
	}
	
	@RequestMapping(value="/form1")
	public String form(Model model,@RequestParam("name")String name,
					   @RequestParam("password")String password,
					   @RequestParam("age")int age){
		User user = new User();
		user.setName(name);
		user.setPassword(password);
		user.setAge(age);
		System.out.println(user);
		model.addAttribute(user);
		return "userInfo";
	}
	
	@RequestMapping(value="/antique")
	public String antique(@ModelAttribute(value="antique") Antique antique){
		return "antiqueInfo";
	}
	
	//model方法实现
	/*@RequestMapping(value="/select/{id}")
	public String select(Model model,@PathVariable("id") int id){
		System.out.println(1);
		for(Instrument instrument : service.init()){
			if(id == instrument.getId()){
				model.addAttribute("instrument",instrument);
			}else{
				continue;
			}
		}
		return "selectInfo";
	}*/
	
	//modelandview 方法实现
	/*@RequestMapping(value="/select/{id}")
	public ModelAndView select(@PathVariable("id") int id){
		System.out.println(1);
		for(Instrument instrument : service.init()){
			if(id == instrument.getId()){
				ModelAndView mav = new ModelAndView("selectInfo");
				 mav.addObject("instrument", instrument);
				 return mav;
			}else{
				continue;
			}
		}
		return null;
	}*/
	
	//servletAPI方法
	@RequestMapping(value="/select/{id}")
	public String select(HttpServletRequest request,@PathVariable("id") int id){
		System.out.println(1);
		for(Instrument instrument : service.init()){
			if(id == instrument.getId()){
				request.setAttribute("instrument",instrument);
			}else{
				continue;
			}
		}
		return "selectInfo";
	}
	
	@Autowired
	private InService service;
	
}
