package com.chyson.factory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 11:23
 */
public class LoginManager {
    public static Login factory(String type){
        if(type.equals("password")){
            return new PasswordLogin();
        }else if(type.equals("passcode")){
            return new DomainLogin();
        }else{
            throw new RuntimeException("没有找到登录类型！");
        }
    }
}
