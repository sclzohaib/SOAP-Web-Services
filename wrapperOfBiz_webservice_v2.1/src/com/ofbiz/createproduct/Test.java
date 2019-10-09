package com.ofbiz.createproduct;

import com.ofbiz.facilitywithproduct.FacilityWithProduct;
import com.ofbiz.facilitywithproduct.FacilityWithProductInput;
import com.ofbiz.facilitywithproduct.FacilityWithProductOutput;
import com.ofbiz.supplierwithproduct.SupplierWithProduct;
import com.ofbiz.supplierwithproduct.SupplierWithProductInput;
import com.ofbiz.supplierwithproduct.SupplierWithProductOutput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateProduct createProduct = new CreateProduct();
//		CreateProductInput createProductInput = new CreateProductInput();
//		createProductInput.brandName = "ALOVERA";
//		createProductInput.productTypeId = "HERBAL";
//		createProductInput.internalName = "ALO";
//		createProductInput.productName = "ABC";
//		CreateProductOutput createProductOutput = createProduct.createProduct(createProductInput);
//		
//		System.out.println("Product Created with id = " + createProductOutput.supplierId);
//		
//		
//		SupplierWithProduct supplierWithProduct = new SupplierWithProduct();
//		
//		SupplierWithProductInput supplierWithProductInput = new SupplierWithProductInput();
//		supplierWithProductInput.setSupplierProductId("1");
//		supplierWithProductInput.setSupplierProductName("HERBAL");
//		supplierWithProductInput.setProductName("ABC");
//		SupplierWithProductOutput supplierWithProductOutput = supplierWithProduct.associateSupplierWithProduct(supplierWithProductInput);
//		System.out.println("Supplier created = " + supplierWithProductOutput.supplierId);
//		
//		
//		FacilityWithProduct facilityWithProduct = new FacilityWithProduct();
//		FacilityWithProductInput facilityWithProductInput = new FacilityWithProductInput();
//		facilityWithProductInput.setProductName("ABC");
//		facilityWithProductInput.setReorderQuantity(1.0);
//		FacilityWithProductOutput facilityWithProductOutput = facilityWithProduct.associateFacilityWithProduct(facilityWithProductInput);
//		
//		System.out.println("Facility creaed = " + facilityWithProductOutput.facilityId);
		
		
		createProduct.getProduct().forEach(n -> {
		System.out.println(n.getProductName());
		});
	
	}

}
