package com.task.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.task.model.Item;
import com.task.model.SizeQuantity;

public class Dao {

	
	public void dbput(String[] sentence)
	{
		Connection conn = DBConnection.getConnection();
		try {
			int j =28;
			for(int i=2;i<=11;i++)
			{
				System.out.println(i+"******&*");
				
			PreparedStatement pstmt = conn.prepareStatement("INSERT INTO ITEMS ( ITEM_NAME, SHADE_NAME,SIZE,QUANTITY, MRP) VALUES (?, ?,?,?,?) ");
			pstmt.setString(1, sentence[0]);
			pstmt.setString(2, sentence[1]);
			pstmt.setInt(3, j);//
			if(sentence[i].length()<1)
			{
				pstmt.setInt(4, 0);
			}
			else
			{
			pstmt.setInt(4, Integer.parseInt(sentence[i]));
			}
			pstmt.setInt(5, Integer.parseInt(sentence[13]));
			j+=2;
			pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Item getItem(String string) {
		// TODO Auto-generated method stub
		Connection conn = DBConnection.getConnection();
		Item item = null;
		try {
			item = new Item();
			Statement stmt = conn.createStatement();
			String query = "SELECT * FROM ITEMS WHERE ITEM_NAME="+"\""+string+"\"";
			System.out.println(query+"*****");
			ResultSet rs =  stmt.executeQuery(query);
		      //System.out.println("Id Name    Job");
			ArrayList<SizeQuantity> sizes = new ArrayList<SizeQuantity>();
			int i = 0;
		      while (rs.next()) {
		    	  if(i>0)
		    	  {
		         item.setItem_name(rs.getString("ITEM_NAME"));
		         item.setShade_name(rs.getString("SHADE_NAME"));
		         item.setMrp(rs.getDouble("MRP"));
		    	  }
		         SizeQuantity sq = new SizeQuantity();
		         sq.setSize(Integer.parseInt(rs.getString("SIZE")));
		         sq.setQuantity(Integer.parseInt(rs.getString("QUANTITY")));
		         sizes.add(sq);
		         //System.out.println(id + "  " + name+"   "+job);
		         i++;
		      }
		      item.setSize_quantity(sizes);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		return item;
	}
}
