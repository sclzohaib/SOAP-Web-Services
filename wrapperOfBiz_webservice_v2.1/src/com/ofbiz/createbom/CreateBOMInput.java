package com.ofbiz.createbom;
import java.util.Date;
public class CreateBOMInput {
	public String productName;
	public Date availableFromDate;
	public Date availableThruDate;
	public String supplierPerfOrderId;
	public String supplierRatingTypeId;
	public double standardLeadTimeDays;
	public double minimumOrderQuantity;
	public double orderQtyIncrements;
	public String unitsIncluded;
	public String quantityUomId;
	public String agreementId;
	public String agreementItemSeqId;
	public double lastPrice;
	public double shippingPrice;
	public String currencyUomId;
	public String supplierProductName;
	public String supplierProductId;
	public boolean canDropShip;
	public String comments;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getAvailableFromDate() {
		return availableFromDate;
	}
	public void setAvailableFromDate(Date availableFromDate) {
		this.availableFromDate = availableFromDate;
	}
	public Date getAvailableThruDate() {
		return availableThruDate;
	}
	public void setAvailableThruDate(Date availableThruDate) {
		this.availableThruDate = availableThruDate;
	}
	public String getSupplierPerfOrderId() {
		return supplierPerfOrderId;
	}
	public void setSupplierPerfOrderId(String supplierPerfOrderId) {
		this.supplierPerfOrderId = supplierPerfOrderId;
	}
	public String getSupplierRatingTypeId() {
		return supplierRatingTypeId;
	}
	public void setSupplierRatingTypeId(String supplierRatingTypeId) {
		this.supplierRatingTypeId = supplierRatingTypeId;
	}
	public double getStandardLeadTimeDays() {
		return standardLeadTimeDays;
	}
	public void setStandardLeadTimeDays(double standardLeadTimeDays) {
		this.standardLeadTimeDays = standardLeadTimeDays;
	}
	public double getMinimumOrderQuantity() {
		return minimumOrderQuantity;
	}
	public void setMinimumOrderQuantity(double minimumOrderQuantity) {
		this.minimumOrderQuantity = minimumOrderQuantity;
	}
	public double getOrderQtyIncrements() {
		return orderQtyIncrements;
	}
	public void setOrderQtyIncrements(double orderQtyIncrements) {
		this.orderQtyIncrements = orderQtyIncrements;
	}
	public String getUnitsIncluded() {
		return unitsIncluded;
	}
	public void setUnitsIncluded(String unitsIncluded) {
		this.unitsIncluded = unitsIncluded;
	}
	public String getQuantityUomId() {
		return quantityUomId;
	}
	public void setQuantityUomId(String quantityUomId) {
		this.quantityUomId = quantityUomId;
	}
	public String getAgreementId() {
		return agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementItemSeqId() {
		return agreementItemSeqId;
	}
	public void setAgreementItemSeqId(String agreementItemSeqId) {
		this.agreementItemSeqId = agreementItemSeqId;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public double getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public String getCurrencyUomId() {
		return currencyUomId;
	}
	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
	}
	public String getSupplierProductName() {
		return supplierProductName;
	}
	public void setSupplierProductName(String supplierProductName) {
		this.supplierProductName = supplierProductName;
	}
	public String getSupplierProductId() {
		return supplierProductId;
	}
	public void setSupplierProductId(String supplierProductId) {
		this.supplierProductId = supplierProductId;
	}
	public boolean isCanDropShip() {
		return canDropShip;
	}
	public void setCanDropShip(boolean canDropShip) {
		this.canDropShip = canDropShip;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
}
