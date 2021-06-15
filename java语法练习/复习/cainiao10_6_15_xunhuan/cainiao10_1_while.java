package cainiao10_6_15_xunhuan;

//菜鸟java10-Java循环结构
//1.while循环 2.do...while循环 3.for循环 4.增强for循环 5.break关键字 6.continue关键字
public class cainiao10_1_while {
    public static void main(String[] args) {
//1.while循环：只要布尔表达式为true，循环就会一直执行下去
        int x = 10;
        while (x < 20) {
            System.out.println("x的值：" + x);
            x++;
            /*System.out.print("\n");//换行（个人使用println自带换行）*/

        }
    }
}
