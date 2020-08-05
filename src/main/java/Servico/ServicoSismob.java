/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author olive
 */
@WebService(serviceName = "ServicoSismob")
public class ServicoSismob {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getServicoSismob")
    public int getServicoSismob(@WebParam(name = "destino") String destino) {
        if (destino.equalsIgnoreCase("ac"))
            return 192;
        if (destino.equalsIgnoreCase("al"))
            return 575;
        if (destino.equalsIgnoreCase("ap"))
            return 130;
        if (destino.equalsIgnoreCase("am"))
            return 376;
        if (destino.equalsIgnoreCase("ba"))
            return 2940;
        if (destino.equalsIgnoreCase("ce"))
            return 1698;
        if (destino.equalsIgnoreCase("df"))
            return 18;
        if (destino.equalsIgnoreCase("es"))
            return 276;
        if (destino.equalsIgnoreCase("go"))
            return 1004;
        if (destino.equalsIgnoreCase("ma"))
            return 1632;
        if (destino.equalsIgnoreCase("mt"))
            return 699;
        if (destino.equalsIgnoreCase("ms"))
            return 403;
        if (destino.equalsIgnoreCase("mg"))
            return 2147;
        if (destino.equalsIgnoreCase("pa"))
            return 1445;
        if (destino.equalsIgnoreCase("pb"))
            return 1545;
        if (destino.equalsIgnoreCase("pe"))
            return 1377;
        if (destino.equalsIgnoreCase("pi"))
            return 1157;
        if (destino.equalsIgnoreCase("rj"))
            return 978;
        if (destino.equalsIgnoreCase("rn"))
            return 674;
        if (destino.equalsIgnoreCase("rs"))
            return 1063;
        if (destino.equalsIgnoreCase("ro"))
            return 216;
        if (destino.equalsIgnoreCase("rr"))
            return 148;
        if (destino.equalsIgnoreCase("sc"))
            return 996;
        if (destino.equalsIgnoreCase("sp"))
            return 2604;
        if (destino.equalsIgnoreCase("se"))
            return 351;
        if (destino.equalsIgnoreCase("to"))
            return 370;
        return 0;
    }
}
