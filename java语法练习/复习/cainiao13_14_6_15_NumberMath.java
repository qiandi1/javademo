//1.Number类：是java.lang包下的一个抽象类，提供了将包装类型拆箱成基本类型的方法
//所有基本类型（数据类型）的包装类型都继承了该抽象类
//好的讲解：https://blog.csdn.net/yaomingyang/article/details/79297750
//2.Math类：包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。
public class cainiao13_14_6_15_NumberMath {
    public static void main(String[] args) {
        int num1 =1;//定义一个int类型的数，只用来运算或参数传递
        Integer num2 =num1;//装箱：将基本数据类型装箱成对象包装类型
        Integer num3 =3;//声名一个对象，有更多应用，以后再了解（java是面向对象的语言）
        int num4 =num3;//拆箱：将对象数据类拆箱
//菜鸟Java14-Character类
//与Math类一样，有许多方法，遇到问题再去研究
        char ch1 ='a';
        Character ch2 =ch1;//装箱
        System.out.println(ch1);//输出a
        System.out.println(+ch1);//输出97（使用+时，自动进行int转换）
        System.out.println(""+ch1);//输出a（字符串拼接）
        System.out.println(ch2);//输出a

    }
}




//Java 语言为每一个内置数据类型(int、long、char)提供了对应的包装类。
//所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类
//这种由编译器特别支持的包装称为装箱，
// 所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。
// 相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。