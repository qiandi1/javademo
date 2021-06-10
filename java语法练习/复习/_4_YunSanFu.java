public class _4_YunSanFu {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a;//先运算，再赋值（a先自增为6，再赋值6给b）
        int c = a++;//先赋值，再运算（a先赋值5给b，再自增为6）
        System.out.println(a);//输出7
        System.out.println(b);//输出6
        System.out.println(c);//输出6
        int d = 5;
        int e = ++d;
        int f = ++d;//(与上个有变化)
        System.out.println(d);//输出7
        System.out.println(e);//输出6
        System.out.println(f);//输出7（体现了变化）
    }
}
