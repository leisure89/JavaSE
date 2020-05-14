import java.util.Scanner;

/**
 * 编程 自定义数组扩容规则，当已存储元素数量达到总容量的80%时，扩容1.5倍，
 * 例如，总容量是10，当输入第8个元素时，数组进行扩容，容量从10变15
 */
public class ArrayCopy {

    public static void main(String[] args){
        // 1.声明一个长度为10的整数数组
        int[] arr = new int[10];

        // 2.声明一个整数 接收用户输入的值
        int num = 0;
        double size = 1.5;

        Scanner sc = new Scanner(System.in);
        // 存储元素达到数组容量的80% 扩容 也就是说初始化元素个数为总长度的80%时 扩容

        // 3.声明一个整数 记录循环次数
        int count = 1;
        // 控制循环
        boolean flag = true;
        for(;flag;){
            // 提示用户输入
            System.out.println("请输入要增加的整数值...");
            num = sc.nextInt();
            // 将用户输入的值赋值给初始数组
            arr[count-1] = num;
            // 判断数组当前已经存放的元素个数是否达标整体的80%
            if ((double) count / arr.length  == 0.8) {
                //达到80%时 扩容
                int[]  temp = new int[(int)(arr.length*1.5)];
                // 将原数组的值赋值给新数组
                System.arraycopy(arr,0,temp,0,count);
                //扔原始数组的地址也指向扩容后的地址
                arr = temp;
                // 打印扩容后的数组
//                for (int j = 0 ; j<temp.length;j++){
//                    System.out.print(temp[j]+" ");
//                }
//                System.out.println(temp.length);
                break;
            }
            count++;
        }

        System.out.println("当前数组的长度是:\t" + arr.length);

    }
}
