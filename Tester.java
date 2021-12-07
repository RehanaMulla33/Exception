package com.xworkz.Assignment4.WaterHeater;

import com.xworkz.Assignment4.WaterHeater.Service.HeaterService;
import com.xworkz.Assignment4.WaterHeater.Service.HeaterServiceImpl;
import com.xworkz.Assignment4.WaterHeater.dto.HeaterDto;

public class Tester {

	public static void main(String[] args)throws Throwable {
		System.out.println("start of program");
		HeaterDto heaterdto = new HeaterDto("H", 600, "Copper", "1 Year");
		HeaterService heaterService = new HeaterServiceImpl();

		heaterService.validateService(heaterdto);
		System.out.println("End of program");

	}

}
