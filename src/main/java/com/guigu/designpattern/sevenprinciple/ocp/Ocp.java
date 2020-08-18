package com.guigu.designpattern.sevenprinciple.ocp;

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
        graphicEditor.drawTriangle(new Triangle());
    }
}
class GraphicEditor{
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle(s);
        }else if(s.m_type == 2){
            drawCircle(s);
        }else if(s.m_type == 3){
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape s) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape s) {
        System.out.println("绘制圆形");
    }
    public void drawTriangle(Shape s) {
        System.out.println("绘制三角形");
    }
}
class  Shape{
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type = 2;
    }
}
//新增画三角形
class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}
