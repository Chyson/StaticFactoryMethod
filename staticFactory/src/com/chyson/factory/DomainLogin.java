package com.chyson.factory;

import sun.rmi.runtime.Log;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 11:21
 */
public class DomainLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        if(name.equals("master")&&password.equals("master")){
            return true;
        }else {
            return false;
        }
    }
}
