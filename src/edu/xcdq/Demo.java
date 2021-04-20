package edu.xcdq;

/**
 * @author huyuansong
 * @date 2021/4/20 14:49
 */
public class Demo {
    public static void main(String[] args) {

        Phone xiaomi11 = new Phone();


       /* xiaomi11.width = 55;
        xiaomi11.height = 135;
        xiaomi11.weight = 255;
        xiaomi11.color = "color";*/

        Phone iphone = new Phone(56, 136, 256, "土豪金");

        Phone onePlus = new Phone(37, 137, 257);

        System.out.println(iphone);  // edu.xcdq.Phone@7ef20235
        System.out.println(onePlus);  //edu.xcdq.Phone@27d6c5e0



    }
}
