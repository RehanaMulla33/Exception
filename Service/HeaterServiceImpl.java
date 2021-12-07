package com.xworkz.Assignment4.WaterHeater.Service;

import com.xworkz.Assignment3.Exception.Helmet.exception.InvalidBrand;
import com.xworkz.Assignment4.WaterHeater.dto.HeaterDto;

public class HeaterServiceImpl implements HeaterService {
	boolean status=true;
	
	public HeaterServiceImpl() {
		System.out.println("Inside Heater service Impl");
	}
	
	public void validateService(HeaterDto dto) throws InvalidBrand{
		if(dto.getBrand()==null || dto.getBrand().length()<2) {
			InvalidBrand invalidBrand=new InvalidBrand("Plz enter valid brand");
			throw invalidBrand;
		}
		
	}

}
