package com.chandu.farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chandu.farm.model.InputCost;
import com.chandu.farm.service.IInputCostService;

@Controller
@RequestMapping("/inputcost")
public class InputCostController {
	@Autowired
	private IInputCostService icservice;
	
	@GetMapping("/show")
	public String showForm(Model model) {
		model.addAttribute("inputCost", new InputCost());
		return "EnterCost";
	}
	
	@PostMapping("/add-cost")
	public String addCost(@ModelAttribute InputCost inputCost,
			              Model model)
	{
		Integer id=icservice.addInputCost(inputCost);
		String message="InputCost added with id :" + id;
		model.addAttribute("message", message);
		return "EnterCost";
		
	}
	
	
}
