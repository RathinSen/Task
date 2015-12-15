package com.task.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.task.model.Item;
import com.task.model.SizeQuantity;
import com.task.service.ItemService;

@Controller
@RequestMapping("/")
public class TaskController {

	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody Item getItemJSON(@PathVariable String name) {
		ItemService itemService = new ItemService();
		Item item = itemService.getItem(name);
//		
//		Item item = new Item();
//		item.setItem_name("1056 TUFFET BNDFT DKNGHT");
//		item.setMrp(2199);
//		item.setShade_name("DARK NIGHT");
//		ArrayList<SizeQuantity> size_quantity = new ArrayList<SizeQuantity>();
//		SizeQuantity sq1 = new SizeQuantity();
//		sq1.setQuantity(1);
//		sq1.setSize(38);
//		SizeQuantity sq2 = new SizeQuantity();
//		sq2.setQuantity(0);
//		sq2.setSize(40);
//		size_quantity.add(sq1);
//		size_quantity.add(sq2);
//		item.setSize_quantity(size_quantity );
//		
		return item;

	}
}
