/**
 * GetSupplierWithProductLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.supplierwithproduct;

public class GetSupplierWithProductLocator extends org.apache.axis.client.Service implements com.ofbiz.supplierwithproduct.GetSupplierWithProduct {

    public GetSupplierWithProductLocator() {
    }


    public GetSupplierWithProductLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetSupplierWithProductLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetSupplierWithProductHttpSoap11Endpoint
    private java.lang.String GetSupplierWithProductHttpSoap11Endpoint_address = "http://localhost:8080/wrapperOfBiz_webservice__v2.1/services/GetSupplierWithProduct.GetSupplierWithProductHttpSoap11Endpoint/";

    public java.lang.String getGetSupplierWithProductHttpSoap11EndpointAddress() {
        return GetSupplierWithProductHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetSupplierWithProductHttpSoap11EndpointWSDDServiceName = "GetSupplierWithProductHttpSoap11Endpoint";

    public java.lang.String getGetSupplierWithProductHttpSoap11EndpointWSDDServiceName() {
        return GetSupplierWithProductHttpSoap11EndpointWSDDServiceName;
    }

    public void setGetSupplierWithProductHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        GetSupplierWithProductHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.ofbiz.supplierwithproduct.GetSupplierWithProductPortType getGetSupplierWithProductHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetSupplierWithProductHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetSupplierWithProductHttpSoap11Endpoint(endpoint);
    }

    public com.ofbiz.supplierwithproduct.GetSupplierWithProductPortType getGetSupplierWithProductHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ofbiz.supplierwithproduct.GetSupplierWithProductSoap11BindingStub _stub = new com.ofbiz.supplierwithproduct.GetSupplierWithProductSoap11BindingStub(portAddress, this);
            _stub.setPortName(getGetSupplierWithProductHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetSupplierWithProductHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        GetSupplierWithProductHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ofbiz.supplierwithproduct.GetSupplierWithProductPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ofbiz.supplierwithproduct.GetSupplierWithProductSoap11BindingStub _stub = new com.ofbiz.supplierwithproduct.GetSupplierWithProductSoap11BindingStub(new java.net.URL(GetSupplierWithProductHttpSoap11Endpoint_address), this);
                _stub.setPortName(getGetSupplierWithProductHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetSupplierWithProductHttpSoap11Endpoint".equals(inputPortName)) {
            return getGetSupplierWithProductHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com", "GetSupplierWithProduct");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://supplierwithproduct.ofbiz.com", "GetSupplierWithProductHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetSupplierWithProductHttpSoap11Endpoint".equals(portName)) {
            setGetSupplierWithProductHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
