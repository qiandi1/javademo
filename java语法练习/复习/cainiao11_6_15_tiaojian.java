//菜鸟java-条件语句
//1.if语句 2.if...else语句 3.if...else if...else语句 4.嵌套if...else语句

public class cainiao11_6_15_tiaojian {
    public static void main(String[] args) {
        System.out.println("---1.if语句---");
//1.if语句
        int a=10;
        if (a<20){
            System.out.println("若a<20，则输出此if语句");
        }
        System.out.println("---2.if...else语句---");
//2.if...else语句
        int a2=30;
        if (a2<20){//若布尔值为true
            System.out.println("输出if语句");
        }else {//若布尔值为false
            System.out.println("输出else语句");
        }
        System.out.println("---3.if...else if...else语句---");
//3.if...else if...else语句
        int a3=30;
        if(a3>=60){//若ture则执行
            System.out.println("a3>=60");
        }else if (a3>=50){//若ture则执行
            System.out.println("a3>=50");
        }else if (a3>=40){
            System.out.println("a3>=40");
        }else if (a3>=30){
            System.out.println("a3>=30");
        }else if (a3>=20){
            System.out.println("a3>=20");
        }else {//若以上都false则执行
            System.out.println("a3小于20");
        }
        System.out.println("---4.嵌套的if...else语句---");
        //4.嵌套的if...else语句（以嵌套if为例，else同理）
        int a4 =30;
        int b4 =10;
        if (a4==30){
            System.out.print("a4=30");
            if (b4==10){
                System.out.print("且b4=10");
            }
        }

    }
}
