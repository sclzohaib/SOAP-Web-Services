package com.ofbiz.createproduct;

import java.util.Date;

public class CreateProductInput {
	public String productId;
	public String productTypeId;
	public String primaryProductCategoryId;
	public String manufacturerPartyId;
	public String facilityId;
	public Date introductionDate;
	public Date releaseDate;
	public Date supportDiscontinuationDate;
	public Date salesDiscontinuationDate;
	public String salesDiscWhenNotAvail;
	public String internalName;
	public String brandName;
	public String comments;
	public String productName;
	public String description;
	public String longDescription;
	public String priceDetailText;
	public String smallImageUrl;
	public String mediumImageUrl;
	public String largeImageUrl;
	public String detailImageUrl;
	public String originalImageUrl;
	public String detailScreen;
	public String inventoryMessage;
	public String inventoryItemTypeId;
	public String requireInventory;
	public String quantityUomId;
	public double qunatityIncluded;
	public double piecesIncluded;
	public char requireAmount;
	public double fixedAmount;
	public String amountUomTypeId;
	public String weightUom;
	public String shippingWeight;
	public String productWeight;
	public String heightUomId;
	public String productHeight;
	public String shippingHeight;
	public String widthUomId;
	public String productWidth;
	public String shippingWidth;
	public String depthUomId;
	public String productDepth;
	public String shippingDepth;
	public String diameterUomId;
	public String productDiameter;
	public String productRating;
	public String ratingTypeEnum;
	public boolean returnable;
	public boolean taxable;
	public char chargeShipping;
	public String autoCreateKeywords;
	public boolean includeInPromotions;
	public boolean isVirtual;
	public boolean isVariant;
	public String virtualVariantMethodEnum;
	public String originGeoId;
	public String requirementMethodEnumId;
	public String billOfMaterialLevel;
	public String reserveMaxPersons;
	public String reserv2nsPPPerc;
	public String reservNthPPPerc;
	public String configId;
	public Date createdDate;
	public String createdByUserLogin;
	public Date lastModifiedDate;
	public String lastModifiedByUserLogin;
	public String inShippingBox;
	public String defaultShipmentBoxTypeId;
	public String lotIdFiledIn;
	public double orderDecimalQuantity;
	public String lastUpdatedStamp;
	public String lastUpdatedTxStamp;
	public Date createdStamp;
	public Date createdTxStamp;
	public String keyword;
	public String keywordTypeId;
	public String keywordRelevancyWeight;
	public String keywordStatusId;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getInternalName() {
		return internalName;
	}
	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getPrimaryProductCategoryId() {
		return primaryProductCategoryId;
	}
	public void setPrimaryProductCategoryId(String primaryProductCategoryId) {
		this.primaryProductCategoryId = primaryProductCategoryId;
	}
	public String getManufacturerPartyId() {
		return manufacturerPartyId;
	}
	public void setManufacturerPartyId(String manufacturerPartyId) {
		this.manufacturerPartyId = manufacturerPartyId;
	}
	public String getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	public Date getIntroductionDate() {
		return introductionDate;
	}
	public void setIntroductionDate(Date introductionDate) {
		this.introductionDate = introductionDate;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Date getSupportDiscontinuationDate() {
		return supportDiscontinuationDate;
	}
	public void setSupportDiscontinuationDate(Date supportDiscontinuationDate) {
		this.supportDiscontinuationDate = supportDiscontinuationDate;
	}
	public Date getSalesDiscontinuationDate() {
		return salesDiscontinuationDate;
	}
	public void setSalesDiscontinuationDate(Date salesDiscontinuationDate) {
		this.salesDiscontinuationDate = salesDiscontinuationDate;
	}
	public String getSalesDiscWhenNotAvail() {
		return salesDiscWhenNotAvail;
	}
	public void setSalesDiscWhenNotAvail(String salesDiscWhenNotAvail) {
		this.salesDiscWhenNotAvail = salesDiscWhenNotAvail;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	public String getPriceDetailText() {
		return priceDetailText;
	}
	public void setPriceDetailText(String priceDetailText) {
		this.priceDetailText = priceDetailText;
	}
	public String getSmallImageUrl() {
		return smallImageUrl;
	}
	public void setSmallImageUrl(String smallImageUrl) {
		this.smallImageUrl = smallImageUrl;
	}
	public String getMediumImageUrl() {
		return mediumImageUrl;
	}
	public void setMediumImageUrl(String mediumImageUrl) {
		this.mediumImageUrl = mediumImageUrl;
	}
	public String getLargeImageUrl() {
		return largeImageUrl;
	}
	public void setLargeImageUrl(String largeImageUrl) {
		this.largeImageUrl = largeImageUrl;
	}
	public String getDetailImageUrl() {
		return detailImageUrl;
	}
	public void setDetailImageUrl(String detailImageUrl) {
		this.detailImageUrl = detailImageUrl;
	}
	public String getOriginalImageUrl() {
		return originalImageUrl;
	}
	public void setOriginalImageUrl(String originalImageUrl) {
		this.originalImageUrl = originalImageUrl;
	}
	public String getDetailScreen() {
		return detailScreen;
	}
	public void setDetailScreen(String detailScreen) {
		this.detailScreen = detailScreen;
	}
	public String getInventoryMessage() {
		return inventoryMessage;
	}
	public void setInventoryMessage(String inventoryMessage) {
		this.inventoryMessage = inventoryMessage;
	}
	public String getInventoryItemTypeId() {
		return inventoryItemTypeId;
	}
	public void setInventoryItemTypeId(String inventoryItemTypeId) {
		this.inventoryItemTypeId = inventoryItemTypeId;
	}
	public String getRequireInventory() {
		return requireInventory;
	}
	public void setRequireInventory(String requireInventory) {
		this.requireInventory = requireInventory;
	}
	public String getQuantityUomId() {
		return quantityUomId;
	}
	public void setQuantityUomId(String quantityUomId) {
		this.quantityUomId = quantityUomId;
	}
	public double getQunatityIncluded() {
		return qunatityIncluded;
	}
	public void setQunatityIncluded(double qunatityIncluded) {
		this.qunatityIncluded = qunatityIncluded;
	}
	public double getPiecesIncluded() {
		return piecesIncluded;
	}
	public void setPiecesIncluded(double piecesIncluded) {
		this.piecesIncluded = piecesIncluded;
	}
	public char getRequireAmount() {
		return requireAmount;
	}
	public void setRequireAmount(char requireAmount) {
		this.requireAmount = requireAmount;
	}
	public double getFixedAmount() {
		return fixedAmount;
	}
	public void setFixedAmount(double fixedAmount) {
		this.fixedAmount = fixedAmount;
	}
	public String getAmountUomTypeId() {
		return amountUomTypeId;
	}
	public void setAmountUomTypeId(String amountUomTypeId) {
		this.amountUomTypeId = amountUomTypeId;
	}
	public String getWeightUom() {
		return weightUom;
	}
	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}
	public String getShippingWeight() {
		return shippingWeight;
	}
	public void setShippingWeight(String shippingWeight) {
		this.shippingWeight = shippingWeight;
	}
	public String getProductWeight() {
		return productWeight;
	}
	public void setProductWeight(String productWeight) {
		this.productWeight = productWeight;
	}
	public String getHeightUomId() {
		return heightUomId;
	}
	public void setHeightUomId(String heightUomId) {
		this.heightUomId = heightUomId;
	}
	public String getProductHeight() {
		return productHeight;
	}
	public void setProductHeight(String productHeight) {
		this.productHeight = productHeight;
	}
	public String getShippingHeight() {
		return shippingHeight;
	}
	public void setShippingHeight(String shippingHeight) {
		this.shippingHeight = shippingHeight;
	}
	public String getWidthUomId() {
		return widthUomId;
	}
	public void setWidthUomId(String widthUomId) {
		this.widthUomId = widthUomId;
	}
	public String getProductWidth() {
		return productWidth;
	}
	public void setProductWidth(String productWidth) {
		this.productWidth = productWidth;
	}
	public String getShippingWidth() {
		return shippingWidth;
	}
	public void setShippingWidth(String shippingWidth) {
		this.shippingWidth = shippingWidth;
	}
	public String getDepthUomId() {
		return depthUomId;
	}
	public void setDepthUomId(String depthUomId) {
		this.depthUomId = depthUomId;
	}
	public String getProductDepth() {
		return productDepth;
	}
	public void setProductDepth(String productDepth) {
		this.productDepth = productDepth;
	}
	public String getShippingDepth() {
		return shippingDepth;
	}
	public void setShippingDepth(String shippingDepth) {
		this.shippingDepth = shippingDepth;
	}
	public String getDiameterUomId() {
		return diameterUomId;
	}
	public void setDiameterUomId(String diameterUomId) {
		this.diameterUomId = diameterUomId;
	}
	public String getProductDiameter() {
		return productDiameter;
	}
	public void setProductDiameter(String productDiameter) {
		this.productDiameter = productDiameter;
	}
	public String getProductRating() {
		return productRating;
	}
	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}
	public String getRatingTypeEnum() {
		return ratingTypeEnum;
	}
	public void setRatingTypeEnum(String ratingTypeEnum) {
		this.ratingTypeEnum = ratingTypeEnum;
	}
	public boolean isReturnable() {
		return returnable;
	}
	public void setReturnable(boolean returnable) {
		this.returnable = returnable;
	}
	public boolean isTaxable() {
		return taxable;
	}
	public void setTaxable(boolean taxable) {
		this.taxable = taxable;
	}
	public char getChargeShipping() {
		return chargeShipping;
	}
	public void setChargeShipping(char chargeShipping) {
		this.chargeShipping = chargeShipping;
	}
	public String getAutoCreateKeywords() {
		return autoCreateKeywords;
	}
	public void setAutoCreateKeywords(String autoCreateKeywords) {
		this.autoCreateKeywords = autoCreateKeywords;
	}
	public boolean isIncludeInPromotions() {
		return includeInPromotions;
	}
	public void setIncludeInPromotions(boolean includeInPromotions) {
		this.includeInPromotions = includeInPromotions;
	}
	public boolean isVirtual() {
		return isVirtual;
	}
	public void setVirtual(boolean isVirtual) {
		this.isVirtual = isVirtual;
	}
	public boolean isVariant() {
		return isVariant;
	}
	public void setVariant(boolean isVariant) {
		this.isVariant = isVariant;
	}
	public String getVirtualVariantMethodEnum() {
		return virtualVariantMethodEnum;
	}
	public void setVirtualVariantMethodEnum(String virtualVariantMethodEnum) {
		this.virtualVariantMethodEnum = virtualVariantMethodEnum;
	}
	public String getOriginGeoId() {
		return originGeoId;
	}
	public void setOriginGeoId(String originGeoId) {
		this.originGeoId = originGeoId;
	}
	public String getRequirementMethodEnumId() {
		return requirementMethodEnumId;
	}
	public void setRequirementMethodEnumId(String requirementMethodEnumId) {
		this.requirementMethodEnumId = requirementMethodEnumId;
	}
	public String getBillOfMaterialLevel() {
		return billOfMaterialLevel;
	}
	public void setBillOfMaterialLevel(String billOfMaterialLevel) {
		this.billOfMaterialLevel = billOfMaterialLevel;
	}
	public String getReserveMaxPersons() {
		return reserveMaxPersons;
	}
	public void setReserveMaxPersons(String reserveMaxPersons) {
		this.reserveMaxPersons = reserveMaxPersons;
	}
	public String getReserv2nsPPPerc() {
		return reserv2nsPPPerc;
	}
	public void setReserv2nsPPPerc(String reserv2nsPPPerc) {
		this.reserv2nsPPPerc = reserv2nsPPPerc;
	}
	public String getReservNthPPPerc() {
		return reservNthPPPerc;
	}
	public void setReservNthPPPerc(String reservNthPPPerc) {
		this.reservNthPPPerc = reservNthPPPerc;
	}
	public String getConfigId() {
		return configId;
	}
	public void setConfigId(String configId) {
		this.configId = configId;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedByUserLogin() {
		return createdByUserLogin;
	}
	public void setCreatedByUserLogin(String createdByUserLogin) {
		this.createdByUserLogin = createdByUserLogin;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public String getLastModifiedByUserLogin() {
		return lastModifiedByUserLogin;
	}
	public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
		this.lastModifiedByUserLogin = lastModifiedByUserLogin;
	}
	public String getInShippingBox() {
		return inShippingBox;
	}
	public void setInShippingBox(String inShippingBox) {
		this.inShippingBox = inShippingBox;
	}
	public String getDefaultShipmentBoxTypeId() {
		return defaultShipmentBoxTypeId;
	}
	public void setDefaultShipmentBoxTypeId(String defaultShipmentBoxTypeId) {
		this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
	}
	public String getLotIdFiledIn() {
		return lotIdFiledIn;
	}
	public void setLotIdFiledIn(String lotIdFiledIn) {
		this.lotIdFiledIn = lotIdFiledIn;
	}
	public double getOrderDecimalQuantity() {
		return orderDecimalQuantity;
	}
	public void setOrderDecimalQuantity(double orderDecimalQuantity) {
		this.orderDecimalQuantity = orderDecimalQuantity;
	}
	public String getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(String lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	public String getLastUpdatedTxStamp() {
		return lastUpdatedTxStamp;
	}
	public void setLastUpdatedTxStamp(String lastUpdatedTxStamp) {
		this.lastUpdatedTxStamp = lastUpdatedTxStamp;
	}
	public Date getCreatedStamp() {
		return createdStamp;
	}
	public void setCreatedStamp(Date createdStamp) {
		this.createdStamp = createdStamp;
	}
	public Date getCreatedTxStamp() {
		return createdTxStamp;
	}
	public void setCreatedTxStamp(Date createdTxStamp) {
		this.createdTxStamp = createdTxStamp;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKeywordTypeId() {
		return keywordTypeId;
	}
	public void setKeywordTypeId(String keywordTypeId) {
		this.keywordTypeId = keywordTypeId;
	}
	public String getKeywordRelevancyWeight() {
		return keywordRelevancyWeight;
	}
	public void setKeywordRelevancyWeight(String keywordRelevancyWeight) {
		this.keywordRelevancyWeight = keywordRelevancyWeight;
	}
	public String getKeywordStatusId() {
		return keywordStatusId;
	}
	public void setKeywordStatusId(String keywordStatusId) {
		this.keywordStatusId = keywordStatusId;
	}
}
