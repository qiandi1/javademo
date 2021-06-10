//狂神p23-Java基础03：数据类型详解
//菜鸟java6-基本数据类型

public class Demo02 {
    public static void main(String[] args) {
        //八大数据类型
        //1.-整数的四种表示方式
        //错误：int num3 = 10000000000;（10个零出现报错）（超过21亿多也会报错）
        //错误：byte num2 = 200;（最多127）
        byte num11 = 127;//（2^7-1），8位整数
        short num12 = 32767;//（2^15 - 1），16位整数
        int num13 = 2147483647;//（2^31 - 1），32位整数
        //错误long num14 = 9223372036854775807;
        long num14 = 9223372036854775807L;//（2^63 -1）， 64位整数（long要加L）
          //float 数据类型是单精度、32位、符合IEEE 754标准的浮点数
          //double 数据类型是双精度、64 位、符合 IEEE 754 标准的浮点数
        //boolean：true 和 false，仅这两个取值
        //char：单一的 16 位 Unicode 字符，最小值\u0000，最大值\uffff
        //2.小数：浮点数
        float num15 = 50.1F;//float要加F
        //错误：float num15 = 50.1;
        double num16 = 3.11111111111111111111111;
        //3.字符：
        //错误：char name = "钱";（不可双引号）
        char name = '钱';
        //错误：char name2 = '钱迪';（只能一个字符）
        char name3 = 'q';
        //错误：char name3 = 'qd';
        //拓展：字符串String不是关键字，是类
        String namea = "钱迪";//首字母是大写的，且是双引号，不是八大基本类型，
        //4.布尔值：是非，只有两个值（只占一位），1B(字节)=8bit(位)
        boolean qiandi = true;
        boolean qiandi2 = false;//不要拼错成forse
        //查看底层：
        //类对应的包装类：Byte，不用刻意去记，以后会讲
        //牢牢记住八个基本类型就好
    }
}
