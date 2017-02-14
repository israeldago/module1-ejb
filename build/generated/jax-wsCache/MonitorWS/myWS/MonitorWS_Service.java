
package myWS;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MonitorWS", targetNamespace = "http://ws/", wsdlLocation = "http://buburutzapc:8080/MonitorWS/MonitorWS?wsdl")
public class MonitorWS_Service
    extends Service
{

    private final static URL MONITORWS_WSDL_LOCATION;
    private final static WebServiceException MONITORWS_EXCEPTION;
    private final static QName MONITORWS_QNAME = new QName("http://ws/", "MonitorWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://buburutzapc:8080/MonitorWS/MonitorWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MONITORWS_WSDL_LOCATION = url;
        MONITORWS_EXCEPTION = e;
    }

    public MonitorWS_Service() {
        super(__getWsdlLocation(), MONITORWS_QNAME);
    }

    public MonitorWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), MONITORWS_QNAME, features);
    }

    public MonitorWS_Service(URL wsdlLocation) {
        super(wsdlLocation, MONITORWS_QNAME);
    }

    public MonitorWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MONITORWS_QNAME, features);
    }

    public MonitorWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MonitorWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MonitorWS
     */
    @WebEndpoint(name = "MonitorWSPort")
    public MonitorWS getMonitorWSPort() {
        return super.getPort(new QName("http://ws/", "MonitorWSPort"), MonitorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MonitorWS
     */
    @WebEndpoint(name = "MonitorWSPort")
    public MonitorWS getMonitorWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "MonitorWSPort"), MonitorWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MONITORWS_EXCEPTION!= null) {
            throw MONITORWS_EXCEPTION;
        }
        return MONITORWS_WSDL_LOCATION;
    }

}