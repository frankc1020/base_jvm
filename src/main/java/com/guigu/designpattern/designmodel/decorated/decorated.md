装饰者模式定义：
    装饰者模式定义：
        1）装饰者模式：动态的将新功能附加到对象上。在对象功能扩展方面，它比继承更有弹性，
            装饰者模式也体现了开闭原则（ocp）
        2）这里提到的动态的将新功能附加到对象和ocp原则，在后面的应用实例上会以代码的形式体现

    IO源码中的InputStream 有使用到装饰者模式
    1.InputStream 是抽象类，类似我们前面的Drink
    2.FileInputStream 是InputStream子类，类似前面的LongBlack
    3.FilterInputStream 是InputStream子类，类似前面 Decorator 修饰者
    4.DataInputStream 是FilterInputStream 子类，具体的修饰着，类似前面 Milk，Soy等
    5.FilterInputStream 类有protected volatile InputStream in; 即含有被装饰者
    6.分析得出在jdk体系中，就是使用装饰者模式