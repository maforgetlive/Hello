package cn.hello;

import java.util.Scanner;

public class da1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("欢迎来到大转盘，请下注：");
        int bj=sc.nextInt();
        System.out.println("-------规则如下--------");
        System.out.println("老虎，100倍");
        System.out.println("老鹰，50倍");
        System.out.println("兔子，20倍");
        System.out.println("小鸡，1倍");
        System.out.println("未中奖");
        System.out.println("-----------------------");
        while (1<2) {
            System.out.println("请下注：");
            int sum = sc.nextInt();
            if(sum>bj){
                System.out.println("下注大于本金，请重新下注");
                continue;
            }
            bj = bj - sum;
            double i = Math.random();
            int a = (int) (i * 100);
            if (a >= 0 && a < 5) {
                bj = sum * 100 + bj;
                System.out.println("你中了老虎，本金为：" + bj);
            } else if (a >= 5 && a < 20) {
                bj = sum * 50 + bj;
                System.out.println("你中了老鹰，本金为：" + bj);
            } else if (a >= 20 && a < 40) {
                bj = sum * 20 + bj;
                System.out.println("你中了兔子，本金为：" + bj);
            } else if (a >= 40 && a < 65) {
                bj = sum * 1 + bj;
                System.out.println("你中了小鸡，本金为：" + bj);
            } else if (a >= 65 && a < 100) {
                bj = bj;
                System.out.println("你未中奖，本金为：" + bj);
            }
            System.out.println("是否退出");
            String w=sc.next();
            if(w.equals("y")||w.equals("Y")){
                break;
            }

        }
    }
}
