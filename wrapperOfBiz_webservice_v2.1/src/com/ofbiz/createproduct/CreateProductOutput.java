package com.ofbiz.createproduct;

public class CreateProductOutput {
	

	public Long supplierId;
	public String supplierName;
	public String suppliercategory;
	public String supplierLocation;
	public CreateProductOutput() {
		super();
	}
	public CreateProductOutput(Long supplierId, String supplierName, String suppliercategory,
			String supplierLocation) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.suppliercategory = suppliercategory;
		this.supplierLocation = supplierLocation;
	}
	public Long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSuppliercategory() {
		return suppliercategory;
	}
	public void setSuppliercategory(String suppliercategory) {
		this.suppliercategory = suppliercategory;
	}
	public String getSupplierLocation() {
		return supplierLocation;
	}
	public void setSupplierLocation(String supplierLocation) {
		this.supplierLocation = supplierLocation;
	}
	@Override
	public String toString() {
		return "CreateProductOutput [supplierId=" + supplierId + ", supplierName=" + supplierName
				+ ", suppliercategory=" + suppliercategory + ", supplierLocation=" + supplierLocation + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((supplierId == null) ? 0 : supplierId.hashCode());
		result = prime * result + ((supplierLocation == null) ? 0 : supplierLocation.hashCode());
		result = prime * result + ((supplierName == null) ? 0 : supplierName.hashCode());
		result = prime * result + ((suppliercategory == null) ? 0 : suppliercategory.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateProductOutput other = (CreateProductOutput) obj;
		if (supplierId == null) {
			if (other.supplierId != null)
				return false;
		} else if (!supplierId.equals(other.supplierId))
			return false;
		if (supplierLocation == null) {
			if (other.supplierLocation != null)
				return false;
		} else if (!supplierLocation.equals(other.supplierLocation))
			return false;
		if (supplierName == null) {
			if (other.supplierName != null)
				return false;
		} else if (!supplierName.equals(other.supplierName))
			return false;
		if (suppliercategory == null) {
			if (other.suppliercategory != null)
				return false;
		} else if (!suppliercategory.equals(other.suppliercategory))
			return false;
		return true;
	}
	
	
	
	
}
