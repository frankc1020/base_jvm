package com.guigu.designpattern.sevenprinciple.ocp.improve;

/**
 * @author admin
 * @title: Ocp
 * @projectName base_thread
 * @description: TODO
 * @date 2020/8/18 13:55
 * 开闭原则
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraiphc());
    }
}

class GraphicEditor{
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s){
        s.draw();
    }

}

abstract  class  Shape{
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
class OtherGraiphc extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
