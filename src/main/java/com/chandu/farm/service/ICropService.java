package com.chandu.farm.service;

import java.util.List;

import com.chandu.farm.model.Crop;

public interface ICropService {
	
	Integer saveCrop(Crop c);
	void updateCrop(Crop c);
	void deleteCrop(Integer id);
	Crop getOneCrop(Integer id);
	List<Crop> getAllCrops();
	

}
