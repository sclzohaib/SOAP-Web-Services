/**
 * FacilityWithProductPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.facilitywithproduct;

public interface FacilityWithProductPortType extends java.rmi.Remote {
    public java.lang.String getName() throws java.rmi.RemoteException;
    public com.ofbiz.facilitywithproduct.xsd.FacilityWithProductOutput associateFacilityWithProduct(com.ofbiz.facilitywithproduct.xsd.FacilityWithProductInput associateFacilityWithProductInput) throws java.rmi.RemoteException;
    public java.lang.String helloWorld(java.lang.String name) throws java.rmi.RemoteException;
}
