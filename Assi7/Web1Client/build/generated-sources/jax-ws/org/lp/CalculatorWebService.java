
package org.lp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWebService", targetNamespace = "http://lp.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWebService {


    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Add")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Add", targetNamespace = "http://lp.org/", className = "org.lp.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://lp.org/", className = "org.lp.AddResponse")
    @Action(input = "http://lp.org/CalculatorWebService/AddRequest", output = "http://lp.org/CalculatorWebService/AddResponse")
    public double add(
        @WebParam(name = "num1", targetNamespace = "")
        double num1,
        @WebParam(name = "num2", targetNamespace = "")
        double num2);

}
