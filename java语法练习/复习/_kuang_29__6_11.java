//狂神29-逻辑运算符，位运算符
//21.6.11
public class _kuang_29__6_11 {
    public static void main(String[] args) {
        //逻辑运算符（狂神29）
        boolean a1 = true;
        boolean b1 = false;
        System.out.println("a1 && b1:"+(a1&&b1));//与（且）（and）
        System.out.println("a1 || b1:"+(a1||b1));//或（or）
        System.out.println("!(a1 && b1):"+!(a1&&b1));//非（取反）

        //短路运算（狂神29）(5分44)
        System.out.println("-----短路运算-------");
        int c1 = 5;
        boolean d1 = (c1<4)&&(c1++<4);//前面为假，则不运算后面的
        System.out.println("c1="+c1);//输出为5，证明未计算c++
        System.out.println("d1="+d1);

        //位运算符（菜鸟-java运算符）
        System.out.println("----菜鸟java----");
        int a = 60;  //60=0011 1100(4+8+16+32=60)
        int b = 13;  //13=0000 1101(8+4+1)
        int c = 0;
        //&：相对应位都是1则为1，反之0
        c = a & b;  //0000 1100=12
        System.out.println("a&b="+c);//输出12
        //|:相对应位都是0则为0，反之1
        c = a | b;  //0011 1101
        System.out.println("a|b="+c);//输出61
        //^:相对应位 值同为0，值反为1
        c = a ^ b;  //0011 0001=1+16+32=49
        System.out.println("a^b="+c);//输出49
        //~：取反
        c = ~a;  //1100 0011(1+2+64+128=195=-61)(取补码：-0011 1101)（正数取反+1）
        System.out.println("~a="+c);//输出-61（a原本为60）
        c = ~b;//1111 0010（取补码：0000 1110）（2+4+8）
        System.out.println("~b="+c);//输出-14（b原本为13）
        //<<:按位左移运算符，移动右符指定位数
        c = a << 2;//1111 0000=240
        System.out.println("a<<2="+c);
        //>>:按位右移运算符，移动右符指定位数
        c = a >> 2;//1111=15（不是0000 1111）
        System.out.println("a>>2="+c);
        //>>>:>>的基础上补零
        c = a >>> 2;//0000 1111=15
        System.out.println("a>>>2="+c);

    }
}
