public class _2_leixinzhuanhuan_kuang_25 {
    public static void main(String[] args) {
        int i = 128;
        byte b =(byte) i;//高到低，需要强制转换
        System.out.println(i);
        System.out.println(b);//输出-128（byte最大值127 导致内存溢出
        double c = i;//低到高，会自动转换
        System.out.println(c);//输出128.0
        //注意：不能对布尔值进行转换
        System.out.println((int)23.7);//输出23
        System.out.println((int)-45.89f);//输出-45(f是float类型)
        System.out.println("---------------");
        //JDK7新特性：数字之间可以用下划线分割
        int money = 100000_0000;
        System.out.println(money);
        int years = 20;
        int total = money*years;//-1474836480(溢出了)
        System.out.println(total);
        long total2 = money*years;//仍然溢出，因为默认是int，转换前已经出现问题
        System.out.println(total2);
        long total3 = money*(long)years;//输出成功（先把一个数强制转换）
        System.out.println(total3);
    }
}