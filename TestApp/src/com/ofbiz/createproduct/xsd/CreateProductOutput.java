/**
 * CreateProductOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.createproduct.xsd;

public class CreateProductOutput  implements java.io.Serializable {
    private java.lang.String supplierId;

    private java.lang.String supplierLocation;

    private java.lang.String supplierName;

    private java.lang.String suppliercategory;

    public CreateProductOutput() {
    }

    public CreateProductOutput(
           java.lang.String supplierId,
           java.lang.String supplierLocation,
           java.lang.String supplierName,
           java.lang.String suppliercategory) {
           this.supplierId = supplierId;
           this.supplierLocation = supplierLocation;
           this.supplierName = supplierName;
           this.suppliercategory = suppliercategory;
    }


    /**
     * Gets the supplierId value for this CreateProductOutput.
     * 
     * @return supplierId
     */
    public java.lang.String getSupplierId() {
        return supplierId;
    }


    /**
     * Sets the supplierId value for this CreateProductOutput.
     * 
     * @param supplierId
     */
    public void setSupplierId(java.lang.String supplierId) {
        this.supplierId = supplierId;
    }


    /**
     * Gets the supplierLocation value for this CreateProductOutput.
     * 
     * @return supplierLocation
     */
    public java.lang.String getSupplierLocation() {
        return supplierLocation;
    }


    /**
     * Sets the supplierLocation value for this CreateProductOutput.
     * 
     * @param supplierLocation
     */
    public void setSupplierLocation(java.lang.String supplierLocation) {
        this.supplierLocation = supplierLocation;
    }


    /**
     * Gets the supplierName value for this CreateProductOutput.
     * 
     * @return supplierName
     */
    public java.lang.String getSupplierName() {
        return supplierName;
    }


    /**
     * Sets the supplierName value for this CreateProductOutput.
     * 
     * @param supplierName
     */
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }


    /**
     * Gets the suppliercategory value for this CreateProductOutput.
     * 
     * @return suppliercategory
     */
    public java.lang.String getSuppliercategory() {
        return suppliercategory;
    }


    /**
     * Sets the suppliercategory value for this CreateProductOutput.
     * 
     * @param suppliercategory
     */
    public void setSuppliercategory(java.lang.String suppliercategory) {
        this.suppliercategory = suppliercategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateProductOutput)) return false;
        CreateProductOutput other = (CreateProductOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.supplierId==null && other.getSupplierId()==null) || 
             (this.supplierId!=null &&
              this.supplierId.equals(other.getSupplierId()))) &&
            ((this.supplierLocation==null && other.getSupplierLocation()==null) || 
             (this.supplierLocation!=null &&
              this.supplierLocation.equals(other.getSupplierLocation()))) &&
            ((this.supplierName==null && other.getSupplierName()==null) || 
             (this.supplierName!=null &&
              this.supplierName.equals(other.getSupplierName()))) &&
            ((this.suppliercategory==null && other.getSuppliercategory()==null) || 
             (this.suppliercategory!=null &&
              this.suppliercategory.equals(other.getSuppliercategory())));
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
        if (getSupplierId() != null) {
            _hashCode += getSupplierId().hashCode();
        }
        if (getSupplierLocation() != null) {
            _hashCode += getSupplierLocation().hashCode();
        }
        if (getSupplierName() != null) {
            _hashCode += getSupplierName().hashCode();
        }
        if (getSuppliercategory() != null) {
            _hashCode += getSuppliercategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateProductOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "CreateProductOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "supplierId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "supplierLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "supplierName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliercategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://createproduct.ofbiz.com/xsd", "suppliercategory"));
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
