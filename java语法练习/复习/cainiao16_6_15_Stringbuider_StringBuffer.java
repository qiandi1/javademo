public class cainiao16_6_15_Stringbuider_StringBuffer {
    public static void main(String[] args) {
//1.StringBuilder
//相比String,如果需要对字符串进行修改推荐使用 StringBuffer
//StringBuilder:相比StringBuffer，不是线程安全的；但有速度优势，多数情况用StringBuilder
        StringBuilder sb = new StringBuilder(10);//创建10位空字符串
        System.out.println(sb);//无输出
        sb.append("Runoob..");//增加8位内容（0到7位）
        System.out.println(sb);//输出Runoob..
        sb.append("!");//增加1位内容（！在第8位）
        System.out.println(sb);//输出Runoob..!
        sb.insert(8, "Java");//在第八位后插入Java（J到第8位，感叹号第12位）
        System.out.println(sb);//输出Runoob..Java!
        sb.delete(5,8);//删除5到8之间的567位：b..
        System.out.println(sb);//输出RunooJava!
//StringBuffer类（相关的许多方法，见菜鸟java-StringBuffer）
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}
