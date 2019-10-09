package com.ofbiz.supplierwithproduct;

public class SupplierWithProductOutput {
	public String supplierId;
	
	

	public SupplierWithProductOutput() {
		super();
	}
	
	

	public SupplierWithProductOutput(String supplierId) {
		super();
		this.supplierId = supplierId;
	}



	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((supplierId == null) ? 0 : supplierId.hashCode());
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
		SupplierWithProductOutput other = (SupplierWithProductOutput) obj;
		if (supplierId == null) {
			if (other.supplierId != null)
				return false;
		} else if (!supplierId.equals(other.supplierId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "SupplierWithProductOutput [supplierId=" + supplierId + "]";
	}
	
	
	
	
}
