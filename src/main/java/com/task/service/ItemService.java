package com.task.service;

import com.task.dao.Dao;
import com.task.model.Item;

public class ItemService {

	public Item getItem(String string) {
		// TODO Auto-generated method stub
		Dao dao = new Dao();
		Item item = dao.getItem(string);
		return item;
	}

}
