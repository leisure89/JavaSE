/**
 * 编程 找出1000以内的所有完数并打印出来。 所谓完数就是一个数恰好等于它的因子之和，如：6=1+2+3
 */
public class PrintWanShu {

    public static void main(String[] args){

        //外循环遍历1-1000的数
        for(int i = 1 ; i <=1000 ; i++){
            int sum = 0; //所有因数的总和
            //内循环判断1-1000以内的完数 对每一个数进行循环判断他的因数并进行累加
            for(int j = 1; j < i / 2 + 1 ; j++){
                if(i%j == 0){
                    sum += j;
                }
            }
            if(i == sum){ //累加完成后判断是否与原数相等 打印满足完数条件的数
                System.out.print(i + "  ");
            }
        }
    }
}
