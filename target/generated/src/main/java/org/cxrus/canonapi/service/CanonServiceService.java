package org.cxrus.canonapi.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0.redhat-611432
 * 2015-05-07T10:31:32.762+07:00
 * Generated source version: 2.7.0.redhat-611432
 * 
 */
@WebServiceClient(name = "CanonServiceService", 
                  wsdlLocation = "file:/D:/FUSE/workspace/soap/src/main/resources/wsdl/CanonServiceService.wsdl",
                  targetNamespace = "http://service.canonapi.cxrus.org/") 
public class CanonServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.canonapi.cxrus.org/", "CanonServiceService");
    public final static QName CanonServicePort = new QName("http://service.canonapi.cxrus.org/", "CanonServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/FUSE/workspace/soap/src/main/resources/wsdl/CanonServiceService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CanonServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/FUSE/workspace/soap/src/main/resources/wsdl/CanonServiceService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CanonServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CanonServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CanonServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CanonServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CanonServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CanonServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CanonService
     */
    @WebEndpoint(name = "CanonServicePort")
    public CanonService getCanonServicePort() {
        return super.getPort(CanonServicePort, CanonService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CanonService
     */
    @WebEndpoint(name = "CanonServicePort")
    public CanonService getCanonServicePort(WebServiceFeature... features) {
        return super.getPort(CanonServicePort, CanonService.class, features);
    }

}
