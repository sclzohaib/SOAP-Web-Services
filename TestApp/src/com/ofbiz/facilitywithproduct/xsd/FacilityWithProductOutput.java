/**
 * FacilityWithProductOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.facilitywithproduct.xsd;

public class FacilityWithProductOutput  implements java.io.Serializable {
    private java.lang.String facilityId;

    public FacilityWithProductOutput() {
    }

    public FacilityWithProductOutput(
           java.lang.String facilityId) {
           this.facilityId = facilityId;
    }


    /**
     * Gets the facilityId value for this FacilityWithProductOutput.
     * 
     * @return facilityId
     */
    public java.lang.String getFacilityId() {
        return facilityId;
    }


    /**
     * Sets the facilityId value for this FacilityWithProductOutput.
     * 
     * @param facilityId
     */
    public void setFacilityId(java.lang.String facilityId) {
        this.facilityId = facilityId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacilityWithProductOutput)) return false;
        FacilityWithProductOutput other = (FacilityWithProductOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.facilityId==null && other.getFacilityId()==null) || 
             (this.facilityId!=null &&
              this.facilityId.equals(other.getFacilityId())));
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
        if (getFacilityId() != null) {
            _hashCode += getFacilityId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacilityWithProductOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "FacilityWithProductOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facilityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com/xsd", "facilityId"));
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
