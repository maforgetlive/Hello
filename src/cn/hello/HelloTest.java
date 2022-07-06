package cn.hello;

import java.time.Year;
import java.util.Scanner;

public class HelloTest {
    public static void main(String[] args){
        while (1<2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的决定:");
            String min = scanner.next();
            double a = Math.random();
            int i = (int) (a * 3);
            String com = " ";
            if (i == 0) {
                com = "石头";
            }
            if (i == 1) {
                com = "剪刀";
            }
            if (i == 2) {
                com = "布";
            }
            if (min.equals("石头") && com.equals("剪刀") || min.equals("剪刀") && com.equals("布") || min.equals("布") && com.equals("石头")) {
                System.out.println("你赢了，电脑出了" + com + ",你出了" + min);
            } else if (min.equals(com)) {
                System.out.println("平局，出的为" + com);
            } else if(min.equals("石头")&&com.equals("布") || min.equals("剪刀") && com.equals("石头") || min.equals("布") && com.equals("剪刀")){
                System.out.println("你输了，电脑出了" + com +  ",你出了" + min);
            }else{
                System.out.println("不符合规则，请重新输入");
            }
            System.out.println("是否退出，输入y/Y退出，输入其他继续");
            String w=scanner.next();
            if(w.equals("y")||w.equals("Y")){
                System.out.println("欢迎下次再来");
                break;
            }
        }
    }

}
