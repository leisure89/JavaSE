import java.util.Random;

/**
 * 编程 实现双色球抽奖游戏中奖号码的生成，中奖号码由6个红球号码和1个蓝球号码组成。
 * 其中红球号码要求随机生成6个1~33之间不重复的随机号码。
 * 其中蓝球号码要求随机生成1个1~16之间的随机号码。
 */
public class DoubleColorBall {

    public static void main(String[] args){

        // 声明一个数组存放6个红球数
        int[] redBall = new int[6];
        Random  ra = new Random();
        //
        int num = 0;

        for(int i = 0 ; i < redBall.length ; i++){
            // 生成1~33之间的随机数
            redBall[i] = ra.nextInt(33)+1;
            num = redBall[i];
            // 判断是否重复
            for(int j = 0 ; j < i ;j++){
                if(redBall[j] == num){
                    //有重复数据
                    i--;
                }
            }
        }


        // 生成1~16之间的随机数
        int blueBall = ra.nextInt(16)+1;
        // 打印红球
        System.out.print("本次红球号码为: ");
        for(int i = 0 ; i < redBall.length ; i++){
            System.out.print(redBall[i]+"  ");
        }
        //打印蓝球
        System.out.println("本次蓝球号码为: "+ blueBall);

    }
}
