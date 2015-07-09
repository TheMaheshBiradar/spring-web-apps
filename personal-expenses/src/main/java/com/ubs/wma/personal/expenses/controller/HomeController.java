package com.ubs.wma.personal.expenses.controller;

import java.io.IOException;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ubs.wma.personal.expenses.domain.UserAccount;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(Map<String, Object> model) throws IOException{
		UserAccount userAccountForm = new UserAccount();
		model.put("userAccountForm", userAccountForm);
		return new ModelAndView("login");
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@Valid @ModelAttribute("userAccountForm") UserAccount userAccount,
			BindingResult result, Map<String, Object> model) throws IOException{
		
		if(result.hasErrors()){
			return new ModelAndView("login");
		}

		
		return new ModelAndView("home");
	}
}
