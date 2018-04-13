package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CalcWebService {

	@WebMethod
	public double soma(@WebParam(name = "x") double x, @WebParam(name = "y") double y);

	@WebMethod
	public double subtracao(@WebParam(name = "x") double x, @WebParam(name = "y") double y);

	@WebMethod
	public double multiplicacao(@WebParam(name = "x") double x, @WebParam(name = "y") double y);

	@WebMethod
	public double divisao(@WebParam(name = "x") double x, @WebParam(name = "y") double y);

	@WebMethod
	public double raizQuadrada(@WebParam(name = "x") double x);
	
	@WebMethod
	public double potencia(@WebParam(name = "x") double x,  @WebParam(name = "y") double y);
	
	@WebMethod
	public String intToBinary(@WebParam(name = "x") int x);
	
}
