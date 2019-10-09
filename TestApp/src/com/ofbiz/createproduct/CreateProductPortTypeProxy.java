package com.ofbiz.createproduct;

public class CreateProductPortTypeProxy implements com.ofbiz.createproduct.CreateProductPortType {
  private String _endpoint = null;
  private com.ofbiz.createproduct.CreateProductPortType createProductPortType = null;
  
  public CreateProductPortTypeProxy() {
    _initCreateProductPortTypeProxy();
  }
  
  public CreateProductPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreateProductPortTypeProxy();
  }
  
  private void _initCreateProductPortTypeProxy() {
    try {
      createProductPortType = (new com.ofbiz.createproduct.CreateProductLocator()).getCreateProductHttpSoap11Endpoint();
      if (createProductPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)createProductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)createProductPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (createProductPortType != null)
      ((javax.xml.rpc.Stub)createProductPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ofbiz.createproduct.CreateProductPortType getCreateProductPortType() {
    if (createProductPortType == null)
      _initCreateProductPortTypeProxy();
    return createProductPortType;
  }
  
  public com.ofbiz.createproduct.xsd.CreateProductInput[] getProduct() throws java.rmi.RemoteException{
    if (createProductPortType == null)
      _initCreateProductPortTypeProxy();
    return createProductPortType.getProduct();
  }
  
  public com.ofbiz.createproduct.xsd.CreateProductOutput createProduct(com.ofbiz.createproduct.xsd.CreateProductInput createProductInput) throws java.rmi.RemoteException{
    if (createProductPortType == null)
      _initCreateProductPortTypeProxy();
    return createProductPortType.createProduct(createProductInput);
  }
  
  
}