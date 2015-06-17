
package tr.gov.ptt.dovizislemleriprj.ws;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "DovizCeviriciWs")
public class DovizCeviriciWs {

    
    @WebMethod(operationName = "dollarToTL")
    public double dollarToTL(@WebParam(name = "p_dollar") double p_dollar)
    {
        return p_dollar *2.8;
    }
    
     @WebMethod(operationName = "TLtoDollar")
    public double TLtoDollar(@WebParam(name = "p_TL") double p_TL)
    {
        return p_TL / 2.8;
    }
    
    /*public static void main(String[] args) {
        
        DovizCeviriciWs x = new DovizCeviriciWs();
        System.out.println(x.dollarToTL(new BigDecimal(3)));
    }*/
}
