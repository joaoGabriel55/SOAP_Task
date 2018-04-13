package webservices;

public class CalcImplProxy implements webservices.CalcImpl {
  private String _endpoint = null;
  private webservices.CalcImpl calcImpl = null;
  
  public CalcImplProxy() {
    _initCalcImplProxy();
  }
  
  public CalcImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcImplProxy();
  }
  
  private void _initCalcImplProxy() {
    try {
      calcImpl = (new webservices.CalcImplCalcimplLocator()).getCalcImplPort();
      if (calcImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calcImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calcImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calcImpl != null)
      ((javax.xml.rpc.Stub)calcImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.CalcImpl getCalcImpl() {
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl;
  }
  
  public java.lang.String intToBinary(int x) throws java.rmi.RemoteException{
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl.intToBinary(x);
  }
  
  public double divisao(double x, double y) throws java.rmi.RemoteException{
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl.divisao(x, y);
  }
  
  public double subtracao(double x, double y) throws java.rmi.RemoteException{
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl.subtracao(x, y);
  }
  
  public double potencia(double x, double y) throws java.rmi.RemoteException{
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl.potencia(x, y);
  }
  
  public double multiplicacao(double x, double y) throws java.rmi.RemoteException{
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl.multiplicacao(x, y);
  }
  
  public double soma(double x, double y) throws java.rmi.RemoteException{
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl.soma(x, y);
  }
  
  public double raizQuadrada(double x) throws java.rmi.RemoteException{
    if (calcImpl == null)
      _initCalcImplProxy();
    return calcImpl.raizQuadrada(x);
  }
  
  
}