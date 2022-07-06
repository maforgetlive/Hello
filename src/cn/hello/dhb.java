package cn.hello;

import java.util.Scanner;

public class dhb {
    lxr[] arr=new lxr[10];
    Scanner sc = new Scanner(System.in);
    public void add(){

        System.out.println("请输入添加的联系人姓名：");
        String name=sc.next();
        System.out.println("请输入联系人电话：");
        String phone=sc.next();


        lxr lxr=new lxr();
        lxr.name=name;
        lxr.phone=phone;
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==null){
                arr[i]=lxr;
                System.out.println("添加成功！");
                return;
            }
        }
        System.out.println("联系人已满！");

    }
    //删除联系人
    public void del(){
        System.out.println("请输入要删除的联系人姓名：");
        String name = sc.next();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null&&arr[i].name.equals(name)){
                arr[i]=null;
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("没有这个人。");
    }

    //修改联系人
    public void update(){
        System.out.println("请输入要修改的联系人姓名：");
        String name=sc.next();
        System.out.println("请输入修改后的联系人姓名：");
        String upname=sc.next();
        System.out.println("请输入修改后的联系人电话：");
        String upphone=sc.next();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null&&arr[i].name.equals(name)){
                arr[i].name=upname;
                arr[i].phone=upphone;
                System.out.println("修改成功！");
                return;
            }
        }
        System.out.println("没有这个人。");
    }


    //查询联系人
    public void select(){
        System.out.println("请输入要查询的联系人姓名：");
        String name = sc.next();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null&arr[i].name.equals(name)){
                System.out.println("信息如下：");
                System.out.println(arr[i].name+"----"+arr[i].phone);
                return;
            }
        }
        System.out.println("没有这个人。");
    }

    //显示所有联系人
    public void all(){
        System.out.println("所有联系人的信息为：");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.println(arr[i].name+"----"+arr[i].phone);
            }
        }
    }


    //定义菜单
     public void a(){
        while (1<2){
            System.out.println("1.添加联系人  2.删除联系人  3.查询联系人  4.显示所有联系人   5.修改联系人  6.结束使用");
            String k=sc.next();
            switch (k){
                case "1":
                    add();
                    break;
                case "2":
                    del();
                case "3":
                    select();
                    break;
                case "4":
                    all();
                    break;
                case "5":
                    update();
                    break;
                case "6":
                    System.out.println("欢迎下次使用");
                    System.exit(0);
                    default:
                        System.out.println("输出有误");
                        break;

            }
        }
    }

}
