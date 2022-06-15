package com.guigu.designpattern.designmodel.adapter.objadapter;

// 适配器类
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;
    // 通过构造器，传入一个Voltage220V 实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
    @Override
    public int output5V() {
        int dst = 0;
        if(null != voltage220V){
            //获取到220V电压
            int src = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配~~~");
            dst = src / 44;// 转成5V
            System.out.println("适配完成，输出的电压为="+ dst);
        }
        return dst;
    }
}
