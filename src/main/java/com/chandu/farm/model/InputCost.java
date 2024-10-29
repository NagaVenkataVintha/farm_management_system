package com.chandu.farm.model;

import java.util.Date;

import org.hibernate.annotations.ManyToAny;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputCost {
	
	@Id
	@GeneratedValue
	private Integer icId;
	private String icType;
	private String icDesc;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date icDate;
	
	
	public Integer getIcId() {
		return icId;
	}
	public void setIcId(Integer icId) {
		this.icId = icId;
	}
	public String getIcType() {
		return icType;
	}
	public void setIcType(String icType) {
		this.icType = icType;
	}
	public String getIcDesc() {
		return icDesc;
	}
	public void setIcDesc(String icDesc) {
		this.icDesc = icDesc;
	}
	public Date getIcDate() {
		return icDate;
	}
	public void setIcDate(Date icDate) {
		this.icDate = icDate;
	}
	
	
}
