/*break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
break 跳出最里层的循环，并且继续执行该循环下面的语句。*/
package cainiao10_6_15_xunhuan;
public class cainiao10_5_break {
    public static void main(String[] args) {
    int [] numbers ={10,20,30,40,50};
    for(int x : numbers){
        if (x==30){
            break;//当x=30，跳出循环（若放在println下面则也打印30）
        }
        System.out.println(x);//不输出30和30后的元素，输出10，20
    }
}
}