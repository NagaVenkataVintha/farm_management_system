package com.chandu.farm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.farm.model.InputCost;
import com.chandu.farm.repo.InputCostRepository;
import com.chandu.farm.service.IInputCostService;

@Service
public class InputCostServiceImpl implements IInputCostService {
	@Autowired
	private InputCostRepository icrepo;

	@Override
	public Integer addInputCost(InputCost ic) {
		// TODO Auto-generated method stub
		icrepo.save(ic);
		return ic.getIcId();
	}

	@Override
	public void updateInputCost(InputCost ic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInputCost(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<InputCost> getAllCosts() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
