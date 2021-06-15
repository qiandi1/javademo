public class cainiao15_6_15_String {
    public static void main(String[] args) {
        String str1 ="菜鸟";//创建方法1-最简单方法
        String str2 =new String("菜鸟");//使用关键字和构造方法创建
        System.out.println(str2);
//length()方法：返回字符串对象包含的字符数
        String baidu ="www.baidu.com";
        System.out.println("百度网址长度："+baidu.length());//写成一行
        int len =baidu.length();
        System.out.println("百度网址长度："+len);//写成两行
//连接字符串
        System.out.println("我叫".concat("钱迪"));//第一种方法
        System.out.println("我叫"+"钱迪");//第二种方法：常用
        String qd ="钱迪";
        System.out.println("我的"+"名字叫"+qd+",很高兴认识你");//灵活运用
//创建格式化字符串
        float a1 = 3.2f;
        int a2 = 20;
        String a3 = "爷";
        System.out.printf( //printf()方法
                "浮点型变量的值为" +
                        "%f,整型变量的值为" +
                        "%d, 字符串变量的值为" +
                        "%s", a1, a2, a3);
        float b1 = 3.2f;
        int b2 = 20;
        String b3 = "爷爷";
        String fs;
        fs = String.format( //format()方法（好像会自动覆盖printf方法）
                "浮点型变量的值为" +
                        "%f,整型变量的值为" +
                        "%d, 字符串变量的值为" +
                        "%s", b1, b2, b3);
        System.out.println(fs);

    }
}
