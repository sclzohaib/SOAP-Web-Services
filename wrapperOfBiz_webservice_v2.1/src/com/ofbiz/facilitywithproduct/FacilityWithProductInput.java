package com.ofbiz.facilitywithproduct;

public class FacilityWithProductInput {
	
	public String productName;
	public double minimumStock;
	public double reorderQuantity;
	public double daysToShip;
	public double inventoryCount;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getMinimumStock() {
		return minimumStock;
	}
	public void setMinimumStock(double minimumStock) {
		this.minimumStock = minimumStock;
	}
	public double getReorderQuantity() {
		return reorderQuantity;
	}
	public void setReorderQuantity(double reorderQuantity) {
		this.reorderQuantity = reorderQuantity;
	}
	public double getDaysToShip() {
		return daysToShip;
	}
	public void setDaysToShip(double daysToShip) {
		this.daysToShip = daysToShip;
	}
	public double getInventoryCount() {
		return inventoryCount;
	}
	public void setInventoryCount(double inventoryCount) {
		this.inventoryCount = inventoryCount;
	}
	
	
}
