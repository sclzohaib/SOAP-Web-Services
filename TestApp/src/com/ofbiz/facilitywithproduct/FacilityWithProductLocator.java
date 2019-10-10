/**
 * FacilityWithProductLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ofbiz.facilitywithproduct;

public class FacilityWithProductLocator extends org.apache.axis.client.Service implements com.ofbiz.facilitywithproduct.FacilityWithProduct {

    public FacilityWithProductLocator() {
    }


    public FacilityWithProductLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FacilityWithProductLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FacilityWithProductHttpSoap11Endpoint
    private java.lang.String FacilityWithProductHttpSoap11Endpoint_address = "http://localhost:8080/wrapperOfBiz_webservice__v2.1/services/FacilityWithProduct.FacilityWithProductHttpSoap11Endpoint/";

    public java.lang.String getFacilityWithProductHttpSoap11EndpointAddress() {
        return FacilityWithProductHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FacilityWithProductHttpSoap11EndpointWSDDServiceName = "FacilityWithProductHttpSoap11Endpoint";

    public java.lang.String getFacilityWithProductHttpSoap11EndpointWSDDServiceName() {
        return FacilityWithProductHttpSoap11EndpointWSDDServiceName;
    }

    public void setFacilityWithProductHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        FacilityWithProductHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.ofbiz.facilitywithproduct.FacilityWithProductPortType getFacilityWithProductHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FacilityWithProductHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFacilityWithProductHttpSoap11Endpoint(endpoint);
    }

    public com.ofbiz.facilitywithproduct.FacilityWithProductPortType getFacilityWithProductHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ofbiz.facilitywithproduct.FacilityWithProductSoap11BindingStub _stub = new com.ofbiz.facilitywithproduct.FacilityWithProductSoap11BindingStub(portAddress, this);
            _stub.setPortName(getFacilityWithProductHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFacilityWithProductHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        FacilityWithProductHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ofbiz.facilitywithproduct.FacilityWithProductPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ofbiz.facilitywithproduct.FacilityWithProductSoap11BindingStub _stub = new com.ofbiz.facilitywithproduct.FacilityWithProductSoap11BindingStub(new java.net.URL(FacilityWithProductHttpSoap11Endpoint_address), this);
                _stub.setPortName(getFacilityWithProductHttpSoap11EndpointWSDDServiceName());
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
        if ("FacilityWithProductHttpSoap11Endpoint".equals(inputPortName)) {
            return getFacilityWithProductHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com", "FacilityWithProduct");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://facilitywithproduct.ofbiz.com", "FacilityWithProductHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FacilityWithProductHttpSoap11Endpoint".equals(portName)) {
            setFacilityWithProductHttpSoap11EndpointEndpointAddress(address);
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
