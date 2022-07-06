package cn.hello;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++){
          boolean b=true;
          for(int j=2;j<i;j++){
              if(i%j==0){
                  b=false;
                  break;
              }
          }
          if(b){
              System.out.println(i+"是质数");

          }



      }
    }
}
