package com.chyson.factory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 11:23
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        if(name.equals("master")&&password.equals("master")){
            return true;
        }else {
            return false;
        }
    }
}
