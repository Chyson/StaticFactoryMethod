package com.chyson.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * Author: Think
 * Date: 2018/10/24
 * Time: 17:38
 */
public class ComputerEngineer {
    private Cpu cpu=null;
    private Mainboard mainboard=null;

    public void makeComputer(AbstractFactory abstractFactory)
    {
        prepareHardwares(abstractFactory);
    }

    private void prepareHardwares(AbstractFactory abstractFactory) {
        Cpu cpu = abstractFactory.createCpu();
        Mainboard mainboard = abstractFactory.createMainboard();
        cpu.calculate();
        mainboard.installCPU();
    }
}
