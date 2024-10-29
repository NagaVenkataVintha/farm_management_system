package com.chandu.farm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.farm.exception.CropNotFoundException;
import com.chandu.farm.model.Crop;
import com.chandu.farm.repo.CropRepository;
import com.chandu.farm.service.ICropService;
@Service
public class CropServiceImpl implements ICropService{
	
	@Autowired
	private CropRepository cropRepo;
	
	
	@Override
	public Integer saveCrop(Crop c) {
		cropRepo.save(c);
		return c.getCrId();
	}
	
	@Override
	public List<Crop> getAllCrops() {
		return cropRepo.findAll();
	}
	
	@Override
	public Crop getOneCrop(Integer id) {
		Crop c=cropRepo.findById(id).orElseThrow(()->new CropNotFoundException("Crop '" + id + "' Not Found"));
		return c;
	}
	
	@Override
	public void updateCrop(Crop c) {
		if(cropRepo.existsById(c.getCrId()))
        {
			cropRepo.save(c);
		}
	
	}

	@Override
	public void deleteCrop(Integer id) {
		if(cropRepo.existsById(id))
		{
			cropRepo.deleteById(id);
		}
		
	}
	

}
