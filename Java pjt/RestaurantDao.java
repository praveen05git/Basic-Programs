package com.sastra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.sastra.bean.Restaurent;
import com.sastra.exception.DataLayerException;
import com.sastra.util.Dbutil;

public class RestaurentDao {
	
	public ArrayList<Restaurent> getAllrestaurentdetails() throws DataLayerException{
		ArrayList<Restaurent> alldetails = new ArrayList<Restaurent>();
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = Dbutil.getmyconnection();
			ps = con.prepareStatement("select * from RESTAURENT");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String menuid = rs.getString(1);
				String menuname = rs.getString(2);
				String category = rs.getString(3);
				String type = rs.getString(4);
				double cost=rs.getDouble(5);
				String status = rs.getString(6);
			Restaurent a=new Restaurent(menuid,menuname,category,type,cost,status);
				alldetails.add(a);
			}
		} catch(SQLException e){
			throw new DataLayerException(e.getMessage());
		}
		return alldetails;
	}
	public boolean addmenu(Restaurent r) throws DataLayerException {
		boolean result = false;
		Connection con = null;
		PreparedStatement pst = null;
		PreparedStatement pst1 = null;

		try {
			con = Dbutil.getmyconnection();
			pst = con.prepareStatement("INSERT INTO RESTAURENT VALUES(?,?,?,?,?,?)");
			pst.setString(1,r.getMenuid());
			pst.setString(2,r.getMenuname());
			pst.setString(3,r.getCategory());
			pst.setString(4,r.getType());
			pst.setDouble(5,r.getCost());
			pst.setString(6,r.getStatus());
			int i=pst.executeUpdate();
			if(i>0){
				result=true;
			}
			Dbutil.closeconnection(con);
			Dbutil.closestatement(pst1);
			Dbutil.closestatement(pst);
		} catch (DataLayerException e) {
			throw new DataLayerException(e.getMessage());
		} catch (SQLException e) {
			throw new DataLayerException(e.getMessage());
		}
		return result;
	}
	public boolean deletemenu(String menuid) throws DataLayerException {
		boolean result=false;
		Connection con = null;
		PreparedStatement pst = null;
		PreparedStatement pst1 = null;
		ResultSet rs=null;
		Restaurent ac=new Restaurent();
		try {
			con = Dbutil.getmyconnection();
			pst = con.prepareStatement("delete  from RESTAURENT where MENUID=?");
			pst.setString(1, menuid);
			int r=pst.executeUpdate();
			if(r>0){
				result=true;
			}
			Dbutil.closeconnection(con);
			Dbutil.closestatement(pst1);
			Dbutil.closestatement(pst);
		} catch (DataLayerException e) {
			throw new DataLayerException(e.getMessage());
		} catch (SQLException e) {
			throw new DataLayerException(e.getMessage());
		}
		return result;
	}

}
