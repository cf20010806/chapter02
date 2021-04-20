package edu.xcdq;

/**
 * @author huyuansong
 * @date 2021/4/20 14:47
 */
public class Phone {
    public double width;
    public double height;
    public int weight;
    public String color ;

    /*
        构造方法：1 一定没有返回值 2 方法的名字必须和类名完全一致
     */
    // 无参构造方法，不管写不写，系统都会生成
    public Phone () {
        System.out.println("我被调用了，有一个对象产生了");
    }
    // 构造方法 包含全部的参数 全参构造方法
    public Phone(double width , double height , int weight , String color) {
        this.width = width ;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
    // 构造函数
    public Phone (double kuandu , double gao, int zhongliang ) {
        width = kuandu;
        height = gao;
        weight = zhongliang ;
    }
    public Phone ( int zhongliang ,double kuandu , double gao  ) {
        width = kuandu;
        height = gao;
        weight = zhongliang ;
    }
    public Phone (int kuandu , int gao, int zhongliang ) {
        width = kuandu;
        height = gao;
        weight = zhongliang ;
    }

    public void startUp () {
        System.out.println("正在开机");
    }
    public void suopin () {
        System.out.println("手机即将锁屏");
    }

    // 方法的复写
    public String toString() {
        return "{" + this.width +" "+ this.height  +" "+ this.weight +" "+ this.color + "}";
    }

}
