package com.chyson.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 17:31
 */
public class AmdCpu implements Cpu {
    private int points=0;

    public AmdCpu(int points) {
        this.points = points;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数：" + points);
    }
}
