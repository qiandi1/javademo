//菜鸟java12-swich case:多重选择语句
public class cainiao12_6_15_JavaSwichCase {
    public static void main(String[] args) {
        System.out.println("---1.含break的swich case语句---");
//1.含break的swich case语句
        char grade = 'B';
        System.out.println("你的等级为"+ grade);
        switch (grade){
            case'A':
                System.out.println("优秀（A）");
                break;
            case 'B':
            case 'C':
                System.out.println("良好（B或C）");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'E':
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知成绩");
        }
        System.out.println("---2.不含break的swich case语句---");
//2.不含break的swich case语句
        //识别成功后，后续case值都会输出，识别不成功则遇到成功的再输出
        int a =5;
        switch (a){
            case 5:System.out.println("a=5");//识别成功，输出后面所有case
            case 4:System.out.println("a=4");
            case 3:System.out.println("a=3");
            break;//后续不再输出（前提是前面有识别成功的）
            case 2:System.out.println("a=2");
            case 1:System.out.println("a=1");

        }
    }
}
