/**
 * FacilityWithProductInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.facilitywithproduct.xsd;

public class FacilityWithProductInput  implements java.io.Serializable {
    private java.lang.Double daysToShip;

    private java.lang.Double inventoryCount;

    private java.lang.Double minimumStock;

    private java.lang.String productName;

    private java.lang.Double reorderQuantity;

    public FacilityWithProductInput() {
    }

    public FacilityWithProductInput(
           java.lang.Double daysToShip,
           java.lang.Double inventoryCount,
           java.lang.Double minimumStock,
           java.lang.String productName,
           java.lang.Double reorderQuantity) {
           this.daysToShip = daysToShip;
           this.inventoryCount = inventoryCount;
           this.minimumStock = minimumStock;
           this.productName = productName;
           this.reorderQuantity = reorderQuantity;
    }


    /**
     * Gets the daysToShip value for this FacilityWithProductInput.
     * 
     * @return daysToShip
     */
    public java.lang.Double getDaysToShip() {
        return daysToShip;
    }


    /**
     * Sets the daysToShip value for this FacilityWithProductInput.
     * 
     * @param daysToShip
     */
    public void setDaysToShip(java.lang.Double daysToShip) {
        this.daysToShip = daysToShip;
    }


    /**
     * Gets the inventoryCount value for this FacilityWithProductInput.
     * 
     * @return inventoryCount
     */
    public java.lang.Double getInventoryCount() {
        return inventoryCount;
    }


    /**
     * Sets the inventoryCount value for this FacilityWithProductInput.
     * 
     * @param inventoryCount
     */
    public void setInventoryCount(java.lang.Double inventoryCount) {
        this.inventoryCount = inventoryCount;
    }


    /**
     * Gets the minimumStock value for this FacilityWithProductInput.
     * 
     * @return minimumStock
     */
    public java.lang.Double getMinimumStock() {
        return minimumStock;
    }


    /**
     * Sets the minimumStock value for this FacilityWithProductInput.
     * 
     * @param minimumStock
     */
    public void setMinimumStock(java.lang.Double minimumStock) {
        this.minimumStock = minimumStock;
    }


    /**
     * Gets the productName value for this FacilityWithProductInput.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this FacilityWithProductInput.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the reorderQuantity value for this FacilityWithProductInput.
     * 
     * @return reorderQuantity
     */
    public java.lang.Double getReorderQuantity() {
        return reorderQuantity;
    }


    /**
     * Sets the reorderQuantity value for this FacilityWithProductInput.
     * 
     * @param reorderQuantity
     */
    public void setReorderQuantity(java.lang.Double reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacilityWithProductInput)) return false;
        FacilityWithProductInput other = (FacilityWithProductInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.daysToShip==null && other.getDaysToShip()==null) || 
             (this.daysToShip!=null &&
              this.daysToShip.equals(other.getDaysToShip()))) &&
            ((this.inventoryCount==null && other.getInventoryCount()==null) || 
             (this.inventoryCount!=null &&
              this.inventoryCount.equals(other.getInventoryCount()))) &&
            ((this.minimumStock==null && other.getMinimumStock()==null) || 
             (this.minimumStock!=null &&
              this.minimumStock.equals(other.getMinimumStock()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.reorderQuantity==null && other.getReorderQuantity()==null) || 
             (this.reorderQuantity!=null &&
              this.reorderQuantity.equals(other.getReorderQuantity())));
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
        if (getDaysToShip() != null) {
            _hashCode += getDaysToShip().hashCode();
        }
        if (getInventoryCount() != null) {
            _hashCode += getInventoryCount().hashCode();
        }
        if (getMinimumStock() != null) {
            _hashCode += getMinimumStock().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getReorderQuantity() != null) {
            _hashCode += getReorderQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacilityWithProductInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "FacilityWithProductInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysToShip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "daysToShip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "inventoryCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumStock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "minimumStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "reorderQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
