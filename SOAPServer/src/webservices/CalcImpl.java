package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "CalcImpl/calcimpl")
public class CalcImpl implements CalcWebService {

	@Override
	@WebMethod
	public double soma(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
		return x + y;
	}

	@Override
	@WebMethod
	public double subtracao(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
		return x - y;
	}

	@Override
	@WebMethod
	public double multiplicacao(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
		return x * y;
	}

	@Override
	@WebMethod
	public double divisao(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
		return x / y;
	}

	@Override
	@WebMethod
	public double raizQuadrada(@WebParam(name = "x") double x) {
		return Math.sqrt(x);
	}

	@Override
	@WebMethod
	public double potencia(@WebParam(name = "x") double x, @WebParam(name = "y") double y) {
		return Math.pow(x, y);
	}

	@Override
	@WebMethod
	public String intToBinary(@WebParam(name = "x") int x) {
		return Integer.toBinaryString(x);
	}

}
