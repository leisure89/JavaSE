import java.time.LocalDate;
import java.util.Scanner;

/**
 * 编程 提示用户输入年月日信息，判断这一天是这一年中的第几天并打印
 */
public class DateJuge {

    public static void main(String[] args){
        //1.提示用户输入年月日并用变量保存，输入错误时提示，并重新再次输入
        int year = 0;  //记录年份
        int month = 0; //记录月份
        int day = 0;   //记录天
        int result = 0;//最终结果
        for(;;){
            boolean flag = true;
            System.out.println("请输入年份：");
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
            if(year <1){
                System.out.println("输入年份有误，请重新输入.... 提示: 请输入大于1的整数");
                flag = false;
                continue;
            }
            System.out.println("请输入月份:");
            month = sc.nextInt();
            if(month <1 || month > 12){
                System.out.println("输入的月份有误，请重新输入....提示:请输入[1-12]的整数");
                continue;
            }

            System.out.println("请输入几号:");
            day = sc.nextInt();
            result = day;
            if(day < 1 || day > 31){
                System.out.println("输入的月份有误，请重新输入....提示:请输入[1-31]之间的整数");
                continue;
            }
            if(flag){
                break;
            }
        }
        //2.根据输入的数据 判断最终结果
        // 2.1 算出当前天数之前月份的天数 取和  声明一个变量存放每月天数
        // 判断闰年 方式二：
        //LocalDate d = LocalDate.of(year,month,day);

        int emdays = 0; //每月的天数
        // 计算当前输入的天数之前月份的天数和
        for(int i = 1 ; i < month  ; i++){
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:emdays = 31;break;
                case 4:
                case 6:
                case 9:
                case 11:emdays = 30;break;
                case 2 :
                    //判断闰年方式一： 闰年2月为29天 平年2月为28天
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                        emdays = 29;
                    }else{
                        emdays = 28;
                    }
                    break;
                    //判断闰年方式二：
//                    if(d.isLeapYear()){
//                        emdays = 29;
//                    }else {
//                        emdays = 28;
//                    }
//                    break;
                default:break;
            }
            result += emdays;
        }

        System.out.println("您输入的"+ year +"年" + month +"月"+ day +"日是这一年中的第" + result + "天");
    }

}
