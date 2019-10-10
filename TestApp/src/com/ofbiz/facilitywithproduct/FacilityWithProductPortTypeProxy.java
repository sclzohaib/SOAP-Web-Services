package com.ofbiz.facilitywithproduct;

public class FacilityWithProductPortTypeProxy implements com.ofbiz.facilitywithproduct.FacilityWithProductPortType {
  private String _endpoint = null;
  private com.ofbiz.facilitywithproduct.FacilityWithProductPortType facilityWithProductPortType = null;
  
  public FacilityWithProductPortTypeProxy() {
    _initFacilityWithProductPortTypeProxy();
  }
  
  public FacilityWithProductPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initFacilityWithProductPortTypeProxy();
  }
  
  private void _initFacilityWithProductPortTypeProxy() {
    try {
      facilityWithProductPortType = (new com.ofbiz.facilitywithproduct.FacilityWithProductLocator()).getFacilityWithProductHttpSoap11Endpoint();
      if (facilityWithProductPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)facilityWithProductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)facilityWithProductPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (facilityWithProductPortType != null)
      ((javax.xml.rpc.Stub)facilityWithProductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ofbiz.facilitywithproduct.FacilityWithProductPortType getFacilityWithProductPortType() {
    if (facilityWithProductPortType == null)
      _initFacilityWithProductPortTypeProxy();
    return facilityWithProductPortType;
  }
  
  public com.ofbiz.facilitywithproduct.xsd.FacilityWithProductInput[] getFacilityWithProduct() throws java.rmi.RemoteException{
    if (facilityWithProductPortType == null)
      _initFacilityWithProductPortTypeProxy();
    return facilityWithProductPortType.getFacilityWithProduct();
  }
  
  public com.ofbiz.facilitywithproduct.xsd.FacilityWithProductOutput associateFacilityWithProduct(com.ofbiz.facilitywithproduct.xsd.FacilityWithProductInput associateFacilityWithProductInput) throws java.rmi.RemoteException{
    if (facilityWithProductPortType == null)
      _initFacilityWithProductPortTypeProxy();
    return facilityWithProductPortType.associateFacilityWithProduct(associateFacilityWithProductInput);
  }
  
  
}