/**
 * CreateProductPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.createproduct;

public interface CreateProductPortType extends java.rmi.Remote {
    public com.ofbiz.createproduct.xsd.CreateProductInput[] getProduct() throws java.rmi.RemoteException;
    public com.ofbiz.createproduct.xsd.CreateProductOutput createProduct(com.ofbiz.createproduct.xsd.CreateProductInput createProductInput) throws java.rmi.RemoteException;
}
