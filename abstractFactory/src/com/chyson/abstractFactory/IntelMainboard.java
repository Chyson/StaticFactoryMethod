package com.chyson.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 17:33
 */
public class IntelMainboard implements Mainboard{
    private int cpuholes =0;

    public IntelMainboard(int cpuholes) {
        this.cpuholes = cpuholes;
    }

    @Override
    public void installCPU() {
        System.out.println("Intel主板的CPU插槽孔数是：" + cpuholes);
    }
}
