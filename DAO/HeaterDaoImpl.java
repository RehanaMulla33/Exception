package com.xworkz.Assignment4.WaterHeater.dao;

import com.xworkz.Assignment4.WaterHeater.dto.HeaterDto;

public class HeaterDaoImpl implements HeaterDao {
	HeaterDto heater[]=new HeaterDto[10];
	int index=10;

	public HeaterDaoImpl() {
		System.out.println("inside Water Heater dao Impl");
	}
	public void save(HeaterDto dto) {
		System.out.println("Inside save method;");
		heater[index] = dto;
		}
	public void display() {
		for(int i=0;i<index;i++) {
			System.out.println(heater[i].getBrand());
			System.out.println(heater[i].getPrice());
			System.out.println(heater[i].getCategory());
			System.out.println(heater[i].getWarranty());
		}
		
			}
		
		
	}


