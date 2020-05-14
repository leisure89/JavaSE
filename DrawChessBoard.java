/**
 * 编程 使用二维数组和循环实现五子棋游戏棋盘的绘制 ，
 *
 */
public class DrawChessBoard {

    public static void main(String[] args){
        // 定义一个二维数组 长度为16*16
        String[][] arr = new String[16][16];
        // 给二维数组赋值
        System.out.print("     ");
        for(int i = 0 ; i < arr.length; i++){
//            System.out.format("%x ", i );
            System.out.print(Integer.toHexString(i) + "   ");
            for(int j = 0 ; j < arr[i].length; j++){
                arr[i][j] = " + ";
            }

        }
        System.out.println();

        // 打印二维数组
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(Integer.toHexString(i)+"   ");
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
