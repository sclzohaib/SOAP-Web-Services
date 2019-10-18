/**
 * CreateProductInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.createproduct.xsd;

public class CreateProductInput  implements java.io.Serializable {
    private java.lang.String amountUomTypeId;

    private java.lang.String autoCreateKeywords;

    private java.lang.String billOfMaterialLevel;

    private java.lang.String brandName;

    private java.lang.Double chargeShipping;

    private java.lang.String comments;

    private java.lang.String configId;

    private java.lang.String createdByUserLogin;

    private java.util.Date createdDate;

    private java.util.Date createdStamp;

    private java.util.Date createdTxStamp;

    private java.lang.String defaultShipmentBoxTypeId;

    private java.lang.String depthUomId;

    private java.lang.String description;

    private java.lang.String detailImageUrl;

    private java.lang.String detailScreen;

    private java.lang.String diameterUomId;

    private java.lang.String facilityId;

    private java.lang.Double fixedAmount;

    private java.lang.String heightUomId;

    private java.lang.String inShippingBox;

    private java.lang.Boolean includeInPromotions;

    private java.lang.String internalName;

    private java.util.Date introductionDate;

    private java.lang.String inventoryItemTypeId;

    private java.lang.String inventoryMessage;

    private java.lang.String keyword;

    private java.lang.String keywordRelevancyWeight;

    private java.lang.String keywordStatusId;

    private java.lang.String keywordTypeId;

    private java.lang.String largeImageUrl;

    private java.lang.String lastModifiedByUserLogin;

    private java.util.Date lastModifiedDate;

    private java.lang.String lastUpdatedStamp;

    private java.lang.String lastUpdatedTxStamp;

    private java.lang.String longDescription;

    private java.lang.String lotIdFiledIn;

    private java.lang.String manufacturerPartyId;

    private java.lang.String mediumImageUrl;

    private java.lang.Double orderDecimalQuantity;

    private java.lang.String originGeoId;

    private java.lang.String originalImageUrl;

    private java.lang.Double piecesIncluded;

    private java.lang.String priceDetailText;

    private java.lang.String primaryProductCategoryId;

    private java.lang.String productDepth;

    private java.lang.String productDiameter;

    private java.lang.String productHeight;

    private java.lang.String productId;

    private java.lang.String productName;

    private java.lang.String productRating;

    private java.lang.String productTypeId;

    private java.lang.String productWeight;

    private java.lang.String productWidth;

    private java.lang.String quantityUomId;

    private java.lang.Double qunatityIncluded;

    private java.lang.String ratingTypeEnum;

    private java.util.Date releaseDate;

    private java.lang.Double requireAmount;

    private java.lang.String requireInventory;

    private java.lang.String requirementMethodEnumId;

    private java.lang.String reserv2NsPPPerc;

    private java.lang.String reservNthPPPerc;

    private java.lang.String reserveMaxPersons;

    private java.lang.Boolean returnable;

    private java.lang.String salesDiscWhenNotAvail;

    private java.util.Date salesDiscontinuationDate;

    private java.lang.String shippingDepth;

    private java.lang.String shippingHeight;

    private java.lang.String shippingWeight;

    private java.lang.String shippingWidth;

    private java.lang.String smallImageUrl;

    private java.util.Date supportDiscontinuationDate;

    private java.lang.Boolean taxable;

    private java.lang.Boolean variant;

    private java.lang.Boolean virtual;

    private java.lang.String virtualVariantMethodEnum;

    private java.lang.String weightUom;

    private java.lang.String widthUomId;

    public CreateProductInput() {
    }

    public CreateProductInput(
           java.lang.String amountUomTypeId,
           java.lang.String autoCreateKeywords,
           java.lang.String billOfMaterialLevel,
           java.lang.String brandName,
           java.lang.Double chargeShipping,
           java.lang.String comments,
           java.lang.String configId,
           java.lang.String createdByUserLogin,
           java.util.Date createdDate,
           java.util.Date createdStamp,
           java.util.Date createdTxStamp,
           java.lang.String defaultShipmentBoxTypeId,
           java.lang.String depthUomId,
           java.lang.String description,
           java.lang.String detailImageUrl,
           java.lang.String detailScreen,
           java.lang.String diameterUomId,
           java.lang.String facilityId,
           java.lang.Double fixedAmount,
           java.lang.String heightUomId,
           java.lang.String inShippingBox,
           java.lang.Boolean includeInPromotions,
           java.lang.String internalName,
           java.util.Date introductionDate,
           java.lang.String inventoryItemTypeId,
           java.lang.String inventoryMessage,
           java.lang.String keyword,
           java.lang.String keywordRelevancyWeight,
           java.lang.String keywordStatusId,
           java.lang.String keywordTypeId,
           java.lang.String largeImageUrl,
           java.lang.String lastModifiedByUserLogin,
           java.util.Date lastModifiedDate,
           java.lang.String lastUpdatedStamp,
           java.lang.String lastUpdatedTxStamp,
           java.lang.String longDescription,
           java.lang.String lotIdFiledIn,
           java.lang.String manufacturerPartyId,
           java.lang.String mediumImageUrl,
           java.lang.Double orderDecimalQuantity,
           java.lang.String originGeoId,
           java.lang.String originalImageUrl,
           java.lang.Double piecesIncluded,
           java.lang.String priceDetailText,
           java.lang.String primaryProductCategoryId,
           java.lang.String productDepth,
           java.lang.String productDiameter,
           java.lang.String productHeight,
           java.lang.String productId,
           java.lang.String productName,
           java.lang.String productRating,
           java.lang.String productTypeId,
           java.lang.String productWeight,
           java.lang.String productWidth,
           java.lang.String quantityUomId,
           java.lang.Double qunatityIncluded,
           java.lang.String ratingTypeEnum,
           java.util.Date releaseDate,
           java.lang.Double requireAmount,
           java.lang.String requireInventory,
           java.lang.String requirementMethodEnumId,
           java.lang.String reserv2NsPPPerc,
           java.lang.String reservNthPPPerc,
           java.lang.String reserveMaxPersons,
           java.lang.Boolean returnable,
           java.lang.String salesDiscWhenNotAvail,
           java.util.Date salesDiscontinuationDate,
           java.lang.String shippingDepth,
           java.lang.String shippingHeight,
           java.lang.String shippingWeight,
           java.lang.String shippingWidth,
           java.lang.String smallImageUrl,
           java.util.Date supportDiscontinuationDate,
           java.lang.Boolean taxable,
           java.lang.Boolean variant,
           java.lang.Boolean virtual,
           java.lang.String virtualVariantMethodEnum,
           java.lang.String weightUom,
           java.lang.String widthUomId) {
           this.amountUomTypeId = amountUomTypeId;
           this.autoCreateKeywords = autoCreateKeywords;
           this.billOfMaterialLevel = billOfMaterialLevel;
           this.brandName = brandName;
           this.chargeShipping = chargeShipping;
           this.comments = comments;
           this.configId = configId;
           this.createdByUserLogin = createdByUserLogin;
           this.createdDate = createdDate;
           this.createdStamp = createdStamp;
           this.createdTxStamp = createdTxStamp;
           this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
           this.depthUomId = depthUomId;
           this.description = description;
           this.detailImageUrl = detailImageUrl;
           this.detailScreen = detailScreen;
           this.diameterUomId = diameterUomId;
           this.facilityId = facilityId;
           this.fixedAmount = fixedAmount;
           this.heightUomId = heightUomId;
           this.inShippingBox = inShippingBox;
           this.includeInPromotions = includeInPromotions;
           this.internalName = internalName;
           this.introductionDate = introductionDate;
           this.inventoryItemTypeId = inventoryItemTypeId;
           this.inventoryMessage = inventoryMessage;
           this.keyword = keyword;
           this.keywordRelevancyWeight = keywordRelevancyWeight;
           this.keywordStatusId = keywordStatusId;
           this.keywordTypeId = keywordTypeId;
           this.largeImageUrl = largeImageUrl;
           this.lastModifiedByUserLogin = lastModifiedByUserLogin;
           this.lastModifiedDate = lastModifiedDate;
           this.lastUpdatedStamp = lastUpdatedStamp;
           this.lastUpdatedTxStamp = lastUpdatedTxStamp;
           this.longDescription = longDescription;
           this.lotIdFiledIn = lotIdFiledIn;
           this.manufacturerPartyId = manufacturerPartyId;
           this.mediumImageUrl = mediumImageUrl;
           this.orderDecimalQuantity = orderDecimalQuantity;
           this.originGeoId = originGeoId;
           this.originalImageUrl = originalImageUrl;
           this.piecesIncluded = piecesIncluded;
           this.priceDetailText = priceDetailText;
           this.primaryProductCategoryId = primaryProductCategoryId;
           this.productDepth = productDepth;
           this.productDiameter = productDiameter;
           this.productHeight = productHeight;
           this.productId = productId;
           this.productName = productName;
           this.productRating = productRating;
           this.productTypeId = productTypeId;
           this.productWeight = productWeight;
           this.productWidth = productWidth;
           this.quantityUomId = quantityUomId;
           this.qunatityIncluded = qunatityIncluded;
           this.ratingTypeEnum = ratingTypeEnum;
           this.releaseDate = releaseDate;
           this.requireAmount = requireAmount;
           this.requireInventory = requireInventory;
           this.requirementMethodEnumId = requirementMethodEnumId;
           this.reserv2NsPPPerc = reserv2NsPPPerc;
           this.reservNthPPPerc = reservNthPPPerc;
           this.reserveMaxPersons = reserveMaxPersons;
           this.returnable = returnable;
           this.salesDiscWhenNotAvail = salesDiscWhenNotAvail;
           this.salesDiscontinuationDate = salesDiscontinuationDate;
           this.shippingDepth = shippingDepth;
           this.shippingHeight = shippingHeight;
           this.shippingWeight = shippingWeight;
           this.shippingWidth = shippingWidth;
           this.smallImageUrl = smallImageUrl;
           this.supportDiscontinuationDate = supportDiscontinuationDate;
           this.taxable = taxable;
           this.variant = variant;
           this.virtual = virtual;
           this.virtualVariantMethodEnum = virtualVariantMethodEnum;
           this.weightUom = weightUom;
           this.widthUomId = widthUomId;
    }


    /**
     * Gets the amountUomTypeId value for this CreateProductInput.
     * 
     * @return amountUomTypeId
     */
    public java.lang.String getAmountUomTypeId() {
        return amountUomTypeId;
    }


    /**
     * Sets the amountUomTypeId value for this CreateProductInput.
     * 
     * @param amountUomTypeId
     */
    public void setAmountUomTypeId(java.lang.String amountUomTypeId) {
        this.amountUomTypeId = amountUomTypeId;
    }


    /**
     * Gets the autoCreateKeywords value for this CreateProductInput.
     * 
     * @return autoCreateKeywords
     */
    public java.lang.String getAutoCreateKeywords() {
        return autoCreateKeywords;
    }


    /**
     * Sets the autoCreateKeywords value for this CreateProductInput.
     * 
     * @param autoCreateKeywords
     */
    public void setAutoCreateKeywords(java.lang.String autoCreateKeywords) {
        this.autoCreateKeywords = autoCreateKeywords;
    }


    /**
     * Gets the billOfMaterialLevel value for this CreateProductInput.
     * 
     * @return billOfMaterialLevel
     */
    public java.lang.String getBillOfMaterialLevel() {
        return billOfMaterialLevel;
    }


    /**
     * Sets the billOfMaterialLevel value for this CreateProductInput.
     * 
     * @param billOfMaterialLevel
     */
    public void setBillOfMaterialLevel(java.lang.String billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }


    /**
     * Gets the brandName value for this CreateProductInput.
     * 
     * @return brandName
     */
    public java.lang.String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this CreateProductInput.
     * 
     * @param brandName
     */
    public void setBrandName(java.lang.String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the chargeShipping value for this CreateProductInput.
     * 
     * @return chargeShipping
     */
    public java.lang.Double getChargeShipping() {
        return chargeShipping;
    }


    /**
     * Sets the chargeShipping value for this CreateProductInput.
     * 
     * @param chargeShipping
     */
    public void setChargeShipping(java.lang.Double chargeShipping) {
        this.chargeShipping = chargeShipping;
    }


    /**
     * Gets the comments value for this CreateProductInput.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this CreateProductInput.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the configId value for this CreateProductInput.
     * 
     * @return configId
     */
    public java.lang.String getConfigId() {
        return configId;
    }


    /**
     * Sets the configId value for this CreateProductInput.
     * 
     * @param configId
     */
    public void setConfigId(java.lang.String configId) {
        this.configId = configId;
    }


    /**
     * Gets the createdByUserLogin value for this CreateProductInput.
     * 
     * @return createdByUserLogin
     */
    public java.lang.String getCreatedByUserLogin() {
        return createdByUserLogin;
    }


    /**
     * Sets the createdByUserLogin value for this CreateProductInput.
     * 
     * @param createdByUserLogin
     */
    public void setCreatedByUserLogin(java.lang.String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }


    /**
     * Gets the createdDate value for this CreateProductInput.
     * 
     * @return createdDate
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CreateProductInput.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the createdStamp value for this CreateProductInput.
     * 
     * @return createdStamp
     */
    public java.util.Date getCreatedStamp() {
        return createdStamp;
    }


    /**
     * Sets the createdStamp value for this CreateProductInput.
     * 
     * @param createdStamp
     */
    public void setCreatedStamp(java.util.Date createdStamp) {
        this.createdStamp = createdStamp;
    }


    /**
     * Gets the createdTxStamp value for this CreateProductInput.
     * 
     * @return createdTxStamp
     */
    public java.util.Date getCreatedTxStamp() {
        return createdTxStamp;
    }


    /**
     * Sets the createdTxStamp value for this CreateProductInput.
     * 
     * @param createdTxStamp
     */
    public void setCreatedTxStamp(java.util.Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }


    /**
     * Gets the defaultShipmentBoxTypeId value for this CreateProductInput.
     * 
     * @return defaultShipmentBoxTypeId
     */
    public java.lang.String getDefaultShipmentBoxTypeId() {
        return defaultShipmentBoxTypeId;
    }


    /**
     * Sets the defaultShipmentBoxTypeId value for this CreateProductInput.
     * 
     * @param defaultShipmentBoxTypeId
     */
    public void setDefaultShipmentBoxTypeId(java.lang.String defaultShipmentBoxTypeId) {
        this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
    }


    /**
     * Gets the depthUomId value for this CreateProductInput.
     * 
     * @return depthUomId
     */
    public java.lang.String getDepthUomId() {
        return depthUomId;
    }


    /**
     * Sets the depthUomId value for this CreateProductInput.
     * 
     * @param depthUomId
     */
    public void setDepthUomId(java.lang.String depthUomId) {
        this.depthUomId = depthUomId;
    }


    /**
     * Gets the description value for this CreateProductInput.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CreateProductInput.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the detailImageUrl value for this CreateProductInput.
     * 
     * @return detailImageUrl
     */
    public java.lang.String getDetailImageUrl() {
        return detailImageUrl;
    }


    /**
     * Sets the detailImageUrl value for this CreateProductInput.
     * 
     * @param detailImageUrl
     */
    public void setDetailImageUrl(java.lang.String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }


    /**
     * Gets the detailScreen value for this CreateProductInput.
     * 
     * @return detailScreen
     */
    public java.lang.String getDetailScreen() {
        return detailScreen;
    }


    /**
     * Sets the detailScreen value for this CreateProductInput.
     * 
     * @param detailScreen
     */
    public void setDetailScreen(java.lang.String detailScreen) {
        this.detailScreen = detailScreen;
    }


    /**
     * Gets the diameterUomId value for this CreateProductInput.
     * 
     * @return diameterUomId
     */
    public java.lang.String getDiameterUomId() {
        return diameterUomId;
    }


    /**
     * Sets the diameterUomId value for this CreateProductInput.
     * 
     * @param diameterUomId
     */
    public void setDiameterUomId(java.lang.String diameterUomId) {
        this.diameterUomId = diameterUomId;
    }


    /**
     * Gets the facilityId value for this CreateProductInput.
     * 
     * @return facilityId
     */
    public java.lang.String getFacilityId() {
        return facilityId;
    }


    /**
     * Sets the facilityId value for this CreateProductInput.
     * 
     * @param facilityId
     */
    public void setFacilityId(java.lang.String facilityId) {
        this.facilityId = facilityId;
    }


    /**
     * Gets the fixedAmount value for this CreateProductInput.
     * 
     * @return fixedAmount
     */
    public java.lang.Double getFixedAmount() {
        return fixedAmount;
    }


    /**
     * Sets the fixedAmount value for this CreateProductInput.
     * 
     * @param fixedAmount
     */
    public void setFixedAmount(java.lang.Double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }


    /**
     * Gets the heightUomId value for this CreateProductInput.
     * 
     * @return heightUomId
     */
    public java.lang.String getHeightUomId() {
        return heightUomId;
    }


    /**
     * Sets the heightUomId value for this CreateProductInput.
     * 
     * @param heightUomId
     */
    public void setHeightUomId(java.lang.String heightUomId) {
        this.heightUomId = heightUomId;
    }


    /**
     * Gets the inShippingBox value for this CreateProductInput.
     * 
     * @return inShippingBox
     */
    public java.lang.String getInShippingBox() {
        return inShippingBox;
    }


    /**
     * Sets the inShippingBox value for this CreateProductInput.
     * 
     * @param inShippingBox
     */
    public void setInShippingBox(java.lang.String inShippingBox) {
        this.inShippingBox = inShippingBox;
    }


    /**
     * Gets the includeInPromotions value for this CreateProductInput.
     * 
     * @return includeInPromotions
     */
    public java.lang.Boolean getIncludeInPromotions() {
        return includeInPromotions;
    }


    /**
     * Sets the includeInPromotions value for this CreateProductInput.
     * 
     * @param includeInPromotions
     */
    public void setIncludeInPromotions(java.lang.Boolean includeInPromotions) {
        this.includeInPromotions = includeInPromotions;
    }


    /**
     * Gets the internalName value for this CreateProductInput.
     * 
     * @return internalName
     */
    public java.lang.String getInternalName() {
        return internalName;
    }


    /**
     * Sets the internalName value for this CreateProductInput.
     * 
     * @param internalName
     */
    public void setInternalName(java.lang.String internalName) {
        this.internalName = internalName;
    }


    /**
     * Gets the introductionDate value for this CreateProductInput.
     * 
     * @return introductionDate
     */
    public java.util.Date getIntroductionDate() {
        return introductionDate;
    }


    /**
     * Sets the introductionDate value for this CreateProductInput.
     * 
     * @param introductionDate
     */
    public void setIntroductionDate(java.util.Date introductionDate) {
        this.introductionDate = introductionDate;
    }


    /**
     * Gets the inventoryItemTypeId value for this CreateProductInput.
     * 
     * @return inventoryItemTypeId
     */
    public java.lang.String getInventoryItemTypeId() {
        return inventoryItemTypeId;
    }


    /**
     * Sets the inventoryItemTypeId value for this CreateProductInput.
     * 
     * @param inventoryItemTypeId
     */
    public void setInventoryItemTypeId(java.lang.String inventoryItemTypeId) {
        this.inventoryItemTypeId = inventoryItemTypeId;
    }


    /**
     * Gets the inventoryMessage value for this CreateProductInput.
     * 
     * @return inventoryMessage
     */
    public java.lang.String getInventoryMessage() {
        return inventoryMessage;
    }


    /**
     * Sets the inventoryMessage value for this CreateProductInput.
     * 
     * @param inventoryMessage
     */
    public void setInventoryMessage(java.lang.String inventoryMessage) {
        this.inventoryMessage = inventoryMessage;
    }


    /**
     * Gets the keyword value for this CreateProductInput.
     * 
     * @return keyword
     */
    public java.lang.String getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this CreateProductInput.
     * 
     * @param keyword
     */
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the keywordRelevancyWeight value for this CreateProductInput.
     * 
     * @return keywordRelevancyWeight
     */
    public java.lang.String getKeywordRelevancyWeight() {
        return keywordRelevancyWeight;
    }


    /**
     * Sets the keywordRelevancyWeight value for this CreateProductInput.
     * 
     * @param keywordRelevancyWeight
     */
    public void setKeywordRelevancyWeight(java.lang.String keywordRelevancyWeight) {
        this.keywordRelevancyWeight = keywordRelevancyWeight;
    }


    /**
     * Gets the keywordStatusId value for this CreateProductInput.
     * 
     * @return keywordStatusId
     */
    public java.lang.String getKeywordStatusId() {
        return keywordStatusId;
    }


    /**
     * Sets the keywordStatusId value for this CreateProductInput.
     * 
     * @param keywordStatusId
     */
    public void setKeywordStatusId(java.lang.String keywordStatusId) {
        this.keywordStatusId = keywordStatusId;
    }


    /**
     * Gets the keywordTypeId value for this CreateProductInput.
     * 
     * @return keywordTypeId
     */
    public java.lang.String getKeywordTypeId() {
        return keywordTypeId;
    }


    /**
     * Sets the keywordTypeId value for this CreateProductInput.
     * 
     * @param keywordTypeId
     */
    public void setKeywordTypeId(java.lang.String keywordTypeId) {
        this.keywordTypeId = keywordTypeId;
    }


    /**
     * Gets the largeImageUrl value for this CreateProductInput.
     * 
     * @return largeImageUrl
     */
    public java.lang.String getLargeImageUrl() {
        return largeImageUrl;
    }


    /**
     * Sets the largeImageUrl value for this CreateProductInput.
     * 
     * @param largeImageUrl
     */
    public void setLargeImageUrl(java.lang.String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }


    /**
     * Gets the lastModifiedByUserLogin value for this CreateProductInput.
     * 
     * @return lastModifiedByUserLogin
     */
    public java.lang.String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }


    /**
     * Sets the lastModifiedByUserLogin value for this CreateProductInput.
     * 
     * @param lastModifiedByUserLogin
     */
    public void setLastModifiedByUserLogin(java.lang.String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }


    /**
     * Gets the lastModifiedDate value for this CreateProductInput.
     * 
     * @return lastModifiedDate
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CreateProductInput.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastUpdatedStamp value for this CreateProductInput.
     * 
     * @return lastUpdatedStamp
     */
    public java.lang.String getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }


    /**
     * Sets the lastUpdatedStamp value for this CreateProductInput.
     * 
     * @param lastUpdatedStamp
     */
    public void setLastUpdatedStamp(java.lang.String lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }


    /**
     * Gets the lastUpdatedTxStamp value for this CreateProductInput.
     * 
     * @return lastUpdatedTxStamp
     */
    public java.lang.String getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }


    /**
     * Sets the lastUpdatedTxStamp value for this CreateProductInput.
     * 
     * @param lastUpdatedTxStamp
     */
    public void setLastUpdatedTxStamp(java.lang.String lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }


    /**
     * Gets the longDescription value for this CreateProductInput.
     * 
     * @return longDescription
     */
    public java.lang.String getLongDescription() {
        return longDescription;
    }


    /**
     * Sets the longDescription value for this CreateProductInput.
     * 
     * @param longDescription
     */
    public void setLongDescription(java.lang.String longDescription) {
        this.longDescription = longDescription;
    }


    /**
     * Gets the lotIdFiledIn value for this CreateProductInput.
     * 
     * @return lotIdFiledIn
     */
    public java.lang.String getLotIdFiledIn() {
        return lotIdFiledIn;
    }


    /**
     * Sets the lotIdFiledIn value for this CreateProductInput.
     * 
     * @param lotIdFiledIn
     */
    public void setLotIdFiledIn(java.lang.String lotIdFiledIn) {
        this.lotIdFiledIn = lotIdFiledIn;
    }


    /**
     * Gets the manufacturerPartyId value for this CreateProductInput.
     * 
     * @return manufacturerPartyId
     */
    public java.lang.String getManufacturerPartyId() {
        return manufacturerPartyId;
    }


    /**
     * Sets the manufacturerPartyId value for this CreateProductInput.
     * 
     * @param manufacturerPartyId
     */
    public void setManufacturerPartyId(java.lang.String manufacturerPartyId) {
        this.manufacturerPartyId = manufacturerPartyId;
    }


    /**
     * Gets the mediumImageUrl value for this CreateProductInput.
     * 
     * @return mediumImageUrl
     */
    public java.lang.String getMediumImageUrl() {
        return mediumImageUrl;
    }


    /**
     * Sets the mediumImageUrl value for this CreateProductInput.
     * 
     * @param mediumImageUrl
     */
    public void setMediumImageUrl(java.lang.String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }


    /**
     * Gets the orderDecimalQuantity value for this CreateProductInput.
     * 
     * @return orderDecimalQuantity
     */
    public java.lang.Double getOrderDecimalQuantity() {
        return orderDecimalQuantity;
    }


    /**
     * Sets the orderDecimalQuantity value for this CreateProductInput.
     * 
     * @param orderDecimalQuantity
     */
    public void setOrderDecimalQuantity(java.lang.Double orderDecimalQuantity) {
        this.orderDecimalQuantity = orderDecimalQuantity;
    }


    /**
     * Gets the originGeoId value for this CreateProductInput.
     * 
     * @return originGeoId
     */
    public java.lang.String getOriginGeoId() {
        return originGeoId;
    }


    /**
     * Sets the originGeoId value for this CreateProductInput.
     * 
     * @param originGeoId
     */
    public void setOriginGeoId(java.lang.String originGeoId) {
        this.originGeoId = originGeoId;
    }


    /**
     * Gets the originalImageUrl value for this CreateProductInput.
     * 
     * @return originalImageUrl
     */
    public java.lang.String getOriginalImageUrl() {
        return originalImageUrl;
    }


    /**
     * Sets the originalImageUrl value for this CreateProductInput.
     * 
     * @param originalImageUrl
     */
    public void setOriginalImageUrl(java.lang.String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }


    /**
     * Gets the piecesIncluded value for this CreateProductInput.
     * 
     * @return piecesIncluded
     */
    public java.lang.Double getPiecesIncluded() {
        return piecesIncluded;
    }


    /**
     * Sets the piecesIncluded value for this CreateProductInput.
     * 
     * @param piecesIncluded
     */
    public void setPiecesIncluded(java.lang.Double piecesIncluded) {
        this.piecesIncluded = piecesIncluded;
    }


    /**
     * Gets the priceDetailText value for this CreateProductInput.
     * 
     * @return priceDetailText
     */
    public java.lang.String getPriceDetailText() {
        return priceDetailText;
    }


    /**
     * Sets the priceDetailText value for this CreateProductInput.
     * 
     * @param priceDetailText
     */
    public void setPriceDetailText(java.lang.String priceDetailText) {
        this.priceDetailText = priceDetailText;
    }


    /**
     * Gets the primaryProductCategoryId value for this CreateProductInput.
     * 
     * @return primaryProductCategoryId
     */
    public java.lang.String getPrimaryProductCategoryId() {
        return primaryProductCategoryId;
    }


    /**
     * Sets the primaryProductCategoryId value for this CreateProductInput.
     * 
     * @param primaryProductCategoryId
     */
    public void setPrimaryProductCategoryId(java.lang.String primaryProductCategoryId) {
        this.primaryProductCategoryId = primaryProductCategoryId;
    }


    /**
     * Gets the productDepth value for this CreateProductInput.
     * 
     * @return productDepth
     */
    public java.lang.String getProductDepth() {
        return productDepth;
    }


    /**
     * Sets the productDepth value for this CreateProductInput.
     * 
     * @param productDepth
     */
    public void setProductDepth(java.lang.String productDepth) {
        this.productDepth = productDepth;
    }


    /**
     * Gets the productDiameter value for this CreateProductInput.
     * 
     * @return productDiameter
     */
    public java.lang.String getProductDiameter() {
        return productDiameter;
    }


    /**
     * Sets the productDiameter value for this CreateProductInput.
     * 
     * @param productDiameter
     */
    public void setProductDiameter(java.lang.String productDiameter) {
        this.productDiameter = productDiameter;
    }


    /**
     * Gets the productHeight value for this CreateProductInput.
     * 
     * @return productHeight
     */
    public java.lang.String getProductHeight() {
        return productHeight;
    }


    /**
     * Sets the productHeight value for this CreateProductInput.
     * 
     * @param productHeight
     */
    public void setProductHeight(java.lang.String productHeight) {
        this.productHeight = productHeight;
    }


    /**
     * Gets the productId value for this CreateProductInput.
     * 
     * @return productId
     */
    public java.lang.String getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this CreateProductInput.
     * 
     * @param productId
     */
    public void setProductId(java.lang.String productId) {
        this.productId = productId;
    }


    /**
     * Gets the productName value for this CreateProductInput.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this CreateProductInput.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productRating value for this CreateProductInput.
     * 
     * @return productRating
     */
    public java.lang.String getProductRating() {
        return productRating;
    }


    /**
     * Sets the productRating value for this CreateProductInput.
     * 
     * @param productRating
     */
    public void setProductRating(java.lang.String productRating) {
        this.productRating = productRating;
    }


    /**
     * Gets the productTypeId value for this CreateProductInput.
     * 
     * @return productTypeId
     */
    public java.lang.String getProductTypeId() {
        return productTypeId;
    }


    /**
     * Sets the productTypeId value for this CreateProductInput.
     * 
     * @param productTypeId
     */
    public void setProductTypeId(java.lang.String productTypeId) {
        this.productTypeId = productTypeId;
    }


    /**
     * Gets the productWeight value for this CreateProductInput.
     * 
     * @return productWeight
     */
    public java.lang.String getProductWeight() {
        return productWeight;
    }


    /**
     * Sets the productWeight value for this CreateProductInput.
     * 
     * @param productWeight
     */
    public void setProductWeight(java.lang.String productWeight) {
        this.productWeight = productWeight;
    }


    /**
     * Gets the productWidth value for this CreateProductInput.
     * 
     * @return productWidth
     */
    public java.lang.String getProductWidth() {
        return productWidth;
    }


    /**
     * Sets the productWidth value for this CreateProductInput.
     * 
     * @param productWidth
     */
    public void setProductWidth(java.lang.String productWidth) {
        this.productWidth = productWidth;
    }


    /**
     * Gets the quantityUomId value for this CreateProductInput.
     * 
     * @return quantityUomId
     */
    public java.lang.String getQuantityUomId() {
        return quantityUomId;
    }


    /**
     * Sets the quantityUomId value for this CreateProductInput.
     * 
     * @param quantityUomId
     */
    public void setQuantityUomId(java.lang.String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }


    /**
     * Gets the qunatityIncluded value for this CreateProductInput.
     * 
     * @return qunatityIncluded
     */
    public java.lang.Double getQunatityIncluded() {
        return qunatityIncluded;
    }


    /**
     * Sets the qunatityIncluded value for this CreateProductInput.
     * 
     * @param qunatityIncluded
     */
    public void setQunatityIncluded(java.lang.Double qunatityIncluded) {
        this.qunatityIncluded = qunatityIncluded;
    }


    /**
     * Gets the ratingTypeEnum value for this CreateProductInput.
     * 
     * @return ratingTypeEnum
     */
    public java.lang.String getRatingTypeEnum() {
        return ratingTypeEnum;
    }


    /**
     * Sets the ratingTypeEnum value for this CreateProductInput.
     * 
     * @param ratingTypeEnum
     */
    public void setRatingTypeEnum(java.lang.String ratingTypeEnum) {
        this.ratingTypeEnum = ratingTypeEnum;
    }


    /**
     * Gets the releaseDate value for this CreateProductInput.
     * 
     * @return releaseDate
     */
    public java.util.Date getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this CreateProductInput.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.util.Date releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the requireAmount value for this CreateProductInput.
     * 
     * @return requireAmount
     */
    public java.lang.Double getRequireAmount() {
        return requireAmount;
    }


    /**
     * Sets the requireAmount value for this CreateProductInput.
     * 
     * @param requireAmount
     */
    public void setRequireAmount(java.lang.Double requireAmount) {
        this.requireAmount = requireAmount;
    }


    /**
     * Gets the requireInventory value for this CreateProductInput.
     * 
     * @return requireInventory
     */
    public java.lang.String getRequireInventory() {
        return requireInventory;
    }


    /**
     * Sets the requireInventory value for this CreateProductInput.
     * 
     * @param requireInventory
     */
    public void setRequireInventory(java.lang.String requireInventory) {
        this.requireInventory = requireInventory;
    }


    /**
     * Gets the requirementMethodEnumId value for this CreateProductInput.
     * 
     * @return requirementMethodEnumId
     */
    public java.lang.String getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }


    /**
     * Sets the requirementMethodEnumId value for this CreateProductInput.
     * 
     * @param requirementMethodEnumId
     */
    public void setRequirementMethodEnumId(java.lang.String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }


    /**
     * Gets the reserv2NsPPPerc value for this CreateProductInput.
     * 
     * @return reserv2NsPPPerc
     */
    public java.lang.String getReserv2NsPPPerc() {
        return reserv2NsPPPerc;
    }


    /**
     * Sets the reserv2NsPPPerc value for this CreateProductInput.
     * 
     * @param reserv2NsPPPerc
     */
    public void setReserv2NsPPPerc(java.lang.String reserv2NsPPPerc) {
        this.reserv2NsPPPerc = reserv2NsPPPerc;
    }


    /**
     * Gets the reservNthPPPerc value for this CreateProductInput.
     * 
     * @return reservNthPPPerc
     */
    public java.lang.String getReservNthPPPerc() {
        return reservNthPPPerc;
    }


    /**
     * Sets the reservNthPPPerc value for this CreateProductInput.
     * 
     * @param reservNthPPPerc
     */
    public void setReservNthPPPerc(java.lang.String reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }


    /**
     * Gets the reserveMaxPersons value for this CreateProductInput.
     * 
     * @return reserveMaxPersons
     */
    public java.lang.String getReserveMaxPersons() {
        return reserveMaxPersons;
    }


    /**
     * Sets the reserveMaxPersons value for this CreateProductInput.
     * 
     * @param reserveMaxPersons
     */
    public void setReserveMaxPersons(java.lang.String reserveMaxPersons) {
        this.reserveMaxPersons = reserveMaxPersons;
    }


    /**
     * Gets the returnable value for this CreateProductInput.
     * 
     * @return returnable
     */
    public java.lang.Boolean getReturnable() {
        return returnable;
    }


    /**
     * Sets the returnable value for this CreateProductInput.
     * 
     * @param returnable
     */
    public void setReturnable(java.lang.Boolean returnable) {
        this.returnable = returnable;
    }


    /**
     * Gets the salesDiscWhenNotAvail value for this CreateProductInput.
     * 
     * @return salesDiscWhenNotAvail
     */
    public java.lang.String getSalesDiscWhenNotAvail() {
        return salesDiscWhenNotAvail;
    }


    /**
     * Sets the salesDiscWhenNotAvail value for this CreateProductInput.
     * 
     * @param salesDiscWhenNotAvail
     */
    public void setSalesDiscWhenNotAvail(java.lang.String salesDiscWhenNotAvail) {
        this.salesDiscWhenNotAvail = salesDiscWhenNotAvail;
    }


    /**
     * Gets the salesDiscontinuationDate value for this CreateProductInput.
     * 
     * @return salesDiscontinuationDate
     */
    public java.util.Date getSalesDiscontinuationDate() {
        return salesDiscontinuationDate;
    }


    /**
     * Sets the salesDiscontinuationDate value for this CreateProductInput.
     * 
     * @param salesDiscontinuationDate
     */
    public void setSalesDiscontinuationDate(java.util.Date salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }


    /**
     * Gets the shippingDepth value for this CreateProductInput.
     * 
     * @return shippingDepth
     */
    public java.lang.String getShippingDepth() {
        return shippingDepth;
    }


    /**
     * Sets the shippingDepth value for this CreateProductInput.
     * 
     * @param shippingDepth
     */
    public void setShippingDepth(java.lang.String shippingDepth) {
        this.shippingDepth = shippingDepth;
    }


    /**
     * Gets the shippingHeight value for this CreateProductInput.
     * 
     * @return shippingHeight
     */
    public java.lang.String getShippingHeight() {
        return shippingHeight;
    }


    /**
     * Sets the shippingHeight value for this CreateProductInput.
     * 
     * @param shippingHeight
     */
    public void setShippingHeight(java.lang.String shippingHeight) {
        this.shippingHeight = shippingHeight;
    }


    /**
     * Gets the shippingWeight value for this CreateProductInput.
     * 
     * @return shippingWeight
     */
    public java.lang.String getShippingWeight() {
        return shippingWeight;
    }


    /**
     * Sets the shippingWeight value for this CreateProductInput.
     * 
     * @param shippingWeight
     */
    public void setShippingWeight(java.lang.String shippingWeight) {
        this.shippingWeight = shippingWeight;
    }


    /**
     * Gets the shippingWidth value for this CreateProductInput.
     * 
     * @return shippingWidth
     */
    public java.lang.String getShippingWidth() {
        return shippingWidth;
    }


    /**
     * Sets the shippingWidth value for this CreateProductInput.
     * 
     * @param shippingWidth
     */
    public void setShippingWidth(java.lang.String shippingWidth) {
        this.shippingWidth = shippingWidth;
    }


    /**
     * Gets the smallImageUrl value for this CreateProductInput.
     * 
     * @return smallImageUrl
     */
    public java.lang.String getSmallImageUrl() {
        return smallImageUrl;
    }


    /**
     * Sets the smallImageUrl value for this CreateProductInput.
     * 
     * @param smallImageUrl
     */
    public void setSmallImageUrl(java.lang.String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }


    /**
     * Gets the supportDiscontinuationDate value for this CreateProductInput.
     * 
     * @return supportDiscontinuationDate
     */
    public java.util.Date getSupportDiscontinuationDate() {
        return supportDiscontinuationDate;
    }


    /**
     * Sets the supportDiscontinuationDate value for this CreateProductInput.
     * 
     * @param supportDiscontinuationDate
     */
    public void setSupportDiscontinuationDate(java.util.Date supportDiscontinuationDate) {
        this.supportDiscontinuationDate = supportDiscontinuationDate;
    }


    /**
     * Gets the taxable value for this CreateProductInput.
     * 
     * @return taxable
     */
    public java.lang.Boolean getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this CreateProductInput.
     * 
     * @param taxable
     */
    public void setTaxable(java.lang.Boolean taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the variant value for this CreateProductInput.
     * 
     * @return variant
     */
    public java.lang.Boolean getVariant() {
        return variant;
    }


    /**
     * Sets the variant value for this CreateProductInput.
     * 
     * @param variant
     */
    public void setVariant(java.lang.Boolean variant) {
        this.variant = variant;
    }


    /**
     * Gets the virtual value for this CreateProductInput.
     * 
     * @return virtual
     */
    public java.lang.Boolean getVirtual() {
        return virtual;
    }


    /**
     * Sets the virtual value for this CreateProductInput.
     * 
     * @param virtual
     */
    public void setVirtual(java.lang.Boolean virtual) {
        this.virtual = virtual;
    }


    /**
     * Gets the virtualVariantMethodEnum value for this CreateProductInput.
     * 
     * @return virtualVariantMethodEnum
     */
    public java.lang.String getVirtualVariantMethodEnum() {
        return virtualVariantMethodEnum;
    }


    /**
     * Sets the virtualVariantMethodEnum value for this CreateProductInput.
     * 
     * @param virtualVariantMethodEnum
     */
    public void setVirtualVariantMethodEnum(java.lang.String virtualVariantMethodEnum) {
        this.virtualVariantMethodEnum = virtualVariantMethodEnum;
    }


    /**
     * Gets the weightUom value for this CreateProductInput.
     * 
     * @return weightUom
     */
    public java.lang.String getWeightUom() {
        return weightUom;
    }


    /**
     * Sets the weightUom value for this CreateProductInput.
     * 
     * @param weightUom
     */
    public void setWeightUom(java.lang.String weightUom) {
        this.weightUom = weightUom;
    }


    /**
     * Gets the widthUomId value for this CreateProductInput.
     * 
     * @return widthUomId
     */
    public java.lang.String getWidthUomId() {
        return widthUomId;
    }


    /**
     * Sets the widthUomId value for this CreateProductInput.
     * 
     * @param widthUomId
     */
    public void setWidthUomId(java.lang.String widthUomId) {
        this.widthUomId = widthUomId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateProductInput)) return false;
        CreateProductInput other = (CreateProductInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountUomTypeId==null && other.getAmountUomTypeId()==null) || 
             (this.amountUomTypeId!=null &&
              this.amountUomTypeId.equals(other.getAmountUomTypeId()))) &&
            ((this.autoCreateKeywords==null && other.getAutoCreateKeywords()==null) || 
             (this.autoCreateKeywords!=null &&
              this.autoCreateKeywords.equals(other.getAutoCreateKeywords()))) &&
            ((this.billOfMaterialLevel==null && other.getBillOfMaterialLevel()==null) || 
             (this.billOfMaterialLevel!=null &&
              this.billOfMaterialLevel.equals(other.getBillOfMaterialLevel()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.chargeShipping==null && other.getChargeShipping()==null) || 
             (this.chargeShipping!=null &&
              this.chargeShipping.equals(other.getChargeShipping()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.configId==null && other.getConfigId()==null) || 
             (this.configId!=null &&
              this.configId.equals(other.getConfigId()))) &&
            ((this.createdByUserLogin==null && other.getCreatedByUserLogin()==null) || 
             (this.createdByUserLogin!=null &&
              this.createdByUserLogin.equals(other.getCreatedByUserLogin()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.createdStamp==null && other.getCreatedStamp()==null) || 
             (this.createdStamp!=null &&
              this.createdStamp.equals(other.getCreatedStamp()))) &&
            ((this.createdTxStamp==null && other.getCreatedTxStamp()==null) || 
             (this.createdTxStamp!=null &&
              this.createdTxStamp.equals(other.getCreatedTxStamp()))) &&
            ((this.defaultShipmentBoxTypeId==null && other.getDefaultShipmentBoxTypeId()==null) || 
             (this.defaultShipmentBoxTypeId!=null &&
              this.defaultShipmentBoxTypeId.equals(other.getDefaultShipmentBoxTypeId()))) &&
            ((this.depthUomId==null && other.getDepthUomId()==null) || 
             (this.depthUomId!=null &&
              this.depthUomId.equals(other.getDepthUomId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.detailImageUrl==null && other.getDetailImageUrl()==null) || 
             (this.detailImageUrl!=null &&
              this.detailImageUrl.equals(other.getDetailImageUrl()))) &&
            ((this.detailScreen==null && other.getDetailScreen()==null) || 
             (this.detailScreen!=null &&
              this.detailScreen.equals(other.getDetailScreen()))) &&
            ((this.diameterUomId==null && other.getDiameterUomId()==null) || 
             (this.diameterUomId!=null &&
              this.diameterUomId.equals(other.getDiameterUomId()))) &&
            ((this.facilityId==null && other.getFacilityId()==null) || 
             (this.facilityId!=null &&
              this.facilityId.equals(other.getFacilityId()))) &&
            ((this.fixedAmount==null && other.getFixedAmount()==null) || 
             (this.fixedAmount!=null &&
              this.fixedAmount.equals(other.getFixedAmount()))) &&
            ((this.heightUomId==null && other.getHeightUomId()==null) || 
             (this.heightUomId!=null &&
              this.heightUomId.equals(other.getHeightUomId()))) &&
            ((this.inShippingBox==null && other.getInShippingBox()==null) || 
             (this.inShippingBox!=null &&
              this.inShippingBox.equals(other.getInShippingBox()))) &&
            ((this.includeInPromotions==null && other.getIncludeInPromotions()==null) || 
             (this.includeInPromotions!=null &&
              this.includeInPromotions.equals(other.getIncludeInPromotions()))) &&
            ((this.internalName==null && other.getInternalName()==null) || 
             (this.internalName!=null &&
              this.internalName.equals(other.getInternalName()))) &&
            ((this.introductionDate==null && other.getIntroductionDate()==null) || 
             (this.introductionDate!=null &&
              this.introductionDate.equals(other.getIntroductionDate()))) &&
            ((this.inventoryItemTypeId==null && other.getInventoryItemTypeId()==null) || 
             (this.inventoryItemTypeId!=null &&
              this.inventoryItemTypeId.equals(other.getInventoryItemTypeId()))) &&
            ((this.inventoryMessage==null && other.getInventoryMessage()==null) || 
             (this.inventoryMessage!=null &&
              this.inventoryMessage.equals(other.getInventoryMessage()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.keywordRelevancyWeight==null && other.getKeywordRelevancyWeight()==null) || 
             (this.keywordRelevancyWeight!=null &&
              this.keywordRelevancyWeight.equals(other.getKeywordRelevancyWeight()))) &&
            ((this.keywordStatusId==null && other.getKeywordStatusId()==null) || 
             (this.keywordStatusId!=null &&
              this.keywordStatusId.equals(other.getKeywordStatusId()))) &&
            ((this.keywordTypeId==null && other.getKeywordTypeId()==null) || 
             (this.keywordTypeId!=null &&
              this.keywordTypeId.equals(other.getKeywordTypeId()))) &&
            ((this.largeImageUrl==null && other.getLargeImageUrl()==null) || 
             (this.largeImageUrl!=null &&
              this.largeImageUrl.equals(other.getLargeImageUrl()))) &&
            ((this.lastModifiedByUserLogin==null && other.getLastModifiedByUserLogin()==null) || 
             (this.lastModifiedByUserLogin!=null &&
              this.lastModifiedByUserLogin.equals(other.getLastModifiedByUserLogin()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastUpdatedStamp==null && other.getLastUpdatedStamp()==null) || 
             (this.lastUpdatedStamp!=null &&
              this.lastUpdatedStamp.equals(other.getLastUpdatedStamp()))) &&
            ((this.lastUpdatedTxStamp==null && other.getLastUpdatedTxStamp()==null) || 
             (this.lastUpdatedTxStamp!=null &&
              this.lastUpdatedTxStamp.equals(other.getLastUpdatedTxStamp()))) &&
            ((this.longDescription==null && other.getLongDescription()==null) || 
             (this.longDescription!=null &&
              this.longDescription.equals(other.getLongDescription()))) &&
            ((this.lotIdFiledIn==null && other.getLotIdFiledIn()==null) || 
             (this.lotIdFiledIn!=null &&
              this.lotIdFiledIn.equals(other.getLotIdFiledIn()))) &&
            ((this.manufacturerPartyId==null && other.getManufacturerPartyId()==null) || 
             (this.manufacturerPartyId!=null &&
              this.manufacturerPartyId.equals(other.getManufacturerPartyId()))) &&
            ((this.mediumImageUrl==null && other.getMediumImageUrl()==null) || 
             (this.mediumImageUrl!=null &&
              this.mediumImageUrl.equals(other.getMediumImageUrl()))) &&
            ((this.orderDecimalQuantity==null && other.getOrderDecimalQuantity()==null) || 
             (this.orderDecimalQuantity!=null &&
              this.orderDecimalQuantity.equals(other.getOrderDecimalQuantity()))) &&
            ((this.originGeoId==null && other.getOriginGeoId()==null) || 
             (this.originGeoId!=null &&
              this.originGeoId.equals(other.getOriginGeoId()))) &&
            ((this.originalImageUrl==null && other.getOriginalImageUrl()==null) || 
             (this.originalImageUrl!=null &&
              this.originalImageUrl.equals(other.getOriginalImageUrl()))) &&
            ((this.piecesIncluded==null && other.getPiecesIncluded()==null) || 
             (this.piecesIncluded!=null &&
              this.piecesIncluded.equals(other.getPiecesIncluded()))) &&
            ((this.priceDetailText==null && other.getPriceDetailText()==null) || 
             (this.priceDetailText!=null &&
              this.priceDetailText.equals(other.getPriceDetailText()))) &&
            ((this.primaryProductCategoryId==null && other.getPrimaryProductCategoryId()==null) || 
             (this.primaryProductCategoryId!=null &&
              this.primaryProductCategoryId.equals(other.getPrimaryProductCategoryId()))) &&
            ((this.productDepth==null && other.getProductDepth()==null) || 
             (this.productDepth!=null &&
              this.productDepth.equals(other.getProductDepth()))) &&
            ((this.productDiameter==null && other.getProductDiameter()==null) || 
             (this.productDiameter!=null &&
              this.productDiameter.equals(other.getProductDiameter()))) &&
            ((this.productHeight==null && other.getProductHeight()==null) || 
             (this.productHeight!=null &&
              this.productHeight.equals(other.getProductHeight()))) &&
            ((this.productId==null && other.getProductId()==null) || 
             (this.productId!=null &&
              this.productId.equals(other.getProductId()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productRating==null && other.getProductRating()==null) || 
             (this.productRating!=null &&
              this.productRating.equals(other.getProductRating()))) &&
            ((this.productTypeId==null && other.getProductTypeId()==null) || 
             (this.productTypeId!=null &&
              this.productTypeId.equals(other.getProductTypeId()))) &&
            ((this.productWeight==null && other.getProductWeight()==null) || 
             (this.productWeight!=null &&
              this.productWeight.equals(other.getProductWeight()))) &&
            ((this.productWidth==null && other.getProductWidth()==null) || 
             (this.productWidth!=null &&
              this.productWidth.equals(other.getProductWidth()))) &&
            ((this.quantityUomId==null && other.getQuantityUomId()==null) || 
             (this.quantityUomId!=null &&
              this.quantityUomId.equals(other.getQuantityUomId()))) &&
            ((this.qunatityIncluded==null && other.getQunatityIncluded()==null) || 
             (this.qunatityIncluded!=null &&
              this.qunatityIncluded.equals(other.getQunatityIncluded()))) &&
            ((this.ratingTypeEnum==null && other.getRatingTypeEnum()==null) || 
             (this.ratingTypeEnum!=null &&
              this.ratingTypeEnum.equals(other.getRatingTypeEnum()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
            ((this.requireAmount==null && other.getRequireAmount()==null) || 
             (this.requireAmount!=null &&
              this.requireAmount.equals(other.getRequireAmount()))) &&
            ((this.requireInventory==null && other.getRequireInventory()==null) || 
             (this.requireInventory!=null &&
              this.requireInventory.equals(other.getRequireInventory()))) &&
            ((this.requirementMethodEnumId==null && other.getRequirementMethodEnumId()==null) || 
             (this.requirementMethodEnumId!=null &&
              this.requirementMethodEnumId.equals(other.getRequirementMethodEnumId()))) &&
            ((this.reserv2NsPPPerc==null && other.getReserv2NsPPPerc()==null) || 
             (this.reserv2NsPPPerc!=null &&
              this.reserv2NsPPPerc.equals(other.getReserv2NsPPPerc()))) &&
            ((this.reservNthPPPerc==null && other.getReservNthPPPerc()==null) || 
             (this.reservNthPPPerc!=null &&
              this.reservNthPPPerc.equals(other.getReservNthPPPerc()))) &&
            ((this.reserveMaxPersons==null && other.getReserveMaxPersons()==null) || 
             (this.reserveMaxPersons!=null &&
              this.reserveMaxPersons.equals(other.getReserveMaxPersons()))) &&
            ((this.returnable==null && other.getReturnable()==null) || 
             (this.returnable!=null &&
              this.returnable.equals(other.getReturnable()))) &&
            ((this.salesDiscWhenNotAvail==null && other.getSalesDiscWhenNotAvail()==null) || 
             (this.salesDiscWhenNotAvail!=null &&
              this.salesDiscWhenNotAvail.equals(other.getSalesDiscWhenNotAvail()))) &&
            ((this.salesDiscontinuationDate==null && other.getSalesDiscontinuationDate()==null) || 
             (this.salesDiscontinuationDate!=null &&
              this.salesDiscontinuationDate.equals(other.getSalesDiscontinuationDate()))) &&
            ((this.shippingDepth==null && other.getShippingDepth()==null) || 
             (this.shippingDepth!=null &&
              this.shippingDepth.equals(other.getShippingDepth()))) &&
            ((this.shippingHeight==null && other.getShippingHeight()==null) || 
             (this.shippingHeight!=null &&
              this.shippingHeight.equals(other.getShippingHeight()))) &&
            ((this.shippingWeight==null && other.getShippingWeight()==null) || 
             (this.shippingWeight!=null &&
              this.shippingWeight.equals(other.getShippingWeight()))) &&
            ((this.shippingWidth==null && other.getShippingWidth()==null) || 
             (this.shippingWidth!=null &&
              this.shippingWidth.equals(other.getShippingWidth()))) &&
            ((this.smallImageUrl==null && other.getSmallImageUrl()==null) || 
             (this.smallImageUrl!=null &&
              this.smallImageUrl.equals(other.getSmallImageUrl()))) &&
            ((this.supportDiscontinuationDate==null && other.getSupportDiscontinuationDate()==null) || 
             (this.supportDiscontinuationDate!=null &&
              this.supportDiscontinuationDate.equals(other.getSupportDiscontinuationDate()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.variant==null && other.getVariant()==null) || 
             (this.variant!=null &&
              this.variant.equals(other.getVariant()))) &&
            ((this.virtual==null && other.getVirtual()==null) || 
             (this.virtual!=null &&
              this.virtual.equals(other.getVirtual()))) &&
            ((this.virtualVariantMethodEnum==null && other.getVirtualVariantMethodEnum()==null) || 
             (this.virtualVariantMethodEnum!=null &&
              this.virtualVariantMethodEnum.equals(other.getVirtualVariantMethodEnum()))) &&
            ((this.weightUom==null && other.getWeightUom()==null) || 
             (this.weightUom!=null &&
              this.weightUom.equals(other.getWeightUom()))) &&
            ((this.widthUomId==null && other.getWidthUomId()==null) || 
             (this.widthUomId!=null &&
              this.widthUomId.equals(other.getWidthUomId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmountUomTypeId() != null) {
            _hashCode += getAmountUomTypeId().hashCode();
        }
        if (getAutoCreateKeywords() != null) {
            _hashCode += getAutoCreateKeywords().hashCode();
        }
        if (getBillOfMaterialLevel() != null) {
            _hashCode += getBillOfMaterialLevel().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getChargeShipping() != null) {
            _hashCode += getChargeShipping().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getConfigId() != null) {
            _hashCode += getConfigId().hashCode();
        }
        if (getCreatedByUserLogin() != null) {
            _hashCode += getCreatedByUserLogin().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCreatedStamp() != null) {
            _hashCode += getCreatedStamp().hashCode();
        }
        if (getCreatedTxStamp() != null) {
            _hashCode += getCreatedTxStamp().hashCode();
        }
        if (getDefaultShipmentBoxTypeId() != null) {
            _hashCode += getDefaultShipmentBoxTypeId().hashCode();
        }
        if (getDepthUomId() != null) {
            _hashCode += getDepthUomId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDetailImageUrl() != null) {
            _hashCode += getDetailImageUrl().hashCode();
        }
        if (getDetailScreen() != null) {
            _hashCode += getDetailScreen().hashCode();
        }
        if (getDiameterUomId() != null) {
            _hashCode += getDiameterUomId().hashCode();
        }
        if (getFacilityId() != null) {
            _hashCode += getFacilityId().hashCode();
        }
        if (getFixedAmount() != null) {
            _hashCode += getFixedAmount().hashCode();
        }
        if (getHeightUomId() != null) {
            _hashCode += getHeightUomId().hashCode();
        }
        if (getInShippingBox() != null) {
            _hashCode += getInShippingBox().hashCode();
        }
        if (getIncludeInPromotions() != null) {
            _hashCode += getIncludeInPromotions().hashCode();
        }
        if (getInternalName() != null) {
            _hashCode += getInternalName().hashCode();
        }
        if (getIntroductionDate() != null) {
            _hashCode += getIntroductionDate().hashCode();
        }
        if (getInventoryItemTypeId() != null) {
            _hashCode += getInventoryItemTypeId().hashCode();
        }
        if (getInventoryMessage() != null) {
            _hashCode += getInventoryMessage().hashCode();
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getKeywordRelevancyWeight() != null) {
            _hashCode += getKeywordRelevancyWeight().hashCode();
        }
        if (getKeywordStatusId() != null) {
            _hashCode += getKeywordStatusId().hashCode();
        }
        if (getKeywordTypeId() != null) {
            _hashCode += getKeywordTypeId().hashCode();
        }
        if (getLargeImageUrl() != null) {
            _hashCode += getLargeImageUrl().hashCode();
        }
        if (getLastModifiedByUserLogin() != null) {
            _hashCode += getLastModifiedByUserLogin().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastUpdatedStamp() != null) {
            _hashCode += getLastUpdatedStamp().hashCode();
        }
        if (getLastUpdatedTxStamp() != null) {
            _hashCode += getLastUpdatedTxStamp().hashCode();
        }
        if (getLongDescription() != null) {
            _hashCode += getLongDescription().hashCode();
        }
        if (getLotIdFiledIn() != null) {
            _hashCode += getLotIdFiledIn().hashCode();
        }
        if (getManufacturerPartyId() != null) {
            _hashCode += getManufacturerPartyId().hashCode();
        }
        if (getMediumImageUrl() != null) {
            _hashCode += getMediumImageUrl().hashCode();
        }
        if (getOrderDecimalQuantity() != null) {
            _hashCode += getOrderDecimalQuantity().hashCode();
        }
        if (getOriginGeoId() != null) {
            _hashCode += getOriginGeoId().hashCode();
        }
        if (getOriginalImageUrl() != null) {
            _hashCode += getOriginalImageUrl().hashCode();
        }
        if (getPiecesIncluded() != null) {
            _hashCode += getPiecesIncluded().hashCode();
        }
        if (getPriceDetailText() != null) {
            _hashCode += getPriceDetailText().hashCode();
        }
        if (getPrimaryProductCategoryId() != null) {
            _hashCode += getPrimaryProductCategoryId().hashCode();
        }
        if (getProductDepth() != null) {
            _hashCode += getProductDepth().hashCode();
        }
        if (getProductDiameter() != null) {
            _hashCode += getProductDiameter().hashCode();
        }
        if (getProductHeight() != null) {
            _hashCode += getProductHeight().hashCode();
        }
        if (getProductId() != null) {
            _hashCode += getProductId().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductRating() != null) {
            _hashCode += getProductRating().hashCode();
        }
        if (getProductTypeId() != null) {
            _hashCode += getProductTypeId().hashCode();
        }
        if (getProductWeight() != null) {
            _hashCode += getProductWeight().hashCode();
        }
        if (getProductWidth() != null) {
            _hashCode += getProductWidth().hashCode();
        }
        if (getQuantityUomId() != null) {
            _hashCode += getQuantityUomId().hashCode();
        }
        if (getQunatityIncluded() != null) {
            _hashCode += getQunatityIncluded().hashCode();
        }
        if (getRatingTypeEnum() != null) {
            _hashCode += getRatingTypeEnum().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        if (getRequireAmount() != null) {
            _hashCode += getRequireAmount().hashCode();
        }
        if (getRequireInventory() != null) {
            _hashCode += getRequireInventory().hashCode();
        }
        if (getRequirementMethodEnumId() != null) {
            _hashCode += getRequirementMethodEnumId().hashCode();
        }
        if (getReserv2NsPPPerc() != null) {
            _hashCode += getReserv2NsPPPerc().hashCode();
        }
        if (getReservNthPPPerc() != null) {
            _hashCode += getReservNthPPPerc().hashCode();
        }
        if (getReserveMaxPersons() != null) {
            _hashCode += getReserveMaxPersons().hashCode();
        }
        if (getReturnable() != null) {
            _hashCode += getReturnable().hashCode();
        }
        if (getSalesDiscWhenNotAvail() != null) {
            _hashCode += getSalesDiscWhenNotAvail().hashCode();
        }
        if (getSalesDiscontinuationDate() != null) {
            _hashCode += getSalesDiscontinuationDate().hashCode();
        }
        if (getShippingDepth() != null) {
            _hashCode += getShippingDepth().hashCode();
        }
        if (getShippingHeight() != null) {
            _hashCode += getShippingHeight().hashCode();
        }
        if (getShippingWeight() != null) {
            _hashCode += getShippingWeight().hashCode();
        }
        if (getShippingWidth() != null) {
            _hashCode += getShippingWidth().hashCode();
        }
        if (getSmallImageUrl() != null) {
            _hashCode += getSmallImageUrl().hashCode();
        }
        if (getSupportDiscontinuationDate() != null) {
            _hashCode += getSupportDiscontinuationDate().hashCode();
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getVariant() != null) {
            _hashCode += getVariant().hashCode();
        }
        if (getVirtual() != null) {
            _hashCode += getVirtual().hashCode();
        }
        if (getVirtualVariantMethodEnum() != null) {
            _hashCode += getVirtualVariantMethodEnum().hashCode();
        }
        if (getWeightUom() != null) {
            _hashCode += getWeightUom().hashCode();
        }
        if (getWidthUomId() != null) {
            _hashCode += getWidthUomId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateProductInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "CreateProductInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountUomTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "amountUomTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCreateKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "autoCreateKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billOfMaterialLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "billOfMaterialLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "brandName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "chargeShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "configId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByUserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "createdByUserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "createdStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTxStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "createdTxStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultShipmentBoxTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "defaultShipmentBoxTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depthUomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "depthUomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "detailImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailScreen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "detailScreen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diameterUomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "diameterUomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "facilityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "fixedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heightUomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "heightUomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inShippingBox");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "inShippingBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInPromotions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "includeInPromotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "internalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("introductionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "introductionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryItemTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "inventoryItemTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "inventoryMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordRelevancyWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "keywordRelevancyWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "keywordStatusId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keywordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "keywordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "largeImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedByUserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "lastModifiedByUserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "lastUpdatedStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedTxStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "lastUpdatedTxStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "longDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lotIdFiledIn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "lotIdFiledIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "manufacturerPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "mediumImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDecimalQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "orderDecimalQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originGeoId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "originGeoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "originalImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("piecesIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "piecesIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceDetailText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "priceDetailText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryProductCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "primaryProductCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDiameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productDiameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "productWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityUomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "quantityUomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qunatityIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "qunatityIncluded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratingTypeEnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "ratingTypeEnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "requireAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireInventory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "requireInventory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirementMethodEnumId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "requirementMethodEnumId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserv2NsPPPerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "reserv2nsPPPerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservNthPPPerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "reservNthPPPerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveMaxPersons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "reserveMaxPersons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "returnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDiscWhenNotAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "salesDiscWhenNotAvail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDiscontinuationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "salesDiscontinuationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDepth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "shippingDepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "shippingHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "shippingWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "shippingWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallImageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "smallImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportDiscontinuationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "supportDiscontinuationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "variant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "virtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("virtualVariantMethodEnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "virtualVariantMethodEnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "weightUom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("widthUomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "widthUomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
