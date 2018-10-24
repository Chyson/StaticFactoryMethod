package com.chyson.factory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 11:27
 */
public class Test {
    public static void main(String[] args){
        String loginType="passcode";
        String userName="master";
        String password ="master";
        Login factory = LoginManager.factory(loginType);
        boolean flag = factory.verify(userName, password);
        if(flag){
            System.out.println("验证无误，登录成功!");
        }else{
            System.out.println("用户名或密码错误！");
        }
    }
}
