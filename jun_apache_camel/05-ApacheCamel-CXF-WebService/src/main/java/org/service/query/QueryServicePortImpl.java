
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.service.query;

import org.apache.log4j.Logger;

/**
 * This class was generated by Apache CXF 3.1.7 2018-02-02T12:34:20.850+08:00
 * Generated source version: 3.1.7
 * 
 */

// @javax.jws.WebService(serviceName = "QueryServiceService", portName =
// "QueryServicePort", targetNamespace = "http://query.service.org/",
// wsdlLocation = "file:/C:/Users/CYX/Desktop/queryInfo.wsdl", endpointInterface
// = "org.service.query.QueryServiceInter")

public class QueryServicePortImpl implements QueryServiceInter {

	public static final Logger logger = Logger.getLogger(QueryServicePortImpl.class);

	public java.lang.String queryCarInfomation(java.lang.String carParam) {
		System.out.println("Executing operation queryCarInfomation");
		System.out.println(carParam);
		try {
			java.lang.String _return = "";
			return _return + "123456";
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	public java.lang.String queryPersonnelInformation(java.lang.String peopleParam) {

		System.out.println("Executing operation queryPersonnelInformation");

		System.out.println(peopleParam);

		try {
			java.lang.String _return = "";
			return _return + "987654321";
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
