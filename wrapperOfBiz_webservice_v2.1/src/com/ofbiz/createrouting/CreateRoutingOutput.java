package com.ofbiz.createrouting;

import java.util.Date;

public class CreateRoutingOutput {
	
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
	public String getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(String productTypeId) {
		this.productTypeId = productTypeId;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((detailImageUrl == null) ? 0 : detailImageUrl.hashCode());
		result = prime * result + ((detailScreen == null) ? 0 : detailScreen.hashCode());
		result = prime * result + ((facilityId == null) ? 0 : facilityId.hashCode());
		result = prime * result + ((internalName == null) ? 0 : internalName.hashCode());
		result = prime * result + ((introductionDate == null) ? 0 : introductionDate.hashCode());
		result = prime * result + ((inventoryItemTypeId == null) ? 0 : inventoryItemTypeId.hashCode());
		result = prime * result + ((inventoryMessage == null) ? 0 : inventoryMessage.hashCode());
		result = prime * result + ((largeImageUrl == null) ? 0 : largeImageUrl.hashCode());
		result = prime * result + ((longDescription == null) ? 0 : longDescription.hashCode());
		result = prime * result + ((manufacturerPartyId == null) ? 0 : manufacturerPartyId.hashCode());
		result = prime * result + ((mediumImageUrl == null) ? 0 : mediumImageUrl.hashCode());
		result = prime * result + ((originalImageUrl == null) ? 0 : originalImageUrl.hashCode());
		result = prime * result + ((priceDetailText == null) ? 0 : priceDetailText.hashCode());
		result = prime * result + ((primaryProductCategoryId == null) ? 0 : primaryProductCategoryId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productTypeId == null) ? 0 : productTypeId.hashCode());
		result = prime * result + ((quantityUomId == null) ? 0 : quantityUomId.hashCode());
		result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
		result = prime * result + ((requireInventory == null) ? 0 : requireInventory.hashCode());
		result = prime * result + ((salesDiscWhenNotAvail == null) ? 0 : salesDiscWhenNotAvail.hashCode());
		result = prime * result + ((salesDiscontinuationDate == null) ? 0 : salesDiscontinuationDate.hashCode());
		result = prime * result + ((smallImageUrl == null) ? 0 : smallImageUrl.hashCode());
		result = prime * result + ((supportDiscontinuationDate == null) ? 0 : supportDiscontinuationDate.hashCode());
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
		CreateRoutingOutput other = (CreateRoutingOutput) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (detailImageUrl == null) {
			if (other.detailImageUrl != null)
				return false;
		} else if (!detailImageUrl.equals(other.detailImageUrl))
			return false;
		if (detailScreen == null) {
			if (other.detailScreen != null)
				return false;
		} else if (!detailScreen.equals(other.detailScreen))
			return false;
		if (facilityId == null) {
			if (other.facilityId != null)
				return false;
		} else if (!facilityId.equals(other.facilityId))
			return false;
		if (internalName == null) {
			if (other.internalName != null)
				return false;
		} else if (!internalName.equals(other.internalName))
			return false;
		if (introductionDate == null) {
			if (other.introductionDate != null)
				return false;
		} else if (!introductionDate.equals(other.introductionDate))
			return false;
		if (inventoryItemTypeId == null) {
			if (other.inventoryItemTypeId != null)
				return false;
		} else if (!inventoryItemTypeId.equals(other.inventoryItemTypeId))
			return false;
		if (inventoryMessage == null) {
			if (other.inventoryMessage != null)
				return false;
		} else if (!inventoryMessage.equals(other.inventoryMessage))
			return false;
		if (largeImageUrl == null) {
			if (other.largeImageUrl != null)
				return false;
		} else if (!largeImageUrl.equals(other.largeImageUrl))
			return false;
		if (longDescription == null) {
			if (other.longDescription != null)
				return false;
		} else if (!longDescription.equals(other.longDescription))
			return false;
		if (manufacturerPartyId == null) {
			if (other.manufacturerPartyId != null)
				return false;
		} else if (!manufacturerPartyId.equals(other.manufacturerPartyId))
			return false;
		if (mediumImageUrl == null) {
			if (other.mediumImageUrl != null)
				return false;
		} else if (!mediumImageUrl.equals(other.mediumImageUrl))
			return false;
		if (originalImageUrl == null) {
			if (other.originalImageUrl != null)
				return false;
		} else if (!originalImageUrl.equals(other.originalImageUrl))
			return false;
		if (priceDetailText == null) {
			if (other.priceDetailText != null)
				return false;
		} else if (!priceDetailText.equals(other.priceDetailText))
			return false;
		if (primaryProductCategoryId == null) {
			if (other.primaryProductCategoryId != null)
				return false;
		} else if (!primaryProductCategoryId.equals(other.primaryProductCategoryId))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productTypeId == null) {
			if (other.productTypeId != null)
				return false;
		} else if (!productTypeId.equals(other.productTypeId))
			return false;
		if (quantityUomId == null) {
			if (other.quantityUomId != null)
				return false;
		} else if (!quantityUomId.equals(other.quantityUomId))
			return false;
		if (releaseDate == null) {
			if (other.releaseDate != null)
				return false;
		} else if (!releaseDate.equals(other.releaseDate))
			return false;
		if (requireInventory == null) {
			if (other.requireInventory != null)
				return false;
		} else if (!requireInventory.equals(other.requireInventory))
			return false;
		if (salesDiscWhenNotAvail == null) {
			if (other.salesDiscWhenNotAvail != null)
				return false;
		} else if (!salesDiscWhenNotAvail.equals(other.salesDiscWhenNotAvail))
			return false;
		if (salesDiscontinuationDate == null) {
			if (other.salesDiscontinuationDate != null)
				return false;
		} else if (!salesDiscontinuationDate.equals(other.salesDiscontinuationDate))
			return false;
		if (smallImageUrl == null) {
			if (other.smallImageUrl != null)
				return false;
		} else if (!smallImageUrl.equals(other.smallImageUrl))
			return false;
		if (supportDiscontinuationDate == null) {
			if (other.supportDiscontinuationDate != null)
				return false;
		} else if (!supportDiscontinuationDate.equals(other.supportDiscontinuationDate))
			return false;
		return true;
	}
	
	

}
