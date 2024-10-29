package com.chandu.farm.model;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Crop {
	@Id
	@GeneratedValue
	private Integer crId;
	private String crName;
	private Double crArea;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date plantingDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expectedHarvestingDate;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date actualHarvestingDate;
	
	
	
	public String getCrName() {
		return crName;
	}
	public void setCrName(String crName) {
		this.crName = crName;
	}
	public Integer getCrId() {
		return crId;
	}
	public void setCrId(Integer crId) {
		this.crId = crId;
	}
	public Double getCrArea() {
		return crArea;
	}
	public void setCrArea(Double crArea) {
		this.crArea = crArea;
	}
	public Date getPlantingDate() {
		return plantingDate;
	}
	public void setPlantingDate(Date plantingDate) {
		this.plantingDate = plantingDate;
	}
	public Date getExpectedHarvestingDate() {
		return expectedHarvestingDate;
	}
	public void setExpectedHarvestingDate(Date expectedHarvestingDate) {
		this.expectedHarvestingDate = expectedHarvestingDate;
	}
	public Date getActualHarvestingDate() {
		return actualHarvestingDate;
	}
	public void setActualHarvestingDate(Date actualHarvestingDate) {
		this.actualHarvestingDate = actualHarvestingDate;
	}
	

}
