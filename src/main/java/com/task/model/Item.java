package com.task.model;

import java.util.ArrayList;

public class Item {

	private String item_name;
	private String shade_name;
	private double mrp;
	private ArrayList<SizeQuantity> size_quantity;
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getShade_name() {
		return shade_name;
	}
	public void setShade_name(String shade_name) {
		this.shade_name = shade_name;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public ArrayList<SizeQuantity> getSize_quantity() {
		return size_quantity;
	}
	public void setSize_quantity(ArrayList<SizeQuantity> size_quantity) {
		this.size_quantity = size_quantity;
	}
	
}
