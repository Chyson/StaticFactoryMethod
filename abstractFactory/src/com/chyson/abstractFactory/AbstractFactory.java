package com.chyson.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 17:25
 */
public interface AbstractFactory {
    public Cpu createCpu();

    public Mainboard createMainboard();
}
