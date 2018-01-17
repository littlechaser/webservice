package com.allen.webservice.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Author   yang_tao@<yangtao.letzgo.com.cn>
 * Date     2018-01-15 15:59
 * Version  1.0
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class HelloWebServiceImpl implements HelloWebService {


    @Override
    public String getUser(String userId) {

        return "this is the user info that you need !!";
    }
}
