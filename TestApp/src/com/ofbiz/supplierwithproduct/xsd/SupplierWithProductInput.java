/**
 * SupplierWithProductInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.supplierwithproduct.xsd;

public class SupplierWithProductInput  implements java.io.Serializable {
    private java.lang.String agreementId;

    private java.lang.String agreementItemSeqId;

    private java.util.Date availableFromDate;

    private java.util.Date availableThruDate;

    private java.lang.Boolean canDropShip;

    private java.lang.String comments;

    private java.lang.String currencyUomId;

    private java.lang.Double lastPrice;

    private java.lang.Double minimumOrderQuantity;

    private java.lang.Double orderQtyIncrements;

    private java.lang.String productName;

    private java.lang.String quantityUomId;

    private java.lang.Double shippingPrice;

    private java.lang.Double standardLeadTimeDays;

    private java.lang.String supplierPerfOrderId;

    private java.lang.String supplierProductId;

    private java.lang.String supplierProductName;

    private java.lang.String supplierRatingTypeId;

    private java.lang.String unitsIncluded;

    public SupplierWithProductInput() {
    }

    public SupplierWithProductInput(
           java.lang.String agreementId,
           java.lang.String agreementItemSeqId,
           java.util.Date availableFromDate,
           java.util.Date availableThruDate,
           java.lang.Boolean canDropShip,
           java.lang.String comments,
           java.lang.String currencyUomId,
           java.lang.Double lastPrice,
           java.lang.Double minimumOrderQuantity,
           java.lang.Double orderQtyIncrements,
           java.lang.String productName,
           java.lang.String quantityUomId,
           java.lang.Double shippingPrice,
           java.lang.Double standardLeadTimeDays,
           java.lang.String supplierPerfOrderId,
           java.lang.String supplierProductId,
           java.lang.String supplierProductName,
           java.lang.String supplierRatingTypeId,
           java.lang.String unitsIncluded) {
           this.agreementId = agreementId;
           this.agreementItemSeqId = agreementItemSeqId;
           this.availableFromDate = availableFromDate;
           this.availableThruDate = availableThruDate;
           this.canDropShip = canDropShip;
           this.comments = comments;
           this.currencyUomId = currencyUomId;
           this.lastPrice = lastPrice;
           this.minimumOrderQuantity = minimumOrderQuantity;
           this.orderQtyIncrements = orderQtyIncrements;
           this.productName = productName;
           this.quantityUomId = quantityUomId;
           this.shippingPrice = shippingPrice;
           this.standardLeadTimeDays = standardLeadTimeDays;
           this.supplierPerfOrderId = supplierPerfOrderId;
           this.supplierProductId = supplierProductId;
           this.supplierProductName = supplierProductName;
           this.supplierRatingTypeId = supplierRatingTypeId;
           this.unitsIncluded = unitsIncluded;
    }


    /**
     * Gets the agreementId value for this SupplierWithProductInput.
     * 
     * @return agreementId
     */
    public java.lang.String getAgreementId() {
        return agreementId;
    }


    /**
     * Sets the agreementId value for this SupplierWithProductInput.
     * 
     * @param agreementId
     */
    public void setAgreementId(java.lang.String agreementId) {
        this.agreementId = agreementId;
    }


    /**
     * Gets the agreementItemSeqId value for this SupplierWithProductInput.
     * 
     * @return agreementItemSeqId
     */
    public java.lang.String getAgreementItemSeqId() {
        return agreementItemSeqId;
    }


    /**
     * Sets the agreementItemSeqId value for this SupplierWithProductInput.
     * 
     * @param agreementItemSeqId
     */
    public void setAgreementItemSeqId(java.lang.String agreementItemSeqId) {
        this.agreementItemSeqId = agreementItemSeqId;
    }


    /**
     * Gets the availableFromDate value for this SupplierWithProductInput.
     * 
     * @return availableFromDate
     */
    public java.util.Date getAvailableFromDate() {
        return availableFromDate;
    }


    /**
     * Sets the availableFromDate value for this SupplierWithProductInput.
     * 
     * @param availableFromDate
     */
    public void setAvailableFromDate(java.util.Date availableFromDate) {
        this.availableFromDate = availableFromDate;
    }


    /**
     * Gets the availableThruDate value for this SupplierWithProductInput.
     * 
     * @return availableThruDate
     */
    public java.util.Date getAvailableThruDate() {
        return availableThruDate;
    }


    /**
     * Sets the availableThruDate value for this SupplierWithProductInput.
     * 
     * @param availableThruDate
     */
    public void setAvailableThruDate(java.util.Date availableThruDate) {
        this.availableThruDate = availableThruDate;
    }


    /**
     * Gets the canDropShip value for this SupplierWithProductInput.
     * 
     * @return canDropShip
     */
    public java.lang.Boolean getCanDropShip() {
        return canDropShip;
    }


    /**
     * Sets the canDropShip value for this SupplierWithProductInput.
     * 
     * @param canDropShip
     */
    public void setCanDropShip(java.lang.Boolean canDropShip) {
        this.canDropShip = canDropShip;
    }


    /**
     * Gets the comments value for this SupplierWithProductInput.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this SupplierWithProductInput.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the currencyUomId value for this SupplierWithProductInput.
     * 
     * @return currencyUomId
     */
    public java.lang.String getCurrencyUomId() {
        return currencyUomId;
    }


    /**
     * Sets the currencyUomId value for this SupplierWithProductInput.
     * 
     * @param currencyUomId
     */
    public void setCurrencyUomId(java.lang.String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }


    /**
     * Gets the lastPrice value for this SupplierWithProductInput.
     * 
     * @return lastPrice
     */
    public java.lang.Double getLastPrice() {
        return lastPrice;
    }


    /**
     * Sets the lastPrice value for this SupplierWithProductInput.
     * 
     * @param lastPrice
     */
    public void setLastPrice(java.lang.Double lastPrice) {
        this.lastPrice = lastPrice;
    }


    /**
     * Gets the minimumOrderQuantity value for this SupplierWithProductInput.
     * 
     * @return minimumOrderQuantity
     */
    public java.lang.Double getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }


    /**
     * Sets the minimumOrderQuantity value for this SupplierWithProductInput.
     * 
     * @param minimumOrderQuantity
     */
    public void setMinimumOrderQuantity(java.lang.Double minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }


    /**
     * Gets the orderQtyIncrements value for this SupplierWithProductInput.
     * 
     * @return orderQtyIncrements
     */
    public java.lang.Double getOrderQtyIncrements() {
        return orderQtyIncrements;
    }


    /**
     * Sets the orderQtyIncrements value for this SupplierWithProductInput.
     * 
     * @param orderQtyIncrements
     */
    public void setOrderQtyIncrements(java.lang.Double orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }


    /**
     * Gets the productName value for this SupplierWithProductInput.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this SupplierWithProductInput.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the quantityUomId value for this SupplierWithProductInput.
     * 
     * @return quantityUomId
     */
    public java.lang.String getQuantityUomId() {
        return quantityUomId;
    }


    /**
     * Sets the quantityUomId value for this SupplierWithProductInput.
     * 
     * @param quantityUomId
     */
    public void setQuantityUomId(java.lang.String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }


    /**
     * Gets the shippingPrice value for this SupplierWithProductInput.
     * 
     * @return shippingPrice
     */
    public java.lang.Double getShippingPrice() {
        return shippingPrice;
    }


    /**
     * Sets the shippingPrice value for this SupplierWithProductInput.
     * 
     * @param shippingPrice
     */
    public void setShippingPrice(java.lang.Double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }


    /**
     * Gets the standardLeadTimeDays value for this SupplierWithProductInput.
     * 
     * @return standardLeadTimeDays
     */
    public java.lang.Double getStandardLeadTimeDays() {
        return standardLeadTimeDays;
    }


    /**
     * Sets the standardLeadTimeDays value for this SupplierWithProductInput.
     * 
     * @param standardLeadTimeDays
     */
    public void setStandardLeadTimeDays(java.lang.Double standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }


    /**
     * Gets the supplierPerfOrderId value for this SupplierWithProductInput.
     * 
     * @return supplierPerfOrderId
     */
    public java.lang.String getSupplierPerfOrderId() {
        return supplierPerfOrderId;
    }


    /**
     * Sets the supplierPerfOrderId value for this SupplierWithProductInput.
     * 
     * @param supplierPerfOrderId
     */
    public void setSupplierPerfOrderId(java.lang.String supplierPerfOrderId) {
        this.supplierPerfOrderId = supplierPerfOrderId;
    }


    /**
     * Gets the supplierProductId value for this SupplierWithProductInput.
     * 
     * @return supplierProductId
     */
    public java.lang.String getSupplierProductId() {
        return supplierProductId;
    }


    /**
     * Sets the supplierProductId value for this SupplierWithProductInput.
     * 
     * @param supplierProductId
     */
    public void setSupplierProductId(java.lang.String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }


    /**
     * Gets the supplierProductName value for this SupplierWithProductInput.
     * 
     * @return supplierProductName
     */
    public java.lang.String getSupplierProductName() {
        return supplierProductName;
    }


    /**
     * Sets the supplierProductName value for this SupplierWithProductInput.
     * 
     * @param supplierProductName
     */
    public void setSupplierProductName(java.lang.String supplierProductName) {
        this.supplierProductName = supplierProductName;
    }


    /**
     * Gets the supplierRatingTypeId value for this SupplierWithProductInput.
     * 
     * @return supplierRatingTypeId
     */
    public java.lang.String getSupplierRatingTypeId() {
        return supplierRatingTypeId;
    }


    /**
     * Sets the supplierRatingTypeId value for this SupplierWithProductInput.
     * 
     * @param supplierRatingTypeId
     */
    public void setSupplierRatingTypeId(java.lang.String supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId;
    }


    /**
     * Gets the unitsIncluded value for this SupplierWithProductInput.
     * 
     * @return unitsIncluded
     */
    public java.lang.String getUnitsIncluded() {
        return unitsIncluded;
    }


    /**
     * Sets the unitsIncluded value for this SupplierWithProductInput.
     * 
     * @param unitsIncluded
     */
    public void setUnitsIncluded(java.lang.String unitsIncluded) {
        this.unitsIncluded = unitsIncluded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupplierWithProductInput)) return false;
        SupplierWithProductInput other = (SupplierWithProductInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agreementId==null && other.getAgreementId()==null) || 
             (this.agreementId!=null &&
              this.agreementId.equals(other.getAgreementId()))) &&
            ((this.agreementItemSeqId==null && other.getAgreementItemSeqId()==null) || 
             (this.agreementItemSeqId!=null &&
              this.agreementItemSeqId.equals(other.getAgreementItemSeqId()))) &&
            ((this.availableFromDate==null && other.getAvailableFromDate()==null) || 
             (this.availableFromDate!=null &&
              this.availableFromDate.equals(other.getAvailableFromDate()))) &&
            ((this.availableThruDate==null && other.getAvailableThruDate()==null) || 
             (this.availableThruDate!=null &&
              this.availableThruDate.equals(other.getAvailableThruDate()))) &&
            ((this.canDropShip==null && other.getCanDropShip()==null) || 
             (this.canDropShip!=null &&
              this.canDropShip.equals(other.getCanDropShip()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.currencyUomId==null && other.getCurrencyUomId()==null) || 
             (this.currencyUomId!=null &&
              this.currencyUomId.equals(other.getCurrencyUomId()))) &&
            ((this.lastPrice==null && other.getLastPrice()==null) || 
             (this.lastPrice!=null &&
              this.lastPrice.equals(other.getLastPrice()))) &&
            ((this.minimumOrderQuantity==null && other.getMinimumOrderQuantity()==null) || 
             (this.minimumOrderQuantity!=null &&
              this.minimumOrderQuantity.equals(other.getMinimumOrderQuantity()))) &&
            ((this.orderQtyIncrements==null && other.getOrderQtyIncrements()==null) || 
             (this.orderQtyIncrements!=null &&
              this.orderQtyIncrements.equals(other.getOrderQtyIncrements()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.quantityUomId==null && other.getQuantityUomId()==null) || 
             (this.quantityUomId!=null &&
              this.quantityUomId.equals(other.getQuantityUomId()))) &&
            ((this.shippingPrice==null && other.getShippingPrice()==null) || 
             (this.shippingPrice!=null &&
              this.shippingPrice.equals(other.getShippingPrice()))) &&
            ((this.standardLeadTimeDays==null && other.getStandardLeadTimeDays()==null) || 
             (this.standardLeadTimeDays!=null &&
              this.standardLeadTimeDays.equals(other.getStandardLeadTimeDays()))) &&
            ((this.supplierPerfOrderId==null && other.getSupplierPerfOrderId()==null) || 
             (this.supplierPerfOrderId!=null &&
              this.supplierPerfOrderId.equals(other.getSupplierPerfOrderId()))) &&
            ((this.supplierProductId==null && other.getSupplierProductId()==null) || 
             (this.supplierProductId!=null &&
              this.supplierProductId.equals(other.getSupplierProductId()))) &&
            ((this.supplierProductName==null && other.getSupplierProductName()==null) || 
             (this.supplierProductName!=null &&
              this.supplierProductName.equals(other.getSupplierProductName()))) &&
            ((this.supplierRatingTypeId==null && other.getSupplierRatingTypeId()==null) || 
             (this.supplierRatingTypeId!=null &&
              this.supplierRatingTypeId.equals(other.getSupplierRatingTypeId()))) &&
            ((this.unitsIncluded==null && other.getUnitsIncluded()==null) || 
             (this.unitsIncluded!=null &&
              this.unitsIncluded.equals(other.getUnitsIncluded())));
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
        if (getAgreementId() != null) {
            _hashCode += getAgreementId().hashCode();
        }
        if (getAgreementItemSeqId() != null) {
            _hashCode += getAgreementItemSeqId().hashCode();
        }
        if (getAvailableFromDate() != null) {
            _hashCode += getAvailableFromDate().hashCode();
        }
        if (getAvailableThruDate() != null) {
            _hashCode += getAvailableThruDate().hashCode();
        }
        if (getCanDropShip() != null) {
            _hashCode += getCanDropShip().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCurrencyUomId() != null) {
            _hashCode += getCurrencyUomId().hashCode();
        }
        if (getLastPrice() != null) {
            _hashCode += getLastPrice().hashCode();
        }
        if (getMinimumOrderQuantity() != null) {
            _hashCode += getMinimumOrderQuantity().hashCode();
        }
        if (getOrderQtyIncrements() != null) {
            _hashCode += getOrderQtyIncrements().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getQuantityUomId() != null) {
            _hashCode += getQuantityUomId().hashCode();
        }
        if (getShippingPrice() != null) {
            _hashCode += getShippingPrice().hashCode();
        }
        if (getStandardLeadTimeDays() != null) {
            _hashCode += getStandardLeadTimeDays().hashCode();
        }
        if (getSupplierPerfOrderId() != null) {
            _hashCode += getSupplierPerfOrderId().hashCode();
        }
        if (getSupplierProductId() != null) {
            _hashCode += getSupplierProductId().hashCode();
        }
        if (getSupplierProductName() != null) {
            _hashCode += getSupplierProductName().hashCode();
        }
        if (getSupplierRatingTypeId() != null) {
            _hashCode += getSupplierRatingTypeId().hashCode();
        }
        if (getUnitsIncluded() != null) {
            _hashCode += getUnitsIncluded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupplierWithProductInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "SupplierWithProductInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "agreementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementItemSeqId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "agreementItemSeqId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "availableFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableThruDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "availableThruDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canDropShip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "canDropShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyUomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "currencyUomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "lastPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumOrderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "minimumOrderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderQtyIncrements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "orderQtyIncrements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityUomId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "quantityUomId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "shippingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardLeadTimeDays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "standardLeadTimeDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierPerfOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "supplierPerfOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierProductId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "supplierProductId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierProductName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "supplierProductName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierRatingTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "supplierRatingTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsIncluded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com/xsd", "unitsIncluded"));
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
