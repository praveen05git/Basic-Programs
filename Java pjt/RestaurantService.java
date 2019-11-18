package com.sastra.service;

import java.util.ArrayList;

import com.sastra.bean.Restaurent;
import com.sastra.dao.RestaurentDao;
import com.sastra.exception.DataLayerException;

public class RestaurentService {
	
RestaurentDao dao=new RestaurentDao();
	public ArrayList<Restaurent> getAllrestaurentdetails() throws DataLayerException{
		return dao.getAllrestaurentdetails();
	}
	public boolean addmenu(Restaurent r) throws DataLayerException {
		return dao.addmenu(r);
	}
	public boolean deletemenu(String menuid) throws DataLayerException {
		return dao.deletemenu(menuid);
	}

}
