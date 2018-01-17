package com.allen.webservice.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2018-01-15 15:58
 * Version  1.0
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWebService {

    @WebMethod
    String getUser(@WebParam(name = "userId") String userId);

}
