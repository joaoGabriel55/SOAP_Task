package webservices;

import javax.xml.ws.Endpoint;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:8080/SOAPServer/CalcImpl/calcimpl", new CalcImpl());
		System.out.println("200 OK!");
	}

}
