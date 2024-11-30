package com.infosys.carRentalSystem.dao;

import com.infosys.carRentalSystem.bean.CarUser;

import java.util.List;

public class CarUserDacImpl implements CarUserDao {

	@Override
	public void save(CarUser carUser) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public List<CarUser> displayAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CarUser findById(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}


//int id=0;
//
//String val=repository.getLastId();
//
//if(val==null)
//
//	id=10001;
//
//else {
//
//	id=Integer.parseInt(val.substring(1));
//
//	id++;
//
//}
//
//String newId="V"+id;  	
//
//return newId;

