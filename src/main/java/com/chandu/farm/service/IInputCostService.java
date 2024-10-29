package com.chandu.farm.service;

import java.util.List;

import com.chandu.farm.model.InputCost;

public interface IInputCostService {
	
	Integer addInputCost(InputCost ic);
	void updateInputCost(InputCost ic);
	void deleteInputCost(Integer id);
	List<InputCost> getAllCosts();

}
