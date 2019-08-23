package com.boco.service;

public class TestServiceProxy implements com.boco.service.TestService {
  private String _endpoint = null;
  private com.boco.service.TestService testService = null;
  
  public TestServiceProxy() {
    _initTestServiceProxy();
  }
  
  public TestServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestServiceProxy();
  }
  
  private void _initTestServiceProxy() {
    try {
      testService = (new com.boco.service.TestServiceServiceLocator()).getTestService();
      if (testService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testService != null)
      ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.boco.service.TestService getTestService() {
    if (testService == null)
      _initTestServiceProxy();
    return testService;
  }
  
  public java.lang.String getMethod(java.lang.String name) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.getMethod(name);
  }
  
  
}