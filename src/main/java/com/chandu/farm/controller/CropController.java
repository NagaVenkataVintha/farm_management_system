package com.chandu.farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chandu.farm.model.Crop;
import com.chandu.farm.service.ICropService;

@Controller
@RequestMapping("/crop")
public class CropController {
	
	@Autowired
	private ICropService cropService;
	
	//Crop Registration
	@GetMapping("/register")
	public String showReg(Model model)
	{
		model.addAttribute("crop", new Crop());
		return "CropReg";
	}
	
	//save the crop
	@PostMapping("/save")
	public String savecrop(@ModelAttribute Crop crop,
			Model model)
	{
		Integer cropId=cropService.saveCrop(crop);
		System.out.println(cropId);
		String message="Crop Saved and ID is " + cropId;
		model.addAttribute("message", message);
		return "CropReg";
	}
	
	//get all crops
	@GetMapping("/all-crops")
	public String allCrops(Model model)
	{
		List<Crop> crops=cropService.getAllCrops();
		model.addAttribute("crops", crops);
		return "CropData";
		
	}
	
	//show edit page
	@GetMapping("/edit-crop/{id}")
	public String showEdit(@PathVariable ( value = "id") Integer crid , Model model)
	{
		//get crop by id
		Crop crop=cropService.getOneCrop(crid);
		model.addAttribute("crop", crop);
		  return "CropEdit";
		
	}
	
	//delete crop
	@GetMapping("/delete-crop/{id}")
	public String deletecrop(@PathVariable ( value = "id") Integer crid)
	{
		cropService.deleteCrop(crid);
		return "redirect:/crop/all-crops";
	}
	
	
}
