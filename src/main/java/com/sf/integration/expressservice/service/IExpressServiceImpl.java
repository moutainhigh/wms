
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.sf.integration.expressservice.service;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.15
 * 2017-03-01T15:46:19.219+08:00
 * Generated source version: 2.6.15
 * 
 */

@javax.jws.WebService(
                      serviceName = "CommonExpressServiceService",
                      portName = "CommonExpressServicePort",
                      targetNamespace = "http://service.expressservice.integration.sf.com/",
                      wsdlLocation = "http://bsp-ois.sit.sf-express.com:9080/bsp-ois/ws/sfexpressService?wsdl",
                      endpointInterface = "com.sf.integration.expressservice.service.IExpressService")
                      
public class IExpressServiceImpl implements IExpressService {

    private static final Logger LOG = Logger.getLogger(IExpressServiceImpl.class.getName());

    /* (non-Javadoc)
     * @see com.sf.integration.expressservice.service.IExpressService#sfexpressService(java.lang.String  arg0 ,)java.lang.String  arg1 )*
     */
    public java.lang.String sfexpressService(java.lang.String arg0,java.lang.String arg1) { 
        LOG.info("Executing operation sfexpressService");
        System.out.println(arg0);
        System.out.println(arg1);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
