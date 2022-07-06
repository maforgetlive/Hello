package cn.hello;

public class da2 {
    public static void main(String[] args) {
        int arr[]=new int[]{0,57,33,2,78,45};
        int tmp;
        System.out.println("数组原顺序为：");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
          }
        System.out.println("冒泡排序后为：");
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + "\t");

        }
    }
}
