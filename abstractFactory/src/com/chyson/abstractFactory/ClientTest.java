package com.chyson.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 17:44
 */
public class ClientTest {
    public static void main(String[] args){
        ComputerEngineer com=new ComputerEngineer();
        AbstractFactory abstractFactory=new IntelFactory();
        AbstractFactory abstractFactory1=new AmdFactory();
        com.makeComputer(abstractFactory1);
    }
}
