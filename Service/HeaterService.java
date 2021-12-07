package com.xworkz.Assignment4.WaterHeater.Service;

import com.xworkz.Assignment3.Exception.Helmet.exception.InvalidBrand;
import com.xworkz.Assignment4.WaterHeater.dto.HeaterDto;

public interface HeaterService {
	public void validateService(HeaterDto dto)throws InvalidBrand;

}
