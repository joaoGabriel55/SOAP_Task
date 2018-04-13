/**
 * CalcImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public interface CalcImpl extends java.rmi.Remote {
    public java.lang.String intToBinary(int x) throws java.rmi.RemoteException;
    public double divisao(double x, double y) throws java.rmi.RemoteException;
    public double subtracao(double x, double y) throws java.rmi.RemoteException;
    public double potencia(double x, double y) throws java.rmi.RemoteException;
    public double multiplicacao(double x, double y) throws java.rmi.RemoteException;
    public double soma(double x, double y) throws java.rmi.RemoteException;
    public double raizQuadrada(double x) throws java.rmi.RemoteException;
}
