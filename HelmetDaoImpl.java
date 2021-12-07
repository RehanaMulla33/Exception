package com.xworkz.Assignment3.Exception.Helmet.dao;

import com.xworkz.Assignment3.Exception.Helmet.dto.HelmetDto;

public class HelmetDaoImpl implements HelmetDao {
	HelmetDto helmets[] = new HelmetDto[10];
	int index = 10;

	public HelmetDaoImpl() {
		System.out.println("Inside Helmet Dao Impl method");
	}

	public void save(HelmetDto dto) {
		System.out.println("Inside save method");
		helmets[index] = dto;
	}

	public void display() {
		System.out.println("Inside display method");
		for (int i = 0; i < index; i++) {
			System.out.println(helmets[i].getBrand());
			System.out.println(helmets[i].getColor());
			System.out.println(helmets[i].getPrice());
			System.out.println(helmets[i].getSize());
			System.out.println(helmets[i].getWieght());
		}

	}

	

}
