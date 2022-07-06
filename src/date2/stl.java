package date2;

import java.util.Scanner;

public class stl {
    Scanner sc=new Scanner(System.in);
    User[] users=new User[10];
    stu[] arr=new stu[10];

    //注册
    public void zhuce(){
        System.out.println("输入要注册的账号");
        String password=sc.next();
        System.out.println("输入要注册的密码");
        String username=sc.next();
        User user=new User();
        user.username=username;
        user.password=password;
        for(int i= 0;i<users.length;i++){
            if(users[i]==null){
                users[i]=user;
                System.out.println("注册成功！");
                return;
            }
        }
        System.out.println("该账号已注册！");
    }

    //登录
    public void denglu(){
        System.out.println("输入账号");
        String username=sc.next();
        System.out.println("输入密码");
        String password=sc.next();
        for(int i=0;i<users.length;i++){
            if(users[i]!=null&&users[i].username.equals(username)&&users[i].password.equals(password)){
                System.out.println("登录成功！");
                mu2();
                return;
            }
        }
        System.out.println("登录失败，账号或密码错误");
    }

    //添加
    public void add(){
        System.out.println("输入要添加的姓名");
        String name=sc.next();
        System.out.println("输入要添加的电话");
        String phone=sc.next();
        System.out.println("输入要添加的成绩");
        String grade=sc.next();
        stu stu=new stu();
        stu.name=name;
        stu.phone=phone;
        stu.grade=grade;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                arr[i]=stu;
                System.out.println("添加成功");
                return;
            }
        }
        System.out.println("添加失败");
    }
    //删除
    public void del(){
        System.out.println("输入要删除的姓名");
        String name=sc.next();
      for(int i=0;i<arr.length;i++){
          if(arr[i]!=null&&arr[i].name.equals(name)){
              arr[i]=null;
              System.out.println("删除成功");
              return;
          }
      }
        System.out.println("没有这个人。");
    }
    //查询
    public void select(){
        System.out.println("输入要查询的姓名");
        String name=sc.next();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null&&arr[i].name.equals(name)){
                System.out.println(arr[i].name+"-----"+arr[i].phone+"------"+arr[i].grade);
                return;
            }
        }
        System.out.println("没有这个人。");
    }
    //修改
    public void update(){
        System.out.println("请输入要修改的姓名");
        String name=sc.next();
        System.out.println("请输入修改后的姓名");
        String upname=sc.next();
        System.out.println("请输入修改后的电话");
        String upphone=sc.next();
        System.out.println("请输入修改后的成绩");
        String upgrade=sc.next();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null&&arr[i].name.equals(name)){
               arr[i].name=upname;
               arr[i].phone=upphone;
               arr[i].grade=upgrade;
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("没有这个人。");
    }
    //显示所有
    public void all(){
        System.out.println("所有人的信息为：");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.println(arr[i].name+"-----"+arr[i].phone+"------"+arr[i].grade);
                return;
            }
        }
    }
    //菜单
    public void mu1(){
        while (true) {
            System.out.println("1.登录   2.注册    3.退出");
            String s = sc.next();
            switch (s) {
                case "1":
                    denglu();
                    break;
                case "2":
                    zhuce();
                    break;
                case "3":
                    System.out.println("欢迎下次使用");
                    System.exit(0);
                default:
                    System.out.println("输出有误");
                    break;
            }
        }
    }
    //管理
    public void mu2(){
        while (true) {
            System.out.println("1.添加   2.删除  3.查询  4.修改  5.显示所有   6.退出");
            String s = sc.next();
            switch (s) {
                case "1":
                    add();
                    break;
                case "2":
                    del();
                case "3":
                    select();
                    break;
                case "4":
                    update();
                    break;
                case "5":
                    all();
                    break;
                case "6":
                    return;
            }
        }
    }
}
