package com.ofbiz.supplierwithproduct;

public class GetSupplierWithProductPortTypeProxy implements com.ofbiz.supplierwithproduct.GetSupplierWithProductPortType {
  private String _endpoint = null;
  private com.ofbiz.supplierwithproduct.GetSupplierWithProductPortType getSupplierWithProductPortType = null;
  
  public GetSupplierWithProductPortTypeProxy() {
    _initGetSupplierWithProductPortTypeProxy();
  }
  
  public GetSupplierWithProductPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetSupplierWithProductPortTypeProxy();
  }
  
  private void _initGetSupplierWithProductPortTypeProxy() {
    try {
      getSupplierWithProductPortType = (new com.ofbiz.supplierwithproduct.GetSupplierWithProductLocator()).getGetSupplierWithProductHttpSoap11Endpoint();
      if (getSupplierWithProductPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getSupplierWithProductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getSupplierWithProductPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getSupplierWithProductPortType != null)
      ((javax.xml.rpc.Stub)getSupplierWithProductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ofbiz.supplierwithproduct.GetSupplierWithProductPortType getGetSupplierWithProductPortType() {
    if (getSupplierWithProductPortType == null)
      _initGetSupplierWithProductPortTypeProxy();
    return getSupplierWithProductPortType;
  }
  
  public com.ofbiz.supplierwithproduct.xsd.SupplierWithProductInput[] getSupplierWithProduct() throws java.rmi.RemoteException{
    if (getSupplierWithProductPortType == null)
      _initGetSupplierWithProductPortTypeProxy();
    return getSupplierWithProductPortType.getSupplierWithProduct();
  }
  
  
}