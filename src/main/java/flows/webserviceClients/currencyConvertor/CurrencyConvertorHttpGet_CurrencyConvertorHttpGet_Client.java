
package flows.webserviceClients.currencyConvertor;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2014-03-14T14:08:46.986+05:30
 * Generated source version: 3.0.0-milestone2
 * 
 */
public final class CurrencyConvertorHttpGet_CurrencyConvertorHttpGet_Client {

    private static final QName SERVICE_NAME = new QName("http://www.webserviceX.NET/", "CurrencyConvertor");

    private CurrencyConvertorHttpGet_CurrencyConvertorHttpGet_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CurrencyConvertor.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        CurrencyConvertor ss = new CurrencyConvertor(wsdlURL, SERVICE_NAME);
        CurrencyConvertorHttpGet port = ss.getCurrencyConvertorHttpGet();  
        
        {
        System.out.println("Invoking conversionRate...");
        java.lang.String _conversionRate_fromCurrency = "";
        java.lang.String _conversionRate_toCurrency = "";
        double _conversionRate__return = port.conversionRate(_conversionRate_fromCurrency, _conversionRate_toCurrency);
        System.out.println("conversionRate.result=" + _conversionRate__return);


        }

        System.exit(0);
    }

}