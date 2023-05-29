/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package org.lp;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author amruta
 */
@WebService(serviceName = "CalculatorWebService")
public class CalculatorWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Add")
    public double Add(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        //TODO write your implementation code here:
        return num1+num2;
    }

    
}
