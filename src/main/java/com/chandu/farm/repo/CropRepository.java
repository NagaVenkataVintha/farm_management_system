package com.chandu.farm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.farm.model.Crop;

public interface CropRepository extends JpaRepository<Crop, Integer> {

}
