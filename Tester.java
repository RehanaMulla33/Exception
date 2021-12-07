package com.xworkz.Assignment3.Exception.Helmet;

import com.xworkz.Assignment3.Exception.Helmet.Service.HelmetService;
import com.xworkz.Assignment3.Exception.Helmet.Service.HelmetServiceImpl;
import com.xworkz.Assignment3.Exception.Helmet.dto.HelmetDto;

public class Tester {

	public static void main(String[] args) throws Throwable {
		System.out.println("Start of program");
		HelmetDto helmetDto=new HelmetDto("Vega",0,"black",'M',12.5);
		HelmetService helmetService=new HelmetServiceImpl();
		
		helmetService.validateSave(helmetDto);
		System.out.println("End of program");
		

	}

}
