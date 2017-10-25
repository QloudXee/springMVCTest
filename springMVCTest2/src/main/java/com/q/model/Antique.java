package com.q.model;

public class Antique {
	
	private String master;
	private String antiqueName;
	private int price;
	
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getAntiqueName() {
		return antiqueName;
	}
	public void setAntiqueName(String antiqueName) {
		this.antiqueName = antiqueName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Antique [master=" + master + ", antiqueName=" + antiqueName + ", price=" + price + "]";
	}
	
}
