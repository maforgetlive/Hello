package cn.hello;

public class da3 {
    public static void main(String[] args) {
        /*
         * 1.定义一个专门用于描述学生的实体类（模板类）
         *               该学生实体类具备以下属性：
         *                       学号 id
         *                       姓名 name
         *                       性别 sex
         *                       年龄 age
         *                       班级 clazz
         *                     方法：show（）用于打印当前学生对象的属性
         *  2.创建5个不同的学生对象。
         *  3.创建一个数组，存储5个不同的学生对象。
         *  4.统计1班和2班各有多少个学生
         *
         * */


        student st1=new student();
        st1.id=111;
        st1.name="zs";
        st1.sex="nan";
        st1.age=12;
        st1.Class="qq";
        student st2=new student();
        st2.id=222;
        st2.name="ls";
        st2.sex="nv";
        st2.age=13;
        st2.Class="ww";
        student st3=new student();
        st3.id=111;
        st3.name="ww";
        st3.sex="nan";
        st3.age=12;
        st3.Class="qq";

        student arr[]=new student[3];
        arr[0]=st1;
        arr[1]=st2;
        arr[2]=st3;
        for(int i=0;i<arr.length;i++){
            arr[i].show();
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].Class.equals("qq")){
                sum1++;
            }
            if(arr[i].Class.equals("ww")){
                sum2++;
            }
        } System.out.println(sum1+"\t"+sum2);
    }
}
