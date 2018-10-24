package com.chyson.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 17:29
 */
public class IntelCpu implements Cpu {
    private int points=0;

    public IntelCpu(int points) {
        this.points = points;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的针脚数" + points);
    }
}
